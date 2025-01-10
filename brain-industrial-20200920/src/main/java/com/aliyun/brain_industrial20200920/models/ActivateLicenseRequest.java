// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ActivateLicenseRequest extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderId")
    public String orderId;

    public static ActivateLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseRequest self = new ActivateLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseRequest setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public ActivateLicenseRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ActivateLicenseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ActivateLicenseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
