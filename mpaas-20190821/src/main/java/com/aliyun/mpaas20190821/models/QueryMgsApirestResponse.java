// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMgsApirestResponse extends TeaModel {
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
    public QueryMgsApirestResponseResultContent resultContent;

    public static QueryMgsApirestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApirestResponse self = new QueryMgsApirestResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMgsApirestResponseResultContentValueHeaderRule extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueHeaderRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueHeaderRule self = new QueryMgsApirestResponseResultContentValueHeaderRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueHeaderRules extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueHeaderRules self = new QueryMgsApirestResponseResultContentValueHeaderRules();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueRequestParams extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueRequestParams build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueRequestParams self = new QueryMgsApirestResponseResultContentValueRequestParams();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueApiInvokerHttpInvoker extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueApiInvokerHttpInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueApiInvokerHttpInvoker self = new QueryMgsApirestResponseResultContentValueApiInvokerHttpInvoker();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueApiInvoker extends TeaModel {
        @NameInMap("RpcInvoker")
        @Validation(required = true)
        public String rpcInvoker;

        @NameInMap("HttpInvoker")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValueApiInvokerHttpInvoker httpInvoker;

        public static QueryMgsApirestResponseResultContentValueApiInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueApiInvoker self = new QueryMgsApirestResponseResultContentValueApiInvoker();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        @Validation(required = true)
        public String cacheKey;

        @NameInMap("NeedCache")
        @Validation(required = true)
        public Boolean needCache;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Long ttl;

        public static QueryMgsApirestResponseResultContentValueCacheRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueCacheRule self = new QueryMgsApirestResponseResultContentValueCacheRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueLimitRule extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueLimitRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueLimitRule self = new QueryMgsApirestResponseResultContentValueLimitRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueMigrateRule extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueMigrateRule self = new QueryMgsApirestResponseResultContentValueMigrateRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValueMockRule extends TeaModel {
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

        public static QueryMgsApirestResponseResultContentValueMockRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValueMockRule self = new QueryMgsApirestResponseResultContentValueMockRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContentValue extends TeaModel {
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
        public java.util.List<QueryMgsApirestResponseResultContentValueHeaderRule> headerRule;

        @NameInMap("HeaderRules")
        @Validation(required = true)
        public java.util.List<QueryMgsApirestResponseResultContentValueHeaderRules> headerRules;

        @NameInMap("RequestParams")
        @Validation(required = true)
        public java.util.List<QueryMgsApirestResponseResultContentValueRequestParams> requestParams;

        @NameInMap("ApiInvoker")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValueApiInvoker apiInvoker;

        @NameInMap("CacheRule")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValueCacheRule cacheRule;

        @NameInMap("LimitRule")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValueLimitRule limitRule;

        @NameInMap("MigrateRule")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValueMigrateRule migrateRule;

        @NameInMap("MockRule")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValueMockRule mockRule;

        public static QueryMgsApirestResponseResultContentValue build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContentValue self = new QueryMgsApirestResponseResultContentValue();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApirestResponseResultContent extends TeaModel {
        @NameInMap("ErrorMessage")
        @Validation(required = true)
        public String errorMessage;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Value")
        @Validation(required = true)
        public QueryMgsApirestResponseResultContentValue value;

        public static QueryMgsApirestResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApirestResponseResultContent self = new QueryMgsApirestResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
