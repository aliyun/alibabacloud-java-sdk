// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsRequest extends TeaModel {
    @NameInMap("RuleName")
    @Validation(required = true)
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

    public static class PutEventRuleTargetsRequestFcParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("FunctionName")
        public String functionName;

        public static PutEventRuleTargetsRequestFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestFcParameters self = new PutEventRuleTargetsRequestFcParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsRequestContactParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Level")
        public String level;

        public static PutEventRuleTargetsRequestContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestContactParameters self = new PutEventRuleTargetsRequestContactParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsRequestMnsParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Region")
        public String region;

        @NameInMap("Queue")
        public String queue;

        public static PutEventRuleTargetsRequestMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestMnsParameters self = new PutEventRuleTargetsRequestMnsParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsRequestWebhookParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Url")
        public String url;

        @NameInMap("Method")
        public String method;

        public static PutEventRuleTargetsRequestWebhookParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestWebhookParameters self = new PutEventRuleTargetsRequestWebhookParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsRequestSlsParameters extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Region")
        public String region;

        @NameInMap("Project")
        public String project;

        @NameInMap("LogStore")
        public String logStore;

        public static PutEventRuleTargetsRequestSlsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsRequestSlsParameters self = new PutEventRuleTargetsRequestSlsParameters();
            return TeaModel.build(map, self);
        }

    }

}
