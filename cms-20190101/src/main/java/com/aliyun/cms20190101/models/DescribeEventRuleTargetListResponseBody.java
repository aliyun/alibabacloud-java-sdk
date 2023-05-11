// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleTargetListResponseBody extends TeaModel {
    /**
     * <p>The alert notification methods. Valid values:</p>
     * <br>
     * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("ContactParameters")
    public DescribeEventRuleTargetListResponseBodyContactParameters contactParameters;

    @NameInMap("FcParameters")
    public DescribeEventRuleTargetListResponseBodyFcParameters fcParameters;

    /**
     * <p>The information about the recipients if alert notifications are sent to the alert contacts of an alert contact group.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("MnsParameters")
    public DescribeEventRuleTargetListResponseBodyMnsParameters mnsParameters;

    @NameInMap("OpenApiParameters")
    public DescribeEventRuleTargetListResponseBodyOpenApiParameters openApiParameters;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlsParameters")
    public DescribeEventRuleTargetListResponseBodySlsParameters slsParameters;

    @NameInMap("WebhookParameters")
    public DescribeEventRuleTargetListResponseBodyWebhookParameters webhookParameters;

    public static DescribeEventRuleTargetListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleTargetListResponseBody self = new DescribeEventRuleTargetListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleTargetListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventRuleTargetListResponseBody setContactParameters(DescribeEventRuleTargetListResponseBodyContactParameters contactParameters) {
        this.contactParameters = contactParameters;
        return this;
    }
    public DescribeEventRuleTargetListResponseBodyContactParameters getContactParameters() {
        return this.contactParameters;
    }

    public DescribeEventRuleTargetListResponseBody setFcParameters(DescribeEventRuleTargetListResponseBodyFcParameters fcParameters) {
        this.fcParameters = fcParameters;
        return this;
    }
    public DescribeEventRuleTargetListResponseBodyFcParameters getFcParameters() {
        return this.fcParameters;
    }

    public DescribeEventRuleTargetListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventRuleTargetListResponseBody setMnsParameters(DescribeEventRuleTargetListResponseBodyMnsParameters mnsParameters) {
        this.mnsParameters = mnsParameters;
        return this;
    }
    public DescribeEventRuleTargetListResponseBodyMnsParameters getMnsParameters() {
        return this.mnsParameters;
    }

    public DescribeEventRuleTargetListResponseBody setOpenApiParameters(DescribeEventRuleTargetListResponseBodyOpenApiParameters openApiParameters) {
        this.openApiParameters = openApiParameters;
        return this;
    }
    public DescribeEventRuleTargetListResponseBodyOpenApiParameters getOpenApiParameters() {
        return this.openApiParameters;
    }

    public DescribeEventRuleTargetListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventRuleTargetListResponseBody setSlsParameters(DescribeEventRuleTargetListResponseBodySlsParameters slsParameters) {
        this.slsParameters = slsParameters;
        return this;
    }
    public DescribeEventRuleTargetListResponseBodySlsParameters getSlsParameters() {
        return this.slsParameters;
    }

    public DescribeEventRuleTargetListResponseBody setWebhookParameters(DescribeEventRuleTargetListResponseBodyWebhookParameters webhookParameters) {
        this.webhookParameters = webhookParameters;
        return this;
    }
    public DescribeEventRuleTargetListResponseBodyWebhookParameters getWebhookParameters() {
        return this.webhookParameters;
    }

    public static class DescribeEventRuleTargetListResponseBodyContactParametersContactParameter extends TeaModel {
        /**
         * <p>Queries the details of an event-triggered alert rule.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        public static DescribeEventRuleTargetListResponseBodyContactParametersContactParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyContactParametersContactParameter self = new DescribeEventRuleTargetListResponseBodyContactParametersContactParameter();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyContactParametersContactParameter setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public DescribeEventRuleTargetListResponseBodyContactParametersContactParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEventRuleTargetListResponseBodyContactParametersContactParameter setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        public java.util.List<DescribeEventRuleTargetListResponseBodyContactParametersContactParameter> contactParameter;

        public static DescribeEventRuleTargetListResponseBodyContactParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyContactParameters self = new DescribeEventRuleTargetListResponseBodyContactParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyContactParameters setContactParameter(java.util.List<DescribeEventRuleTargetListResponseBodyContactParametersContactParameter> contactParameter) {
            this.contactParameter = contactParameter;
            return this;
        }
        public java.util.List<DescribeEventRuleTargetListResponseBodyContactParametersContactParameter> getContactParameter() {
            return this.contactParameter;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyFcParametersFCParameter extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        public static DescribeEventRuleTargetListResponseBodyFcParametersFCParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyFcParametersFCParameter self = new DescribeEventRuleTargetListResponseBodyFcParametersFCParameter();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyFcParametersFCParameter setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeEventRuleTargetListResponseBodyFcParametersFCParameter setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public DescribeEventRuleTargetListResponseBodyFcParametersFCParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEventRuleTargetListResponseBodyFcParametersFCParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeEventRuleTargetListResponseBodyFcParametersFCParameter setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyFcParameters extends TeaModel {
        @NameInMap("FCParameter")
        public java.util.List<DescribeEventRuleTargetListResponseBodyFcParametersFCParameter> FCParameter;

        public static DescribeEventRuleTargetListResponseBodyFcParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyFcParameters self = new DescribeEventRuleTargetListResponseBodyFcParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyFcParameters setFCParameter(java.util.List<DescribeEventRuleTargetListResponseBodyFcParametersFCParameter> FCParameter) {
            this.FCParameter = FCParameter;
            return this;
        }
        public java.util.List<DescribeEventRuleTargetListResponseBodyFcParametersFCParameter> getFCParameter() {
            return this.FCParameter;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Region")
        public String region;

        @NameInMap("Topic")
        public String topic;

        public static DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter self = new DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        public java.util.List<DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter> mnsParameter;

        public static DescribeEventRuleTargetListResponseBodyMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyMnsParameters self = new DescribeEventRuleTargetListResponseBodyMnsParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyMnsParameters setMnsParameter(java.util.List<DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter> mnsParameter) {
            this.mnsParameter = mnsParameter;
            return this;
        }
        public java.util.List<DescribeEventRuleTargetListResponseBodyMnsParametersMnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("Product")
        public String product;

        @NameInMap("Region")
        public String region;

        @NameInMap("Role")
        public String role;

        @NameInMap("Version")
        public String version;

        public static DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters self = new DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyOpenApiParameters extends TeaModel {
        @NameInMap("OpenApiParameters")
        public java.util.List<DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters> openApiParameters;

        public static DescribeEventRuleTargetListResponseBodyOpenApiParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyOpenApiParameters self = new DescribeEventRuleTargetListResponseBodyOpenApiParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyOpenApiParameters setOpenApiParameters(java.util.List<DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters> openApiParameters) {
            this.openApiParameters = openApiParameters;
            return this;
        }
        public java.util.List<DescribeEventRuleTargetListResponseBodyOpenApiParametersOpenApiParameters> getOpenApiParameters() {
            return this.openApiParameters;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("Id")
        public String id;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

        @NameInMap("Region")
        public String region;

        public static DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter self = new DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodySlsParameters extends TeaModel {
        @NameInMap("SlsParameter")
        public java.util.List<DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter> slsParameter;

        public static DescribeEventRuleTargetListResponseBodySlsParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodySlsParameters self = new DescribeEventRuleTargetListResponseBodySlsParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodySlsParameters setSlsParameter(java.util.List<DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter> slsParameter) {
            this.slsParameter = slsParameter;
            return this;
        }
        public java.util.List<DescribeEventRuleTargetListResponseBodySlsParametersSlsParameter> getSlsParameter() {
            return this.slsParameter;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Method")
        public String method;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Url")
        public String url;

        public static DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter self = new DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeEventRuleTargetListResponseBodyWebhookParameters extends TeaModel {
        @NameInMap("WebhookParameter")
        public java.util.List<DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter> webhookParameter;

        public static DescribeEventRuleTargetListResponseBodyWebhookParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseBodyWebhookParameters self = new DescribeEventRuleTargetListResponseBodyWebhookParameters();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleTargetListResponseBodyWebhookParameters setWebhookParameter(java.util.List<DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter> webhookParameter) {
            this.webhookParameter = webhookParameter;
            return this;
        }
        public java.util.List<DescribeEventRuleTargetListResponseBodyWebhookParametersWebhookParameter> getWebhookParameter() {
            return this.webhookParameter;
        }

    }

}
