// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListAppsResponse extends TeaModel {
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
    public ListAppsResponseAppInfos appInfos;

    public static ListAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponse self = new ListAppsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAppsResponse setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public ListAppsResponse setAppInfos(ListAppsResponseAppInfos appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public ListAppsResponseAppInfos getAppInfos() {
        return this.appInfos;
    }

    public static class ListAppsResponseAppInfosAppInfo extends TeaModel {
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

        @NameInMap("EncodedIcon")
        @Validation(required = true)
        public String encodedIcon;

        @NameInMap("IndustryId")
        @Validation(required = true)
        public Integer industryId;

        public static ListAppsResponseAppInfosAppInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseAppInfosAppInfo self = new ListAppsResponseAppInfosAppInfo();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseAppInfosAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListAppsResponseAppInfosAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsResponseAppInfosAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListAppsResponseAppInfosAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ListAppsResponseAppInfosAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListAppsResponseAppInfosAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ListAppsResponseAppInfosAppInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public ListAppsResponseAppInfosAppInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

    }

    public static class ListAppsResponseAppInfos extends TeaModel {
        @NameInMap("AppInfo")
        @Validation(required = true)
        public java.util.List<ListAppsResponseAppInfosAppInfo> appInfo;

        public static ListAppsResponseAppInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseAppInfos self = new ListAppsResponseAppInfos();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseAppInfos setAppInfo(java.util.List<ListAppsResponseAppInfosAppInfo> appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public java.util.List<ListAppsResponseAppInfosAppInfo> getAppInfo() {
            return this.appInfo;
        }

    }

}
