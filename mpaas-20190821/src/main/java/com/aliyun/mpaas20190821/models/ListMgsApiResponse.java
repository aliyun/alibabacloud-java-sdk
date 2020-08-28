// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMgsApiResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ResultContent")
    @Validation(required = true)
    public ListMgsApiResponseResultContent resultContent;

    public static ListMgsApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMgsApiResponse self = new ListMgsApiResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMgsApiResponseResultContentValueHeaderRule extends TeaModel {
        @NameInMap("HeaderKey")
        @Validation(required = true)
        public String headerKey;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListMgsApiResponseResultContentValueHeaderRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueHeaderRule self = new ListMgsApiResponseResultContentValueHeaderRule();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueHeaderRules extends TeaModel {
        @NameInMap("HeaderKey")
        @Validation(required = true)
        public String headerKey;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static ListMgsApiResponseResultContentValueHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueHeaderRules self = new ListMgsApiResponseResultContentValueHeaderRules();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueRequestParams extends TeaModel {
        @NameInMap("ApiId")
        @Validation(required = true)
        public String apiId;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("DefaultValue")
        @Validation(required = true)
        public String defaultValue;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Location")
        @Validation(required = true)
        public String location;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RefType")
        @Validation(required = true)
        public String refType;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("WorkspaceId")
        @Validation(required = true)
        public String workspaceId;

        public static ListMgsApiResponseResultContentValueRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueRequestParams self = new ListMgsApiResponseResultContentValueRequestParams();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueApiInvokerHttpInvoker extends TeaModel {
        @NameInMap("Charset")
        @Validation(required = true)
        public String charset;

        @NameInMap("ContentType")
        @Validation(required = true)
        public String contentType;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Method")
        @Validation(required = true)
        public String method;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        public static ListMgsApiResponseResultContentValueApiInvokerHttpInvoker build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueApiInvokerHttpInvoker self = new ListMgsApiResponseResultContentValueApiInvokerHttpInvoker();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueApiInvoker extends TeaModel {
        @NameInMap("RpcInvoker")
        @Validation(required = true)
        public String rpcInvoker;

        @NameInMap("HttpInvoker")
        @Validation(required = true)
        public ListMgsApiResponseResultContentValueApiInvokerHttpInvoker httpInvoker;

        public static ListMgsApiResponseResultContentValueApiInvoker build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueApiInvoker self = new ListMgsApiResponseResultContentValueApiInvoker();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        @Validation(required = true)
        public String cacheKey;

        @NameInMap("NeedCache")
        @Validation(required = true)
        public Boolean needCache;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Long ttl;

        public static ListMgsApiResponseResultContentValueCacheRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueCacheRule self = new ListMgsApiResponseResultContentValueCacheRule();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueLimitRule extends TeaModel {
        @NameInMap("DefaultResponse")
        @Validation(required = true)
        public String defaultResponse;

        @NameInMap("I18nResponse")
        @Validation(required = true)
        public String i18nResponse;

        @NameInMap("Interval")
        @Validation(required = true)
        public Long interval;

        @NameInMap("Limit")
        @Validation(required = true)
        public Long limit;

        @NameInMap("Mode")
        @Validation(required = true)
        public String mode;

        public static ListMgsApiResponseResultContentValueLimitRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueLimitRule self = new ListMgsApiResponseResultContentValueLimitRule();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueMigrateRule extends TeaModel {
        @NameInMap("FlowPercent")
        @Validation(required = true)
        public Long flowPercent;

        @NameInMap("NeedMigrate")
        @Validation(required = true)
        public Boolean needMigrate;

        @NameInMap("NeedSwitchCompletely")
        @Validation(required = true)
        public Boolean needSwitchCompletely;

        @NameInMap("SysId")
        @Validation(required = true)
        public Long sysId;

        @NameInMap("SysName")
        @Validation(required = true)
        public String sysName;

        @NameInMap("UpstreamType")
        @Validation(required = true)
        public String upstreamType;

        public static ListMgsApiResponseResultContentValueMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueMigrateRule self = new ListMgsApiResponseResultContentValueMigrateRule();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValueMockRule extends TeaModel {
        @NameInMap("MockData")
        @Validation(required = true)
        public String mockData;

        @NameInMap("NeedMock")
        @Validation(required = true)
        public Boolean needMock;

        @NameInMap("Percentage")
        @Validation(required = true)
        public Long percentage;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static ListMgsApiResponseResultContentValueMockRule build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValueMockRule self = new ListMgsApiResponseResultContentValueMockRule();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContentValue extends TeaModel {
        @NameInMap("ApiName")
        @Validation(required = true)
        public String apiName;

        @NameInMap("ApiStatus")
        @Validation(required = true)
        public String apiStatus;

        @NameInMap("ApiType")
        @Validation(required = true)
        public String apiType;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AuthRuleName")
        @Validation(required = true)
        public String authRuleName;

        @NameInMap("Charset")
        @Validation(required = true)
        public String charset;

        @NameInMap("ContentType")
        @Validation(required = true)
        public String contentType;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("InterfaceType")
        @Validation(required = true)
        public String interfaceType;

        @NameInMap("Method")
        @Validation(required = true)
        public String method;

        @NameInMap("MethodName")
        @Validation(required = true)
        public String methodName;

        @NameInMap("NeedEncrypt")
        @Validation(required = true)
        public String needEncrypt;

        @NameInMap("NeedETag")
        @Validation(required = true)
        public String needETag;

        @NameInMap("NeedJsonp")
        @Validation(required = true)
        public String needJsonp;

        @NameInMap("NeedSign")
        @Validation(required = true)
        public String needSign;

        @NameInMap("OperationType")
        @Validation(required = true)
        public String operationType;

        @NameInMap("ParamGetMethod")
        @Validation(required = true)
        public String paramGetMethod;

        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("RequestBodyModel")
        @Validation(required = true)
        public String requestBodyModel;

        @NameInMap("ResponseBodyModel")
        @Validation(required = true)
        public String responseBodyModel;

        @NameInMap("SysId")
        @Validation(required = true)
        public Long sysId;

        @NameInMap("SysName")
        @Validation(required = true)
        public String sysName;

        @NameInMap("Timeout")
        @Validation(required = true)
        public String timeout;

        @NameInMap("WorkspaceId")
        @Validation(required = true)
        public String workspaceId;

        @NameInMap("HeaderRule")
        @Validation(required = true)
        public java.util.List<ListMgsApiResponseResultContentValueHeaderRule> headerRule;

        @NameInMap("HeaderRules")
        @Validation(required = true)
        public java.util.List<ListMgsApiResponseResultContentValueHeaderRules> headerRules;

        @NameInMap("RequestParams")
        @Validation(required = true)
        public java.util.List<ListMgsApiResponseResultContentValueRequestParams> requestParams;

        @NameInMap("ApiInvoker")
        @Validation(required = true)
        public ListMgsApiResponseResultContentValueApiInvoker apiInvoker;

        @NameInMap("CacheRule")
        @Validation(required = true)
        public ListMgsApiResponseResultContentValueCacheRule cacheRule;

        @NameInMap("LimitRule")
        @Validation(required = true)
        public ListMgsApiResponseResultContentValueLimitRule limitRule;

        @NameInMap("MigrateRule")
        @Validation(required = true)
        public ListMgsApiResponseResultContentValueMigrateRule migrateRule;

        @NameInMap("MockRule")
        @Validation(required = true)
        public ListMgsApiResponseResultContentValueMockRule mockRule;

        public static ListMgsApiResponseResultContentValue build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContentValue self = new ListMgsApiResponseResultContentValue();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMgsApiResponseResultContent extends TeaModel {
        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Value")
        @Validation(required = true)
        public java.util.List<ListMgsApiResponseResultContentValue> value;

        public static ListMgsApiResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMgsApiResponseResultContent self = new ListMgsApiResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
