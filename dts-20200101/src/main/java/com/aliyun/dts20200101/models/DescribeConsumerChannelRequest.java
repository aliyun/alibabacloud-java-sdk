// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConsumerChannelRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ParentChannelId")
    public String parentChannelId;

    public static DescribeConsumerChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsumerChannelRequest self = new DescribeConsumerChannelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConsumerChannelRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeConsumerChannelRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public DescribeConsumerChannelRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeConsumerChannelRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeConsumerChannelRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeConsumerChannelRequest setParentChannelId(String parentChannelId) {
        this.parentChannelId = parentChannelId;
        return this;
    }
    public String getParentChannelId() {
        return this.parentChannelId;
    }

}
