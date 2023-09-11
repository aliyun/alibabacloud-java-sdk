// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportRequest extends TeaModel {
    @NameInMap("MaxItems")
    public String maxItems;

    @NameInMap("NextToken")
    public String nextToken;

    public static GetCredentialReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialReportRequest self = new GetCredentialReportRequest();
        return TeaModel.build(map, self);
    }

    public GetCredentialReportRequest setMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public String getMaxItems() {
        return this.maxItems;
    }

    public GetCredentialReportRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
