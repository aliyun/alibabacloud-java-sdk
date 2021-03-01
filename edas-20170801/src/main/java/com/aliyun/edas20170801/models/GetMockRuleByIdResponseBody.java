// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetMockRuleByIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetMockRuleByIdResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetMockRuleByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMockRuleByIdResponseBody self = new GetMockRuleByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMockRuleByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMockRuleByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMockRuleByIdResponseBody setData(GetMockRuleByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMockRuleByIdResponseBodyData getData() {
        return this.data;
    }

    public GetMockRuleByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMockRuleByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMockRuleByIdResponseBodyDataDubboMockItems extends TeaModel {
        @NameInMap("ParamTypes")
        public String paramTypes;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("Value")
        public String value;

        @NameInMap("Oper")
        public String oper;

        @NameInMap("ExceptionMessage")
        public String exceptionMessage;

        @NameInMap("ExecuteCondition")
        public String executeCondition;

        @NameInMap("Version")
        public String version;

        @NameInMap("Path")
        public String path;

        @NameInMap("ExceptionClassName")
        public String exceptionClassName;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Group")
        public String group;

        public static GetMockRuleByIdResponseBodyDataDubboMockItems build(java.util.Map<String, ?> map) throws Exception {
            GetMockRuleByIdResponseBodyDataDubboMockItems self = new GetMockRuleByIdResponseBodyDataDubboMockItems();
            return TeaModel.build(map, self);
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setParamTypes(String paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public String getParamTypes() {
            return this.paramTypes;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setExceptionMessage(String exceptionMessage) {
            this.exceptionMessage = exceptionMessage;
            return this;
        }
        public String getExceptionMessage() {
            return this.exceptionMessage;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setExecuteCondition(String executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }
        public String getExecuteCondition() {
            return this.executeCondition;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setExceptionClassName(String exceptionClassName) {
            this.exceptionClassName = exceptionClassName;
            return this;
        }
        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetMockRuleByIdResponseBodyDataDubboMockItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class GetMockRuleByIdResponseBodyDataScMockItems extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Oper")
        public String oper;

        @NameInMap("ExecuteCondition")
        public String executeCondition;

        @NameInMap("Path")
        public String path;

        @NameInMap("Method")
        public String method;

        @NameInMap("ExceptionClassName")
        public String exceptionClassName;

        @NameInMap("ServiceName")
        public String serviceName;

        public static GetMockRuleByIdResponseBodyDataScMockItems build(java.util.Map<String, ?> map) throws Exception {
            GetMockRuleByIdResponseBodyDataScMockItems self = new GetMockRuleByIdResponseBodyDataScMockItems();
            return TeaModel.build(map, self);
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setExecuteCondition(String executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }
        public String getExecuteCondition() {
            return this.executeCondition;
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setExceptionClassName(String exceptionClassName) {
            this.exceptionClassName = exceptionClassName;
            return this;
        }
        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public GetMockRuleByIdResponseBodyDataScMockItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetMockRuleByIdResponseBodyData extends TeaModel {
        @NameInMap("DubboMockItems")
        public java.util.List<GetMockRuleByIdResponseBodyDataDubboMockItems> dubboMockItems;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("ExtraJson")
        public String extraJson;

        @NameInMap("Source")
        public String source;

        @NameInMap("Region")
        public String region;

        @NameInMap("ScMockItems")
        public java.util.List<GetMockRuleByIdResponseBodyDataScMockItems> scMockItems;

        @NameInMap("ProviderAppId")
        public String providerAppId;

        @NameInMap("ProviderAppName")
        public String providerAppName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Enable")
        public Boolean enable;

        public static GetMockRuleByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMockRuleByIdResponseBodyData self = new GetMockRuleByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMockRuleByIdResponseBodyData setDubboMockItems(java.util.List<GetMockRuleByIdResponseBodyDataDubboMockItems> dubboMockItems) {
            this.dubboMockItems = dubboMockItems;
            return this;
        }
        public java.util.List<GetMockRuleByIdResponseBodyDataDubboMockItems> getDubboMockItems() {
            return this.dubboMockItems;
        }

        public GetMockRuleByIdResponseBodyData setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public GetMockRuleByIdResponseBodyData setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public GetMockRuleByIdResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetMockRuleByIdResponseBodyData setExtraJson(String extraJson) {
            this.extraJson = extraJson;
            return this;
        }
        public String getExtraJson() {
            return this.extraJson;
        }

        public GetMockRuleByIdResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMockRuleByIdResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetMockRuleByIdResponseBodyData setScMockItems(java.util.List<GetMockRuleByIdResponseBodyDataScMockItems> scMockItems) {
            this.scMockItems = scMockItems;
            return this;
        }
        public java.util.List<GetMockRuleByIdResponseBodyDataScMockItems> getScMockItems() {
            return this.scMockItems;
        }

        public GetMockRuleByIdResponseBodyData setProviderAppId(String providerAppId) {
            this.providerAppId = providerAppId;
            return this;
        }
        public String getProviderAppId() {
            return this.providerAppId;
        }

        public GetMockRuleByIdResponseBodyData setProviderAppName(String providerAppName) {
            this.providerAppName = providerAppName;
            return this;
        }
        public String getProviderAppName() {
            return this.providerAppName;
        }

        public GetMockRuleByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMockRuleByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMockRuleByIdResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
