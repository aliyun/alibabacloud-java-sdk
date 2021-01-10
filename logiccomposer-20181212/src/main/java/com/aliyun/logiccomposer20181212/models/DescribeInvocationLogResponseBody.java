// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeInvocationLogResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("ReturnCode")
    public String returnCode;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Actions")
    public java.util.List<DescribeInvocationLogResponseBodyActions> actions;

    @NameInMap("TimeoutTime")
    public Long timeoutTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Workflow")
    public DescribeInvocationLogResponseBodyWorkflow workflow;

    @NameInMap("InvocationError")
    public DescribeInvocationLogResponseBodyInvocationError invocationError;

    @NameInMap("Trigger")
    public DescribeInvocationLogResponseBodyTrigger trigger;

    @NameInMap("ResponseResult")
    public DescribeInvocationLogResponseBodyResponseResult responseResult;

    @NameInMap("InvocationId")
    public String invocationId;

    @NameInMap("OutputsResult")
    public DescribeInvocationLogResponseBodyOutputsResult outputsResult;

    public static DescribeInvocationLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationLogResponseBody self = new DescribeInvocationLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationLogResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInvocationLogResponseBody setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DescribeInvocationLogResponseBody setReturnCode(String returnCode) {
        this.returnCode = returnCode;
        return this;
    }
    public String getReturnCode() {
        return this.returnCode;
    }

    public DescribeInvocationLogResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeInvocationLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInvocationLogResponseBody setActions(java.util.List<DescribeInvocationLogResponseBodyActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<DescribeInvocationLogResponseBodyActions> getActions() {
        return this.actions;
    }

    public DescribeInvocationLogResponseBody setTimeoutTime(Long timeoutTime) {
        this.timeoutTime = timeoutTime;
        return this;
    }
    public Long getTimeoutTime() {
        return this.timeoutTime;
    }

    public DescribeInvocationLogResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeInvocationLogResponseBody setWorkflow(DescribeInvocationLogResponseBodyWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }
    public DescribeInvocationLogResponseBodyWorkflow getWorkflow() {
        return this.workflow;
    }

    public DescribeInvocationLogResponseBody setInvocationError(DescribeInvocationLogResponseBodyInvocationError invocationError) {
        this.invocationError = invocationError;
        return this;
    }
    public DescribeInvocationLogResponseBodyInvocationError getInvocationError() {
        return this.invocationError;
    }

    public DescribeInvocationLogResponseBody setTrigger(DescribeInvocationLogResponseBodyTrigger trigger) {
        this.trigger = trigger;
        return this;
    }
    public DescribeInvocationLogResponseBodyTrigger getTrigger() {
        return this.trigger;
    }

    public DescribeInvocationLogResponseBody setResponseResult(DescribeInvocationLogResponseBodyResponseResult responseResult) {
        this.responseResult = responseResult;
        return this;
    }
    public DescribeInvocationLogResponseBodyResponseResult getResponseResult() {
        return this.responseResult;
    }

    public DescribeInvocationLogResponseBody setInvocationId(String invocationId) {
        this.invocationId = invocationId;
        return this;
    }
    public String getInvocationId() {
        return this.invocationId;
    }

    public DescribeInvocationLogResponseBody setOutputsResult(DescribeInvocationLogResponseBodyOutputsResult outputsResult) {
        this.outputsResult = outputsResult;
        return this;
    }
    public DescribeInvocationLogResponseBodyOutputsResult getOutputsResult() {
        return this.outputsResult;
    }

    public static class DescribeInvocationLogResponseBodyActionsError extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Message")
        public String message;

        public static DescribeInvocationLogResponseBodyActionsError build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyActionsError self = new DescribeInvocationLogResponseBodyActionsError();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyActionsError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationLogResponseBodyActionsError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeInvocationLogResponseBodyActionsOutputsResult extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ContentSize")
        public String contentSize;

        @NameInMap("Url")
        public String url;

        public static DescribeInvocationLogResponseBodyActionsOutputsResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyActionsOutputsResult self = new DescribeInvocationLogResponseBodyActionsOutputsResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyActionsOutputsResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeInvocationLogResponseBodyActionsOutputsResult setContentSize(String contentSize) {
            this.contentSize = contentSize;
            return this;
        }
        public String getContentSize() {
            return this.contentSize;
        }

        public DescribeInvocationLogResponseBodyActionsOutputsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeInvocationLogResponseBodyActionsInputsResult extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ContentSize")
        public String contentSize;

        @NameInMap("Url")
        public String url;

        public static DescribeInvocationLogResponseBodyActionsInputsResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyActionsInputsResult self = new DescribeInvocationLogResponseBodyActionsInputsResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyActionsInputsResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeInvocationLogResponseBodyActionsInputsResult setContentSize(String contentSize) {
            this.contentSize = contentSize;
            return this;
        }
        public String getContentSize() {
            return this.contentSize;
        }

        public DescribeInvocationLogResponseBodyActionsInputsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeInvocationLogResponseBodyActions extends TeaModel {
        @NameInMap("LoopCount")
        public Integer loopCount;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("InvocationId")
        public String invocationId;

        @NameInMap("ReturnCode")
        public String returnCode;

        @NameInMap("Error")
        public DescribeInvocationLogResponseBodyActionsError error;

        @NameInMap("OutputsResult")
        public DescribeInvocationLogResponseBodyActionsOutputsResult outputsResult;

        @NameInMap("Name")
        public String name;

        @NameInMap("InputsResult")
        public DescribeInvocationLogResponseBodyActionsInputsResult inputsResult;

        public static DescribeInvocationLogResponseBodyActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyActions self = new DescribeInvocationLogResponseBodyActions();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyActions setLoopCount(Integer loopCount) {
            this.loopCount = loopCount;
            return this;
        }
        public Integer getLoopCount() {
            return this.loopCount;
        }

        public DescribeInvocationLogResponseBodyActions setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeInvocationLogResponseBodyActions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInvocationLogResponseBodyActions setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationLogResponseBodyActions setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public DescribeInvocationLogResponseBodyActions setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public DescribeInvocationLogResponseBodyActions setError(DescribeInvocationLogResponseBodyActionsError error) {
            this.error = error;
            return this;
        }
        public DescribeInvocationLogResponseBodyActionsError getError() {
            return this.error;
        }

        public DescribeInvocationLogResponseBodyActions setOutputsResult(DescribeInvocationLogResponseBodyActionsOutputsResult outputsResult) {
            this.outputsResult = outputsResult;
            return this;
        }
        public DescribeInvocationLogResponseBodyActionsOutputsResult getOutputsResult() {
            return this.outputsResult;
        }

        public DescribeInvocationLogResponseBodyActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInvocationLogResponseBodyActions setInputsResult(DescribeInvocationLogResponseBodyActionsInputsResult inputsResult) {
            this.inputsResult = inputsResult;
            return this;
        }
        public DescribeInvocationLogResponseBodyActionsInputsResult getInputsResult() {
            return this.inputsResult;
        }

    }

    public static class DescribeInvocationLogResponseBodyWorkflow extends TeaModel {
        @NameInMap("Definition")
        public String definition;

        @NameInMap("Version")
        public String version;

        @NameInMap("FlowId")
        public String flowId;

        public static DescribeInvocationLogResponseBodyWorkflow build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyWorkflow self = new DescribeInvocationLogResponseBodyWorkflow();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyWorkflow setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public DescribeInvocationLogResponseBodyWorkflow setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeInvocationLogResponseBodyWorkflow setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

    }

    public static class DescribeInvocationLogResponseBodyInvocationError extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Message")
        public String message;

        public static DescribeInvocationLogResponseBodyInvocationError build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyInvocationError self = new DescribeInvocationLogResponseBodyInvocationError();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyInvocationError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationLogResponseBodyInvocationError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeInvocationLogResponseBodyTriggerError extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Message")
        public String message;

        public static DescribeInvocationLogResponseBodyTriggerError build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyTriggerError self = new DescribeInvocationLogResponseBodyTriggerError();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyTriggerError setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeInvocationLogResponseBodyTriggerError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeInvocationLogResponseBodyTriggerOutputsResult extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ContentSize")
        public String contentSize;

        @NameInMap("Url")
        public String url;

        public static DescribeInvocationLogResponseBodyTriggerOutputsResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyTriggerOutputsResult self = new DescribeInvocationLogResponseBodyTriggerOutputsResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyTriggerOutputsResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeInvocationLogResponseBodyTriggerOutputsResult setContentSize(String contentSize) {
            this.contentSize = contentSize;
            return this;
        }
        public String getContentSize() {
            return this.contentSize;
        }

        public DescribeInvocationLogResponseBodyTriggerOutputsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeInvocationLogResponseBodyTriggerInputsResult extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ContentSize")
        public String contentSize;

        @NameInMap("Url")
        public String url;

        public static DescribeInvocationLogResponseBodyTriggerInputsResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyTriggerInputsResult self = new DescribeInvocationLogResponseBodyTriggerInputsResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyTriggerInputsResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeInvocationLogResponseBodyTriggerInputsResult setContentSize(String contentSize) {
            this.contentSize = contentSize;
            return this;
        }
        public String getContentSize() {
            return this.contentSize;
        }

        public DescribeInvocationLogResponseBodyTriggerInputsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeInvocationLogResponseBodyTrigger extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("InvocationId")
        public String invocationId;

        @NameInMap("ReturnCode")
        public String returnCode;

        @NameInMap("Error")
        public DescribeInvocationLogResponseBodyTriggerError error;

        @NameInMap("OutputsResult")
        public DescribeInvocationLogResponseBodyTriggerOutputsResult outputsResult;

        @NameInMap("Name")
        public String name;

        @NameInMap("InputsResult")
        public DescribeInvocationLogResponseBodyTriggerInputsResult inputsResult;

        public static DescribeInvocationLogResponseBodyTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyTrigger self = new DescribeInvocationLogResponseBodyTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyTrigger setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeInvocationLogResponseBodyTrigger setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInvocationLogResponseBodyTrigger setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeInvocationLogResponseBodyTrigger setInvocationId(String invocationId) {
            this.invocationId = invocationId;
            return this;
        }
        public String getInvocationId() {
            return this.invocationId;
        }

        public DescribeInvocationLogResponseBodyTrigger setReturnCode(String returnCode) {
            this.returnCode = returnCode;
            return this;
        }
        public String getReturnCode() {
            return this.returnCode;
        }

        public DescribeInvocationLogResponseBodyTrigger setError(DescribeInvocationLogResponseBodyTriggerError error) {
            this.error = error;
            return this;
        }
        public DescribeInvocationLogResponseBodyTriggerError getError() {
            return this.error;
        }

        public DescribeInvocationLogResponseBodyTrigger setOutputsResult(DescribeInvocationLogResponseBodyTriggerOutputsResult outputsResult) {
            this.outputsResult = outputsResult;
            return this;
        }
        public DescribeInvocationLogResponseBodyTriggerOutputsResult getOutputsResult() {
            return this.outputsResult;
        }

        public DescribeInvocationLogResponseBodyTrigger setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInvocationLogResponseBodyTrigger setInputsResult(DescribeInvocationLogResponseBodyTriggerInputsResult inputsResult) {
            this.inputsResult = inputsResult;
            return this;
        }
        public DescribeInvocationLogResponseBodyTriggerInputsResult getInputsResult() {
            return this.inputsResult;
        }

    }

    public static class DescribeInvocationLogResponseBodyResponseResult extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ContentSize")
        public String contentSize;

        @NameInMap("Url")
        public String url;

        public static DescribeInvocationLogResponseBodyResponseResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyResponseResult self = new DescribeInvocationLogResponseBodyResponseResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyResponseResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeInvocationLogResponseBodyResponseResult setContentSize(String contentSize) {
            this.contentSize = contentSize;
            return this;
        }
        public String getContentSize() {
            return this.contentSize;
        }

        public DescribeInvocationLogResponseBodyResponseResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribeInvocationLogResponseBodyOutputsResult extends TeaModel {
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("ContentSize")
        public String contentSize;

        @NameInMap("Url")
        public String url;

        public static DescribeInvocationLogResponseBodyOutputsResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeInvocationLogResponseBodyOutputsResult self = new DescribeInvocationLogResponseBodyOutputsResult();
            return TeaModel.build(map, self);
        }

        public DescribeInvocationLogResponseBodyOutputsResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public DescribeInvocationLogResponseBodyOutputsResult setContentSize(String contentSize) {
            this.contentSize = contentSize;
            return this;
        }
        public String getContentSize() {
            return this.contentSize;
        }

        public DescribeInvocationLogResponseBodyOutputsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
