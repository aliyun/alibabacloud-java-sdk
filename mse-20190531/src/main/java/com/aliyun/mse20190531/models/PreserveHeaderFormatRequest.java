// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class PreserveHeaderFormatRequest extends TeaModel {
    /**
     * <p>The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The unique ID of the gateway.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-3f97e2989c344f35ab3fd62b19f1****</p>
     */
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    /**
     * <p>Specifies whether the request header is case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("PreserveHeaderFormat")
    public Boolean preserveHeaderFormat;

    public static PreserveHeaderFormatRequest build(java.util.Map<String, ?> map) throws Exception {
        PreserveHeaderFormatRequest self = new PreserveHeaderFormatRequest();
        return TeaModel.build(map, self);
    }

    public PreserveHeaderFormatRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public PreserveHeaderFormatRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public PreserveHeaderFormatRequest setPreserveHeaderFormat(Boolean preserveHeaderFormat) {
        this.preserveHeaderFormat = preserveHeaderFormat;
        return this;
    }
    public Boolean getPreserveHeaderFormat() {
        return this.preserveHeaderFormat;
    }

}
