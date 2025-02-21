// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeUserTagKeysResponseBody extends TeaModel {
    /**
     * <p>Number of items per page in paginated queries. The maximum value is 100.</p>
     * <p>Default value:</p>
     * <ul>
     * <li><p>If no value is set or the set value is less than 10, the default is 10.</p>
     * </li>
     * <li><p>If the set value is greater than 100, the default is 100.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. An empty NextToken indicates there are no more results.</p>
     * 
     * <strong>example:</strong>
     * <p>f07b150eadfa1d7a</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C123F94F-4E38-19AE-942A-A8D6F44F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of matching tag keys.</p>
     */
    @NameInMap("TagKeys")
    public java.util.List<String> tagKeys;

    public static DescribeUserTagKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserTagKeysResponseBody self = new DescribeUserTagKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserTagKeysResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeUserTagKeysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeUserTagKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserTagKeysResponseBody setTagKeys(java.util.List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.List<String> getTagKeys() {
        return this.tagKeys;
    }

}
