// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceBillRequest extends TeaModel {
    /**
     * <p>The billing cycle. Format: YYYY-MM.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05</p>
     */
    @NameInMap("BillingCycle")
    public String billingCycle;

    /**
     * <p>The billing date. This parameter is required only if the <strong>Granularity</strong> parameter is set to DAILY. Format: YYYY-MM-DD.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-01</p>
     */
    @NameInMap("BillingDate")
    public String billingDate;

    /**
     * <p>The granularity at which bills are queried. Valid values:</p>
     * <ul>
     * <li>MONTHLY: queries bills by month. The data queried is consistent with the data that is displayed for the specified billing cycle on the Billing Details tab of the Bill Details page in User Center.</li>
     * <li>DAILY: queries bills by day. The data queried is consistent with the data that is displayed for the specified day on the Billing Details tab of the Bill Details page in User Center.</li>
     * </ul>
     * <p>You must set the <strong>BillingDate</strong> parameter before you can set the Granularity parameter to DAILY.</p>
     * 
     * <strong>example:</strong>
     * <p>DAILY</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The number of entries page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAVz7BQqj2xtiNSC3d3RAD38=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The service instance ID.</p>
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
