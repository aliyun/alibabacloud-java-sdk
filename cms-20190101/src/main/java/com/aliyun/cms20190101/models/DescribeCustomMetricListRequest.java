// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomMetricListRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Dimension")
    public String dimension;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeCustomMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomMetricListRequest self = new DescribeCustomMetricListRequest();
        return TeaModel.build(map, self);
    }

}
