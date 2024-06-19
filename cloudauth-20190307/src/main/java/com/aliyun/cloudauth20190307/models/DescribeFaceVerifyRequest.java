// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>91707dc296d469ad38e4c5efa6a0f24b</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <strong>example:</strong>
     * <p>JPG</p>
     */
    @NameInMap("PictureReturnType")
    public String pictureReturnType;

    /**
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static DescribeFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceVerifyRequest self = new DescribeFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeFaceVerifyRequest setPictureReturnType(String pictureReturnType) {
        this.pictureReturnType = pictureReturnType;
        return this;
    }
    public String getPictureReturnType() {
        return this.pictureReturnType;
    }

    public DescribeFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
