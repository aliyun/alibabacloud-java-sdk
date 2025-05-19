// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class QueryCustomMetricListRequest extends TeaModel {
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Page")
    public String page;

    @NameInMap("Size")
    public String size;

    public static QueryCustomMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomMetricListRequest self = new QueryCustomMetricListRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomMetricListRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public QueryCustomMetricListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryCustomMetricListRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public QueryCustomMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public QueryCustomMetricListRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public QueryCustomMetricListRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
