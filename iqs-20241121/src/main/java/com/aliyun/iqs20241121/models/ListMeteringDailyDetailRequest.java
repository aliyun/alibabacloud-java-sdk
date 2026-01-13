// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ListMeteringDailyDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>202506</p>
     */
    @NameInMap("billPeriod")
    public String billPeriod;

    @NameInMap("billingItem")
    public String billingItem;

    /**
     * <strong>example:</strong>
     * <p>20240908</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>20240908</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>23432423423434</p>
     */
    @NameInMap("subAccountId")
    public String subAccountId;

    public static ListMeteringDailyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMeteringDailyDetailRequest self = new ListMeteringDailyDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListMeteringDailyDetailRequest setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
        return this;
    }
    public String getBillPeriod() {
        return this.billPeriod;
    }

    public ListMeteringDailyDetailRequest setBillingItem(String billingItem) {
        this.billingItem = billingItem;
        return this;
    }
    public String getBillingItem() {
        return this.billingItem;
    }

    public ListMeteringDailyDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListMeteringDailyDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMeteringDailyDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMeteringDailyDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListMeteringDailyDetailRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
