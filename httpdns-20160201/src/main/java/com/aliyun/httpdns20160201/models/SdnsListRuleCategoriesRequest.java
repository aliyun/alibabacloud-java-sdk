// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class SdnsListRuleCategoriesRequest extends TeaModel {
    /**
     * <p>The domain name that is connected to HTTPDNS under the current account. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>api.example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static SdnsListRuleCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SdnsListRuleCategoriesRequest self = new SdnsListRuleCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public SdnsListRuleCategoriesRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
