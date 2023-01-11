// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   slb</p>
     * <p>*   eni</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <p>The edition of the MSE instance that you want to purchase.</p>
     * <br>
     * <p>*   mse_pro: Professional Edition</p>
     * <p>*   mse_dev: Developer Edition</p>
     */
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
