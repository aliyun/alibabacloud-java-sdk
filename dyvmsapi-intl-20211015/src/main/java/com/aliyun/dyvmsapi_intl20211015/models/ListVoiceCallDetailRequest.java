// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListVoiceCallDetailRequest extends TeaModel {
    @NameInMap("BusinessType")
    public Long businessType;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CountryId")
    public String countryId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("HangupType")
    public Long hangupType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Long status;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskName")
    public String taskName;

    public static ListVoiceCallDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVoiceCallDetailRequest self = new ListVoiceCallDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListVoiceCallDetailRequest setBusinessType(Long businessType) {
        this.businessType = businessType;
        return this;
    }
    public Long getBusinessType() {
        return this.businessType;
    }

    public ListVoiceCallDetailRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ListVoiceCallDetailRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListVoiceCallDetailRequest setCountryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
    public String getCountryId() {
        return this.countryId;
    }

    public ListVoiceCallDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListVoiceCallDetailRequest setHangupType(Long hangupType) {
        this.hangupType = hangupType;
        return this;
    }
    public Long getHangupType() {
        return this.hangupType;
    }

    public ListVoiceCallDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListVoiceCallDetailRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListVoiceCallDetailRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListVoiceCallDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListVoiceCallDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListVoiceCallDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListVoiceCallDetailRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public ListVoiceCallDetailRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ListVoiceCallDetailRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
