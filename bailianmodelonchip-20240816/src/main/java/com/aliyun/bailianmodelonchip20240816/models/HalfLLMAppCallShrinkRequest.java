// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class HalfLLMAppCallShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b883e6dcf14041fba390c1f795493c6b</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("bizParam")
    public String bizParamShrink;

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
    public String modelTypeListShrink;

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

    public static HalfLLMAppCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        HalfLLMAppCallShrinkRequest self = new HalfLLMAppCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public HalfLLMAppCallShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public HalfLLMAppCallShrinkRequest setBizParamShrink(String bizParamShrink) {
        this.bizParamShrink = bizParamShrink;
        return this;
    }
    public String getBizParamShrink() {
        return this.bizParamShrink;
    }

    public HalfLLMAppCallShrinkRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public HalfLLMAppCallShrinkRequest setModelTypeListShrink(String modelTypeListShrink) {
        this.modelTypeListShrink = modelTypeListShrink;
        return this;
    }
    public String getModelTypeListShrink() {
        return this.modelTypeListShrink;
    }

    public HalfLLMAppCallShrinkRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public HalfLLMAppCallShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public HalfLLMAppCallShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public HalfLLMAppCallShrinkRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
