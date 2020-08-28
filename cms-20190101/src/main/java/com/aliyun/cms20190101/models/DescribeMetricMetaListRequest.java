// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMetricMetaListRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMetricMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetricMetaListRequest self = new DescribeMetricMetaListRequest();
        return TeaModel.build(map, self);
    }

}
