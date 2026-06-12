// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceBillRequest extends TeaModel {
    /**
     * <p>The billing cycle in YYYY-MM format. Only billing cycles in the last 18 months are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only when <strong>Granularity</strong> is set to DAILY. The format is YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-01</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity of the bills to query. Valid values:</p>
     * <ul>
     * <li><p>MONTHLY: monthly. The data is consistent with the bills aggregated by billing cycle in the User Center.</p>
     * </li>
     * <li><p>DAILY: daily. The data is consistent with the bills aggregated by day in the User Center.</p>
     * </li>
     * </ul>
     * <p>If you set this parameter to DAILY, you must also specify <strong>BillingDate</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAVz7BQqj2xtiNSC3d3RAD38=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>si-49793f3bfa034ec6a990</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static ListServiceInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceBillRequest self = new ListServiceInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceBillRequest setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }
    public String getBillingCycle() {
        return this.billingCycle;
    }

    public ListServiceInstanceBillRequest setBillingDate(String billingDate) {
        this.billingDate = billingDate;
        return this;
    }
    public String getBillingDate() {
        return this.billingDate;
    }

    public ListServiceInstanceBillRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public ListServiceInstanceBillRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceBillRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceBillRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
