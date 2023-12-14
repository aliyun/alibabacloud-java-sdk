// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportRequest extends TeaModel {
    /**
     * <p>The number of entries per page. If a response is truncated because it reaches the value of `MaxItems`, the value of `IsTruncated` will be true.</p>
     * <br>
     * <p>Valid values: 1 to 3501. Default value: 3501.</p>
     */
    @NameInMap("MaxItems")
    public String maxItems;

    /**
     * <p>The token that is used to initiate the next request if the response of the current request is truncated. You can use the token to initiate another request and obtain the remaining records.``</p>
     */
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
