// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class RefundInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-ivauto-hqito6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static RefundInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundInstanceRequest self = new RefundInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RefundInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
