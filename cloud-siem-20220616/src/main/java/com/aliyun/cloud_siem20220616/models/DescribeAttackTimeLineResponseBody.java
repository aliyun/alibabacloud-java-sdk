// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAttackTimeLineResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAttackTimeLineResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAttackTimeLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackTimeLineResponseBody self = new DescribeAttackTimeLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackTimeLineResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAttackTimeLineResponseBody setData(java.util.List<DescribeAttackTimeLineResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAttackTimeLineResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAttackTimeLineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAttackTimeLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAttackTimeLineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAttackTimeLineResponseBodyData extends TeaModel {
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

        @NameInMap("AlertTime")
        public Long alertTime;

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

        @NameInMap("AssetId")
        public String assetId;

        @NameInMap("AssetList")
        public String assetList;

        @NameInMap("AssetName")
        public String assetName;

        @NameInMap("AttCk")
        public String attCk;

        @NameInMap("CloudCode")
        public String cloudCode;

        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("LogTime")
        public String logTime;

        public static DescribeAttackTimeLineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAttackTimeLineResponseBodyData self = new DescribeAttackTimeLineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAttackTimeLineResponseBodyData setAlertLevel(String alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public String getAlertLevel() {
            return this.alertLevel;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertNameCode(String alertNameCode) {
            this.alertNameCode = alertNameCode;
            return this;
        }
        public String getAlertNameCode() {
            return this.alertNameCode;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertNameEn(String alertNameEn) {
            this.alertNameEn = alertNameEn;
            return this;
        }
        public String getAlertNameEn() {
            return this.alertNameEn;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertTime(Long alertTime) {
            this.alertTime = alertTime;
            return this;
        }
        public Long getAlertTime() {
            return this.alertTime;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertTitle(String alertTitle) {
            this.alertTitle = alertTitle;
            return this;
        }
        public String getAlertTitle() {
            return this.alertTitle;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertTitleEn(String alertTitleEn) {
            this.alertTitleEn = alertTitleEn;
            return this;
        }
        public String getAlertTitleEn() {
            return this.alertTitleEn;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertTypeCode(String alertTypeCode) {
            this.alertTypeCode = alertTypeCode;
            return this;
        }
        public String getAlertTypeCode() {
            return this.alertTypeCode;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertTypeEn(String alertTypeEn) {
            this.alertTypeEn = alertTypeEn;
            return this;
        }
        public String getAlertTypeEn() {
            return this.alertTypeEn;
        }

        public DescribeAttackTimeLineResponseBodyData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public DescribeAttackTimeLineResponseBodyData setAssetId(String assetId) {
            this.assetId = assetId;
            return this;
        }
        public String getAssetId() {
            return this.assetId;
        }

        public DescribeAttackTimeLineResponseBodyData setAssetList(String assetList) {
            this.assetList = assetList;
            return this;
        }
        public String getAssetList() {
            return this.assetList;
        }

        public DescribeAttackTimeLineResponseBodyData setAssetName(String assetName) {
            this.assetName = assetName;
            return this;
        }
        public String getAssetName() {
            return this.assetName;
        }

        public DescribeAttackTimeLineResponseBodyData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public DescribeAttackTimeLineResponseBodyData setCloudCode(String cloudCode) {
            this.cloudCode = cloudCode;
            return this;
        }
        public String getCloudCode() {
            return this.cloudCode;
        }

        public DescribeAttackTimeLineResponseBodyData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeAttackTimeLineResponseBodyData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

    }

}
