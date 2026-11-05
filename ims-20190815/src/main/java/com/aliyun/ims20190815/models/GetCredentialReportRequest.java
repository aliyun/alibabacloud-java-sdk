// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportRequest extends TeaModel {
    /**
     * <p>The maximum number of items to return. When the response is truncated because the maximum number of items is reached, the IsTruncated parameter is set to true.</p>
     * <p>Valid values: 1 to 3501. Default value: 3501.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxItems")
    public String maxItems;

    /**
     * <p>The token used to retrieve the next set of results when the response is truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>EXAMPLE</p>
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
