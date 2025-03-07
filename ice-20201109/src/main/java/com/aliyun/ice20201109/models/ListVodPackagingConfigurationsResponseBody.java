// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListVodPackagingConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The packaging configurations.</p>
     */
    @NameInMap("PackagingConfigurations")
    public java.util.List<VodPackagingConfiguration> packagingConfigurations;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sorting order of the packaging configurations based on the time when they were created. Valid values:</p>
     * <ul>
     * <li>desc: descending order.</li>
     * <li>asc: ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListVodPackagingConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVodPackagingConfigurationsResponseBody self = new ListVodPackagingConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVodPackagingConfigurationsResponseBody setPackagingConfigurations(java.util.List<VodPackagingConfiguration> packagingConfigurations) {
        this.packagingConfigurations = packagingConfigurations;
        return this;
    }
    public java.util.List<VodPackagingConfiguration> getPackagingConfigurations() {
        return this.packagingConfigurations;
    }

    public ListVodPackagingConfigurationsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListVodPackagingConfigurationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVodPackagingConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVodPackagingConfigurationsResponseBody setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListVodPackagingConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
