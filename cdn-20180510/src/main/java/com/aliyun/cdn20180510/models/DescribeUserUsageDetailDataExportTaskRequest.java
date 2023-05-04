// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDetailDataExportTaskRequest extends TeaModel {
    /**
     * <p>The name of the task.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The usage details returned per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeUserUsageDetailDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDetailDataExportTaskRequest self = new DescribeUserUsageDetailDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDetailDataExportTaskRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserUsageDetailDataExportTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
