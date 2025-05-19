// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryMetricMetaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[{\&quot;name\&quot;:\&quot;alertUnit\&quot;,\&quot;value\&quot;:\&quot;%\&quot;}]</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Project")
    public String project;

    public static QueryMetricMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricMetaRequest self = new QueryMetricMetaRequest();
        return TeaModel.build(map, self);
    }

    public QueryMetricMetaRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public QueryMetricMetaRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public QueryMetricMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryMetricMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMetricMetaRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
