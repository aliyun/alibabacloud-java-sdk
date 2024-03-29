// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmartVerifyRequest extends TeaModel {
    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("PictureReturnType")
    public String pictureReturnType;

    @NameInMap("SceneId")
    public Long sceneId;

    public static DescribeSmartVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartVerifyRequest self = new DescribeSmartVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeSmartVerifyRequest setPictureReturnType(String pictureReturnType) {
        this.pictureReturnType = pictureReturnType;
        return this;
    }
    public String getPictureReturnType() {
        return this.pictureReturnType;
    }

    public DescribeSmartVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
