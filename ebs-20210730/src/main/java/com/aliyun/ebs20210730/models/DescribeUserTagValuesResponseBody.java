// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeUserTagValuesResponseBody extends TeaModel {
    /**
     * <p>Number of items per page in a paginated query. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If no value is set or the set value is less than 10, the default value is 10.</p>
     * </li>
     * <li><p>If the set value is greater than 100, the default value is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Query token (Token). The value should be the NextToken parameter value from the previous call to this interface. This parameter is not required for the initial call. If NextToken is set, the PageSize and PageNumber request parameters become invalid, and the TotalCount in the response data is also invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>NextToken</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID. We return the request ID regardless of whether the API call was successful or not.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Tag values corresponding to the tag key.</p>
     */
    @NameInMap("TagValues")
    public java.util.List<String> tagValues;

    public static DescribeUserTagValuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagValuesResponseBody self = new DescribeUserTagValuesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagValuesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserTagValuesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserTagValuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserTagValuesResponseBody setTagValues(java.util.List<String> tagValues) {
        this.tagValues = tagValues;
        return this;
    }
    public java.util.List<String> getTagValues() {
        return this.tagValues;
    }

}
