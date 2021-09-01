// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class ListEventAlgorithmDetailsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IsvId")
    public String isvId;

    public static ListEventAlgorithmDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventAlgorithmDetailsRequest self = new ListEventAlgorithmDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListEventAlgorithmDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEventAlgorithmDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEventAlgorithmDetailsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListEventAlgorithmDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListEventAlgorithmDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListEventAlgorithmDetailsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public ListEventAlgorithmDetailsRequest setIsvId(String isvId) {
        this.isvId = isvId;
        return this;
    }
    public String getIsvId() {
        return this.isvId;
    }

}
