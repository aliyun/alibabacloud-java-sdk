// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreateCloudGtmInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the domain name instance configuration. A GTM instance can have both an A record and an AAAA record for the same access domain name. In this case, the GTM instance has two domain name instance configurations. The ConfigId uniquely identifies each configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>config-000**1</p>
     */
    @NameInMap("ConfigId")
    public Boolean configId;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful:</p>
     * <ul>
     * <li><p>true: The operation was successful.</p>
     * </li>
     * <li><p>false: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateCloudGtmInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudGtmInstanceConfigResponseBody self = new CreateCloudGtmInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudGtmInstanceConfigResponseBody setConfigId(Boolean configId) {
        this.configId = configId;
        return this;
    }
    public Boolean getConfigId() {
        return this.configId;
    }

    public CreateCloudGtmInstanceConfigResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCloudGtmInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCloudGtmInstanceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
