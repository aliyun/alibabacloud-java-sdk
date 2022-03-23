// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetCnameDetailRequest extends TeaModel {
    // 应用id
    @NameInMap("AppId")
    public String appId;

    // 域名的名称
    @NameInMap("DomainName")
    public String domainName;

    // 云产品code
    @NameInMap("ProductCode")
    public String productCode;

    public static GetCnameDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCnameDetailRequest self = new GetCnameDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCnameDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetCnameDetailRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetCnameDetailRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
