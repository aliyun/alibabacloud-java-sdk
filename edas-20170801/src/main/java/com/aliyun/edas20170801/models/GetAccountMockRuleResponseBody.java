// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetAccountMockRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAccountMockRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    public static GetAccountMockRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMockRuleResponseBody self = new GetAccountMockRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountMockRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountMockRuleResponseBody setData(GetAccountMockRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAccountMockRuleResponseBodyData getData() {
        return this.data;
    }

    public GetAccountMockRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountMockRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountMockRuleResponseBodyDataResultDubboMockItems extends TeaModel {
        @NameInMap("ExceptionClassName")
        public String exceptionClassName;

        @NameInMap("ExecuteCondition")
        public String executeCondition;

        @NameInMap("Group")
        public String group;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("Oper")
        public String oper;

        @NameInMap("ParamTypes")
        public java.util.List<String> paramTypes;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Value")
        public String value;

        @NameInMap("Version")
        public String version;

        public static GetAccountMockRuleResponseBodyDataResultDubboMockItems build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyDataResultDubboMockItems self = new GetAccountMockRuleResponseBodyDataResultDubboMockItems();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setExceptionClassName(String exceptionClassName) {
            this.exceptionClassName = exceptionClassName;
            return this;
        }
        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setExecuteCondition(String executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }
        public String getExecuteCondition() {
            return this.executeCondition;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setParamTypes(java.util.List<String> paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public java.util.List<String> getParamTypes() {
            return this.paramTypes;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetAccountMockRuleResponseBodyDataResultDubboMockItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetAccountMockRuleResponseBodyDataResultScMockItems extends TeaModel {
        @NameInMap("ExceptionClassName")
        public String exceptionClassName;

        @NameInMap("ExecuteCondition")
        public String executeCondition;

        @NameInMap("Method")
        public String method;

        @NameInMap("Oper")
        public String oper;

        @NameInMap("Path")
        public String path;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Value")
        public String value;

        public static GetAccountMockRuleResponseBodyDataResultScMockItems build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyDataResultScMockItems self = new GetAccountMockRuleResponseBodyDataResultScMockItems();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setExceptionClassName(String exceptionClassName) {
            this.exceptionClassName = exceptionClassName;
            return this;
        }
        public String getExceptionClassName() {
            return this.exceptionClassName;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setExecuteCondition(String executeCondition) {
            this.executeCondition = executeCondition;
            return this;
        }
        public String getExecuteCondition() {
            return this.executeCondition;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setOper(String oper) {
            this.oper = oper;
            return this;
        }
        public String getOper() {
            return this.oper;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetAccountMockRuleResponseBodyDataResultScMockItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetAccountMockRuleResponseBodyDataResult extends TeaModel {
        @NameInMap("ConsumerAppId")
        public String consumerAppId;

        @NameInMap("ConsumerAppName")
        public String consumerAppName;

        @NameInMap("DubboMockItems")
        public java.util.List<GetAccountMockRuleResponseBodyDataResultDubboMockItems> dubboMockItems;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProviderAppId")
        public String providerAppId;

        @NameInMap("ProviderAppName")
        public String providerAppName;

        @NameInMap("Region")
        public String region;

        @NameInMap("ScMockItems")
        public java.util.List<GetAccountMockRuleResponseBodyDataResultScMockItems> scMockItems;

        @NameInMap("Status")
        public Integer status;

        public static GetAccountMockRuleResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyDataResult self = new GetAccountMockRuleResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetAccountMockRuleResponseBodyDataResult setConsumerAppId(String consumerAppId) {
            this.consumerAppId = consumerAppId;
            return this;
        }
        public String getConsumerAppId() {
            return this.consumerAppId;
        }

        public GetAccountMockRuleResponseBodyDataResult setConsumerAppName(String consumerAppName) {
            this.consumerAppName = consumerAppName;
            return this;
        }
        public String getConsumerAppName() {
            return this.consumerAppName;
        }

        public GetAccountMockRuleResponseBodyDataResult setDubboMockItems(java.util.List<GetAccountMockRuleResponseBodyDataResultDubboMockItems> dubboMockItems) {
            this.dubboMockItems = dubboMockItems;
            return this;
        }
        public java.util.List<GetAccountMockRuleResponseBodyDataResultDubboMockItems> getDubboMockItems() {
            return this.dubboMockItems;
        }

        public GetAccountMockRuleResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetAccountMockRuleResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetAccountMockRuleResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetAccountMockRuleResponseBodyDataResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetAccountMockRuleResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

        public GetAccountMockRuleResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetAccountMockRuleResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<GetAccountMockRuleResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetAccountMockRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAccountMockRuleResponseBodyData self = new GetAccountMockRuleResponseBodyData();
            return TeaModel.build(map, self);
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

    }

}
