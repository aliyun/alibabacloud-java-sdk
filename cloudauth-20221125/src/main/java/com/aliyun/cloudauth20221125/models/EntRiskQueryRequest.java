// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20221125.models;

import com.aliyun.tea.*;

public class EntRiskQueryRequest extends TeaModel {
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    @NameInMap("MerchantUserId")
    public String merchantUserId;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("ParamValue")
    public String paramValue;

    @NameInMap("SceneCode")
    public String sceneCode;

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
