// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAccountMockRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetAccountMockRuleResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAccountMockRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMockRuleResponseBody self = new GetAccountMockRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountMockRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountMockRuleResponseBody setData(GetAccountMockRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountMockRuleResponseBodyData getData() {
        return this.data;
    }

    public GetAccountMockRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountMockRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountMockRuleResponseBodyDataResultDubboMockItems extends TeaModel {
        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("ParamTypes")
        public java.util.List<String> paramTypes;

        @NameInMap("Value")
        public String value;

        @NameInMap("Oper")
        public String oper;

        @NameInMap("ExecuteCondition")
        public String executeCondition;

        @NameInMap("Version")
        public String version;

        @NameInMap("ExceptionClassName")
        public String exceptionClassName;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Group")
        public String group;

        public static GetAccountMockRuleResponseBodyDataResultDubboMockItems build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyDataResultDubboMockItems self = new GetAccountMockRuleResponseBodyDataResultDubboMockItems();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setParamTypes(java.util.List<String> paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public java.util.List<String> getParamTypes() {
            return this.paramTypes;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setExecuteCondition(String executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }
        public String getExecuteCondition() {
            return this.executeCondition;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setExceptionClassName(String exceptionClassName) {
            this.exceptionClassName = exceptionClassName;
            return this;
        }
        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

    }

    public static class GetAccountMockRuleResponseBodyDataResultScMockItems extends TeaModel {
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

        public static GetAccountMockRuleResponseBodyDataResultScMockItems build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyDataResultScMockItems self = new GetAccountMockRuleResponseBodyDataResultScMockItems();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setExecuteCondition(String executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }
        public String getExecuteCondition() {
            return this.executeCondition;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setExceptionClassName(String exceptionClassName) {
            this.exceptionClassName = exceptionClassName;
            return this;
        }
        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class GetAccountMockRuleResponseBodyDataResult extends TeaModel {
        @NameInMap("DubboMockItems")
        public java.util.List<GetAccountMockRuleResponseBodyDataResultDubboMockItems> dubboMockItems;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Region")
        public String region;

        @NameInMap("ScMockItems")
        public java.util.List<GetAccountMockRuleResponseBodyDataResultScMockItems> scMockItems;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("ProviderAppId")
        public String providerAppId;

        @NameInMap("ProviderAppName")
        public String providerAppName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Enable")
        public Boolean enable;

        public static GetAccountMockRuleResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyDataResult self = new GetAccountMockRuleResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyDataResult setDubboMockItems(java.util.List<GetAccountMockRuleResponseBodyDataResultDubboMockItems> dubboMockItems) {
            this.dubboMockItems = dubboMockItems;
            return this;
        }
        public java.util.List<GetAccountMockRuleResponseBodyDataResultDubboMockItems> getDubboMockItems() {
            return this.dubboMockItems;
        }

        public GetAccountMockRuleResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAccountMockRuleResponseBodyDataResult setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public GetAccountMockRuleResponseBodyDataResult setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public GetAccountMockRuleResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAccountMockRuleResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAccountMockRuleResponseBodyDataResult setScMockItems(java.util.List<GetAccountMockRuleResponseBodyDataResultScMockItems> scMockItems) {
            this.scMockItems = scMockItems;
            return this;
        }
        public java.util.List<GetAccountMockRuleResponseBodyDataResultScMockItems> getScMockItems() {
            return this.scMockItems;
        }

        public GetAccountMockRuleResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAccountMockRuleResponseBodyDataResult setProviderAppId(String providerAppId) {
            this.providerAppId = providerAppId;
            return this;
        }
        public String getProviderAppId() {
            return this.providerAppId;
        }

        public GetAccountMockRuleResponseBodyDataResult setProviderAppName(String providerAppName) {
            this.providerAppName = providerAppName;
            return this;
        }
        public String getProviderAppName() {
            return this.providerAppName;
        }

        public GetAccountMockRuleResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAccountMockRuleResponseBodyDataResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetAccountMockRuleResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

    public static class GetAccountMockRuleResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetAccountMockRuleResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static GetAccountMockRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyData self = new GetAccountMockRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyData setResult(java.util.List<GetAccountMockRuleResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetAccountMockRuleResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetAccountMockRuleResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public GetAccountMockRuleResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetAccountMockRuleResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
