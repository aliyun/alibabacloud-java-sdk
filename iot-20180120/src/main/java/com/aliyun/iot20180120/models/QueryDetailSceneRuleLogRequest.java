// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDetailSceneRuleLogRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("RuleId")
    @Validation(required = true)
    public String ruleId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public Integer startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Integer endTime;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    public static QueryDetailSceneRuleLogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailSceneRuleLogRequest self = new QueryDetailSceneRuleLogRequest();
        return TeaModel.build(map, self);
    }

    public QueryDetailSceneRuleLogRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDetailSceneRuleLogRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public QueryDetailSceneRuleLogRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public QueryDetailSceneRuleLogRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryDetailSceneRuleLogRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryDetailSceneRuleLogRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDetailSceneRuleLogRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
