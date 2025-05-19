// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class PutEventTargetsRequest extends TeaModel {
    @NameInMap("ContactParameters")
    public java.util.List<PutEventTargetsRequestContactParameters> contactParameters;

    @NameInMap("FcParameters")
    public java.util.List<PutEventTargetsRequestFcParameters> fcParameters;

    @NameInMap("MnsParameters")
    public java.util.List<PutEventTargetsRequestMnsParameters> mnsParameters;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("SlsParameters")
    public java.util.List<PutEventTargetsRequestSlsParameters> slsParameters;

    @NameInMap("WebhookParameters")
    public java.util.List<PutEventTargetsRequestWebhookParameters> webhookParameters;

    public static PutEventTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventTargetsRequest self = new PutEventTargetsRequest();
        return TeaModel.build(map, self);
    }

    public PutEventTargetsRequest setContactParameters(java.util.List<PutEventTargetsRequestContactParameters> contactParameters) {
        this.contactParameters = contactParameters;
        return this;
    }
    public java.util.List<PutEventTargetsRequestContactParameters> getContactParameters() {
        return this.contactParameters;
    }

    public PutEventTargetsRequest setFcParameters(java.util.List<PutEventTargetsRequestFcParameters> fcParameters) {
        this.fcParameters = fcParameters;
        return this;
    }
    public java.util.List<PutEventTargetsRequestFcParameters> getFcParameters() {
        return this.fcParameters;
    }

    public PutEventTargetsRequest setMnsParameters(java.util.List<PutEventTargetsRequestMnsParameters> mnsParameters) {
        this.mnsParameters = mnsParameters;
        return this;
    }
    public java.util.List<PutEventTargetsRequestMnsParameters> getMnsParameters() {
        return this.mnsParameters;
    }

    public PutEventTargetsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PutEventTargetsRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public PutEventTargetsRequest setSlsParameters(java.util.List<PutEventTargetsRequestSlsParameters> slsParameters) {
        this.slsParameters = slsParameters;
        return this;
    }
    public java.util.List<PutEventTargetsRequestSlsParameters> getSlsParameters() {
        return this.slsParameters;
    }

    public PutEventTargetsRequest setWebhookParameters(java.util.List<PutEventTargetsRequestWebhookParameters> webhookParameters) {
        this.webhookParameters = webhookParameters;
        return this;
    }
    public java.util.List<PutEventTargetsRequestWebhookParameters> getWebhookParameters() {
        return this.webhookParameters;
    }

    public static class PutEventTargetsRequestContactParameters extends TeaModel {
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Level")
        public String level;

        public static PutEventTargetsRequestContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsRequestContactParameters self = new PutEventTargetsRequestContactParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsRequestContactParameters setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public PutEventTargetsRequestContactParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventTargetsRequestContactParameters setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutEventTargetsRequestFcParameters extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        public static PutEventTargetsRequestFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsRequestFcParameters self = new PutEventTargetsRequestFcParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsRequestFcParameters setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public PutEventTargetsRequestFcParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventTargetsRequestFcParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventTargetsRequestFcParameters setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class PutEventTargetsRequestMnsParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Region")
        public String region;

        public static PutEventTargetsRequestMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsRequestMnsParameters self = new PutEventTargetsRequestMnsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsRequestMnsParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventTargetsRequestMnsParameters setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public PutEventTargetsRequestMnsParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventTargetsRequestSlsParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

        @NameInMap("Region")
        public String region;

        public static PutEventTargetsRequestSlsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsRequestSlsParameters self = new PutEventTargetsRequestSlsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsRequestSlsParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventTargetsRequestSlsParameters setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public PutEventTargetsRequestSlsParameters setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public PutEventTargetsRequestSlsParameters setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventTargetsRequestWebhookParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Method")
        public String method;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Url")
        public String url;

        public static PutEventTargetsRequestWebhookParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsRequestWebhookParameters self = new PutEventTargetsRequestWebhookParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsRequestWebhookParameters setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventTargetsRequestWebhookParameters setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public PutEventTargetsRequestWebhookParameters setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public PutEventTargetsRequestWebhookParameters setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
