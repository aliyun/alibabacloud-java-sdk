// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleTargetListResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the recipients if alert notifications are sent to the alert contacts of an alert contact group.</p>
     */
    @NameInMap("ContactParameters")
    public DescribeEventRuleTargetListResponseBodyContactParameters contactParameters;

    /**
     * <p>The information about the recipients in Function Compute.</p>
     */
    @NameInMap("FcParameters")
    public DescribeEventRuleTargetListResponseBodyFcParameters fcParameters;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The information about the recipients in Message Service (MNS).</p>
     */
    @NameInMap("MnsParameters")
    public DescribeEventRuleTargetListResponseBodyMnsParameters mnsParameters;

    /**
     * <p>The information about the recipients in OpenAPI Explorer.</p>
     */
    @NameInMap("OpenApiParameters")
    public DescribeEventRuleTargetListResponseBodyOpenApiParameters openApiParameters;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the recipients in Log Service.</p>
     */
    @NameInMap("SlsParameters")
    public DescribeEventRuleTargetListResponseBodySlsParameters slsParameters;

    /**
     * <p>The information about the recipients if alert notifications are sent by sending a request to a callback URL.</p>
     */
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
         * <p>The name of the alert group.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The alert notification methods. Valid values:</p>
         * <br>
         * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
         */
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
        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the function. </p>
         * <br>
         * <p>Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: </p>
         * <br>
         * <p>- Service: the code of an Alibaba Cloud service</p>
         * <p>- Region: the region ID</p>
         * <p>- Account: the ID of an Alibaba Cloud account</p>
         * <p>- ResourceType: the resource type</p>
         * <p>- ResourceId: the resource ID</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The name of the function.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The region where Function Compute is deployed.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The name of the Function Compute service.</p>
         */
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
        /**
         * <p>The ARN of the MNS queue. </p>
         * <br>
         * <p>Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: </p>
         * <br>
         * <p>- Service: the code of an Alibaba Cloud service</p>
         * <p>- Region: the region ID</p>
         * <p>- Account: the ID of an Alibaba Cloud account</p>
         * <p>- ResourceType: the resource type</p>
         * <p>- ResourceId: the resource ID</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the MNS queue.</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>The region where MNS is deployed.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The MNS topic.</p>
         */
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
        /**
         * <p>The name of the API operation.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The ARN of the API operation. </p>
         * <br>
         * <p>Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: </p>
         * <br>
         * <p>- Service: the code of an Alibaba Cloud service</p>
         * <p>- Region: the region ID</p>
         * <p>- Account: the ID of an Alibaba Cloud account</p>
         * <p>- ResourceType: the resource type</p>
         * <p>- ResourceId: the resource ID The ARN of the Log Service Logstore. </p>
         * <br>
         * <p>Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields:</p>
         * <p>- Service: the code of an Alibaba Cloud service</p>
         * <p>- Region: the region ID</p>
         * <p>- Account: the ID of an Alibaba Cloud account</p>
         * <p>- ResourceType: the resource type</p>
         * <p>- ResourceId: the resource ID</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the cloud service to which the API operation belongs.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The region where the resource resides.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The name of the role.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The version of the API.</p>
         */
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
        /**
         * <p>The ARN of the Log Service Logstore. </p>
         * <br>
         * <p>Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields: </p>
         * <br>
         * <p>- Service: the code of an Alibaba Cloud service</p>
         * <p>- Region: the region ID</p>
         * <p>- Account: the ID of an Alibaba Cloud account</p>
         * <p>- ResourceType: the resource type</p>
         * <p>- ResourceId: the resource ID</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the Logstore.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The name of the project.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the region where the Log Service project resides.</p>
         */
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
        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The HTTP request method. Valid values: GET and POST.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The protocol type.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The callback URL.</p>
         */
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
