// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ApplyCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You must call the UpdateInstance operation in advance to ensure that all application information for the instance has been updated and completed before applying for a certificate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_dv-cn-rp643r82d0i1</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ApplyCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCertificateRequest self = new ApplyCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCertificateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
