// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetAlertActionResponseBody extends TeaModel {
    /**
     * <p>The list of alert action integration configurations.</p>
     */
    @NameInMap("alertActions")
    public GetAlertActionResponseBodyAlertActions alertActions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetAlertActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlertActionResponseBody self = new GetAlertActionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlertActionResponseBody setAlertActions(GetAlertActionResponseBodyAlertActions alertActions) {
        this.alertActions = alertActions;
        return this;
    }
    public GetAlertActionResponseBodyAlertActions getAlertActions() {
        return this.alertActions;
    }

    public GetAlertActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAlertActionResponseBodyAlertActionsEbParam extends TeaModel {
        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ebSource")
        public String ebSource;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("eventBusName")
        public String eventBusName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The subject.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("subject")
        public String subject;

        public static GetAlertActionResponseBodyAlertActionsEbParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsEbParam self = new GetAlertActionResponseBodyAlertActionsEbParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsEbParam setEbSource(String ebSource) {
            this.ebSource = ebSource;
            return this;
        }
        public String getEbSource() {
            return this.ebSource;
        }

        public GetAlertActionResponseBodyAlertActionsEbParam setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public GetAlertActionResponseBodyAlertActionsEbParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAlertActionResponseBodyAlertActionsEbParam setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsEssParam extends TeaModel {
        /**
         * <p>The ID of the elastic scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("essGroupId")
        public String essGroupId;

        /**
         * <p>The ID of the elastic scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("essRuleId")
        public String essRuleId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetAlertActionResponseBodyAlertActionsEssParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsEssParam self = new GetAlertActionResponseBodyAlertActionsEssParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsEssParam setEssGroupId(String essGroupId) {
            this.essGroupId = essGroupId;
            return this;
        }
        public String getEssGroupId() {
            return this.essGroupId;
        }

        public GetAlertActionResponseBodyAlertActionsEssParam setEssRuleId(String essRuleId) {
            this.essRuleId = essRuleId;
            return this;
        }
        public String getEssRuleId() {
            return this.essRuleId;
        }

        public GetAlertActionResponseBodyAlertActionsEssParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsFc3Param extends TeaModel {
        /**
         * <p>The name of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <p>The version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("qualifier")
        public String qualifier;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetAlertActionResponseBodyAlertActionsFc3Param build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsFc3Param self = new GetAlertActionResponseBodyAlertActionsFc3Param();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsFc3Param setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public GetAlertActionResponseBodyAlertActionsFc3Param setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public GetAlertActionResponseBodyAlertActionsFc3Param setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsFcParam extends TeaModel {
        /**
         * <p>The name of the function in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The service name in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("service")
        public String service;

        public static GetAlertActionResponseBodyAlertActionsFcParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsFcParam self = new GetAlertActionResponseBodyAlertActionsFcParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsFcParam setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public GetAlertActionResponseBodyAlertActionsFcParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAlertActionResponseBodyAlertActionsFcParam setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsMnsParam extends TeaModel {
        /**
         * <p>The resource type of Simple Message Queue (formerly MNS).</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        @NameInMap("mnsType")
        public String mnsType;

        /**
         * <p>The name of the resource.</p>
         * <ul>
         * <li>If the resource type is queue, the resource name is the name of the queue.</li>
         * <li>If the resource type is topic, the resource name is the name of the topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetAlertActionResponseBodyAlertActionsMnsParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsMnsParam self = new GetAlertActionResponseBodyAlertActionsMnsParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsMnsParam setMnsType(String mnsType) {
            this.mnsType = mnsType;
            return this;
        }
        public String getMnsType() {
            return this.mnsType;
        }

        public GetAlertActionResponseBodyAlertActionsMnsParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAlertActionResponseBodyAlertActionsMnsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsPagerDutyParam extends TeaModel {
        /**
         * <p>The integration key of PagerDuty.</p>
         * 
         * <strong>example:</strong>
         * <p>EWR4WR4T4GREG4ET453T5Y</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The integration webhook URL for PagerDuty. V1 and V2 are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://events.pagerduty.com/v2/enqueue">https://events.pagerduty.com/v2/enqueue</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAlertActionResponseBodyAlertActionsPagerDutyParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsPagerDutyParam self = new GetAlertActionResponseBodyAlertActionsPagerDutyParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsPagerDutyParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetAlertActionResponseBodyAlertActionsPagerDutyParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsSlsParam extends TeaModel {
        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetAlertActionResponseBodyAlertActionsSlsParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsSlsParam self = new GetAlertActionResponseBodyAlertActionsSlsParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsSlsParam setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetAlertActionResponseBodyAlertActionsSlsParam setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public GetAlertActionResponseBodyAlertActionsSlsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAlertActionResponseBodyAlertActionsWebhookParam extends TeaModel {
        /**
         * <p>The data format. This parameter takes effect only when the request method is POST.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The request header information.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The webhook request method.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The URL for the alert callback.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">http://www.test.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAlertActionResponseBodyAlertActionsWebhookParam build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActionsWebhookParam self = new GetAlertActionResponseBodyAlertActionsWebhookParam();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActionsWebhookParam setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetAlertActionResponseBodyAlertActionsWebhookParam setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetAlertActionResponseBodyAlertActionsWebhookParam setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetAlertActionResponseBodyAlertActionsWebhookParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAlertActionResponseBodyAlertActions extends TeaModel {
        /**
         * <p>The unique identifier of the alert action integration.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("alertActionId")
        public String alertActionId;

        /**
         * <p>The name of the alert action integration.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("alertActionName")
        public String alertActionName;

        /**
         * <p>The event bus parameters.</p>
         */
        @NameInMap("ebParam")
        public GetAlertActionResponseBodyAlertActionsEbParam ebParam;

        /**
         * <p>The elastic scaling parameters.</p>
         */
        @NameInMap("essParam")
        public GetAlertActionResponseBodyAlertActionsEssParam essParam;

        /**
         * <p>The Function Compute 3.0 parameters.</p>
         */
        @NameInMap("fc3Param")
        public GetAlertActionResponseBodyAlertActionsFc3Param fc3Param;

        /**
         * <p>The Function Compute parameters.</p>
         */
        @NameInMap("fcParam")
        public GetAlertActionResponseBodyAlertActionsFcParam fcParam;

        /**
         * <p>The Simple Message Queue (formerly MNS) parameters.</p>
         */
        @NameInMap("mnsParam")
        public GetAlertActionResponseBodyAlertActionsMnsParam mnsParam;

        /**
         * <p>The PagerDuty parameters.</p>
         */
        @NameInMap("pagerDutyParam")
        public GetAlertActionResponseBodyAlertActionsPagerDutyParam pagerDutyParam;

        /**
         * <p>The Simple Log Service parameters.</p>
         */
        @NameInMap("slsParam")
        public GetAlertActionResponseBodyAlertActionsSlsParam slsParam;

        /**
         * <p>The type of the alert action integration.</p>
         * 
         * <strong>example:</strong>
         * <p>FC</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The webhook parameters.</p>
         */
        @NameInMap("webhookParam")
        public GetAlertActionResponseBodyAlertActionsWebhookParam webhookParam;

        public static GetAlertActionResponseBodyAlertActions build(java.util.Map<String, ?> map) throws Exception {
            GetAlertActionResponseBodyAlertActions self = new GetAlertActionResponseBodyAlertActions();
            return TeaModel.build(map, self);
        }

        public GetAlertActionResponseBodyAlertActions setAlertActionId(String alertActionId) {
            this.alertActionId = alertActionId;
            return this;
        }
        public String getAlertActionId() {
            return this.alertActionId;
        }

        public GetAlertActionResponseBodyAlertActions setAlertActionName(String alertActionName) {
            this.alertActionName = alertActionName;
            return this;
        }
        public String getAlertActionName() {
            return this.alertActionName;
        }

        public GetAlertActionResponseBodyAlertActions setEbParam(GetAlertActionResponseBodyAlertActionsEbParam ebParam) {
            this.ebParam = ebParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsEbParam getEbParam() {
            return this.ebParam;
        }

        public GetAlertActionResponseBodyAlertActions setEssParam(GetAlertActionResponseBodyAlertActionsEssParam essParam) {
            this.essParam = essParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsEssParam getEssParam() {
            return this.essParam;
        }

        public GetAlertActionResponseBodyAlertActions setFc3Param(GetAlertActionResponseBodyAlertActionsFc3Param fc3Param) {
            this.fc3Param = fc3Param;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsFc3Param getFc3Param() {
            return this.fc3Param;
        }

        public GetAlertActionResponseBodyAlertActions setFcParam(GetAlertActionResponseBodyAlertActionsFcParam fcParam) {
            this.fcParam = fcParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsFcParam getFcParam() {
            return this.fcParam;
        }

        public GetAlertActionResponseBodyAlertActions setMnsParam(GetAlertActionResponseBodyAlertActionsMnsParam mnsParam) {
            this.mnsParam = mnsParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsMnsParam getMnsParam() {
            return this.mnsParam;
        }

        public GetAlertActionResponseBodyAlertActions setPagerDutyParam(GetAlertActionResponseBodyAlertActionsPagerDutyParam pagerDutyParam) {
            this.pagerDutyParam = pagerDutyParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsPagerDutyParam getPagerDutyParam() {
            return this.pagerDutyParam;
        }

        public GetAlertActionResponseBodyAlertActions setSlsParam(GetAlertActionResponseBodyAlertActionsSlsParam slsParam) {
            this.slsParam = slsParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsSlsParam getSlsParam() {
            return this.slsParam;
        }

        public GetAlertActionResponseBodyAlertActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlertActionResponseBodyAlertActions setWebhookParam(GetAlertActionResponseBodyAlertActionsWebhookParam webhookParam) {
            this.webhookParam = webhookParam;
            return this;
        }
        public GetAlertActionResponseBodyAlertActionsWebhookParam getWebhookParam() {
            return this.webhookParam;
        }

    }

}
