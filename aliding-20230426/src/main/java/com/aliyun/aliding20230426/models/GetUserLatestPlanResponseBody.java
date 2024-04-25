// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserLatestPlanResponseBody extends TeaModel {
    @NameInMap("accountHandleStatus")
    public Integer accountHandleStatus;

    @NameInMap("accountHandleTime")
    public String accountHandleTime;

    @NameInMap("accountType")
    public Integer accountType;

    @NameInMap("agreementFirstSignTime")
    public String agreementFirstSignTime;

    @NameInMap("agreementLastSignTime")
    public String agreementLastSignTime;

    @NameInMap("agreementStatus")
    public Integer agreementStatus;

    @NameInMap("dataHandleEndTime")
    public String dataHandleEndTime;

    @NameInMap("dataHandleStartTime")
    public String dataHandleStartTime;

    @NameInMap("dataHandleStatus")
    public Integer dataHandleStatus;

    @NameInMap("exclusivePlan")
    public Integer exclusivePlan;

    @NameInMap("newAccountUid")
    public Long newAccountUid;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("status")
    public Integer status;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    @NameInMap("vendorType")
    public String vendorType;

    public static GetUserLatestPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserLatestPlanResponseBody self = new GetUserLatestPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserLatestPlanResponseBody setAccountHandleStatus(Integer accountHandleStatus) {
        this.accountHandleStatus = accountHandleStatus;
        return this;
    }
    public Integer getAccountHandleStatus() {
        return this.accountHandleStatus;
    }

    public GetUserLatestPlanResponseBody setAccountHandleTime(String accountHandleTime) {
        this.accountHandleTime = accountHandleTime;
        return this;
    }
    public String getAccountHandleTime() {
        return this.accountHandleTime;
    }

    public GetUserLatestPlanResponseBody setAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }
    public Integer getAccountType() {
        return this.accountType;
    }

    public GetUserLatestPlanResponseBody setAgreementFirstSignTime(String agreementFirstSignTime) {
        this.agreementFirstSignTime = agreementFirstSignTime;
        return this;
    }
    public String getAgreementFirstSignTime() {
        return this.agreementFirstSignTime;
    }

    public GetUserLatestPlanResponseBody setAgreementLastSignTime(String agreementLastSignTime) {
        this.agreementLastSignTime = agreementLastSignTime;
        return this;
    }
    public String getAgreementLastSignTime() {
        return this.agreementLastSignTime;
    }

    public GetUserLatestPlanResponseBody setAgreementStatus(Integer agreementStatus) {
        this.agreementStatus = agreementStatus;
        return this;
    }
    public Integer getAgreementStatus() {
        return this.agreementStatus;
    }

    public GetUserLatestPlanResponseBody setDataHandleEndTime(String dataHandleEndTime) {
        this.dataHandleEndTime = dataHandleEndTime;
        return this;
    }
    public String getDataHandleEndTime() {
        return this.dataHandleEndTime;
    }

    public GetUserLatestPlanResponseBody setDataHandleStartTime(String dataHandleStartTime) {
        this.dataHandleStartTime = dataHandleStartTime;
        return this;
    }
    public String getDataHandleStartTime() {
        return this.dataHandleStartTime;
    }

    public GetUserLatestPlanResponseBody setDataHandleStatus(Integer dataHandleStatus) {
        this.dataHandleStatus = dataHandleStatus;
        return this;
    }
    public Integer getDataHandleStatus() {
        return this.dataHandleStatus;
    }

    public GetUserLatestPlanResponseBody setExclusivePlan(Integer exclusivePlan) {
        this.exclusivePlan = exclusivePlan;
        return this;
    }
    public Integer getExclusivePlan() {
        return this.exclusivePlan;
    }

    public GetUserLatestPlanResponseBody setNewAccountUid(Long newAccountUid) {
        this.newAccountUid = newAccountUid;
        return this;
    }
    public Long getNewAccountUid() {
        return this.newAccountUid;
    }

    public GetUserLatestPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserLatestPlanResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetUserLatestPlanResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public GetUserLatestPlanResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
