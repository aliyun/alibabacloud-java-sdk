// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FailedParameterCount")
    @Validation(required = true)
    public String failedParameterCount;

    @NameInMap("FailedContactParameters")
    @Validation(required = true)
    public PutEventRuleTargetsResponseFailedContactParameters failedContactParameters;

    @NameInMap("FailedMnsParameters")
    @Validation(required = true)
    public PutEventRuleTargetsResponseFailedMnsParameters failedMnsParameters;

    @NameInMap("FailedFcParameters")
    @Validation(required = true)
    public PutEventRuleTargetsResponseFailedFcParameters failedFcParameters;

    public static PutEventRuleTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleTargetsResponse self = new PutEventRuleTargetsResponse();
        return TeaModel.build(map, self);
    }

    public static class PutEventRuleTargetsResponseFailedContactParametersContactParameter extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("ContactGroupName")
        @Validation(required = true)
        public String contactGroupName;

        @NameInMap("Level")
        @Validation(required = true)
        public String level;

        public static PutEventRuleTargetsResponseFailedContactParametersContactParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseFailedContactParametersContactParameter self = new PutEventRuleTargetsResponseFailedContactParametersContactParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsResponseFailedContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        @Validation(required = true)
        public java.util.List<PutEventRuleTargetsResponseFailedContactParametersContactParameter> contactParameter;

        public static PutEventRuleTargetsResponseFailedContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseFailedContactParameters self = new PutEventRuleTargetsResponseFailedContactParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsResponseFailedMnsParametersMnsParameter extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Queue")
        @Validation(required = true)
        public String queue;

        public static PutEventRuleTargetsResponseFailedMnsParametersMnsParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseFailedMnsParametersMnsParameter self = new PutEventRuleTargetsResponseFailedMnsParametersMnsParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsResponseFailedMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        @Validation(required = true)
        public java.util.List<PutEventRuleTargetsResponseFailedMnsParametersMnsParameter> mnsParameter;

        public static PutEventRuleTargetsResponseFailedMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseFailedMnsParameters self = new PutEventRuleTargetsResponseFailedMnsParameters();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsResponseFailedFcParametersFcParameter extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("FunctionName")
        @Validation(required = true)
        public String functionName;

        public static PutEventRuleTargetsResponseFailedFcParametersFcParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseFailedFcParametersFcParameter self = new PutEventRuleTargetsResponseFailedFcParametersFcParameter();
            return TeaModel.build(map, self);
        }

    }

    public static class PutEventRuleTargetsResponseFailedFcParameters extends TeaModel {
        @NameInMap("FcParameter")
        @Validation(required = true)
        public java.util.List<PutEventRuleTargetsResponseFailedFcParametersFcParameter> fcParameter;

        public static PutEventRuleTargetsResponseFailedFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseFailedFcParameters self = new PutEventRuleTargetsResponseFailedFcParameters();
            return TeaModel.build(map, self);
        }

    }

}
