// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ApplyDataModelConfigInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("Configuration")
    public String configuration;

    @NameInMap("DataModelCode")
    public String dataModelCode;

    @NameInMap("ProductKey")
    public String productKey;

    public static ApplyDataModelConfigInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyDataModelConfigInfoRequest self = new ApplyDataModelConfigInfoRequest();
        return TeaModel.build(map, self);
    }

    public ApplyDataModelConfigInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public ApplyDataModelConfigInfoRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public ApplyDataModelConfigInfoRequest setDataModelCode(String dataModelCode) {
        this.dataModelCode = dataModelCode;
        return this;
    }
    public String getDataModelCode() {
        return this.dataModelCode;
    }

    public ApplyDataModelConfigInfoRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
