// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorUsageShrinkRequest extends TeaModel {
    @NameInMap("ApiKeyIds")
    public String apiKeyIdsShrink;

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
    public String keysShrink;

    @NameInMap("ModelNames")
    public String modelNamesShrink;

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

    public static DescribeModelOperatorUsageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorUsageShrinkRequest self = new DescribeModelOperatorUsageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorUsageShrinkRequest setApiKeyIdsShrink(String apiKeyIdsShrink) {
        this.apiKeyIdsShrink = apiKeyIdsShrink;
        return this;
    }
    public String getApiKeyIdsShrink() {
        return this.apiKeyIdsShrink;
    }

    public DescribeModelOperatorUsageShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeModelOperatorUsageShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public DescribeModelOperatorUsageShrinkRequest setKeysShrink(String keysShrink) {
        this.keysShrink = keysShrink;
        return this;
    }
    public String getKeysShrink() {
        return this.keysShrink;
    }

    public DescribeModelOperatorUsageShrinkRequest setModelNamesShrink(String modelNamesShrink) {
        this.modelNamesShrink = modelNamesShrink;
        return this;
    }
    public String getModelNamesShrink() {
        return this.modelNamesShrink;
    }

    public DescribeModelOperatorUsageShrinkRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public DescribeModelOperatorUsageShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
