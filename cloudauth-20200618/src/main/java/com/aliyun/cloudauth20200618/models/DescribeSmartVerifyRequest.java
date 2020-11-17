// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class DescribeSmartVerifyRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("CertifyId")
    public String certifyId;

    public static DescribeSmartVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartVerifyRequest self = new DescribeSmartVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSmartVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeSmartVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
