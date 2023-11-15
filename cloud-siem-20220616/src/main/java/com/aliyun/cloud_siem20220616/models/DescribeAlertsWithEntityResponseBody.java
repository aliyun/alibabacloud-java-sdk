// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEntityResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeAlertsWithEntityResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertsWithEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEntityResponseBody self = new DescribeAlertsWithEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEntityResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAlertsWithEntityResponseBody setData(DescribeAlertsWithEntityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAlertsWithEntityResponseBodyData getData() {
        return this.data;
    }

    public DescribeAlertsWithEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertsWithEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertsWithEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertsWithEntityResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAlertsWithEntityResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEntityResponseBodyDataPageInfo self = new DescribeAlertsWithEntityResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEntityResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAlertsWithEntityResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAlertsWithEntityResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("KeyName")
        public String keyName;

        @NameInMap("Values")
        public String values;

        public static DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList self = new DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList setKeyName(String keyName) {
            this.keyName = keyName;
            return this;
        }
        public String getKeyName() {
            return this.keyName;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList setValues(String values) {
            this.values = values;
            return this;
        }
        public String getValues() {
            return this.values;
        }

    }

    public static class DescribeAlertsWithEntityResponseBodyDataResponseData extends TeaModel {
        @NameInMap("AlertDesc")
        public String alertDesc;

        @NameInMap("AlertDescCode")
        public String alertDescCode;

        @NameInMap("AlertDescEn")
        public String alertDescEn;

        @NameInMap("AlertDetail")
        public String alertDetail;

        @NameInMap("AlertInfoList")
        public java.util.List<DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList> alertInfoList;

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

        public static DescribeAlertsWithEntityResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEntityResponseBodyDataResponseData self = new DescribeAlertsWithEntityResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertDesc(String alertDesc) {
            this.alertDesc = alertDesc;
            return this;
        }
        public String getAlertDesc() {
            return this.alertDesc;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertDescCode(String alertDescCode) {
            this.alertDescCode = alertDescCode;
            return this;
        }
        public String getAlertDescCode() {
            return this.alertDescCode;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertDescEn(String alertDescEn) {
            this.alertDescEn = alertDescEn;
            return this;
        }
        public String getAlertDescEn() {
            return this.alertDescEn;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertDetail(String alertDetail) {
            this.alertDetail = alertDetail;
            return this;
        }
        public String getAlertDetail() {
            return this.alertDetail;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertInfoList(java.util.List<DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList> alertInfoList) {
            this.alertInfoList = alertInfoList;
            return this;
        }
        public java.util.List<DescribeAlertsWithEntityResponseBodyDataResponseDataAlertInfoList> getAlertInfoList() {
            return this.alertInfoList;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertNameCode(String alertNameCode) {
            this.alertNameCode = alertNameCode;
            return this;
        }
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertNameEn(String alertNameEn) {
            this.alertNameEn = alertNameEn;
            return this;
        }
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertTitleEn(String alertTitleEn) {
            this.alertTitleEn = alertTitleEn;
            return this;
        }
        public String getAlertTitleEn() {
            return this.alertTitleEn;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertTypeCode(String alertTypeCode) {
            this.alertTypeCode = alertTypeCode;
            return this;
        }
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertTypeEn(String alertTypeEn) {
            this.alertTypeEn = alertTypeEn;
            return this;
        }
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAssetList(String assetList) {
            this.assetList = assetList;
            return this;
        }
        public String getAssetList() {
            return this.assetList;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setIsDefend(String isDefend) {
            this.isDefend = isDefend;
            return this;
        }
        public String getIsDefend() {
            return this.isDefend;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setLogUuid(String logUuid) {
            this.logUuid = logUuid;
            return this;
        }
        public String getLogUuid() {
            return this.logUuid;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setOccurTime(String occurTime) {
            this.occurTime = occurTime;
            return this;
        }
        public String getOccurTime() {
            return this.occurTime;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeAlertsWithEntityResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

    public static class DescribeAlertsWithEntityResponseBodyData extends TeaModel {
        @NameInMap("PageInfo")
        public DescribeAlertsWithEntityResponseBodyDataPageInfo pageInfo;

        @NameInMap("ResponseData")
        public java.util.List<DescribeAlertsWithEntityResponseBodyDataResponseData> responseData;

        public static DescribeAlertsWithEntityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertsWithEntityResponseBodyData self = new DescribeAlertsWithEntityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAlertsWithEntityResponseBodyData setPageInfo(DescribeAlertsWithEntityResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeAlertsWithEntityResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeAlertsWithEntityResponseBodyData setResponseData(java.util.List<DescribeAlertsWithEntityResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeAlertsWithEntityResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
