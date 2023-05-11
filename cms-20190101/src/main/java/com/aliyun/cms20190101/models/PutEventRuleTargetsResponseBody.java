// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleTargetsResponseBody extends TeaModel {
    /**
     * <p>The name of the API operation.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The name of the queue. Valid values of N: 1 to 5.</p>
     */
    @NameInMap("FailedContactParameters")
    public PutEventRuleTargetsResponseBodyFailedContactParameters failedContactParameters;

    @NameInMap("FailedFcParameters")
    public PutEventRuleTargetsResponseBodyFailedFcParameters failedFcParameters;

    @NameInMap("FailedMnsParameters")
    public PutEventRuleTargetsResponseBodyFailedMnsParameters failedMnsParameters;

    /**
     * <p>The name of the Function Compute service. Valid values of N: 1 to 5.</p>
     */
    @NameInMap("FailedParameterCount")
    public String failedParameterCount;

    /**
     * <p>The ID of the recipient that receives alert notifications. Valid values of N: 1 to 5.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The alert notification methods. Valid values:</p>
     * <br>
     * <p>4: Alert notifications are sent by using DingTalk chatbots and emails.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the role.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PutEventRuleTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleTargetsResponseBody self = new PutEventRuleTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEventRuleTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutEventRuleTargetsResponseBody setFailedContactParameters(PutEventRuleTargetsResponseBodyFailedContactParameters failedContactParameters) {
        this.failedContactParameters = failedContactParameters;
        return this;
    }
    public PutEventRuleTargetsResponseBodyFailedContactParameters getFailedContactParameters() {
        return this.failedContactParameters;
    }

    public PutEventRuleTargetsResponseBody setFailedFcParameters(PutEventRuleTargetsResponseBodyFailedFcParameters failedFcParameters) {
        this.failedFcParameters = failedFcParameters;
        return this;
    }
    public PutEventRuleTargetsResponseBodyFailedFcParameters getFailedFcParameters() {
        return this.failedFcParameters;
    }

    public PutEventRuleTargetsResponseBody setFailedMnsParameters(PutEventRuleTargetsResponseBodyFailedMnsParameters failedMnsParameters) {
        this.failedMnsParameters = failedMnsParameters;
        return this;
    }
    public PutEventRuleTargetsResponseBodyFailedMnsParameters getFailedMnsParameters() {
        return this.failedMnsParameters;
    }

    public PutEventRuleTargetsResponseBody setFailedParameterCount(String failedParameterCount) {
        this.failedParameterCount = failedParameterCount;
        return this;
    }
    public String getFailedParameterCount() {
        return this.failedParameterCount;
    }

    public PutEventRuleTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutEventRuleTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutEventRuleTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Level")
        public String level;

        public static PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter self = new PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutEventRuleTargetsResponseBodyFailedContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        public java.util.List<PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter> contactParameter;

        public static PutEventRuleTargetsResponseBodyFailedContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseBodyFailedContactParameters self = new PutEventRuleTargetsResponseBodyFailedContactParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsResponseBodyFailedContactParameters setContactParameter(java.util.List<PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter> contactParameter) {
            this.contactParameter = contactParameter;
            return this;
        }
        public java.util.List<PutEventRuleTargetsResponseBodyFailedContactParametersContactParameter> getContactParameter() {
            return this.contactParameter;
        }

    }

    public static class PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        public static PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter self = new PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class PutEventRuleTargetsResponseBodyFailedFcParameters extends TeaModel {
        @NameInMap("FcParameter")
        public java.util.List<PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter> fcParameter;

        public static PutEventRuleTargetsResponseBodyFailedFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseBodyFailedFcParameters self = new PutEventRuleTargetsResponseBodyFailedFcParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsResponseBodyFailedFcParameters setFcParameter(java.util.List<PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter> fcParameter) {
            this.fcParameter = fcParameter;
            return this;
        }
        public java.util.List<PutEventRuleTargetsResponseBodyFailedFcParametersFcParameter> getFcParameter() {
            return this.fcParameter;
        }

    }

    public static class PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Region")
        public String region;

        public static PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter self = new PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventRuleTargetsResponseBodyFailedMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        public java.util.List<PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter> mnsParameter;

        public static PutEventRuleTargetsResponseBodyFailedMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleTargetsResponseBodyFailedMnsParameters self = new PutEventRuleTargetsResponseBodyFailedMnsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventRuleTargetsResponseBodyFailedMnsParameters setMnsParameter(java.util.List<PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter> mnsParameter) {
            this.mnsParameter = mnsParameter;
            return this;
        }
        public java.util.List<PutEventRuleTargetsResponseBodyFailedMnsParametersMnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

    }

}
