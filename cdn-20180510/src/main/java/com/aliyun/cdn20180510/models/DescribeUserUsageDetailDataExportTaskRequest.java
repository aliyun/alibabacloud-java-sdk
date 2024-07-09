// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDetailDataExportTaskRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>.</p>
     * <p>Valid values: an integer from <strong>1</strong> to <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
