// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class PutEventTargetsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ContactParameters")
    public PutEventTargetsResponseBodyContactParameters contactParameters;

    @NameInMap("FailedContactParameters")
    public PutEventTargetsResponseBodyFailedContactParameters failedContactParameters;

    @NameInMap("FailedFcParameters")
    public PutEventTargetsResponseBodyFailedFcParameters failedFcParameters;

    @NameInMap("FailedMnsParameters")
    public PutEventTargetsResponseBodyFailedMnsParameters failedMnsParameters;

    @NameInMap("FailedParameterCount")
    public String failedParameterCount;

    @NameInMap("FailedSlsParameters")
    public PutEventTargetsResponseBodyFailedSlsParameters failedSlsParameters;

    @NameInMap("FcParameters")
    public PutEventTargetsResponseBodyFcParameters fcParameters;

    @NameInMap("Message")
    public String message;

    @NameInMap("MnsParameters")
    public PutEventTargetsResponseBodyMnsParameters mnsParameters;

    @NameInMap("ParameterCount")
    public String parameterCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PutEventTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutEventTargetsResponseBody self = new PutEventTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public PutEventTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutEventTargetsResponseBody setContactParameters(PutEventTargetsResponseBodyContactParameters contactParameters) {
        this.contactParameters = contactParameters;
        return this;
    }
    public PutEventTargetsResponseBodyContactParameters getContactParameters() {
        return this.contactParameters;
    }

    public PutEventTargetsResponseBody setFailedContactParameters(PutEventTargetsResponseBodyFailedContactParameters failedContactParameters) {
        this.failedContactParameters = failedContactParameters;
        return this;
    }
    public PutEventTargetsResponseBodyFailedContactParameters getFailedContactParameters() {
        return this.failedContactParameters;
    }

    public PutEventTargetsResponseBody setFailedFcParameters(PutEventTargetsResponseBodyFailedFcParameters failedFcParameters) {
        this.failedFcParameters = failedFcParameters;
        return this;
    }
    public PutEventTargetsResponseBodyFailedFcParameters getFailedFcParameters() {
        return this.failedFcParameters;
    }

    public PutEventTargetsResponseBody setFailedMnsParameters(PutEventTargetsResponseBodyFailedMnsParameters failedMnsParameters) {
        this.failedMnsParameters = failedMnsParameters;
        return this;
    }
    public PutEventTargetsResponseBodyFailedMnsParameters getFailedMnsParameters() {
        return this.failedMnsParameters;
    }

    public PutEventTargetsResponseBody setFailedParameterCount(String failedParameterCount) {
        this.failedParameterCount = failedParameterCount;
        return this;
    }
    public String getFailedParameterCount() {
        return this.failedParameterCount;
    }

    public PutEventTargetsResponseBody setFailedSlsParameters(PutEventTargetsResponseBodyFailedSlsParameters failedSlsParameters) {
        this.failedSlsParameters = failedSlsParameters;
        return this;
    }
    public PutEventTargetsResponseBodyFailedSlsParameters getFailedSlsParameters() {
        return this.failedSlsParameters;
    }

    public PutEventTargetsResponseBody setFcParameters(PutEventTargetsResponseBodyFcParameters fcParameters) {
        this.fcParameters = fcParameters;
        return this;
    }
    public PutEventTargetsResponseBodyFcParameters getFcParameters() {
        return this.fcParameters;
    }

    public PutEventTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutEventTargetsResponseBody setMnsParameters(PutEventTargetsResponseBodyMnsParameters mnsParameters) {
        this.mnsParameters = mnsParameters;
        return this;
    }
    public PutEventTargetsResponseBodyMnsParameters getMnsParameters() {
        return this.mnsParameters;
    }

    public PutEventTargetsResponseBody setParameterCount(String parameterCount) {
        this.parameterCount = parameterCount;
        return this;
    }
    public String getParameterCount() {
        return this.parameterCount;
    }

    public PutEventTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutEventTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutEventTargetsResponseBodyContactParametersContactParameter extends TeaModel {
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Level")
        public String level;

        public static PutEventTargetsResponseBodyContactParametersContactParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyContactParametersContactParameter self = new PutEventTargetsResponseBodyContactParametersContactParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyContactParametersContactParameter setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public PutEventTargetsResponseBodyContactParametersContactParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyContactParametersContactParameter setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutEventTargetsResponseBodyContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        public java.util.List<PutEventTargetsResponseBodyContactParametersContactParameter> contactParameter;

        public static PutEventTargetsResponseBodyContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyContactParameters self = new PutEventTargetsResponseBodyContactParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyContactParameters setContactParameter(java.util.List<PutEventTargetsResponseBodyContactParametersContactParameter> contactParameter) {
            this.contactParameter = contactParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyContactParametersContactParameter> getContactParameter() {
            return this.contactParameter;
        }

    }

    public static class PutEventTargetsResponseBodyFailedContactParametersContactParameter extends TeaModel {
        @NameInMap("ContactGroupName")
        public String contactGroupName;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Level")
        public String level;

        public static PutEventTargetsResponseBodyFailedContactParametersContactParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedContactParametersContactParameter self = new PutEventTargetsResponseBodyFailedContactParametersContactParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedContactParametersContactParameter setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

        public PutEventTargetsResponseBodyFailedContactParametersContactParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyFailedContactParametersContactParameter setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class PutEventTargetsResponseBodyFailedContactParameters extends TeaModel {
        @NameInMap("ContactParameter")
        public java.util.List<PutEventTargetsResponseBodyFailedContactParametersContactParameter> contactParameter;

        public static PutEventTargetsResponseBodyFailedContactParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedContactParameters self = new PutEventTargetsResponseBodyFailedContactParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedContactParameters setContactParameter(java.util.List<PutEventTargetsResponseBodyFailedContactParametersContactParameter> contactParameter) {
            this.contactParameter = contactParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyFailedContactParametersContactParameter> getContactParameter() {
            return this.contactParameter;
        }

    }

    public static class PutEventTargetsResponseBodyFailedFcParametersFcParameter extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        public static PutEventTargetsResponseBodyFailedFcParametersFcParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedFcParametersFcParameter self = new PutEventTargetsResponseBodyFailedFcParametersFcParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedFcParametersFcParameter setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public PutEventTargetsResponseBodyFailedFcParametersFcParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyFailedFcParametersFcParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventTargetsResponseBodyFailedFcParametersFcParameter setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class PutEventTargetsResponseBodyFailedFcParameters extends TeaModel {
        @NameInMap("FcParameter")
        public java.util.List<PutEventTargetsResponseBodyFailedFcParametersFcParameter> fcParameter;

        public static PutEventTargetsResponseBodyFailedFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedFcParameters self = new PutEventTargetsResponseBodyFailedFcParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedFcParameters setFcParameter(java.util.List<PutEventTargetsResponseBodyFailedFcParametersFcParameter> fcParameter) {
            this.fcParameter = fcParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyFailedFcParametersFcParameter> getFcParameter() {
            return this.fcParameter;
        }

    }

    public static class PutEventTargetsResponseBodyFailedMnsParametersMnsParameter extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Region")
        public String region;

        public static PutEventTargetsResponseBodyFailedMnsParametersMnsParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedMnsParametersMnsParameter self = new PutEventTargetsResponseBodyFailedMnsParametersMnsParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedMnsParametersMnsParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyFailedMnsParametersMnsParameter setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public PutEventTargetsResponseBodyFailedMnsParametersMnsParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventTargetsResponseBodyFailedMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        public java.util.List<PutEventTargetsResponseBodyFailedMnsParametersMnsParameter> mnsParameter;

        public static PutEventTargetsResponseBodyFailedMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedMnsParameters self = new PutEventTargetsResponseBodyFailedMnsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedMnsParameters setMnsParameter(java.util.List<PutEventTargetsResponseBodyFailedMnsParametersMnsParameter> mnsParameter) {
            this.mnsParameter = mnsParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyFailedMnsParametersMnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

    }

    public static class PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("LogStore")
        public String logStore;

        @NameInMap("Project")
        public String project;

        @NameInMap("Region")
        public String region;

        public static PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter self = new PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter setLogStore(String logStore) {
            this.logStore = logStore;
            return this;
        }
        public String getLogStore() {
            return this.logStore;
        }

        public PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventTargetsResponseBodyFailedSlsParameters extends TeaModel {
        @NameInMap("FailedSlsParameter")
        public java.util.List<PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter> failedSlsParameter;

        public static PutEventTargetsResponseBodyFailedSlsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFailedSlsParameters self = new PutEventTargetsResponseBodyFailedSlsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFailedSlsParameters setFailedSlsParameter(java.util.List<PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter> failedSlsParameter) {
            this.failedSlsParameter = failedSlsParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyFailedSlsParametersFailedSlsParameter> getFailedSlsParameter() {
            return this.failedSlsParameter;
        }

    }

    public static class PutEventTargetsResponseBodyFcParametersFcParameter extends TeaModel {
        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Region")
        public String region;

        @NameInMap("ServiceName")
        public String serviceName;

        public static PutEventTargetsResponseBodyFcParametersFcParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFcParametersFcParameter self = new PutEventTargetsResponseBodyFcParametersFcParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFcParametersFcParameter setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public PutEventTargetsResponseBodyFcParametersFcParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyFcParametersFcParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public PutEventTargetsResponseBodyFcParametersFcParameter setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class PutEventTargetsResponseBodyFcParameters extends TeaModel {
        @NameInMap("FcParameter")
        public java.util.List<PutEventTargetsResponseBodyFcParametersFcParameter> fcParameter;

        public static PutEventTargetsResponseBodyFcParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyFcParameters self = new PutEventTargetsResponseBodyFcParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyFcParameters setFcParameter(java.util.List<PutEventTargetsResponseBodyFcParametersFcParameter> fcParameter) {
            this.fcParameter = fcParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyFcParametersFcParameter> getFcParameter() {
            return this.fcParameter;
        }

    }

    public static class PutEventTargetsResponseBodyMnsParametersMnsParameter extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("Queue")
        public String queue;

        @NameInMap("Region")
        public String region;

        public static PutEventTargetsResponseBodyMnsParametersMnsParameter build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyMnsParametersMnsParameter self = new PutEventTargetsResponseBodyMnsParametersMnsParameter();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyMnsParametersMnsParameter setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public PutEventTargetsResponseBodyMnsParametersMnsParameter setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

        public PutEventTargetsResponseBodyMnsParametersMnsParameter setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

    public static class PutEventTargetsResponseBodyMnsParameters extends TeaModel {
        @NameInMap("MnsParameter")
        public java.util.List<PutEventTargetsResponseBodyMnsParametersMnsParameter> mnsParameter;

        public static PutEventTargetsResponseBodyMnsParameters build(java.util.Map<String, ?> map) throws Exception {
            PutEventTargetsResponseBodyMnsParameters self = new PutEventTargetsResponseBodyMnsParameters();
            return TeaModel.build(map, self);
        }

        public PutEventTargetsResponseBodyMnsParameters setMnsParameter(java.util.List<PutEventTargetsResponseBodyMnsParametersMnsParameter> mnsParameter) {
            this.mnsParameter = mnsParameter;
            return this;
        }
        public java.util.List<PutEventTargetsResponseBodyMnsParametersMnsParameter> getMnsParameter() {
            return this.mnsParameter;
        }

    }

}
