// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertActionRequest extends TeaModel {
    /**
     * <p>The name of the alert action integration.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("alertActionName")
    public String alertActionName;

    /**
     * <p>The event bus.</p>
     */
    @NameInMap("ebParam")
    public UpdateAlertActionRequestEbParam ebParam;

    /**
     * <p>The elastic scaling parameters.</p>
     */
    @NameInMap("essParam")
    public UpdateAlertActionRequestEssParam essParam;

    /**
     * <p>The Function Compute 3.0 parameters.</p>
     */
    @NameInMap("fc3Param")
    public UpdateAlertActionRequestFc3Param fc3Param;

    /**
     * <p>The Function Compute parameters.</p>
     */
    @NameInMap("fcParam")
    public UpdateAlertActionRequestFcParam fcParam;

    /**
     * <p>The Simple Message Queue (formerly MNS) parameters.</p>
     */
    @NameInMap("mnsParam")
    public UpdateAlertActionRequestMnsParam mnsParam;

    /**
     * <p>The PagerDuty parameters.</p>
     */
    @NameInMap("pagerDutyParam")
    public UpdateAlertActionRequestPagerDutyParam pagerDutyParam;

    /**
     * <p>The Simple Log Service parameters.</p>
     */
    @NameInMap("slsParam")
    public UpdateAlertActionRequestSlsParam slsParam;

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
    public UpdateAlertActionRequestWebhookParam webhookParam;

    public static UpdateAlertActionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertActionRequest self = new UpdateAlertActionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertActionRequest setAlertActionName(String alertActionName) {
        this.alertActionName = alertActionName;
        return this;
    }
    public String getAlertActionName() {
        return this.alertActionName;
    }

    public UpdateAlertActionRequest setEbParam(UpdateAlertActionRequestEbParam ebParam) {
        this.ebParam = ebParam;
        return this;
    }
    public UpdateAlertActionRequestEbParam getEbParam() {
        return this.ebParam;
    }

    public UpdateAlertActionRequest setEssParam(UpdateAlertActionRequestEssParam essParam) {
        this.essParam = essParam;
        return this;
    }
    public UpdateAlertActionRequestEssParam getEssParam() {
        return this.essParam;
    }

    public UpdateAlertActionRequest setFc3Param(UpdateAlertActionRequestFc3Param fc3Param) {
        this.fc3Param = fc3Param;
        return this;
    }
    public UpdateAlertActionRequestFc3Param getFc3Param() {
        return this.fc3Param;
    }

    public UpdateAlertActionRequest setFcParam(UpdateAlertActionRequestFcParam fcParam) {
        this.fcParam = fcParam;
        return this;
    }
    public UpdateAlertActionRequestFcParam getFcParam() {
        return this.fcParam;
    }

    public UpdateAlertActionRequest setMnsParam(UpdateAlertActionRequestMnsParam mnsParam) {
        this.mnsParam = mnsParam;
        return this;
    }
    public UpdateAlertActionRequestMnsParam getMnsParam() {
        return this.mnsParam;
    }

    public UpdateAlertActionRequest setPagerDutyParam(UpdateAlertActionRequestPagerDutyParam pagerDutyParam) {
        this.pagerDutyParam = pagerDutyParam;
        return this;
    }
    public UpdateAlertActionRequestPagerDutyParam getPagerDutyParam() {
        return this.pagerDutyParam;
    }

    public UpdateAlertActionRequest setSlsParam(UpdateAlertActionRequestSlsParam slsParam) {
        this.slsParam = slsParam;
        return this;
    }
    public UpdateAlertActionRequestSlsParam getSlsParam() {
        return this.slsParam;
    }

    public UpdateAlertActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateAlertActionRequest setWebhookParam(UpdateAlertActionRequestWebhookParam webhookParam) {
        this.webhookParam = webhookParam;
        return this;
    }
    public UpdateAlertActionRequestWebhookParam getWebhookParam() {
        return this.webhookParam;
    }

    public static class UpdateAlertActionRequestEbParam extends TeaModel {
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

        public static UpdateAlertActionRequestEbParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestEbParam self = new UpdateAlertActionRequestEbParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestEbParam setEbSource(String ebSource) {
            this.ebSource = ebSource;
            return this;
        }
        public String getEbSource() {
            return this.ebSource;
        }

        public UpdateAlertActionRequestEbParam setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public UpdateAlertActionRequestEbParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateAlertActionRequestEbParam setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class UpdateAlertActionRequestEssParam extends TeaModel {
        /**
         * <p>The ID of the elastic scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("essGroupId")
        public String essGroupId;

        /**
         * <p>The ID of the elastic scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("essRuleId")
        public String essRuleId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static UpdateAlertActionRequestEssParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestEssParam self = new UpdateAlertActionRequestEssParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestEssParam setEssGroupId(String essGroupId) {
            this.essGroupId = essGroupId;
            return this;
        }
        public String getEssGroupId() {
            return this.essGroupId;
        }

        public UpdateAlertActionRequestEssParam setEssRuleId(String essRuleId) {
            this.essRuleId = essRuleId;
            return this;
        }
        public String getEssRuleId() {
            return this.essRuleId;
        }

        public UpdateAlertActionRequestEssParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateAlertActionRequestFc3Param extends TeaModel {
        /**
         * <p>The name of the function in Function Compute.</p>
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
         * <p>cn-heyuan</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static UpdateAlertActionRequestFc3Param build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestFc3Param self = new UpdateAlertActionRequestFc3Param();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestFc3Param setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public UpdateAlertActionRequestFc3Param setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public UpdateAlertActionRequestFc3Param setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateAlertActionRequestFcParam extends TeaModel {
        /**
         * <p>The name of the function in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("function")
        public String function;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The service name in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>testService</p>
         */
        @NameInMap("service")
        public String service;

        public static UpdateAlertActionRequestFcParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestFcParam self = new UpdateAlertActionRequestFcParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestFcParam setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public UpdateAlertActionRequestFcParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateAlertActionRequestFcParam setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class UpdateAlertActionRequestMnsParam extends TeaModel {
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
         * <li>If the resource type is queue, the resource name is the queue name.</li>
         * <li>If the resource type is topic, the resource name is the topic name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static UpdateAlertActionRequestMnsParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestMnsParam self = new UpdateAlertActionRequestMnsParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestMnsParam setMnsType(String mnsType) {
            this.mnsType = mnsType;
            return this;
        }
        public String getMnsType() {
            return this.mnsType;
        }

        public UpdateAlertActionRequestMnsParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateAlertActionRequestMnsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateAlertActionRequestPagerDutyParam extends TeaModel {
        /**
         * <p>The integration key of PagerDuty.</p>
         * 
         * <strong>example:</strong>
         * <p>fwe4rwr543t543t43t43t43</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The integration webhook of PagerDuty. V1 and V2 are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://events.pagerduty.com/v2/enqueue">https://events.pagerduty.com/v2/enqueue</a></p>
         */
        @NameInMap("url")
        public String url;

        public static UpdateAlertActionRequestPagerDutyParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestPagerDutyParam self = new UpdateAlertActionRequestPagerDutyParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestPagerDutyParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateAlertActionRequestPagerDutyParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateAlertActionRequestSlsParam extends TeaModel {
        /**
         * <p>The name of the Simple Log Service Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>testLogstore</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>testProject</p>
         */
        @NameInMap("project")
        public String project;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static UpdateAlertActionRequestSlsParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestSlsParam self = new UpdateAlertActionRequestSlsParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestSlsParam setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateAlertActionRequestSlsParam setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public UpdateAlertActionRequestSlsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class UpdateAlertActionRequestWebhookParam extends TeaModel {
        /**
         * <p>The data format. This parameter takes effect only when the request method is POST.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("contentType")
        public String contentType;

        /**
         * <p>The request headers.</p>
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
         * <p>The alert callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">http://www.test.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static UpdateAlertActionRequestWebhookParam build(java.util.Map<String, ?> map) throws Exception {
            UpdateAlertActionRequestWebhookParam self = new UpdateAlertActionRequestWebhookParam();
            return TeaModel.build(map, self);
        }

        public UpdateAlertActionRequestWebhookParam setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public UpdateAlertActionRequestWebhookParam setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UpdateAlertActionRequestWebhookParam setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public UpdateAlertActionRequestWebhookParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
