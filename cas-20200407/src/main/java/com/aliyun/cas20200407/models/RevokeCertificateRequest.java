// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RevokeCertificateRequest extends TeaModel {
    @NameInMap("CertificateId")
    public Long certificateId;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-cn-68n1mm16****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RevokeCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeCertificateRequest self = new RevokeCertificateRequest();
        return TeaModel.build(map, self);
    }

    public RevokeCertificateRequest setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

    public RevokeCertificateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
