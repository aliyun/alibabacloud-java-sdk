// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CancelPendingCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_dv-cn-rp643r82d0i1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static CancelPendingCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPendingCertificateRequest self = new CancelPendingCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CancelPendingCertificateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
