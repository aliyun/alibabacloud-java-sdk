// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMappCenterAppResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("QueryMappCenterAppResult")
    @Validation(required = true)
    public QueryMappCenterAppResponseQueryMappCenterAppResult queryMappCenterAppResult;

    public static QueryMappCenterAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMappCenterAppResponse self = new QueryMappCenterAppResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppAndroidConfig extends TeaModel {
        @NameInMap("CertRSA")
        @Validation(required = true)
        public String certRSA;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        public static QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppAndroidConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppAndroidConfig self = new QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppAndroidConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppIosConfig extends TeaModel {
        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        public static QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppIosConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppIosConfig self = new QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppIosConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterApp extends TeaModel {
        @NameInMap("AppDesc")
        @Validation(required = true)
        public String appDesc;

        @NameInMap("AppIcon")
        @Validation(required = true)
        public String appIcon;

        @NameInMap("AppId")
        @Validation(required = true)
        public String appId;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("AppSecret")
        @Validation(required = true)
        public String appSecret;

        @NameInMap("Creator")
        @Validation(required = true)
        public String creator;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Modifier")
        @Validation(required = true)
        public String modifier;

        @NameInMap("MonitorJson")
        @Validation(required = true)
        public String monitorJson;

        @NameInMap("Status")
        @Validation(required = true)
        public Long status;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("Type")
        @Validation(required = true)
        public Long type;

        @NameInMap("AndroidConfig")
        @Validation(required = true)
        public QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppAndroidConfig androidConfig;

        @NameInMap("IosConfig")
        @Validation(required = true)
        public QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterAppIosConfig iosConfig;

        public static QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterApp build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterApp self = new QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterApp();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMappCenterAppResponseQueryMappCenterAppResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("MappCenterApp")
        @Validation(required = true)
        public QueryMappCenterAppResponseQueryMappCenterAppResultMappCenterApp mappCenterApp;

        public static QueryMappCenterAppResponseQueryMappCenterAppResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMappCenterAppResponseQueryMappCenterAppResult self = new QueryMappCenterAppResponseQueryMappCenterAppResult();
            return TeaModel.build(map, self);
        }

    }

}
