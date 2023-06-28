// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeOnDemandInstanceRequest extends TeaModel {
    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the on-demand instance that you want to query. </p>
     * <br>
     * <p>>  You can call the [DescribeRegions](https://www.alibabacloud.com/help/en/ddos-protection/latest/instances-describeregions) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeOnDemandInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnDemandInstanceRequest self = new DescribeOnDemandInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnDemandInstanceRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeOnDemandInstanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOnDemandInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
