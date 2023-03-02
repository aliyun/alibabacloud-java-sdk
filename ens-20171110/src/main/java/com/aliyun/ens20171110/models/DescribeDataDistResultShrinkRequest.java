// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeDataDistResultShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DataNames")
    public String dataNames;

    @NameInMap("DataVersions")
    public String dataVersions;

    @NameInMap("EnsRegionIds")
    public String ensRegionIdsShrink;

    @NameInMap("InstanceIds")
    public String instanceIds;

    @NameInMap("MaxDate")
    public String maxDate;

    @NameInMap("MinDate")
    public String minDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeDataDistResultShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataDistResultShrinkRequest self = new DescribeDataDistResultShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataDistResultShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeDataDistResultShrinkRequest setDataNames(String dataNames) {
        this.dataNames = dataNames;
        return this;
    }
    public String getDataNames() {
        return this.dataNames;
    }

    public DescribeDataDistResultShrinkRequest setDataVersions(String dataVersions) {
        this.dataVersions = dataVersions;
        return this;
    }
    public String getDataVersions() {
        return this.dataVersions;
    }

    public DescribeDataDistResultShrinkRequest setEnsRegionIdsShrink(String ensRegionIdsShrink) {
        this.ensRegionIdsShrink = ensRegionIdsShrink;
        return this;
    }
    public String getEnsRegionIdsShrink() {
        return this.ensRegionIdsShrink;
    }

    public DescribeDataDistResultShrinkRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeDataDistResultShrinkRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeDataDistResultShrinkRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public DescribeDataDistResultShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataDistResultShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
