// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class ActivateLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>ID</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>12bea6b4489fsde7b903fe05934a0adx</p>
     */
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
