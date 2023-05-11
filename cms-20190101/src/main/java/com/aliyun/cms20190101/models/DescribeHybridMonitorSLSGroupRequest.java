// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHybridMonitorSLSGroupRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The timestamp that was generated when the Logstore group was created.</p>
     * <br>
     * <p>Unit: milliseconds.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call is successful.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeHybridMonitorSLSGroup**.</p>
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
