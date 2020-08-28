// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListAppsByOwnerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("UbsmsStatus")
    @Validation(required = true)
    public String ubsmsStatus;

    @NameInMap("AppInfos")
    @Validation(required = true)
    public ListAppsByOwnerResponseAppInfos appInfos;

    public static ListAppsByOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppsByOwnerResponse self = new ListAppsByOwnerResponse();
        return TeaModel.build(map, self);
    }

    public ListAppsByOwnerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsByOwnerResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAppsByOwnerResponse setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public ListAppsByOwnerResponse setAppInfos(ListAppsByOwnerResponseAppInfos appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public ListAppsByOwnerResponseAppInfos getAppInfos() {
        return this.appInfos;
    }

    public static class ListAppsByOwnerResponseAppInfosAppInfo extends TeaModel {
        @NameInMap("AppKey")
        @Validation(required = true)
        public String appKey;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("Readonly")
        @Validation(required = true)
        public Boolean readonly;

        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        public static ListAppsByOwnerResponseAppInfosAppInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppsByOwnerResponseAppInfosAppInfo self = new ListAppsByOwnerResponseAppInfosAppInfo();
            return TeaModel.build(map, self);
        }

        public ListAppsByOwnerResponseAppInfosAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListAppsByOwnerResponseAppInfosAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsByOwnerResponseAppInfosAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListAppsByOwnerResponseAppInfosAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ListAppsByOwnerResponseAppInfosAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListAppsByOwnerResponseAppInfosAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

    }

    public static class ListAppsByOwnerResponseAppInfos extends TeaModel {
        @NameInMap("AppInfo")
        @Validation(required = true)
        public java.util.List<ListAppsByOwnerResponseAppInfosAppInfo> appInfo;

        public static ListAppsByOwnerResponseAppInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAppsByOwnerResponseAppInfos self = new ListAppsByOwnerResponseAppInfos();
            return TeaModel.build(map, self);
        }

        public ListAppsByOwnerResponseAppInfos setAppInfo(java.util.List<ListAppsByOwnerResponseAppInfosAppInfo> appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public java.util.List<ListAppsByOwnerResponseAppInfosAppInfo> getAppInfo() {
            return this.appInfo;
        }

    }

}
