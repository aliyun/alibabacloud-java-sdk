// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUsageBillRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Day")
    public String day;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Type")
    public String type;

    public static DescribeUsageBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageBillRequest self = new DescribeUsageBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUsageBillRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeUsageBillRequest setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public DescribeUsageBillRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUsageBillRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeUsageBillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
