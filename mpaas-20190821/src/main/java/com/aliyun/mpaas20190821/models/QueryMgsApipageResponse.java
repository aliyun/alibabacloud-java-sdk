// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMgsApipageResponse extends TeaModel {
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
    public QueryMgsApipageResponseResultContent resultContent;

    public static QueryMgsApipageResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMgsApipageResponse self = new QueryMgsApipageResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMgsApipageResponseResultContentListHeaderRule extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListHeaderRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListHeaderRule self = new QueryMgsApipageResponseResultContentListHeaderRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListHeaderRules extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListHeaderRules build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListHeaderRules self = new QueryMgsApipageResponseResultContentListHeaderRules();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListRequestParams extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListRequestParams build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListRequestParams self = new QueryMgsApipageResponseResultContentListRequestParams();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListApiInvokerHttpInvoker extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListApiInvokerHttpInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListApiInvokerHttpInvoker self = new QueryMgsApipageResponseResultContentListApiInvokerHttpInvoker();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListApiInvoker extends TeaModel {
        @NameInMap("RpcInvoker")
        @Validation(required = true)
        public String rpcInvoker;

        @NameInMap("HttpInvoker")
        @Validation(required = true)
        public QueryMgsApipageResponseResultContentListApiInvokerHttpInvoker httpInvoker;

        public static QueryMgsApipageResponseResultContentListApiInvoker build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListApiInvoker self = new QueryMgsApipageResponseResultContentListApiInvoker();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListCacheRule extends TeaModel {
        @NameInMap("CacheKey")
        @Validation(required = true)
        public String cacheKey;

        @NameInMap("NeedCache")
        @Validation(required = true)
        public Boolean needCache;

        @NameInMap("Ttl")
        @Validation(required = true)
        public Long ttl;

        public static QueryMgsApipageResponseResultContentListCacheRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListCacheRule self = new QueryMgsApipageResponseResultContentListCacheRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListLimitRule extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListLimitRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListLimitRule self = new QueryMgsApipageResponseResultContentListLimitRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListMigrateRule extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListMigrateRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListMigrateRule self = new QueryMgsApipageResponseResultContentListMigrateRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentListMockRule extends TeaModel {
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

        public static QueryMgsApipageResponseResultContentListMockRule build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentListMockRule self = new QueryMgsApipageResponseResultContentListMockRule();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContentList extends TeaModel {
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
        public java.util.List<QueryMgsApipageResponseResultContentListHeaderRule> headerRule;

        @NameInMap("HeaderRules")
        @Validation(required = true)
        public java.util.List<QueryMgsApipageResponseResultContentListHeaderRules> headerRules;

        @NameInMap("RequestParams")
        @Validation(required = true)
        public java.util.List<QueryMgsApipageResponseResultContentListRequestParams> requestParams;

        @NameInMap("ApiInvoker")
        @Validation(required = true)
        public QueryMgsApipageResponseResultContentListApiInvoker apiInvoker;

        @NameInMap("CacheRule")
        @Validation(required = true)
        public QueryMgsApipageResponseResultContentListCacheRule cacheRule;

        @NameInMap("LimitRule")
        @Validation(required = true)
        public QueryMgsApipageResponseResultContentListLimitRule limitRule;

        @NameInMap("MigrateRule")
        @Validation(required = true)
        public QueryMgsApipageResponseResultContentListMigrateRule migrateRule;

        @NameInMap("MockRule")
        @Validation(required = true)
        public QueryMgsApipageResponseResultContentListMockRule mockRule;

        public static QueryMgsApipageResponseResultContentList build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContentList self = new QueryMgsApipageResponseResultContentList();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMgsApipageResponseResultContent extends TeaModel {
        @NameInMap("Current")
        @Validation(required = true)
        public Long current;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Long pageSize;

        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("List")
        @Validation(required = true)
        public java.util.List<QueryMgsApipageResponseResultContentList> list;

        public static QueryMgsApipageResponseResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryMgsApipageResponseResultContent self = new QueryMgsApipageResponseResultContent();
            return TeaModel.build(map, self);
        }

    }

}
