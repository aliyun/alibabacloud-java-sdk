// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeAlertsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsResponseBody self = new DescribeAlertsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertsResponseBody setData(DescribeAlertsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlertsResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlertsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertsResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAlertsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsResponseBodyDataPageInfo self = new DescribeAlertsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAlertsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAlertsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAlertsResponseBodyDataResponseDataAlertInfoList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyName")
        public String keyName;

        @NameInMap("Values")
        public String values;

        public static DescribeAlertsResponseBodyDataResponseDataAlertInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsResponseBodyDataResponseDataAlertInfoList self = new DescribeAlertsResponseBodyDataResponseDataAlertInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsResponseBodyDataResponseDataAlertInfoList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAlertsResponseBodyDataResponseDataAlertInfoList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeAlertsResponseBodyDataResponseDataAlertInfoList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeAlertsResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AlertDesc")
        public String alertDesc;

        @NameInMap("AlertDescCode")
        public String alertDescCode;

        @NameInMap("AlertDescEn")
        public String alertDescEn;

        @NameInMap("AlertDetail")
        public String alertDetail;

        @NameInMap("AlertInfoList")
        public java.util.List<DescribeAlertsResponseBodyDataResponseDataAlertInfoList> alertInfoList;

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

        public static DescribeAlertsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsResponseBodyDataResponseData self = new DescribeAlertsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertDesc(String alertDesc) {
            this.alertDesc = alertDesc;
            return this;
        }
        public String getAlertDesc() {
            return this.alertDesc;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertDescCode(String alertDescCode) {
            this.alertDescCode = alertDescCode;
            return this;
        }
        public String getAlertDescCode() {
            return this.alertDescCode;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertDescEn(String alertDescEn) {
            this.alertDescEn = alertDescEn;
            return this;
        }
        public String getAlertDescEn() {
            return this.alertDescEn;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertDetail(String alertDetail) {
            this.alertDetail = alertDetail;
            return this;
        }
        public String getAlertDetail() {
            return this.alertDetail;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertInfoList(java.util.List<DescribeAlertsResponseBodyDataResponseDataAlertInfoList> alertInfoList) {
            this.alertInfoList = alertInfoList;
            return this;
        }
        public java.util.List<DescribeAlertsResponseBodyDataResponseDataAlertInfoList> getAlertInfoList() {
            return this.alertInfoList;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertNameCode(String alertNameCode) {
            this.alertNameCode = alertNameCode;
            return this;
        }
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertNameEn(String alertNameEn) {
            this.alertNameEn = alertNameEn;
            return this;
        }
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertTitleEn(String alertTitleEn) {
            this.alertTitleEn = alertTitleEn;
            return this;
        }
        public String getAlertTitleEn() {
            return this.alertTitleEn;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertTypeCode(String alertTypeCode) {
            this.alertTypeCode = alertTypeCode;
            return this;
        }
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertTypeEn(String alertTypeEn) {
            this.alertTypeEn = alertTypeEn;
            return this;
        }
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        public DescribeAlertsResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public DescribeAlertsResponseBodyDataResponseData setAssetList(String assetList) {
            this.assetList = assetList;
            return this;
        }
        public String getAssetList() {
            return this.assetList;
        }

        public DescribeAlertsResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public DescribeAlertsResponseBodyDataResponseData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeAlertsResponseBodyDataResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAlertsResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAlertsResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlertsResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAlertsResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeAlertsResponseBodyDataResponseData setIsDefend(String isDefend) {
            this.isDefend = isDefend;
            return this;
        }
        public String getIsDefend() {
            return this.isDefend;
        }

        public DescribeAlertsResponseBodyDataResponseData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public DescribeAlertsResponseBodyDataResponseData setLogUuid(String logUuid) {
            this.logUuid = logUuid;
            return this;
        }
        public String getLogUuid() {
            return this.logUuid;
        }

        public DescribeAlertsResponseBodyDataResponseData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public DescribeAlertsResponseBodyDataResponseData setOccurTime(String occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public String getOccurTime() {
            return this.occurTime;
        }

        public DescribeAlertsResponseBodyDataResponseData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAlertsResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

    public static class DescribeAlertsResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public DescribeAlertsResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<DescribeAlertsResponseBodyDataResponseData> responseData;

        public static DescribeAlertsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsResponseBodyData self = new DescribeAlertsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsResponseBodyData setPageInfo(DescribeAlertsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeAlertsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeAlertsResponseBodyData setResponseData(java.util.List<DescribeAlertsResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeAlertsResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
