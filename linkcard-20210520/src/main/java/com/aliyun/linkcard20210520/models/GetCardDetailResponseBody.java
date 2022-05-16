// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCardDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCardDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardDetailResponseBody self = new GetCardDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardDetailResponseBody setData(GetCardDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCardDetailResponseBodyData getData() {
        return this.data;
    }

    public GetCardDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCardDetailResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public GetCardDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardDetailResponseBodyDataListPsimCards extends TeaModel {
        @NameInMap("ApnName")
        public String apnName;

        @NameInMap("CertifyStatus")
        public String certifyStatus;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Imsi")
        public java.util.List<String> imsi;

        @NameInMap("Ip")
        public java.util.List<String> ip;

        @NameInMap("Msisdn")
        public java.util.List<String> msisdn;

        @NameInMap("OpenSms")
        public Boolean openSms;

        @NameInMap("OsStatus")
        public String osStatus;

        @NameInMap("PeriodAddFlow")
        public String periodAddFlow;

        @NameInMap("PeriodSmsUse")
        public String periodSmsUse;

        @NameInMap("PrivateNetworkSegment")
        public String privateNetworkSegment;

        @NameInMap("Status")
        public String status;

        @NameInMap("Vendor")
        public String vendor;

        public static GetCardDetailResponseBodyDataListPsimCards build(java.util.Map<String, ?> map) throws Exception {
            GetCardDetailResponseBodyDataListPsimCards self = new GetCardDetailResponseBodyDataListPsimCards();
            return TeaModel.build(map, self);
        }

        public GetCardDetailResponseBodyDataListPsimCards setApnName(String apnName) {
            this.apnName = apnName;
            return this;
        }
        public String getApnName() {
            return this.apnName;
        }

        public GetCardDetailResponseBodyDataListPsimCards setCertifyStatus(String certifyStatus) {
            this.certifyStatus = certifyStatus;
            return this;
        }
        public String getCertifyStatus() {
            return this.certifyStatus;
        }

        public GetCardDetailResponseBodyDataListPsimCards setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public GetCardDetailResponseBodyDataListPsimCards setImsi(java.util.List<String> imsi) {
            this.imsi = imsi;
            return this;
        }
        public java.util.List<String> getImsi() {
            return this.imsi;
        }

        public GetCardDetailResponseBodyDataListPsimCards setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public GetCardDetailResponseBodyDataListPsimCards setMsisdn(java.util.List<String> msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public java.util.List<String> getMsisdn() {
            return this.msisdn;
        }

        public GetCardDetailResponseBodyDataListPsimCards setOpenSms(Boolean openSms) {
            this.openSms = openSms;
            return this;
        }
        public Boolean getOpenSms() {
            return this.openSms;
        }

        public GetCardDetailResponseBodyDataListPsimCards setOsStatus(String osStatus) {
            this.osStatus = osStatus;
            return this;
        }
        public String getOsStatus() {
            return this.osStatus;
        }

        public GetCardDetailResponseBodyDataListPsimCards setPeriodAddFlow(String periodAddFlow) {
            this.periodAddFlow = periodAddFlow;
            return this;
        }
        public String getPeriodAddFlow() {
            return this.periodAddFlow;
        }

        public GetCardDetailResponseBodyDataListPsimCards setPeriodSmsUse(String periodSmsUse) {
            this.periodSmsUse = periodSmsUse;
            return this;
        }
        public String getPeriodSmsUse() {
            return this.periodSmsUse;
        }

        public GetCardDetailResponseBodyDataListPsimCards setPrivateNetworkSegment(String privateNetworkSegment) {
            this.privateNetworkSegment = privateNetworkSegment;
            return this;
        }
        public String getPrivateNetworkSegment() {
            return this.privateNetworkSegment;
        }

        public GetCardDetailResponseBodyDataListPsimCards setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCardDetailResponseBodyDataListPsimCards setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

    public static class GetCardDetailResponseBodyDataVsimCardInfoTagList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("TagName")
        public String tagName;

        public static GetCardDetailResponseBodyDataVsimCardInfoTagList build(java.util.Map<String, ?> map) throws Exception {
            GetCardDetailResponseBodyDataVsimCardInfoTagList self = new GetCardDetailResponseBodyDataVsimCardInfoTagList();
            return TeaModel.build(map, self);
        }

        public GetCardDetailResponseBodyDataVsimCardInfoTagList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCardDetailResponseBodyDataVsimCardInfoTagList setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class GetCardDetailResponseBodyDataVsimCardInfo extends TeaModel {
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

        @NameInMap("AutoLimitResume")
        public Boolean autoLimitResume;

        @NameInMap("AutoRebindReuse")
        public Boolean autoRebindReuse;

        @NameInMap("CardLimitSpeedThreshold")
        public Integer cardLimitSpeedThreshold;

        @NameInMap("CardLimitStopThreshold")
        public Integer cardLimitStopThreshold;

        @NameInMap("CertifyStatus")
        public String certifyStatus;

        @NameInMap("CertifyType")
        public String certifyType;

        @NameInMap("CredentialInstanceId")
        public String credentialInstanceId;

        @NameInMap("CredentialLimitSpeedThreshold")
        public Integer credentialLimitSpeedThreshold;

        @NameInMap("CredentialLimitStopThreshold")
        public Integer credentialLimitStopThreshold;

        @NameInMap("CredentialNo")
        public String credentialNo;

        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("DataLevel")
        public String dataLevel;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("DeviceImei")
        public String deviceImei;

        @NameInMap("DirectionalGroupId")
        public String directionalGroupId;

        @NameInMap("DirectionalGroupName")
        public String directionalGroupName;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FlowThresholdUnit")
        public String flowThresholdUnit;

        @NameInMap("Iccid")
        public String iccid;

        @NameInMap("Imsi")
        public java.util.List<String> imsi;

        @NameInMap("Ip")
        public java.util.List<String> ip;

        @NameInMap("IsAutoRecharge")
        public Boolean isAutoRecharge;

        @NameInMap("Msisdn")
        public java.util.List<String> msisdn;

        @NameInMap("NotifyId")
        public String notifyId;

        @NameInMap("OpenAccountTime")
        public String openAccountTime;

        @NameInMap("OpenSms")
        public Boolean openSms;

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

        @NameInMap("SimType")
        public String simType;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagList")
        public java.util.List<GetCardDetailResponseBodyDataVsimCardInfoTagList> tagList;

        @NameInMap("Vendor")
        public String vendor;

        @NameInMap("VsimInstanceId")
        public Integer vsimInstanceId;

        public static GetCardDetailResponseBodyDataVsimCardInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCardDetailResponseBodyDataVsimCardInfo self = new GetCardDetailResponseBodyDataVsimCardInfo();
            return TeaModel.build(map, self);
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setActiveTime(String activeTime) {
            this.activeTime = activeTime;
            return this;
        }
        public String getActiveTime() {
            return this.activeTime;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setActiveType(String activeType) {
            this.activeType = activeType;
            return this;
        }
        public String getActiveType() {
            return this.activeType;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setAliFee(String aliFee) {
            this.aliFee = aliFee;
            return this;
        }
        public String getAliFee() {
            return this.aliFee;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setAliyunOrderId(String aliyunOrderId) {
            this.aliyunOrderId = aliyunOrderId;
            return this;
        }
        public String getAliyunOrderId() {
            return this.aliyunOrderId;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setApnName(String apnName) {
            this.apnName = apnName;
            return this;
        }
        public String getApnName() {
            return this.apnName;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setAutoLimitResume(Boolean autoLimitResume) {
            this.autoLimitResume = autoLimitResume;
            return this;
        }
        public Boolean getAutoLimitResume() {
            return this.autoLimitResume;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setAutoRebindReuse(Boolean autoRebindReuse) {
            this.autoRebindReuse = autoRebindReuse;
            return this;
        }
        public Boolean getAutoRebindReuse() {
            return this.autoRebindReuse;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCardLimitSpeedThreshold(Integer cardLimitSpeedThreshold) {
            this.cardLimitSpeedThreshold = cardLimitSpeedThreshold;
            return this;
        }
        public Integer getCardLimitSpeedThreshold() {
            return this.cardLimitSpeedThreshold;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCardLimitStopThreshold(Integer cardLimitStopThreshold) {
            this.cardLimitStopThreshold = cardLimitStopThreshold;
            return this;
        }
        public Integer getCardLimitStopThreshold() {
            return this.cardLimitStopThreshold;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCertifyStatus(String certifyStatus) {
            this.certifyStatus = certifyStatus;
            return this;
        }
        public String getCertifyStatus() {
            return this.certifyStatus;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCertifyType(String certifyType) {
            this.certifyType = certifyType;
            return this;
        }
        public String getCertifyType() {
            return this.certifyType;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCredentialInstanceId(String credentialInstanceId) {
            this.credentialInstanceId = credentialInstanceId;
            return this;
        }
        public String getCredentialInstanceId() {
            return this.credentialInstanceId;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCredentialLimitSpeedThreshold(Integer credentialLimitSpeedThreshold) {
            this.credentialLimitSpeedThreshold = credentialLimitSpeedThreshold;
            return this;
        }
        public Integer getCredentialLimitSpeedThreshold() {
            return this.credentialLimitSpeedThreshold;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCredentialLimitStopThreshold(Integer credentialLimitStopThreshold) {
            this.credentialLimitStopThreshold = credentialLimitStopThreshold;
            return this;
        }
        public Integer getCredentialLimitStopThreshold() {
            return this.credentialLimitStopThreshold;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setDataLevel(String dataLevel) {
            this.dataLevel = dataLevel;
            return this;
        }
        public String getDataLevel() {
            return this.dataLevel;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setDeviceImei(String deviceImei) {
            this.deviceImei = deviceImei;
            return this;
        }
        public String getDeviceImei() {
            return this.deviceImei;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setDirectionalGroupId(String directionalGroupId) {
            this.directionalGroupId = directionalGroupId;
            return this;
        }
        public String getDirectionalGroupId() {
            return this.directionalGroupId;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setDirectionalGroupName(String directionalGroupName) {
            this.directionalGroupName = directionalGroupName;
            return this;
        }
        public String getDirectionalGroupName() {
            return this.directionalGroupName;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setFlowThresholdUnit(String flowThresholdUnit) {
            this.flowThresholdUnit = flowThresholdUnit;
            return this;
        }
        public String getFlowThresholdUnit() {
            return this.flowThresholdUnit;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setIccid(String iccid) {
            this.iccid = iccid;
            return this;
        }
        public String getIccid() {
            return this.iccid;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setImsi(java.util.List<String> imsi) {
            this.imsi = imsi;
            return this;
        }
        public java.util.List<String> getImsi() {
            return this.imsi;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setIsAutoRecharge(Boolean isAutoRecharge) {
            this.isAutoRecharge = isAutoRecharge;
            return this;
        }
        public Boolean getIsAutoRecharge() {
            return this.isAutoRecharge;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setMsisdn(java.util.List<String> msisdn) {
            this.msisdn = msisdn;
            return this;
        }
        public java.util.List<String> getMsisdn() {
            return this.msisdn;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setNotifyId(String notifyId) {
            this.notifyId = notifyId;
            return this;
        }
        public String getNotifyId() {
            return this.notifyId;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setOpenAccountTime(String openAccountTime) {
            this.openAccountTime = openAccountTime;
            return this;
        }
        public String getOpenAccountTime() {
            return this.openAccountTime;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setOpenSms(Boolean openSms) {
            this.openSms = openSms;
            return this;
        }
        public Boolean getOpenSms() {
            return this.openSms;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setOsStatus(String osStatus) {
            this.osStatus = osStatus;
            return this;
        }
        public String getOsStatus() {
            return this.osStatus;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setPeriod(String period) {
            this.period = period;
            return this;
        }
        public String getPeriod() {
            return this.period;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setPeriodAddFlow(String periodAddFlow) {
            this.periodAddFlow = periodAddFlow;
            return this;
        }
        public String getPeriodAddFlow() {
            return this.periodAddFlow;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setPeriodRestFlow(String periodRestFlow) {
            this.periodRestFlow = periodRestFlow;
            return this;
        }
        public String getPeriodRestFlow() {
            return this.periodRestFlow;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setPeriodSmsUse(String periodSmsUse) {
            this.periodSmsUse = periodSmsUse;
            return this;
        }
        public String getPeriodSmsUse() {
            return this.periodSmsUse;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setPrivateNetworkSegment(String privateNetworkSegment) {
            this.privateNetworkSegment = privateNetworkSegment;
            return this;
        }
        public String getPrivateNetworkSegment() {
            return this.privateNetworkSegment;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setSimType(String simType) {
            this.simType = simType;
            return this;
        }
        public String getSimType() {
            return this.simType;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setTagList(java.util.List<GetCardDetailResponseBodyDataVsimCardInfoTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetCardDetailResponseBodyDataVsimCardInfoTagList> getTagList() {
            return this.tagList;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public GetCardDetailResponseBodyDataVsimCardInfo setVsimInstanceId(Integer vsimInstanceId) {
            this.vsimInstanceId = vsimInstanceId;
            return this;
        }
        public Integer getVsimInstanceId() {
            return this.vsimInstanceId;
        }

    }

    public static class GetCardDetailResponseBodyData extends TeaModel {
        @NameInMap("ListPsimCards")
        public java.util.List<GetCardDetailResponseBodyDataListPsimCards> listPsimCards;

        @NameInMap("VsimCardInfo")
        public GetCardDetailResponseBodyDataVsimCardInfo vsimCardInfo;

        public static GetCardDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCardDetailResponseBodyData self = new GetCardDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCardDetailResponseBodyData setListPsimCards(java.util.List<GetCardDetailResponseBodyDataListPsimCards> listPsimCards) {
            this.listPsimCards = listPsimCards;
            return this;
        }
        public java.util.List<GetCardDetailResponseBodyDataListPsimCards> getListPsimCards() {
            return this.listPsimCards;
        }

        public GetCardDetailResponseBodyData setVsimCardInfo(GetCardDetailResponseBodyDataVsimCardInfo vsimCardInfo) {
            this.vsimCardInfo = vsimCardInfo;
            return this;
        }
        public GetCardDetailResponseBodyDataVsimCardInfo getVsimCardInfo() {
            return this.vsimCardInfo;
        }

    }

}
