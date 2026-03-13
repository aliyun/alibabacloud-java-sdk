// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListCustomDomainOutput extends TeaModel {
    /**
     * <p>The custom domain names.</p>
     */
    @NameInMap("customDomains")
    public java.util.List<CustomDomain> customDomains;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>next_domain_name</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListCustomDomainOutput build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainOutput self = new ListCustomDomainOutput();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainOutput setCustomDomains(java.util.List<CustomDomain> customDomains) {
        this.customDomains = customDomains;
        return this;
    }
    public java.util.List<CustomDomain> getCustomDomains() {
        return this.customDomains;
    }

    public ListCustomDomainOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
