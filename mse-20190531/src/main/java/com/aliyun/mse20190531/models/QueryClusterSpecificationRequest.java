// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The network type. Valid values:
    // 
    // *   slb
    // *   eni
    @NameInMap("ConnectType")
    public String connectType;

    // The edition of the Microservices Engine (MSE) instance that you want to purchase.
    // 
    // *   mse_pro: Professional Edition
    // *   mse_dev: Developer Edition
    @NameInMap("MseVersion")
    public String mseVersion;

    public static QueryClusterSpecificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterSpecificationRequest self = new QueryClusterSpecificationRequest();
        return TeaModel.build(map, self);
    }

    public QueryClusterSpecificationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryClusterSpecificationRequest setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public QueryClusterSpecificationRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

}
