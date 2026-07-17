// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserMaxPlanQuotaResponseBody extends TeaModel {
    /**
     * <p>The plan instance ID. You can obtain this value by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>esa-site-b09z4sk9pbls</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The plan name.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Free Edition: entranceplan</li>
     * <li>Basic: basic</li>
     * <li>Standard: medium</li>
     * <li>Premium Edition: high</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li>Entrance: entranceplan_intl</li>
     * <li>Pro: basicplan_intl</li>
     * <li>Premium: vipplan_intl</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The quota value.</p>
     * 
     * <strong>example:</strong>
     * <p>44640</p>
     */
    @NameInMap("QuotaValue")
    public String quotaValue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6599BB6-525D-5CFF-86BC-24068E6FB3EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserMaxPlanQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserMaxPlanQuotaResponseBody self = new GetUserMaxPlanQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserMaxPlanQuotaResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserMaxPlanQuotaResponseBody setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public GetUserMaxPlanQuotaResponseBody setQuotaValue(String quotaValue) {
        this.quotaValue = quotaValue;
        return this;
    }
    public String getQuotaValue() {
        return this.quotaValue;
    }

    public GetUserMaxPlanQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
