// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListCustomDomainOutput extends TeaModel {
    @NameInMap("customDomains")
    public java.util.List<CustomDomain> customDomains;

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
