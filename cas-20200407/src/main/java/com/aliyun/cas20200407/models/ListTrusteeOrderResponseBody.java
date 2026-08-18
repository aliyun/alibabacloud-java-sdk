// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListTrusteeOrderResponseBody extends TeaModel {
    /**
     * <p>The maximum number of records to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. If NextToken is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>1d2db86sca4384811e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0068247C-A454-5FC9-93BF-C41CBB5CD19E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of orders.</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The order list.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;VerifyStatus&quot;: 0,
     *     &quot;ShowRefund&quot;: false,
     *     &quot;CertificateId&quot;: 0,
     *     &quot;SourceType&quot;: &quot;buy&quot;,
     *     &quot;IsMix&quot;: false,
     *     &quot;CertType&quot;: &quot;DV&quot;,
     *     &quot;PartnerOrderId&quot;: null,
     *     &quot;ProductId&quot;: 53,
     *     &quot;StatusCode&quot;: &quot;closed&quot;,
     *     &quot;KeyProtection&quot;: &quot;UNKNOWN&quot;,
     *     &quot;BrandName&quot;: &quot;Rapid&quot;,
     *     &quot;JobStatus&quot;: &quot;editing&quot;,
     *     &quot;Month&quot;: 6,
     *     &quot;IsFree&quot;: false,
     *     &quot;DomainType&quot;: &quot;ONE&quot;,
     *     &quot;IsRefunding&quot;: false,
     *     &quot;RevokeReturnCount&quot;: false,
     *     &quot;JobId&quot;: 440231,
     *     &quot;DomainCount&quot;: 1,
     *     &quot;InstanceId&quot;: &quot;cas-ivauto-fe7kv4-15650439-renew&quot;,
     *     &quot;ProductCode&quot;: &quot;geotrust-dv-1-starter&quot;,
     *     &quot;WildDomainCount&quot;: 0,
     *     &quot;OrderId&quot;: 15652305,
     *     &quot;Algorithm&quot;: &quot;RSA&quot;,
     *     &quot;Year&quot;: 1,
     *     &quot;IsRenew&quot;: false,
     *     &quot;Domain&quot;: &quot;tw.certqa.cn&quot;,
     *     &quot;AllDomain&quot;: &quot;tw.certqa.cn&quot;,
     *     &quot;BuyDate&quot;: 1773906251000
     *   }
     * ]</p>
     */
    @NameInMap("TrusteeOrderList")
    public String trusteeOrderList;

    public static ListTrusteeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTrusteeOrderResponseBody self = new ListTrusteeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTrusteeOrderResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrusteeOrderResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrusteeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTrusteeOrderResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListTrusteeOrderResponseBody setTrusteeOrderList(String trusteeOrderList) {
        this.trusteeOrderList = trusteeOrderList;
        return this;
    }
    public String getTrusteeOrderList() {
        return this.trusteeOrderList;
    }

}
