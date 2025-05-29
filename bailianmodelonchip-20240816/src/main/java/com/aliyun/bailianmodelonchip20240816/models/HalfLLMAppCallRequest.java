// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMAppCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b883e6dcf14041fba390c1f795493c6b</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("bizParam")
    public java.util.Map<String, String> bizParam;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b504f84b69b9a73d3a21a2cff05e190</p>
     */
    @NameInMap("deviceName")
    public String deviceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("modelTypeList")
    public java.util.List<String> modelTypeList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2oImhCz4f8XCviiM</p>
     */
    @NameInMap("productKey")
    public String productKey;

    /**
     * <strong>example:</strong>
     * <p>0sIRZDNncmCfBagzy534x2PH</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>678699541713794</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("text")
    public String text;

    public static HalfLLMAppCallRequest build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMAppCallRequest self = new HalfLLMAppCallRequest();
        return TeaModel.build(map, self);
    }

    public HalfLLMAppCallRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public HalfLLMAppCallRequest setBizParam(java.util.Map<String, String> bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public java.util.Map<String, String> getBizParam() {
        return this.bizParam;
    }

    public HalfLLMAppCallRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public HalfLLMAppCallRequest setModelTypeList(java.util.List<String> modelTypeList) {
        this.modelTypeList = modelTypeList;
        return this;
    }
    public java.util.List<String> getModelTypeList() {
        return this.modelTypeList;
    }

    public HalfLLMAppCallRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public HalfLLMAppCallRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public HalfLLMAppCallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public HalfLLMAppCallRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
