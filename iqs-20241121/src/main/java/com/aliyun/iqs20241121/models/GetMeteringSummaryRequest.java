// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetMeteringSummaryRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>202505</p>
     */
    @NameInMap("billPeriod")
    public String billPeriod;

    @NameInMap("billingItem")
    public String billingItem;

    /**
     * <strong>example:</strong>
     * <p>20250522</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>20240920</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>2312312312312</p>
     */
    @NameInMap("subAccountId")
    public String subAccountId;

    public static GetMeteringSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMeteringSummaryRequest self = new GetMeteringSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetMeteringSummaryRequest setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public GetMeteringSummaryRequest setBillingItem(String billingItem) {
        this.billingItem = billingItem;
        return this;
    }
    public String getBillingItem() {
        return this.billingItem;
    }

    public GetMeteringSummaryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetMeteringSummaryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetMeteringSummaryRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
