// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListIvrTrackingDetailRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListIvrTrackingDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIvrTrackingDetailRequest self = new ListIvrTrackingDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListIvrTrackingDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListIvrTrackingDetailRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListIvrTrackingDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListIvrTrackingDetailRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

    public ListIvrTrackingDetailRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListIvrTrackingDetailRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ListIvrTrackingDetailRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIvrTrackingDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
