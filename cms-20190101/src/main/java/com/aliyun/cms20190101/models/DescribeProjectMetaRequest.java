// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeProjectMetaRequest extends TeaModel {
    /**
     * <p>Indicates whether the call was successful. The value true indicates success. The value false indicates failure.</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The tags. Tags are used to filter services.</p>
     * <br>
     * <p>Tags are returned in the following format: `[{"name":"Tag key","value":"Tag value"}, {"name":"Tag key","value":"Tag value"}]`. The following tags are commonly used:</p>
     * <br>
     * <p>*   alertUnit: the unit of the metric value in alerts.</p>
     * <br>
     * <p>    If the unit is small, the original metric value may be too large. In this case, you can use the `alertUnit` tag to specify an appropriate unit. This tag is used in CloudMonitor.</p>
     * <br>
     * <p>*   minAlertPeriod: the minimum time interval to report a new alert. The interval is usually set to 1 minute.</p>
     * <br>
     * <p>*   metricCategory: the specification of the service. Example: kvstore_sharding.</p>
     * <br>
     * <p>    An Alibaba Cloud service may have different specifications that are defined in the same namespace. You can use this parameter to distinguish between service specifications.</p>
     * <br>
     * <p>*   is_alarm: specifies whether an alert rule can be set.</p>
     * <br>
     * <p>    We recommend that you do not use the special tags in the CloudMonitor console.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 10000.</p>
     * <br>
     * <p>Default value: 30.</p>
     * <br>
     * <p>>  The value of this parameter is not limited. You can view a large number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeProjectMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectMetaRequest self = new DescribeProjectMetaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectMetaRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DescribeProjectMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
