// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamsControlHistoryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Rows")
    public Integer rows;

    public static DescribeLiveStreamsControlHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamsControlHistoryRequest self = new DescribeLiveStreamsControlHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamsControlHistoryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveStreamsControlHistoryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamsControlHistoryRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveStreamsControlHistoryRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveStreamsControlHistoryRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveStreamsControlHistoryRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public DescribeLiveStreamsControlHistoryRequest setRows(Integer rows) {
        this.rows = rows;
        return this;
    }
    public Integer getRows() {
        return this.rows;
    }

}
