// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ImportServicesShrinkRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("GatewayUniqueId")
    public String gatewayUniqueId;

    @NameInMap("ServiceList")
    public String serviceListShrink;

    @NameInMap("SourceId")
    public String sourceId;

    // 服务来源
    @NameInMap("SourceType")
    public String sourceType;

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

    public ImportServicesShrinkRequest setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public ImportServicesShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
