// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListNotifyPoliciesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records returned for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. Empty if no more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJjdXJzb3IiOjEwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of notification policies. Each item is of the NotifyPolicySummary type, which is a lightweight view.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;uuid&quot;:&quot;np-12345678-1234-1234-1234-123456789012&quot;,&quot;name&quot;:&quot;prod-alert&quot;,&quot;description&quot;:&quot;Production environment alert policy&quot;,&quot;enabled&quot;:true,&quot;version&quot;:1,&quot;workspace&quot;:&quot;default-cms-xxxx-cn-hangzhou&quot;,&quot;userId&quot;:&quot;107640&quot;,&quot;createTime&quot;:&quot;1711792800000&quot;,&quot;updateTime&quot;:&quot;1711792800000&quot;}]</p>
     */
    @NameInMap("notifyPolicyList")
    public java.util.List<NotifyPolicySummary> notifyPolicyList;

    /**
     * <p>The unique ID of the request, used for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-A01D6CC3F4B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records. The actual total is returned for the first page, and -1 is returned for subsequent pages.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListNotifyPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotifyPoliciesResponseBody self = new ListNotifyPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotifyPoliciesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNotifyPoliciesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNotifyPoliciesResponseBody setNotifyPolicyList(java.util.List<NotifyPolicySummary> notifyPolicyList) {
        this.notifyPolicyList = notifyPolicyList;
        return this;
    }
    public java.util.List<NotifyPolicySummary> getNotifyPolicyList() {
        return this.notifyPolicyList;
    }

    public ListNotifyPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNotifyPoliciesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
