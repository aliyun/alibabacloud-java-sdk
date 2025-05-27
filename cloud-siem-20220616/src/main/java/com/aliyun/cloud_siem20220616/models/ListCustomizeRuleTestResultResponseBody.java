// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListCustomizeRuleTestResultResponseBody extends TeaModel {
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
    public ListCustomizeRuleTestResultResponseBodyData data;

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

    public static ListCustomizeRuleTestResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizeRuleTestResultResponseBody self = new ListCustomizeRuleTestResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomizeRuleTestResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCustomizeRuleTestResultResponseBody setData(ListCustomizeRuleTestResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCustomizeRuleTestResultResponseBodyData getData() {
        return this.data;
    }

    public ListCustomizeRuleTestResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCustomizeRuleTestResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomizeRuleTestResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCustomizeRuleTestResultResponseBodyDataPageInfo extends TeaModel {
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

        @NameInMap("VerifiedCount")
        public Long verifiedCount;

        public static ListCustomizeRuleTestResultResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizeRuleTestResultResponseBodyDataPageInfo self = new ListCustomizeRuleTestResultResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public ListCustomizeRuleTestResultResponseBodyDataPageInfo setVerifiedCount(Long verifiedCount) {
            this.verifiedCount = verifiedCount;
            return this;
        }
        public Long getVerifiedCount() {
            return this.verifiedCount;
        }

    }

    public static class ListCustomizeRuleTestResultResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The description of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>The account you logged in this time is not in the legal account category defined by you. Please confirm the legality of the login behavior.</p>
         */
        @NameInMap("AlertDesc")
        public String alertDesc;

        /**
         * <p>The alert details in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;main_user_id&quot;: &quot;165295629792****&quot;;&quot;log_uuid_count&quot;: &quot;99&quot;;&quot;attack_ip&quot;: &quot;218.92.XX.XX&quot;}</p>
         */
        @NameInMap("AlertDetail")
        public String alertDetail;

        /**
         * <p>The source of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("AlertSrcProd")
        public String alertSrcProd;

        /**
         * <p>The sub-module of the source.</p>
         * 
         * <strong>example:</strong>
         * <p>waf</p>
         */
        @NameInMap("AlertSrcProdModule")
        public String alertSrcProdModule;

        /**
         * <p>The tag of the ATT\&amp;CK attack.</p>
         * 
         * <strong>example:</strong>
         * <p>T1595.002 Vulnerability Scanning</p>
         */
        @NameInMap("AttCk")
        public String attCk;

        /**
         * <p>The name of the alert, which corresponds to the name of the custom rule.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_scan</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The threat type, which indicates the alert type.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The threat level. Valid values:</p>
         * <ul>
         * <li>serious: high.</li>
         * <li>suspicious: medium.</li>
         * <li>remind: low.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>remind</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The log source of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_siem_aegis_sas_alert</p>
         */
        @NameInMap("LogSource")
        public String logSource;

        /**
         * <p>The time when the alert was recorded.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("LogTime")
        public String logTime;

        /**
         * <p>The log type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ALERT_ACTIVITY</p>
         */
        @NameInMap("LogType")
        public String logType;

        /**
         * <p>The ID of the Alibaba Cloud account that is associated with the alert in SIEM.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("MainUserId")
        public String mainUserId;

        /**
         * <p>The status of the alert data. Valid values:</p>
         * <ul>
         * <li>test: business test data.</li>
         * <li>online: online data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnlineStatus")
        public String onlineStatus;

        /**
         * <p>The ID of the Alibaba Cloud account within which the alert is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>176555323***</p>
         */
        @NameInMap("SubUserId")
        public String subUserId;

        /**
         * <p>The UUID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_71e24437d2797ce8fc59692905a4****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VerifyType")
        public String verifyType;

        public static ListCustomizeRuleTestResultResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizeRuleTestResultResponseBodyDataResponseData self = new ListCustomizeRuleTestResultResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertDesc(String alertDesc) {
            this.alertDesc = alertDesc;
            return this;
        }
        public String getAlertDesc() {
            return this.alertDesc;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertDetail(String alertDetail) {
            this.alertDetail = alertDetail;
            return this;
        }
        public String getAlertDetail() {
            return this.alertDetail;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertSrcProd(String alertSrcProd) {
            this.alertSrcProd = alertSrcProd;
            return this;
        }
        public String getAlertSrcProd() {
            return this.alertSrcProd;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAlertSrcProdModule(String alertSrcProdModule) {
            this.alertSrcProdModule = alertSrcProdModule;
            return this;
        }
        public String getAlertSrcProdModule() {
            return this.alertSrcProdModule;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setAttCk(String attCk) {
            this.attCk = attCk;
            return this;
        }
        public String getAttCk() {
            return this.attCk;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLogSource(String logSource) {
            this.logSource = logSource;
            return this;
        }
        public String getLogSource() {
            return this.logSource;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLogTime(String logTime) {
            this.logTime = logTime;
            return this;
        }
        public String getLogTime() {
            return this.logTime;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setLogType(String logType) {
            this.logType = logType;
            return this;
        }
        public String getLogType() {
            return this.logType;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setMainUserId(String mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public String getMainUserId() {
            return this.mainUserId;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setOnlineStatus(String onlineStatus) {
            this.onlineStatus = onlineStatus;
            return this;
        }
        public String getOnlineStatus() {
            return this.onlineStatus;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setSubUserId(String subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public String getSubUserId() {
            return this.subUserId;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ListCustomizeRuleTestResultResponseBodyDataResponseData setVerifyType(String verifyType) {
            this.verifyType = verifyType;
            return this;
        }
        public String getVerifyType() {
            return this.verifyType;
        }

    }

    public static class ListCustomizeRuleTestResultResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public ListCustomizeRuleTestResultResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<ListCustomizeRuleTestResultResponseBodyDataResponseData> responseData;

        public static ListCustomizeRuleTestResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomizeRuleTestResultResponseBodyData self = new ListCustomizeRuleTestResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomizeRuleTestResultResponseBodyData setPageInfo(ListCustomizeRuleTestResultResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListCustomizeRuleTestResultResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListCustomizeRuleTestResultResponseBodyData setResponseData(java.util.List<ListCustomizeRuleTestResultResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListCustomizeRuleTestResultResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
