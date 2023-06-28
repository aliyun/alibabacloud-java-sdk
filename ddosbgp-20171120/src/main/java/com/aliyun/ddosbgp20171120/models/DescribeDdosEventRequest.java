// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeDdosEventRequest extends TeaModel {
    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("PackId")
    public String packId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartTime")
    public Integer startTime;

    public static DescribeDdosEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosEventRequest self = new DescribeDdosEventRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosEventRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeDdosEventRequest setPackId(String packId) {
        this.packId = packId;
        return this;
    }
    public String getPackId() {
        return this.packId;
    }

    public DescribeDdosEventRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeDdosEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDdosEventRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDdosEventRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
