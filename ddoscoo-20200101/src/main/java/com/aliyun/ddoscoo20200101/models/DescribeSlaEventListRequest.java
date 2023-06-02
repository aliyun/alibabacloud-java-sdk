// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlaEventListRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Region")
    public String region;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeSlaEventListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlaEventListRequest self = new DescribeSlaEventListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlaEventListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeSlaEventListRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeSlaEventListRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeSlaEventListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSlaEventListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeSlaEventListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
