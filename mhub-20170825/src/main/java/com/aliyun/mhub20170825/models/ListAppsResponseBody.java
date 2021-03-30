// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UbsmsStatus")
    public String ubsmsStatus;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("AppInfos")
    public ListAppsResponseBodyAppInfos appInfos;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public ListAppsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAppsResponseBody setAppInfos(ListAppsResponseBodyAppInfos appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public ListAppsResponseBodyAppInfos getAppInfos() {
        return this.appInfos;
    }

    public static class ListAppsResponseBodyAppInfosAppInfo extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("IndustryId")
        public Integer industryId;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        @NameInMap("Name")
        public String name;

        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("Readonly")
        public Boolean readonly;

        public static ListAppsResponseBodyAppInfosAppInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyAppInfosAppInfo self = new ListAppsResponseBodyAppInfosAppInfo();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyAppInfosAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListAppsResponseBodyAppInfosAppInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public ListAppsResponseBodyAppInfosAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListAppsResponseBodyAppInfosAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ListAppsResponseBodyAppInfosAppInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public ListAppsResponseBodyAppInfosAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsResponseBodyAppInfosAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListAppsResponseBodyAppInfosAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

    }

    public static class ListAppsResponseBodyAppInfos extends TeaModel {
        @NameInMap("AppInfo")
        public java.util.List<ListAppsResponseBodyAppInfosAppInfo> appInfo;

        public static ListAppsResponseBodyAppInfos build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyAppInfos self = new ListAppsResponseBodyAppInfos();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyAppInfos setAppInfo(java.util.List<ListAppsResponseBodyAppInfosAppInfo> appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public java.util.List<ListAppsResponseBodyAppInfosAppInfo> getAppInfo() {
            return this.appInfo;
        }

    }

}
