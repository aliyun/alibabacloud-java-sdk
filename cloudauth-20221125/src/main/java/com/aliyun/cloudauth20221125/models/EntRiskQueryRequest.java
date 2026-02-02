// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntRiskQueryRequest extends TeaModel {
    /**
     * <p>A unique business identifier defined by the merchant side, used for subsequent problem localization and troubleshooting. Supports a combination of 32 alphanumeric characters, please ensure uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>32198****193000</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>A custom user ID in your business, used for subsequent problem localization and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Parameter type.
     * 00: Company name;
     * 01: Business registration number;
     * 02: Unified Social Credit Code;
     * 03: Organization code;</p>
     * 
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("ParamType")
    public String paramType;

    /**
     * <p>Enter one of the following based on the ParamType: company name, business registration number, unified social credit code, or organization code.</p>
     * 
     * <strong>example:</strong>
     * <p>91330106673959****</p>
     */
    @NameInMap("ParamValue")
    public String paramValue;

    /**
     * <p>Custom scene code, used to distinguish business scenarios, a 10-digit number.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000086</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Whether user authorization is obtained.
     * 1: Authorized
     * 0: Not authorized</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserAuthorization")
    public String userAuthorization;

    public static EntRiskQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        EntRiskQueryRequest self = new EntRiskQueryRequest();
        return TeaModel.build(map, self);
    }

    public EntRiskQueryRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public EntRiskQueryRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public EntRiskQueryRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public EntRiskQueryRequest setParamValue(String paramValue) {
        this.paramValue = paramValue;
        return this;
    }
    public String getParamValue() {
        return this.paramValue;
    }

    public EntRiskQueryRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public EntRiskQueryRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

}
