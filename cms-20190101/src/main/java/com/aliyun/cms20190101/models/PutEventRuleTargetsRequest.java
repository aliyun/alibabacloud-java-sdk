// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("FcParameters")
    public java.util.List<PutEventRuleTargetsRequestFcParameters> fcParameters;

    @NameInMap("ContactParameters")
    public java.util.List<PutEventRuleTargetsRequestContactParameters> contactParameters;

    @NameInMap("MnsParameters")
    public java.util.List<PutEventRuleTargetsRequestMnsParameters> mnsParameters;

    @NameInMap("WebhookParameters")
    public java.util.List<PutEventRuleTargetsRequestWebhookParameters> webhookParameters;

    @NameInMap("SlsParameters")
    public java.util.List<PutEventRuleTargetsRequestSlsParameters> slsParameters;

    public static PutEventRuleTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleTargetsRequest self = new PutEventRuleTargetsRequest();
        return TeaModel.build(map, self);
    }

    public PutEventRuleTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutEventRuleTargetsRequest setFcParameters(java.util.List<PutEventRuleTargetsRequestFcParameters> fcParameters) {
        this.fcParameters = fcParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestFcParameters> getFcParameters() {
        return this.fcParameters;
    }

    public PutEventRuleTargetsRequest setContactParameters(java.util.List<PutEventRuleTargetsRequestContactParameters> contactParameters) {
        this.contactParameters = contactParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestContactParameters> getContactParameters() {
        return this.contactParameters;
    }

    public PutEventRuleTargetsRequest setMnsParameters(java.util.List<PutEventRuleTargetsRequestMnsParameters> mnsParameters) {
        this.mnsParameters = mnsParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestMnsParameters> getMnsParameters() {
        return this.mnsParameters;
    }

    public PutEventRuleTargetsRequest setWebhookParameters(java.util.List<PutEventRuleTargetsRequestWebhookParameters> webhookParameters) {
        this.webhookParameters = webhookParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestWebhookParameters> getWebhookParameters() {
        return this.webhookParameters;
    }

    public PutEventRuleTargetsRequest setSlsParameters(java.util.List<PutEventRuleTargetsRequestSlsParameters> slsParameters) {
        this.slsParameters = slsParameters;
        return this;
    }
    public java.util.List<PutEventRuleTargetsRequestSlsParameters> getSlsParameters() {
        return this.slsParameters;
    }

    public static class PutEventRuleTargetsRequestFcParameters extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Id")
        public String id;

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

        public PutEventRuleTargetsRequestFcParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class PutEventRuleTargetsRequestContactParameters extends TeaModel {
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Level")
        public String level;

        @NameInMap("Id")
        public String id;

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

        public PutEventRuleTargetsRequestContactParameters setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public PutEventRuleTargetsRequestContactParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class PutEventRuleTargetsRequestMnsParameters extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Id")
        public String id;

        public static PutEventRuleTargetsRequestMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestMnsParameters self = new PutEventRuleTargetsRequestMnsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestMnsParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventRuleTargetsRequestMnsParameters setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public PutEventRuleTargetsRequestMnsParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class PutEventRuleTargetsRequestWebhookParameters extends TeaModel {
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Method")
        public String method;

        @NameInMap("Url")
        public String url;

        @NameInMap("Id")
        public String id;

        public static PutEventRuleTargetsRequestWebhookParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestWebhookParameters self = new PutEventRuleTargetsRequestWebhookParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestWebhookParameters setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public PutEventRuleTargetsRequestWebhookParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PutEventRuleTargetsRequestWebhookParameters setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public PutEventRuleTargetsRequestWebhookParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class PutEventRuleTargetsRequestSlsParameters extends TeaModel {
        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Region")
        public String region;

        @NameInMap("Project")
        public String project;

        @NameInMap("Id")
        public String id;

        public static PutEventRuleTargetsRequestSlsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestSlsParameters self = new PutEventRuleTargetsRequestSlsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsRequestSlsParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public PutEventRuleTargetsRequestSlsParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventRuleTargetsRequestSlsParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public PutEventRuleTargetsRequestSlsParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
