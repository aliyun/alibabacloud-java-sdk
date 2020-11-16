// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeMixStreamListRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("MixStreamId")
    public String mixStreamId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeMixStreamListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMixStreamListRequest self = new DescribeMixStreamListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMixStreamListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeMixStreamListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeMixStreamListRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public DescribeMixStreamListRequest setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    public DescribeMixStreamListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeMixStreamListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMixStreamListRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeMixStreamListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
