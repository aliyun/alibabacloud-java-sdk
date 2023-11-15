// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEventResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeAlertsWithEventResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertsWithEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEventResponseBody self = new DescribeAlertsWithEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEventResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertsWithEventResponseBody setData(DescribeAlertsWithEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlertsWithEventResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlertsWithEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertsWithEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertsWithEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertsWithEventResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAlertsWithEventResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEventResponseBodyDataPageInfo self = new DescribeAlertsWithEventResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEventResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAlertsWithEventResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAlertsWithEventResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyName")
        public String keyName;

        @NameInMap("Values")
        public String values;

        public static DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList self = new DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeAlertsWithEventResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AlertDesc")
        public String alertDesc;

        @NameInMap("AlertDescCode")
        public String alertDescCode;

        @NameInMap("AlertDescEn")
        public String alertDescEn;

        @NameInMap("AlertDetail")
        public String alertDetail;

        @NameInMap("AlertInfoList")
        public java.util.List<DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList> alertInfoList;

        @NameInMap("AlertLevel")
        public String alertLevel;

        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertNameCode")
        public String alertNameCode;

        @NameInMap("AlertNameEn")
        public String alertNameEn;

        @NameInMap("AlertSrcProd")
        public String alertSrcProd;

        @NameInMap("AlertSrcProdModule")
        public String alertSrcProdModule;

        @NameInMap("AlertTitle")
        public String alertTitle;

        @NameInMap("AlertTitleEn")
        public String alertTitleEn;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("AlertTypeCode")
        public String alertTypeCode;

        @NameInMap("AlertTypeEn")
        public String alertTypeEn;

        @NameInMap("AlertUuid")
        public String alertUuid;

        @NameInMap("AssetList")
        public String assetList;

        @NameInMap("AttCk")
        public String attCk;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("IsDefend")
        public String isDefend;

        @NameInMap("LogTime")
        public String logTime;

        @NameInMap("LogUuid")
        public String logUuid;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("OccurTime")
        public String occurTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SubUserId")
        public Long subUserId;

        public static DescribeAlertsWithEventResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEventResponseBodyDataResponseData self = new DescribeAlertsWithEventResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertDesc(String alertDesc) {
            this.alertDesc = alertDesc;
            return this;
        }
        public String getAlertDesc() {
            return this.alertDesc;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertDescCode(String alertDescCode) {
            this.alertDescCode = alertDescCode;
            return this;
        }
        public String getAlertDescCode() {
            return this.alertDescCode;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertDescEn(String alertDescEn) {
            this.alertDescEn = alertDescEn;
            return this;
        }
        public String getAlertDescEn() {
            return this.alertDescEn;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertDetail(String alertDetail) {
            this.alertDetail = alertDetail;
            return this;
        }
        public String getAlertDetail() {
            return this.alertDetail;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertInfoList(java.util.List<DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList> alertInfoList) {
            this.alertInfoList = alertInfoList;
            return this;
        }
        public java.util.List<DescribeAlertsWithEventResponseBodyDataResponseDataAlertInfoList> getAlertInfoList() {
            return this.alertInfoList;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertNameCode(String alertNameCode) {
            this.alertNameCode = alertNameCode;
            return this;
        }
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertNameEn(String alertNameEn) {
            this.alertNameEn = alertNameEn;
            return this;
        }
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertTitleEn(String alertTitleEn) {
            this.alertTitleEn = alertTitleEn;
            return this;
        }
        public String getAlertTitleEn() {
            return this.alertTitleEn;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertTypeCode(String alertTypeCode) {
            this.alertTypeCode = alertTypeCode;
            return this;
        }
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertTypeEn(String alertTypeEn) {
            this.alertTypeEn = alertTypeEn;
            return this;
        }
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAssetList(String assetList) {
            this.assetList = assetList;
            return this;
        }
        public String getAssetList() {
            return this.assetList;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setIsDefend(String isDefend) {
            this.isDefend = isDefend;
            return this;
        }
        public String getIsDefend() {
            return this.isDefend;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setLogUuid(String logUuid) {
            this.logUuid = logUuid;
            return this;
        }
        public String getLogUuid() {
            return this.logUuid;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setOccurTime(String occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public String getOccurTime() {
            return this.occurTime;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAlertsWithEventResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

    public static class DescribeAlertsWithEventResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public DescribeAlertsWithEventResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<DescribeAlertsWithEventResponseBodyDataResponseData> responseData;

        public static DescribeAlertsWithEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEventResponseBodyData self = new DescribeAlertsWithEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEventResponseBodyData setPageInfo(DescribeAlertsWithEventResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeAlertsWithEventResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeAlertsWithEventResponseBodyData setResponseData(java.util.List<DescribeAlertsWithEventResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeAlertsWithEventResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
