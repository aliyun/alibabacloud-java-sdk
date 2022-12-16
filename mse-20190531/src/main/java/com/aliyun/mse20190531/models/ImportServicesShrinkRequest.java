// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesShrinkRequest extends TeaModel {
    // The data structure.
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The unique ID of the gateway.
    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    // The information about services.
    @NameInMap("ServiceList")
    public String serviceListShrink;

    // The source type of the service.
    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TlsSetting")
    public String tlsSetting;

    public static ImportServicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportServicesShrinkRequest self = new ImportServicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportServicesShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ImportServicesShrinkRequest setGatewayUniqueId(String gatewayUniqueId) {
        this.gatewayUniqueId = gatewayUniqueId;
        return this;
    }
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public ImportServicesShrinkRequest setServiceListShrink(String serviceListShrink) {
        this.serviceListShrink = serviceListShrink;
        return this;
    }
    public String getServiceListShrink() {
        return this.serviceListShrink;
    }

    public ImportServicesShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ImportServicesShrinkRequest setTlsSetting(String tlsSetting) {
        this.tlsSetting = tlsSetting;
        return this;
    }
    public String getTlsSetting() {
        return this.tlsSetting;
    }

}
