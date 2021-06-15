// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryDPUtilizationDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceSpec")
    public String instanceSpec;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("DeductedInstanceId")
    public String deductedInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("LastToken")
    public String lastToken;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("IncludeShare")
    public Boolean includeShare;

    public static QueryDPUtilizationDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDPUtilizationDetailRequest self = new QueryDPUtilizationDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryDPUtilizationDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDPUtilizationDetailRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public QueryDPUtilizationDetailRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public QueryDPUtilizationDetailRequest setDeductedInstanceId(String deductedInstanceId) {
        this.deductedInstanceId = deductedInstanceId;
        return this;
    }
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    public QueryDPUtilizationDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryDPUtilizationDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryDPUtilizationDetailRequest setLastToken(String lastToken) {
        this.lastToken = lastToken;
        return this;
    }
    public String getLastToken() {
        return this.lastToken;
    }

    public QueryDPUtilizationDetailRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public QueryDPUtilizationDetailRequest setIncludeShare(Boolean includeShare) {
        this.includeShare = includeShare;
        return this;
    }
    public Boolean getIncludeShare() {
        return this.includeShare;
    }

}
