// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsResponseBody extends TeaModel {
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
    public DescribeAlertsResponseBodyData data;

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
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <p>The attribute key.</p>
         * 
         * <strong>example:</strong>
         * <p>suspicious.wbd.wb.trojanpath</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The name of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>Trojan Path</p>
         */
        @NameInMap("KeyName")
        public String keyName;

        /**
         * <p>The value of the key.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/test33.php</p>
         */
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
        /**
         * <p>The description of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>The detection model found a suspicious Webshell file on your server, which may be a backdoor file implanted to maintain permissions after the attacker successfully invaded the website.</p>
         */
        @NameInMap("AlertDesc")
        public String alertDesc;

        /**
         * <p>The internal code of the alert description.</p>
         * 
         * <strong>example:</strong>
         * <p>security_event_config.event_name.webshell</p>
         */
        @NameInMap("AlertDescCode")
        public String alertDescCode;

        /**
         * <p>The description of the alert in English.</p>
         * 
         * <strong>example:</strong>
         * <p>The detection model found a suspicious Webshell file on your server, which may be a backdoor file implanted to maintain permissions after the attacker successfully invaded the website.</p>
         */
        @NameInMap("AlertDescEn")
        public String alertDescEn;

        /**
         * <p>The details of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;main_user_id&quot;: &quot;165295629792****&quot;;&quot;log_uuid_count&quot;: &quot;99&quot;;&quot;attack_ip&quot;: &quot;21.92.<em>.</em>&quot;}</p>
         */
        @NameInMap("AlertDetail")
        public String alertDetail;

        /**
         * <p>The displayed details of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("AlertInfoList")
        public java.util.List<DescribeAlertsResponseBodyDataResponseDataAlertInfoList> alertInfoList;

        /**
         * <p>The threat level. Valid values:</p>
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
         * <p>The name of the alert.</p>
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
         * <p>The name of the alert in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Try SNMP weak password</p>
         */
        @NameInMap("AlertNameEn")
        public String alertNameEn;

        /**
         * <p>The service for which the alert associated with the event is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("AlertSrcProd")
        public String alertSrcProd;

        /**
         * <p>The sub-module of ther alert source.</p>
         * 
         * <strong>example:</strong>
         * <p>waf</p>
         */
        @NameInMap("AlertSrcProdModule")
        public String alertSrcProdModule;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlertStatus")
        public String alertStatus;

        /**
         * <p>The title of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan-Try SNMP weak password</p>
         */
        @NameInMap("AlertTitle")
        public String alertTitle;

        /**
         * <p>The title of the alert in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan-Try SNMP weak password</p>
         */
        @NameInMap("AlertTitleEn")
        public String alertTitleEn;

        /**
         * <p>The alert type.</p>
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
         * <p>The type of the alert in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Scan</p>
         */
        @NameInMap("AlertTypeEn")
        public String alertTypeEn;

        /**
         * <p>The UUID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

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

        @NameInMap("DetectionRuleId")
        public String detectionRuleId;

        /**
         * <p>The time when the alert was closed.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EntityList")
        public String entityList;

        @NameInMap("ExtendContent")
        public String extendContent;

        /**
         * <p>The time when the alert was received.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the alert was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The unique ID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UUID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>Indicates whether an attack is defended. Valid values:</p>
         * <ul>
         * <li>0: detected.</li>
         * <li>1: blocked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDefend")
        public String isDefend;

        /**
         * <p>The time when the alert was recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <p>The UUID of the alert log.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw_d12e285a-a042-4d7e-be89-f8a795ef****</p>
         */
        @NameInMap("LogUuid")
        public String logUuid;

        /**
         * <p>The ID of the Alibaba Cloud account that is associated with the alert in SIEM.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("MainUserId")
        public Long mainUserId;

        /**
         * <p>The time when the alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("OccurTime")
        public String occurTime;

        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The time at which the alert was first generated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The ID of the Alibaba Cloud account within which the alert is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>176555323***</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        /**
         * <strong>example:</strong>
         * <p>176555323***</p>
         */
        @NameInMap("SubUserName")
        public String subUserName;

        /**
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

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

        public DescribeAlertsResponseBodyDataResponseData setAlertStatus(String alertStatus) {
            this.alertStatus = alertStatus;
            return this;
        }
        public String getAlertStatus() {
            return this.alertStatus;
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

        public DescribeAlertsResponseBodyDataResponseData setDetectionRuleId(String detectionRuleId) {
            this.detectionRuleId = detectionRuleId;
            return this;
        }
        public String getDetectionRuleId() {
            return this.detectionRuleId;
        }

        public DescribeAlertsResponseBodyDataResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeAlertsResponseBodyDataResponseData setEntityList(String entityList) {
            this.entityList = entityList;
            return this;
        }
        public String getEntityList() {
            return this.entityList;
        }

        public DescribeAlertsResponseBodyDataResponseData setExtendContent(String extendContent) {
            this.extendContent = extendContent;
            return this;
        }
        public String getExtendContent() {
            return this.extendContent;
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

        public DescribeAlertsResponseBodyDataResponseData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
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

        public DescribeAlertsResponseBodyDataResponseData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

        public DescribeAlertsResponseBodyDataResponseData setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

    public static class DescribeAlertsResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeAlertsResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
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
