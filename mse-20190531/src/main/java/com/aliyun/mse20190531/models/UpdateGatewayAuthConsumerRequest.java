// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayAuthConsumerRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The description of the consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The encryption type. Valid values:</p>
     * <ul>
     * <li>RSA</li>
     * <li>OCT</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-90392d768a3847a7b804c505254d****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the consumer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>63</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The JWT public key. The JSON format is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;keys&quot;:[{&quot;e&quot;:&quot;AQAB&quot;,&quot;kid&quot;:&quot;DHFbpoIUqrY8t2zpA2qXfCmr5VO5ZEr4RzHU_-envvQ&quot;,&quot;kty&quot;:&quot;RSA&quot;,&quot;n&quot;:&quot;xAE7eB6qugXyCAG3yhh7pkDkT65pHymX-P7KfIupjf59vsdo91bSP9C8H07pSAGQO1MV_xFj9VswgsCg4R6otmg5PV2He95lZdHtOcU5DXIg_pbhLdKXbi66GlVeK6ABZOUW3WYtnNHD-91gVuoeJT_DwtGGcp4ignkgXfkiEm4sw-4sfb4qdt5oLbyVpmW6x9cfa7vs2WTfURiCrBoUqgBo_-4WTiULmmHSGZHOjzwa8WtrtOQGsAFjIbno85jp6MnGGGZPYZbDAa_b3y5u-YpW7ypZrvD8BgtKVjgtQgZhLAGezMt0ua3DRrWnKqTZ0BJ_EyxOGuHJrLsn00fnMQ&quot;}]}</p>
     */
    @NameInMap("Jwks")
    public String jwks;

    /**
     * <p>The name of the key used for JWT-based identity authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>iss</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>The value of the key used for JWT-based identity authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>abcd</p>
     */
    @NameInMap("KeyValue")
    public String keyValue;

    /**
     * <p>The names of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Authorization</p>
     */
    @NameInMap("TokenName")
    public String tokenName;

    /**
     * <p>Specifies whether to enable pass-through.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TokenPass")
    public Boolean tokenPass;

    /**
     * <p>The positions of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>HEADER</p>
     */
    @NameInMap("TokenPosition")
    public String tokenPosition;

    /**
     * <p>The prefixes of the parameters that are required to verify each token. By default, each token is prefixed with Bearer and stored in the Authorization header, such as <code>Authorization: Bearer &lt;Content of a token&gt;</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer</p>
     */
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
