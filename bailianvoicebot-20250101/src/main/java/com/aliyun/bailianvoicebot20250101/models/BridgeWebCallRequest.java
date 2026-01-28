// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class BridgeWebCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a395011f-a247-400f-bc69-28796749fd52</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>13052253537</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>467539456766097392-cn-shenzhen</p>
     */
    @NameInMap("DeviceId")
    public String deviceId;

    /**
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("SampleRate")
    public Integer sampleRate;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Sandbox")
    public Boolean sandbox;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;ENV\&quot;: \&quot;production\&quot;}</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TimeoutSeconds")
    public Integer timeoutSeconds;

    public static BridgeWebCallRequest build(java.util.Map<String, ?> map) throws Exception {
        BridgeWebCallRequest self = new BridgeWebCallRequest();
        return TeaModel.build(map, self);
    }

    public BridgeWebCallRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public BridgeWebCallRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public BridgeWebCallRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public BridgeWebCallRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public BridgeWebCallRequest setSampleRate(Integer sampleRate) {
        this.sampleRate = sampleRate;
        return this;
    }
    public Integer getSampleRate() {
        return this.sampleRate;
    }

    public BridgeWebCallRequest setSandbox(Boolean sandbox) {
        this.sandbox = sandbox;
        return this;
    }
    public Boolean getSandbox() {
        return this.sandbox;
    }

    public BridgeWebCallRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public BridgeWebCallRequest setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

}
