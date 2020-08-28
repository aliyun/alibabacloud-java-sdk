// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleTargetListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ContactParameters")
    @Validation(required = true)
    public DescribeEventRuleTargetListResponseContactParameters contactParameters;

    @NameInMap("FcParameters")
    @Validation(required = true)
    public DescribeEventRuleTargetListResponseFcParameters fcParameters;

    @NameInMap("MnsParameters")
    @Validation(required = true)
    public DescribeEventRuleTargetListResponseMnsParameters mnsParameters;

    @NameInMap("WebhookParameters")
    @Validation(required = true)
    public DescribeEventRuleTargetListResponseWebhookParameters webhookParameters;

    @NameInMap("SlsParameters")
    @Validation(required = true)
    public DescribeEventRuleTargetListResponseSlsParameters slsParameters;

    public static DescribeEventRuleTargetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleTargetListResponse self = new DescribeEventRuleTargetListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEventRuleTargetListResponseContactParametersContactParameter extends TeaModel {
        @NameInMap("ContactGroupName")
        @Validation(required = true)
        public String contactGroupName;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static DescribeEventRuleTargetListResponseContactParametersContactParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseContactParametersContactParameter self = new DescribeEventRuleTargetListResponseContactParametersContactParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleTargetListResponseContactParametersContactParameter> contactParameter;

        public static DescribeEventRuleTargetListResponseContactParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseContactParameters self = new DescribeEventRuleTargetListResponseContactParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseFcParametersFCParameter extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("FunctionName")
        @Validation(required = true)
        public String functionName;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        public static DescribeEventRuleTargetListResponseFcParametersFCParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseFcParametersFCParameter self = new DescribeEventRuleTargetListResponseFcParametersFCParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseFcParameters extends TeaModel {
        @NameInMap("FCParameter")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleTargetListResponseFcParametersFCParameter> FCParameter;

        public static DescribeEventRuleTargetListResponseFcParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseFcParameters self = new DescribeEventRuleTargetListResponseFcParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseMnsParametersMnsParameter extends TeaModel {
        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Queue")
        @Validation(required = true)
        public String queue;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        public static DescribeEventRuleTargetListResponseMnsParametersMnsParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseMnsParametersMnsParameter self = new DescribeEventRuleTargetListResponseMnsParametersMnsParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleTargetListResponseMnsParametersMnsParameter> mnsParameter;

        public static DescribeEventRuleTargetListResponseMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseMnsParameters self = new DescribeEventRuleTargetListResponseMnsParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseWebhookParametersWebhookParameter extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("Method")
        @Validation(required = true)
        public String method;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        public static DescribeEventRuleTargetListResponseWebhookParametersWebhookParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseWebhookParametersWebhookParameter self = new DescribeEventRuleTargetListResponseWebhookParametersWebhookParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseWebhookParameters extends TeaModel {
        @NameInMap("WebhookParameter")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleTargetListResponseWebhookParametersWebhookParameter> webhookParameter;

        public static DescribeEventRuleTargetListResponseWebhookParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseWebhookParameters self = new DescribeEventRuleTargetListResponseWebhookParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseSlsParametersSlsParameter extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Project")
        @Validation(required = true)
        public String project;

        @NameInMap("LogStore")
        @Validation(required = true)
        public String logStore;

        @NameInMap("Arn")
        @Validation(required = true)
        public String arn;

        public static DescribeEventRuleTargetListResponseSlsParametersSlsParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseSlsParametersSlsParameter self = new DescribeEventRuleTargetListResponseSlsParametersSlsParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleTargetListResponseSlsParameters extends TeaModel {
        @NameInMap("SlsParameter")
        @Validation(required = true)
        public java.util.List<DescribeEventRuleTargetListResponseSlsParametersSlsParameter> slsParameter;

        public static DescribeEventRuleTargetListResponseSlsParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleTargetListResponseSlsParameters self = new DescribeEventRuleTargetListResponseSlsParameters();
            return TeaModel.build(map, self);
        }

    }

}
