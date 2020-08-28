// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetAuthPolicyInfoResponse extends TeaModel {
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
    public GetAuthPolicyInfoResponseData data;

    public static GetAuthPolicyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthPolicyInfoResponse self = new GetAuthPolicyInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetAuthPolicyInfoResponseDataAuthRuleMethod extends TeaModel {
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

        public static GetAuthPolicyInfoResponseDataAuthRuleMethod build(java.util.Map<String, ?> map) throws Exception {
            GetAuthPolicyInfoResponseDataAuthRuleMethod self = new GetAuthPolicyInfoResponseDataAuthRuleMethod();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAuthPolicyInfoResponseDataAuthRule extends TeaModel {
        @NameInMap("Black")
        @Validation(required = true)
        public Boolean black;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("All")
        @Validation(required = true)
        public Boolean all;

        @NameInMap("Method")
        @Validation(required = true)
        public GetAuthPolicyInfoResponseDataAuthRuleMethod method;

        @NameInMap("AppIds")
        @Validation(required = true)
        public java.util.List<String> appIds;

        @NameInMap("AppNames")
        @Validation(required = true)
        public java.util.List<String> appNames;

        public static GetAuthPolicyInfoResponseDataAuthRule build(java.util.Map<String, ?> map) throws Exception {
            GetAuthPolicyInfoResponseDataAuthRule self = new GetAuthPolicyInfoResponseDataAuthRule();
            return TeaModel.build(map, self);
        }

    }

    public static class GetAuthPolicyInfoResponseData extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

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

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("AuthRule")
        @Validation(required = true)
        public java.util.List<GetAuthPolicyInfoResponseDataAuthRule> authRule;

        public static GetAuthPolicyInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetAuthPolicyInfoResponseData self = new GetAuthPolicyInfoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
