// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryRIUtilizationDetailRequest extends TeaModel {
    @NameInMap("RIInstanceId")
    public String RIInstanceId;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("RICommodityCode")
    public String RICommodityCode;

    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryRIUtilizationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRIUtilizationDetailRequest self = new QueryRIUtilizationDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryRIUtilizationDetailRequest setRIInstanceId(String RIInstanceId) {
        this.RIInstanceId = RIInstanceId;
        return this;
    }
    public String getRIInstanceId() {
        return this.RIInstanceId;
    }

    public QueryRIUtilizationDetailRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public QueryRIUtilizationDetailRequest setRICommodityCode(String RICommodityCode) {
        this.RICommodityCode = RICommodityCode;
        return this;
    }
    public String getRICommodityCode() {
        return this.RICommodityCode;
    }

    public QueryRIUtilizationDetailRequest setDeductedInstanceId(String deductedInstanceId) {
        this.deductedInstanceId = deductedInstanceId;
        return this;
    }
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    public QueryRIUtilizationDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryRIUtilizationDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryRIUtilizationDetailRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRIUtilizationDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
