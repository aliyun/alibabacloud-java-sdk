// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorUsageRequest extends TeaModel {
    @NameInMap("ApiKeyIds")
    public java.util.List<Integer> apiKeyIds;

    /**
     * <strong>example:</strong>
     * <p>2026-06-02T00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>model</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("Keys")
    public java.util.List<String> keys;

    @NameInMap("ModelNames")
    public java.util.List<String> modelNames;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>2026-06-01T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeModelOperatorUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorUsageRequest self = new DescribeModelOperatorUsageRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorUsageRequest setApiKeyIds(java.util.List<Integer> apiKeyIds) {
        this.apiKeyIds = apiKeyIds;
        return this;
    }
    public java.util.List<Integer> getApiKeyIds() {
        return this.apiKeyIds;
    }

    public DescribeModelOperatorUsageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeModelOperatorUsageRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeModelOperatorUsageRequest setKeys(java.util.List<String> keys) {
        this.keys = keys;
        return this;
    }
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    public DescribeModelOperatorUsageRequest setModelNames(java.util.List<String> modelNames) {
        this.modelNames = modelNames;
        return this;
    }
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

    public DescribeModelOperatorUsageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeModelOperatorUsageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
