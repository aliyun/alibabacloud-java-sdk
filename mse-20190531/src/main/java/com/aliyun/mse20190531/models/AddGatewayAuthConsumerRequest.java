// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddGatewayAuthConsumerRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The description of the consumer.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The encryption type. Valid values:</p>
     * <br>
     * <p>*   RSA</p>
     * <p>*   OCT</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <p>The unique ID of the gateway.</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The JWT public key. The JSON format is supported.</p>
     */
    @NameInMap("Jwks")
    public String jwks;

    /**
     * <p>The name of the key used for JWT-based identity authentication.</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>The value of the key used for JWT-based identity authentication.</p>
     */
    @NameInMap("KeyValue")
    public String keyValue;

    /**
     * <p>The name of the consumer.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The names of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <p>Specifies whether to enable pass-through.</p>
     */
    @NameInMap("TokenPass")
    public Boolean tokenPass;

    /**
     * <p>The positions of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.</p>
     */
    @NameInMap("TokenPosition")
    public String tokenPosition;

    /**
     * <p>The prefixes of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as `Authorization: Bearer <Content of a token>`.</p>
     */
    @NameInMap("TokenPrefix")
    public String tokenPrefix;

    /**
     * <p>The authentication type. Valid values:</p>
     * <br>
     * <p>*   JWT</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddGatewayAuthConsumerRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGatewayAuthConsumerRequest self = new AddGatewayAuthConsumerRequest();
        return TeaModel.build(map, self);
    }

    public AddGatewayAuthConsumerRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public AddGatewayAuthConsumerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddGatewayAuthConsumerRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public AddGatewayAuthConsumerRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public AddGatewayAuthConsumerRequest setJwks(String jwks) {
        this.jwks = jwks;
        return this;
    }
    public String getJwks() {
        return this.jwks;
    }

    public AddGatewayAuthConsumerRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public AddGatewayAuthConsumerRequest setKeyValue(String keyValue) {
        this.keyValue = keyValue;
        return this;
    }
    public String getKeyValue() {
        return this.keyValue;
    }

    public AddGatewayAuthConsumerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddGatewayAuthConsumerRequest setTokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }
    public String getTokenName() {
        return this.tokenName;
    }

    public AddGatewayAuthConsumerRequest setTokenPass(Boolean tokenPass) {
        this.tokenPass = tokenPass;
        return this;
    }
    public Boolean getTokenPass() {
        return this.tokenPass;
    }

    public AddGatewayAuthConsumerRequest setTokenPosition(String tokenPosition) {
        this.tokenPosition = tokenPosition;
        return this;
    }
    public String getTokenPosition() {
        return this.tokenPosition;
    }

    public AddGatewayAuthConsumerRequest setTokenPrefix(String tokenPrefix) {
        this.tokenPrefix = tokenPrefix;
        return this;
    }
    public String getTokenPrefix() {
        return this.tokenPrefix;
    }

    public AddGatewayAuthConsumerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
