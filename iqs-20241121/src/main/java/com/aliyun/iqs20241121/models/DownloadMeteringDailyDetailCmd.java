// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class DownloadMeteringDailyDetailCmd extends TeaModel {
    @NameInMap("billPeriod")
    public String billPeriod;

    @NameInMap("billingItem")
    public String billingItem;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static DownloadMeteringDailyDetailCmd build(java.util.Map<String, ?> map) throws Exception {
        DownloadMeteringDailyDetailCmd self = new DownloadMeteringDailyDetailCmd();
        return TeaModel.build(map, self);
    }

    public DownloadMeteringDailyDetailCmd setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public DownloadMeteringDailyDetailCmd setBillingItem(String billingItem) {
        this.billingItem = billingItem;
        return this;
    }
    public String getBillingItem() {
        return this.billingItem;
    }

    public DownloadMeteringDailyDetailCmd setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DownloadMeteringDailyDetailCmd setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DownloadMeteringDailyDetailCmd setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
