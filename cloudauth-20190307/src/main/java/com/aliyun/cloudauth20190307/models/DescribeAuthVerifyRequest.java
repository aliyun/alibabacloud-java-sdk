// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAuthVerifyRequest extends TeaModel {
    /**
     * <p>The unique identifier for ID Verification.
     * Obtain this value by calling InitAuthVerify to initiate an OCR request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>shsf57a4e0d9981c3bd66dc754f3d3cd</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>The authentication scenario ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000****</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static DescribeAuthVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthVerifyRequest self = new DescribeAuthVerifyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAuthVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeAuthVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
