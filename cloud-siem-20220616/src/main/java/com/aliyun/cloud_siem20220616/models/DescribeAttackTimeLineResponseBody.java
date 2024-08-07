// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAttackTimeLineResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeAttackTimeLineResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li>serious: high</li>
         * <li>suspicious: medium</li>
         * <li>remind: low</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("AlertLevel")
        public String alertLevel;

        /**
         * <p>The alert name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Try SNMP weak password</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The internal code of the alert name.</p>
         * 
         * <strong>example:</strong>
         * <p>security_event_config.event_name.webshell</p>
         */
        @NameInMap("AlertNameCode")
        public String alertNameCode;

        /**
         * <p>The alert name in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Try SNMP weak password</p>
         */
        @NameInMap("AlertNameEn")
        public String alertNameEn;

        /**
         * <p>The source of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("AlertSrcProd")
        public String alertSrcProd;

        /**
         * <p>The sub-module of the alert source.</p>
         * 
         * <strong>example:</strong>
         * <p>waf</p>
         */
        @NameInMap("AlertSrcProdModule")
        public String alertSrcProdModule;

        /**
         * <p>The time when the alert was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("AlertTime")
        public Long alertTime;

        /**
         * <p>The title of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan-Try SNMP weak password</p>
         */
        @NameInMap("AlertTitle")
        public String alertTitle;

        /**
         * <p>The alert title in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan-Try SNMP weak password</p>
         */
        @NameInMap("AlertTitleEn")
        public String alertTitleEn;

        /**
         * <p>The type of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The internal code of the alert type.</p>
         * 
         * <strong>example:</strong>
         * <p>security_event_config.event_name.webshellName</p>
         */
        @NameInMap("AlertTypeCode")
        public String alertTypeCode;

        /**
         * <p>The alert type in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan</p>
         */
        @NameInMap("AlertTypeEn")
        public String alertTypeEn;

        /**
         * <p>The UUID of the alert</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The logical ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>0616caeb-acb8-45e0-8520-4ee5fbe251f0</p>
         */
        @NameInMap("AssetId")
        public String assetId;

        /**
         * <p>The details of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;is_main_asset&quot;: &quot;1&quot;,
         *             &quot;asset_name&quot;: &quot;47.245.<em>&quot;,
         *             &quot;port&quot;: &quot;22&quot;,
         *             &quot;ip&quot;: &quot;47.245.</em>&quot;,
         *             &quot;asset_type&quot;: &quot;ip&quot;,
         *             &quot;location&quot;: &quot;ap-southeast-1&quot;,
         *             &quot;asset_id&quot;: &quot;47.245.*&quot;,
         *             &quot;net_connect_dir&quot;: &quot;in&quot;
         *       }
         * ]</p>
         */
        @NameInMap("AssetList")
        public String assetList;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>zsw-agentless-centos****</p>
         */
        @NameInMap("AssetName")
        public String assetName;

        /**
         * <p>The tag of the ATT\&amp;CK attack.</p>
         * 
         * <strong>example:</strong>
         * <p>T1595.002 Vulnerability Scanning</p>
         */
        @NameInMap("AttCk")
        public String attCk;

        /**
         * <p>The cloud code. Valid values:</p>
         * <ul>
         * <li>aliyun: Alibaba Cloud</li>
         * <li>qcloud: Tencent Cloud</li>
         * <li>hcloud: Huawei Cloud</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("CloudCode")
        public String cloudCode;

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The time when the alert was recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
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
