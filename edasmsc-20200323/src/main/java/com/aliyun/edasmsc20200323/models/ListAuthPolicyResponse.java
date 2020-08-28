// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class ListAuthPolicyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public ListAuthPolicyResponseData data;

    public static ListAuthPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthPolicyResponse self = new ListAuthPolicyResponse();
        return TeaModel.build(map, self);
    }

    public static class ListAuthPolicyResponseDataResultAuthRuleMethod extends TeaModel {
        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Group")
        @Validation(required = true)
        public String group;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ReturnType")
        @Validation(required = true)
        public String returnType;

        @NameInMap("ParameterTypes")
        @Validation(required = true)
        public java.util.List<String> parameterTypes;

        public static ListAuthPolicyResponseDataResultAuthRuleMethod build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseDataResultAuthRuleMethod self = new ListAuthPolicyResponseDataResultAuthRuleMethod();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAuthPolicyResponseDataResultAuthRule extends TeaModel {
        @NameInMap("Black")
        @Validation(required = true)
        public Boolean black;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("Method")
        @Validation(required = true)
        public ListAuthPolicyResponseDataResultAuthRuleMethod method;

        @NameInMap("AppIds")
        @Validation(required = true)
        public java.util.List<String> appIds;

        public static ListAuthPolicyResponseDataResultAuthRule build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseDataResultAuthRule self = new ListAuthPolicyResponseDataResultAuthRule();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAuthPolicyResponseDataResult extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Enable")
        @Validation(required = true)
        public Boolean enable;

        @NameInMap("Id")
        @Validation(required = true)
        public Integer id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("NamespaceId")
        @Validation(required = true)
        public String namespaceId;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("Source")
        @Validation(required = true)
        public String source;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("AuthRule")
        @Validation(required = true)
        public java.util.List<ListAuthPolicyResponseDataResultAuthRule> authRule;

        public static ListAuthPolicyResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseDataResult self = new ListAuthPolicyResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class ListAuthPolicyResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<ListAuthPolicyResponseDataResult> result;

        public static ListAuthPolicyResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAuthPolicyResponseData self = new ListAuthPolicyResponseData();
            return TeaModel.build(map, self);
        }

    }

}
