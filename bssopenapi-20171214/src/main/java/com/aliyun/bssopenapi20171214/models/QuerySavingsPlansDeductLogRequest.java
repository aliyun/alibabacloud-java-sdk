// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySavingsPlansDeductLogRequest extends TeaModel {
    /**
     * <p>The type of the instance ID based on which the data is queried. Valid values:</p>
     * <br>
     * <p>*   spn: queries data based on the ID of the savings plan instance.</p>
     * <p>*   product: queries data based on the ID of the cloud service instance.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The end of the billing cycle for which the fee is deducted.</p>
     */
    @NameInMap("Locale")
    public String locale;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The operation that you want to perform. Set the value to QuerySavingsPlansDeductLog.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static QuerySavingsPlansDeductLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySavingsPlansDeductLogRequest self = new QuerySavingsPlansDeductLogRequest();
        return TeaModel.build(map, self);
    }

    public QuerySavingsPlansDeductLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QuerySavingsPlansDeductLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QuerySavingsPlansDeductLogRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public QuerySavingsPlansDeductLogRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public QuerySavingsPlansDeductLogRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QuerySavingsPlansDeductLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySavingsPlansDeductLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
