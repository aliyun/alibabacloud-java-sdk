// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorSLSGroupRequest extends TeaModel {
    /**
     * <p>The keyword that is used to search for Logstore groups.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the Logstore group.</p>
     */
    @NameInMap("SLSGroupName")
    public String SLSGroupName;

    public static DescribeHybridMonitorSLSGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridMonitorSLSGroupRequest self = new DescribeHybridMonitorSLSGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridMonitorSLSGroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeHybridMonitorSLSGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHybridMonitorSLSGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeHybridMonitorSLSGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHybridMonitorSLSGroupRequest setSLSGroupName(String SLSGroupName) {
        this.SLSGroupName = SLSGroupName;
        return this;
    }
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

}
