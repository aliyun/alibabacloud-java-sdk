// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListTrusteeOrderRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23787679</p>
     */
    @NameInMap("CertificateId")
    public Long certificateId;

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
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14933279</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    public static ListTrusteeOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrusteeOrderRequest self = new ListTrusteeOrderRequest();
        return TeaModel.build(map, self);
    }

    public ListTrusteeOrderRequest setCertificateId(Long certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Long getCertificateId() {
        return this.certificateId;
    }

    public ListTrusteeOrderRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTrusteeOrderRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTrusteeOrderRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

}
