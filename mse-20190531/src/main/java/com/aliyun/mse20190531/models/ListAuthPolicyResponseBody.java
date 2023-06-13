// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAuthPolicyResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListAuthPolicyResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAuthPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthPolicyResponseBody self = new ListAuthPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthPolicyResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAuthPolicyResponseBody setData(ListAuthPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAuthPolicyResponseBodyData getData() {
        return this.data;
    }

    public ListAuthPolicyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAuthPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuthPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuthPolicyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAuthPolicyResponseBodyDataResultAuthRuleMethod extends TeaModel {
        @NameInMap("Group")
        public String group;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParameterTypes")
        public java.util.List<String> parameterTypes;

        @NameInMap("ReturnType")
        public String returnType;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Version")
        public String version;

        public static ListAuthPolicyResponseBodyDataResultAuthRuleMethod build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseBodyDataResultAuthRuleMethod self = new ListAuthPolicyResponseBodyDataResultAuthRuleMethod();
            return TeaModel.build(map, self);
        }

        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod setParameterTypes(java.util.List<String> parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public java.util.List<String> getParameterTypes() {
            return this.parameterTypes;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListAuthPolicyResponseBodyDataResultAuthRule extends TeaModel {
        @NameInMap("AppIds")
        public java.util.List<String> appIds;

        @NameInMap("AuthType")
        public Integer authType;

        @NameInMap("Black")
        public Boolean black;

        @NameInMap("K8sNamespaces")
        public java.util.List<String> k8sNamespaces;

        @NameInMap("Method")
        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod method;

        @NameInMap("Path")
        public String path;

        public static ListAuthPolicyResponseBodyDataResultAuthRule build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseBodyDataResultAuthRule self = new ListAuthPolicyResponseBodyDataResultAuthRule();
            return TeaModel.build(map, self);
        }

        public ListAuthPolicyResponseBodyDataResultAuthRule setAppIds(java.util.List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public java.util.List<String> getAppIds() {
            return this.appIds;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRule setAuthType(Integer authType) {
            this.authType = authType;
            return this;
        }
        public Integer getAuthType() {
            return this.authType;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRule setBlack(Boolean black) {
            this.black = black;
            return this;
        }
        public Boolean getBlack() {
            return this.black;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRule setK8sNamespaces(java.util.List<String> k8sNamespaces) {
            this.k8sNamespaces = k8sNamespaces;
            return this;
        }
        public java.util.List<String> getK8sNamespaces() {
            return this.k8sNamespaces;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRule setMethod(ListAuthPolicyResponseBodyDataResultAuthRuleMethod method) {
            this.method = method;
            return this;
        }
        public ListAuthPolicyResponseBodyDataResultAuthRuleMethod getMethod() {
            return this.method;
        }

        public ListAuthPolicyResponseBodyDataResultAuthRule setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ListAuthPolicyResponseBodyDataResult extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AuthRule")
        public java.util.List<ListAuthPolicyResponseBodyDataResultAuthRule> authRule;

        @NameInMap("AuthType")
        public Integer authType;

        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>ID。</p>
         */
        @NameInMap("Id")
        public Integer id;

        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

        public static ListAuthPolicyResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseBodyDataResult self = new ListAuthPolicyResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListAuthPolicyResponseBodyDataResult setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListAuthPolicyResponseBodyDataResult setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAuthPolicyResponseBodyDataResult setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAuthPolicyResponseBodyDataResult setAuthRule(java.util.List<ListAuthPolicyResponseBodyDataResultAuthRule> authRule) {
            this.authRule = authRule;
            return this;
        }
        public java.util.List<ListAuthPolicyResponseBodyDataResultAuthRule> getAuthRule() {
            return this.authRule;
        }

        public ListAuthPolicyResponseBodyDataResult setAuthType(Integer authType) {
            this.authType = authType;
            return this;
        }
        public Integer getAuthType() {
            return this.authType;
        }

        public ListAuthPolicyResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListAuthPolicyResponseBodyDataResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAuthPolicyResponseBodyDataResult setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public ListAuthPolicyResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAuthPolicyResponseBodyDataResult setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListAuthPolicyResponseBodyDataResult setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListAuthPolicyResponseBodyDataResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAuthPolicyResponseBodyDataResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAuthPolicyResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class ListAuthPolicyResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListAuthPolicyResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListAuthPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseBodyData self = new ListAuthPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuthPolicyResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAuthPolicyResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAuthPolicyResponseBodyData setResult(java.util.List<ListAuthPolicyResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListAuthPolicyResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListAuthPolicyResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
