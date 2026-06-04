// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>si-70a3b15bb626435b****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static RenewServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewServiceInstanceRequest self = new RenewServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RenewServiceInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public RenewServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
