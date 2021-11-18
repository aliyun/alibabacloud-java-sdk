// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListCallDetailRecordsRequest extends TeaModel {
    @NameInMap("ContactDisposition")
    public String contactDisposition;

    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("ContactType")
    public String contactType;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    @NameInMap("WithRecording")
    public Boolean withRecording;

    public static ListCallDetailRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallDetailRecordsRequest self = new ListCallDetailRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListCallDetailRecordsRequest setContactDisposition(String contactDisposition) {
        this.contactDisposition = contactDisposition;
        return this;
    }
    public String getContactDisposition() {
        return this.contactDisposition;
    }

    public ListCallDetailRecordsRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ListCallDetailRecordsRequest setContactType(String contactType) {
        this.contactType = contactType;
        return this;
    }
    public String getContactType() {
        return this.contactType;
    }

    public ListCallDetailRecordsRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ListCallDetailRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCallDetailRecordsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListCallDetailRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCallDetailRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCallDetailRecordsRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ListCallDetailRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCallDetailRecordsRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

    public ListCallDetailRecordsRequest setWithRecording(Boolean withRecording) {
        this.withRecording = withRecording;
        return this;
    }
    public Boolean getWithRecording() {
        return this.withRecording;
    }

}
