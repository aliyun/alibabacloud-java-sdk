// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorNamespaceListRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShowTaskStatistic")
    public Boolean showTaskStatistic;

    public static DescribeHybridMonitorNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorNamespaceListRequest self = new DescribeHybridMonitorNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorNamespaceListRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeHybridMonitorNamespaceListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeHybridMonitorNamespaceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorNamespaceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorNamespaceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridMonitorNamespaceListRequest setShowTaskStatistic(Boolean showTaskStatistic) {
        this.showTaskStatistic = showTaskStatistic;
        return this;
    }
    public Boolean getShowTaskStatistic() {
        return this.showTaskStatistic;
    }

}
