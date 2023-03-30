// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("Description")
    public String description;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Jwks")
    public String jwks;

    @NameInMap("KeyName")
    public String keyName;

    @NameInMap("KeyValue")
    public String keyValue;

    @NameInMap("TokenName")
    public String tokenName;

    @NameInMap("TokenPass")
    public Boolean tokenPass;

    @NameInMap("TokenPosition")
    public String tokenPosition;

    @NameInMap("TokenPrefix")
    public String tokenPrefix;

    public static UpdateGatewayAuthConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayAuthConsumerRequest self = new UpdateGatewayAuthConsumerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayAuthConsumerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayAuthConsumerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateGatewayAuthConsumerRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public UpdateGatewayAuthConsumerRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayAuthConsumerRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateGatewayAuthConsumerRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public UpdateGatewayAuthConsumerRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public UpdateGatewayAuthConsumerRequest setKeyValue(String keyValue) {
        this.keyValue = keyValue;
        return this;
    }
    public String getKeyValue() {
        return this.keyValue;
    }

    public UpdateGatewayAuthConsumerRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public UpdateGatewayAuthConsumerRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public UpdateGatewayAuthConsumerRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public UpdateGatewayAuthConsumerRequest setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
        return this;
    }
    public String getTokenPrefix() {
        return this.tokenPrefix;
    }

}
