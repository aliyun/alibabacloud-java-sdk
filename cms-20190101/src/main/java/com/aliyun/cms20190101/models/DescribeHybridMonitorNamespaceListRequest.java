// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorNamespaceListRequest extends TeaModel {
    /**
     * <p>The keyword for the search.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The name of the namespace.</p>
     * <p>The name can contain uppercase letters, lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to display the configuration details of data import tasks for Alibaba Cloud services and the number of data import tasks for non-Alibaba Cloud services. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
