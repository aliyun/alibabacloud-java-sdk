// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsRequest extends TeaModel {
    @NameInMap("ContactParameters")
    public java.util.List<PutEventRuleTargetsRequestContactParameters> contactParameters;

    @NameInMap("FcParameters")
    public java.util.List<PutEventRuleTargetsRequestFcParameters> fcParameters;

    @NameInMap("MnsParameters")
    public java.util.List<PutEventRuleTargetsRequestMnsParameters> mnsParameters;

    @NameInMap("OpenApiParameters")
    public java.util.List<PutEventRuleTargetsRequestOpenApiParameters> openApiParameters;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the protocol. Valid values of N: 1 to 5. Valid values:</p>
     * <br>
     * <p>*   http</p>
     * <p>*   telnet</p>
     * <p>*   ping</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SlsParameters")
    public java.util.List<PutEventRuleTargetsRequestSlsParameters> slsParameters;

    @NameInMap("WebhookParameters")
    public java.util.List<PutEventRuleTargetsRequestWebhookParameters> webhookParameters;

    public static PutEventRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleTargetsRequest self = new PutEventRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public PutEventRuleTargetsRequest setContactParameters(java.util.List<PutEventRuleTargetsRequestContactParameters> contactParameters) {
        this.contactParameters = contactParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestContactParameters> getContactParameters() {
        return this.contactParameters;
    }

    public PutEventRuleTargetsRequest setFcParameters(java.util.List<PutEventRuleTargetsRequestFcParameters> fcParameters) {
        this.fcParameters = fcParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestFcParameters> getFcParameters() {
        return this.fcParameters;
    }

    public PutEventRuleTargetsRequest setMnsParameters(java.util.List<PutEventRuleTargetsRequestMnsParameters> mnsParameters) {
        this.mnsParameters = mnsParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestMnsParameters> getMnsParameters() {
        return this.mnsParameters;
    }

    public PutEventRuleTargetsRequest setOpenApiParameters(java.util.List<PutEventRuleTargetsRequestOpenApiParameters> openApiParameters) {
        this.openApiParameters = openApiParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestOpenApiParameters> getOpenApiParameters() {
        return this.openApiParameters;
    }

    public PutEventRuleTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutEventRuleTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutEventRuleTargetsRequest setSlsParameters(java.util.List<PutEventRuleTargetsRequestSlsParameters> slsParameters) {
        this.slsParameters = slsParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestSlsParameters> getSlsParameters() {
        return this.slsParameters;
    }

    public PutEventRuleTargetsRequest setWebhookParameters(java.util.List<PutEventRuleTargetsRequestWebhookParameters> webhookParameters) {
        this.webhookParameters = webhookParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestWebhookParameters> getWebhookParameters() {
        return this.webhookParameters;
    }

    public static class PutEventRuleTargetsRequestContactParameters extends TeaModel {
        /**
         * <p>The operation that you want to perform. Set the value to **PutEventRuleTargets**.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        /**
         * <p>The HTTP request method. Valid values of N: 1 to 5.</p>
         * <br>
         * <p>Valid values: GET and POST.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the event-triggered alert rule.</p>
         */
        @NameInMap("Level")
        public String level;

        public static PutEventRuleTargetsRequestContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestContactParameters self = new PutEventRuleTargetsRequestContactParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestContactParameters setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public PutEventRuleTargetsRequestContactParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventRuleTargetsRequestContactParameters setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutEventRuleTargetsRequestFcParameters extends TeaModel {
        /**
         * <p>The number of resources that failed to be created or modified.</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>The HTTP status code.</p>
         * <br>
         * <p>>  The status code 200 indicates that the call was successful.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The MNS topic.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The region where Log Service is deployed. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static PutEventRuleTargetsRequestFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestFcParameters self = new PutEventRuleTargetsRequestFcParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestFcParameters setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public PutEventRuleTargetsRequestFcParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventRuleTargetsRequestFcParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventRuleTargetsRequestFcParameters setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class PutEventRuleTargetsRequestMnsParameters extends TeaModel {
        /**
         * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The version of the API.</p>
         */
        @NameInMap("Queue")
        public String queue;

        /**
         * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the resource. Valid values of N: 1 to 5.</p>
         * <br>
         * <p>Format: `arn:acs:${Service}:${Region}:${Account}:${ResourceType}/${ResourceId}`. Fields:</p>
         * <br>
         * <p>*   Service: the code of a cloud service</p>
         * <p>*   Region: the region ID</p>
         * <p>*   Account: the ID of an Alibaba Cloud account</p>
         * <p>*   ResourceType: the resource type</p>
         * <p>*   ResourceId: the resource ID</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static PutEventRuleTargetsRequestMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestMnsParameters self = new PutEventRuleTargetsRequestMnsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestMnsParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventRuleTargetsRequestMnsParameters setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public PutEventRuleTargetsRequestMnsParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventRuleTargetsRequestMnsParameters setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class PutEventRuleTargetsRequestOpenApiParameters extends TeaModel {
        /**
         * <p>The ID of the recipient that receives alert notifications sent by an API callback.</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The error message.</p>
         */
        @NameInMap("Arn")
        public String arn;

        /**
         * <p>The region where Function Compute is deployed. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The region where Message Service (MNS) is deployed. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("JsonParams")
        public String jsonParams;

        /**
         * <p>The name of the Log Service project. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <p>The callback URL. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>This parameter is returned if the specified alert contact groups in the request failed to be created or modified.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The name of the alert contact group.</p>
         */
        @NameInMap("Version")
        public String version;

        public static PutEventRuleTargetsRequestOpenApiParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestOpenApiParameters self = new PutEventRuleTargetsRequestOpenApiParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestOpenApiParameters setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setJsonParams(String jsonParams) {
            this.jsonParams = jsonParams;
            return this;
        }
        public String getJsonParams() {
            return this.jsonParams;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public PutEventRuleTargetsRequestOpenApiParameters setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class PutEventRuleTargetsRequestSlsParameters extends TeaModel {
        /**
         * <p>The name of the alert contact group. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the Log Service Logstore. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("LogStore")
        public String logStore;

        /**
         * <p>The parameters of the alert callback. The parameters are in the JSON format.</p>
         */
        @NameInMap("Project")
        public String project;

        /**
         * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Region")
        public String region;

        public static PutEventRuleTargetsRequestSlsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestSlsParameters self = new PutEventRuleTargetsRequestSlsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestSlsParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventRuleTargetsRequestSlsParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public PutEventRuleTargetsRequestSlsParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public PutEventRuleTargetsRequestSlsParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventRuleTargetsRequestWebhookParameters extends TeaModel {
        /**
         * <p>The alert notification methods. Valid values of N: 1 to 5. Valid values:</p>
         * <br>
         * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The region where the resource resides.</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The ID of the recipient.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The name of the function. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Url")
        public String url;

        public static PutEventRuleTargetsRequestWebhookParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestWebhookParameters self = new PutEventRuleTargetsRequestWebhookParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestWebhookParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventRuleTargetsRequestWebhookParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PutEventRuleTargetsRequestWebhookParameters setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public PutEventRuleTargetsRequestWebhookParameters setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
