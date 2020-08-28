// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMappCenterAppsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("ListMappCenterAppResult")
    @Validation(required = true)
    public ListMappCenterAppsResponseListMappCenterAppResult listMappCenterAppResult;

    public static ListMappCenterAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMappCenterAppsResponse self = new ListMappCenterAppsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListAndroidConfig extends TeaModel {
        @NameInMap("CertRSA")
        @Validation(required = true)
        public String certRSA;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        public static ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListAndroidConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListAndroidConfig self = new ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListAndroidConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListIosConfig extends TeaModel {
        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        public static ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListIosConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListIosConfig self = new ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListIosConfig();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppList extends TeaModel {
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
        public ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListAndroidConfig androidConfig;

        @NameInMap("IosConfig")
        @Validation(required = true)
        public ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppListIosConfig iosConfig;

        public static ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppList build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppList self = new ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppList();
            return TeaModel.build(map, self);
        }

    }

    public static class ListMappCenterAppsResponseListMappCenterAppResult extends TeaModel {
        @NameInMap("ResultMsg")
        @Validation(required = true)
        public String resultMsg;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("MappCenterAppList")
        @Validation(required = true)
        public java.util.List<ListMappCenterAppsResponseListMappCenterAppResultMappCenterAppList> mappCenterAppList;

        public static ListMappCenterAppsResponseListMappCenterAppResult build(java.util.Map<String, ?> map) throws Exception {
            ListMappCenterAppsResponseListMappCenterAppResult self = new ListMappCenterAppsResponseListMappCenterAppResult();
            return TeaModel.build(map, self);
        }

    }

}
