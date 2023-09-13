// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListCardInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListCardInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCardInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCardInfoResponseBody self = new ListCardInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCardInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCardInfoResponseBody setData(ListCardInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCardInfoResponseBodyData getData() {
        return this.data;
    }

    public ListCardInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCardInfoResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public ListCardInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCardInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCardInfoResponseBodyDataListTagList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("TagName")
        public String tagName;

        public static ListCardInfoResponseBodyDataListTagList build(java.util.Map<String, ?> map) throws Exception {
            ListCardInfoResponseBodyDataListTagList self = new ListCardInfoResponseBodyDataListTagList();
            return TeaModel.build(map, self);
        }

        public ListCardInfoResponseBodyDataListTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCardInfoResponseBodyDataListTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class ListCardInfoResponseBodyDataList extends TeaModel {
        @NameInMap("ActiveTime")
        public String activeTime;

        @NameInMap("ActiveType")
        public String activeType;

        @NameInMap("AliFee")
        public String aliFee;

        @NameInMap("AliyunOrderId")
        public String aliyunOrderId;

        @NameInMap("ApnName")
        public String apnName;

        @NameInMap("CertifyType")
        public String certifyType;

        @NameInMap("CredentialInstanceId")
        public String credentialInstanceId;

        @NameInMap("CredentialNo")
        public String credentialNo;

        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("DataLevel")
        public String dataLevel;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DirectionalGroupId")
        public Long directionalGroupId;

        @NameInMap("DirectionalGroupName")
        public String directionalGroupName;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FlowLatestModifiedTime")
        public String flowLatestModifiedTime;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Imsi")
        public java.util.List<String> imsi;

        @NameInMap("IsAutoRecharge")
        public Boolean isAutoRecharge;

        @NameInMap("Msisdn")
        public java.util.List<String> msisdn;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("NotifyId")
        public String notifyId;

        @NameInMap("OpenAccountTime")
        public String openAccountTime;

        @NameInMap("OsStatus")
        public String osStatus;

        @NameInMap("Period")
        public String period;

        @NameInMap("PeriodAddFlow")
        public String periodAddFlow;

        @NameInMap("PeriodRestFlow")
        public String periodRestFlow;

        @NameInMap("PeriodSmsUse")
        public String periodSmsUse;

        @NameInMap("PrivateNetworkSegment")
        public String privateNetworkSegment;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SimType")
        public String simType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagList")
        public java.util.List<ListCardInfoResponseBodyDataListTagList> tagList;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("VsimInstanceId")
        public Long vsimInstanceId;

        public static ListCardInfoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListCardInfoResponseBodyDataList self = new ListCardInfoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListCardInfoResponseBodyDataList setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public ListCardInfoResponseBodyDataList setActiveType(String activeType) {
            this.activeType = activeType;
            return this;
        }
        public String getActiveType() {
            return this.activeType;
        }

        public ListCardInfoResponseBodyDataList setAliFee(String aliFee) {
            this.aliFee = aliFee;
            return this;
        }
        public String getAliFee() {
            return this.aliFee;
        }

        public ListCardInfoResponseBodyDataList setAliyunOrderId(String aliyunOrderId) {
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }
        public String getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        public ListCardInfoResponseBodyDataList setApnName(String apnName) {
            this.apnName = apnName;
            return this;
        }
        public String getApnName() {
            return this.apnName;
        }

        public ListCardInfoResponseBodyDataList setCertifyType(String certifyType) {
            this.certifyType = certifyType;
            return this;
        }
        public String getCertifyType() {
            return this.certifyType;
        }

        public ListCardInfoResponseBodyDataList setCredentialInstanceId(String credentialInstanceId) {
            this.credentialInstanceId = credentialInstanceId;
            return this;
        }
        public String getCredentialInstanceId() {
            return this.credentialInstanceId;
        }

        public ListCardInfoResponseBodyDataList setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public ListCardInfoResponseBodyDataList setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public ListCardInfoResponseBodyDataList setDataLevel(String dataLevel) {
            this.dataLevel = dataLevel;
            return this;
        }
        public String getDataLevel() {
            return this.dataLevel;
        }

        public ListCardInfoResponseBodyDataList setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListCardInfoResponseBodyDataList setDirectionalGroupId(Long directionalGroupId) {
            this.directionalGroupId = directionalGroupId;
            return this;
        }
        public Long getDirectionalGroupId() {
            return this.directionalGroupId;
        }

        public ListCardInfoResponseBodyDataList setDirectionalGroupName(String directionalGroupName) {
            this.directionalGroupName = directionalGroupName;
            return this;
        }
        public String getDirectionalGroupName() {
            return this.directionalGroupName;
        }

        public ListCardInfoResponseBodyDataList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListCardInfoResponseBodyDataList setFlowLatestModifiedTime(String flowLatestModifiedTime) {
            this.flowLatestModifiedTime = flowLatestModifiedTime;
            return this;
        }
        public String getFlowLatestModifiedTime() {
            return this.flowLatestModifiedTime;
        }

        public ListCardInfoResponseBodyDataList setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public ListCardInfoResponseBodyDataList setImsi(java.util.List<String> imsi) {
            this.imsi = imsi;
            return this;
        }
        public java.util.List<String> getImsi() {
            return this.imsi;
        }

        public ListCardInfoResponseBodyDataList setIsAutoRecharge(Boolean isAutoRecharge) {
            this.isAutoRecharge = isAutoRecharge;
            return this;
        }
        public Boolean getIsAutoRecharge() {
            return this.isAutoRecharge;
        }

        public ListCardInfoResponseBodyDataList setMsisdn(java.util.List<String> msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public java.util.List<String> getMsisdn() {
            return this.msisdn;
        }

        public ListCardInfoResponseBodyDataList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListCardInfoResponseBodyDataList setNotifyId(String notifyId) {
            this.notifyId = notifyId;
            return this;
        }
        public String getNotifyId() {
            return this.notifyId;
        }

        public ListCardInfoResponseBodyDataList setOpenAccountTime(String openAccountTime) {
            this.openAccountTime = openAccountTime;
            return this;
        }
        public String getOpenAccountTime() {
            return this.openAccountTime;
        }

        public ListCardInfoResponseBodyDataList setOsStatus(String osStatus) {
            this.osStatus = osStatus;
            return this;
        }
        public String getOsStatus() {
            return this.osStatus;
        }

        public ListCardInfoResponseBodyDataList setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public ListCardInfoResponseBodyDataList setPeriodAddFlow(String periodAddFlow) {
            this.periodAddFlow = periodAddFlow;
            return this;
        }
        public String getPeriodAddFlow() {
            return this.periodAddFlow;
        }

        public ListCardInfoResponseBodyDataList setPeriodRestFlow(String periodRestFlow) {
            this.periodRestFlow = periodRestFlow;
            return this;
        }
        public String getPeriodRestFlow() {
            return this.periodRestFlow;
        }

        public ListCardInfoResponseBodyDataList setPeriodSmsUse(String periodSmsUse) {
            this.periodSmsUse = periodSmsUse;
            return this;
        }
        public String getPeriodSmsUse() {
            return this.periodSmsUse;
        }

        public ListCardInfoResponseBodyDataList setPrivateNetworkSegment(String privateNetworkSegment) {
            this.privateNetworkSegment = privateNetworkSegment;
            return this;
        }
        public String getPrivateNetworkSegment() {
            return this.privateNetworkSegment;
        }

        public ListCardInfoResponseBodyDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListCardInfoResponseBodyDataList setSimType(String simType) {
            this.simType = simType;
            return this;
        }
        public String getSimType() {
            return this.simType;
        }

        public ListCardInfoResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCardInfoResponseBodyDataList setTagList(java.util.List<ListCardInfoResponseBodyDataListTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<ListCardInfoResponseBodyDataListTagList> getTagList() {
            return this.tagList;
        }

        public ListCardInfoResponseBodyDataList setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListCardInfoResponseBodyDataList setVsimInstanceId(Long vsimInstanceId) {
            this.vsimInstanceId = vsimInstanceId;
            return this;
        }
        public Long getVsimInstanceId() {
            return this.vsimInstanceId;
        }

    }

    public static class ListCardInfoResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListCardInfoResponseBodyDataList> list;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListCardInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCardInfoResponseBodyData self = new ListCardInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCardInfoResponseBodyData setList(java.util.List<ListCardInfoResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListCardInfoResponseBodyDataList> getList() {
            return this.list;
        }

        public ListCardInfoResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListCardInfoResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListCardInfoResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCardInfoResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
