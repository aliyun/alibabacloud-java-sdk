// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDataExportTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("PageNumber")
    public String pageNumber;

    public static DescribeUserUsageDataExportTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDataExportTaskRequest self = new DescribeUserUsageDataExportTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDataExportTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeUserUsageDataExportTaskRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeUserUsageDataExportTaskRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

}
