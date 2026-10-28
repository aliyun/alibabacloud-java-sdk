// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertActionRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
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
    public CreateAlertActionRequestEbParam ebParam;

    /**
     * <p>The elastic scaling parameters.</p>
     */
    @NameInMap("essParam")
    public CreateAlertActionRequestEssParam essParam;

    /**
     * <p>The Function Compute 3.0 parameters.</p>
     */
    @NameInMap("fc3Param")
    public CreateAlertActionRequestFc3Param fc3Param;

    /**
     * <p>The Function Compute parameters.</p>
     */
    @NameInMap("fcParam")
    public CreateAlertActionRequestFcParam fcParam;

    /**
     * <p>The Simple Message Queue (formerly MNS) (MSMQ) parameters.</p>
     */
    @NameInMap("mnsParam")
    public CreateAlertActionRequestMnsParam mnsParam;

    /**
     * <p>The PagerDuty parameters.</p>
     */
    @NameInMap("pagerDutyParam")
    public CreateAlertActionRequestPagerDutyParam pagerDutyParam;

    /**
     * <p>The Simple Log Service parameters.</p>
     */
    @NameInMap("slsParam")
    public CreateAlertActionRequestSlsParam slsParam;

    /**
     * <p>The type of the alert action integration.</p>
     * <p>This parameter is required.</p>
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
    public CreateAlertActionRequestWebhookParam webhookParam;

    public static CreateAlertActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertActionRequest self = new CreateAlertActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertActionRequest setAlertActionId(String alertActionId) {
        this.alertActionId = alertActionId;
        return this;
    }
    public String getAlertActionId() {
        return this.alertActionId;
    }

    public CreateAlertActionRequest setAlertActionName(String alertActionName) {
        this.alertActionName = alertActionName;
        return this;
    }
    public String getAlertActionName() {
        return this.alertActionName;
    }

    public CreateAlertActionRequest setEbParam(CreateAlertActionRequestEbParam ebParam) {
        this.ebParam = ebParam;
        return this;
    }
    public CreateAlertActionRequestEbParam getEbParam() {
        return this.ebParam;
    }

    public CreateAlertActionRequest setEssParam(CreateAlertActionRequestEssParam essParam) {
        this.essParam = essParam;
        return this;
    }
    public CreateAlertActionRequestEssParam getEssParam() {
        return this.essParam;
    }

    public CreateAlertActionRequest setFc3Param(CreateAlertActionRequestFc3Param fc3Param) {
        this.fc3Param = fc3Param;
        return this;
    }
    public CreateAlertActionRequestFc3Param getFc3Param() {
        return this.fc3Param;
    }

    public CreateAlertActionRequest setFcParam(CreateAlertActionRequestFcParam fcParam) {
        this.fcParam = fcParam;
        return this;
    }
    public CreateAlertActionRequestFcParam getFcParam() {
        return this.fcParam;
    }

    public CreateAlertActionRequest setMnsParam(CreateAlertActionRequestMnsParam mnsParam) {
        this.mnsParam = mnsParam;
        return this;
    }
    public CreateAlertActionRequestMnsParam getMnsParam() {
        return this.mnsParam;
    }

    public CreateAlertActionRequest setPagerDutyParam(CreateAlertActionRequestPagerDutyParam pagerDutyParam) {
        this.pagerDutyParam = pagerDutyParam;
        return this;
    }
    public CreateAlertActionRequestPagerDutyParam getPagerDutyParam() {
        return this.pagerDutyParam;
    }

    public CreateAlertActionRequest setSlsParam(CreateAlertActionRequestSlsParam slsParam) {
        this.slsParam = slsParam;
        return this;
    }
    public CreateAlertActionRequestSlsParam getSlsParam() {
        return this.slsParam;
    }

    public CreateAlertActionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAlertActionRequest setWebhookParam(CreateAlertActionRequestWebhookParam webhookParam) {
        this.webhookParam = webhookParam;
        return this;
    }
    public CreateAlertActionRequestWebhookParam getWebhookParam() {
        return this.webhookParam;
    }

    public static class CreateAlertActionRequestEbParam extends TeaModel {
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

        public static CreateAlertActionRequestEbParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestEbParam self = new CreateAlertActionRequestEbParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestEbParam setEbSource(String ebSource) {
            this.ebSource = ebSource;
            return this;
        }
        public String getEbSource() {
            return this.ebSource;
        }

        public CreateAlertActionRequestEbParam setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public CreateAlertActionRequestEbParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAlertActionRequestEbParam setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class CreateAlertActionRequestEssParam extends TeaModel {
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
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static CreateAlertActionRequestEssParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestEssParam self = new CreateAlertActionRequestEssParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestEssParam setEssGroupId(String essGroupId) {
            this.essGroupId = essGroupId;
            return this;
        }
        public String getEssGroupId() {
            return this.essGroupId;
        }

        public CreateAlertActionRequestEssParam setEssRuleId(String essRuleId) {
            this.essRuleId = essRuleId;
            return this;
        }
        public String getEssRuleId() {
            return this.essRuleId;
        }

        public CreateAlertActionRequestEssParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateAlertActionRequestFc3Param extends TeaModel {
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
         * <p>cn-nanjing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static CreateAlertActionRequestFc3Param build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestFc3Param self = new CreateAlertActionRequestFc3Param();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestFc3Param setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public CreateAlertActionRequestFc3Param setQualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }
        public String getQualifier() {
            return this.qualifier;
        }

        public CreateAlertActionRequestFc3Param setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateAlertActionRequestFcParam extends TeaModel {
        /**
         * <p>The name of the function in Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>testFunction</p>
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
         * <p>The service name of Function Compute.</p>
         * 
         * <strong>example:</strong>
         * <p>testService</p>
         */
        @NameInMap("service")
        public String service;

        public static CreateAlertActionRequestFcParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestFcParam self = new CreateAlertActionRequestFcParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestFcParam setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public CreateAlertActionRequestFcParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateAlertActionRequestFcParam setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class CreateAlertActionRequestMnsParam extends TeaModel {
        /**
         * <p>The resource type of Simple Message Queue (formerly MNS) (MSMQ).</p>
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
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static CreateAlertActionRequestMnsParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestMnsParam self = new CreateAlertActionRequestMnsParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestMnsParam setMnsType(String mnsType) {
            this.mnsType = mnsType;
            return this;
        }
        public String getMnsType() {
            return this.mnsType;
        }

        public CreateAlertActionRequestMnsParam setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAlertActionRequestMnsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateAlertActionRequestPagerDutyParam extends TeaModel {
        /**
         * <p>The integration key of PagerDuty.</p>
         * 
         * <strong>example:</strong>
         * <p>fds3wr54rvcxfr4543t6435</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The integration webhook URL of PagerDuty. Both V1 and V2 are supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://events.pagerduty.com/v2/enqueue">https://events.pagerduty.com/v2/enqueue</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CreateAlertActionRequestPagerDutyParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestPagerDutyParam self = new CreateAlertActionRequestPagerDutyParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestPagerDutyParam setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAlertActionRequestPagerDutyParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateAlertActionRequestSlsParam extends TeaModel {
        /**
         * <p>The name of the Logstore in Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>testLogstore。</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the project in Simple Log Service.</p>
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
         * <p>cn-zhangjiakou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static CreateAlertActionRequestSlsParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestSlsParam self = new CreateAlertActionRequestSlsParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestSlsParam setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateAlertActionRequestSlsParam setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public CreateAlertActionRequestSlsParam setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateAlertActionRequestWebhookParam extends TeaModel {
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
         * <p>The alert callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">http://www.test.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CreateAlertActionRequestWebhookParam build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertActionRequestWebhookParam self = new CreateAlertActionRequestWebhookParam();
            return TeaModel.build(map, self);
        }

        public CreateAlertActionRequestWebhookParam setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public CreateAlertActionRequestWebhookParam setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public CreateAlertActionRequestWebhookParam setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateAlertActionRequestWebhookParam setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
