// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceVerifyRequest extends TeaModel {
    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("PictureReturnType")
    public String pictureReturnType;

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
