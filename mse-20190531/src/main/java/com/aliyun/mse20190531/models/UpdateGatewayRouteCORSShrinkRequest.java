// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteCORSShrinkRequest extends TeaModel {
    /**
     * <p>The language of the response. In compliance with <a href="https://tools.ietf.org/html/rfc7231">RFC 7231</a>, the backend service must return a response based on the language used by the user.</p>
     * <ul>
     * <li>No default value.</li>
     * <li>zh-CN: Chinese</li>
     * <li>en-US: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The information about the CORS policy.</p>
     */
    @NameInMap("CorsJSON")
    public String corsJSONShrink;

    /**
     * <p>The ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>85</p>
     */
    @NameInMap("GatewayId")
    public Long gatewayId;

    /**
     * <p>The unique ID of the gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-f70a6ddf2f0941a2bb997b2d16028f37</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>The ID of the associated record.</p>
     * 
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("Id")
    public Long id;

    public static UpdateGatewayRouteCORSShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteCORSShrinkRequest self = new UpdateGatewayRouteCORSShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteCORSShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateGatewayRouteCORSShrinkRequest setCorsJSONShrink(String corsJSONShrink) {
        this.corsJSONShrink = corsJSONShrink;
        return this;
    }
    public String getCorsJSONShrink() {
        return this.corsJSONShrink;
    }

    public UpdateGatewayRouteCORSShrinkRequest setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public Long getGatewayId() {
        return this.gatewayId;
    }

    public UpdateGatewayRouteCORSShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public UpdateGatewayRouteCORSShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
