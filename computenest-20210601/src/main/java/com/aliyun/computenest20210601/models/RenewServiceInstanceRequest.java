// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class RenewServiceInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run of the renewal request, including permission and instance status checks. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Sends the request without renewing the service instance.</p>
     * </li>
     * <li><p><strong>false</strong>: Sends the request and renews the service instance after the checks pass.</p>
     * </li>
     * </ul>
     * <p>Default value: false. The operation is allowed only when the service instance is in the Pending Renewal or Renewal Failed state.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The service instance ID.</p>
     * 
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
