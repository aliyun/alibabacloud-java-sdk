// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListAppsResponseBody extends TeaModel {
    @NameInMap("AppInfos")
    public ListAppsResponseBodyAppInfos appInfos;

    /**
     * <strong>example:</strong>
     * <p>126D4DDD-05A5-49B1-B18C-39C4A929BFB2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    /**
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("UbsmsStatus")
    public String ubsmsStatus;

    public static ListAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppsResponseBody self = new ListAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppsResponseBody setAppInfos(ListAppsResponseBodyAppInfos appInfos) {
        this.appInfos = appInfos;
        return this;
    }
    public ListAppsResponseBodyAppInfos getAppInfos() {
        return this.appInfos;
    }

    public ListAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAppsResponseBody setUbsmsStatus(String ubsmsStatus) {
        this.ubsmsStatus = ubsmsStatus;
        return this;
    }
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public static class ListAppsResponseBodyAppInfosAppInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("AppKey")
        public String appKey;

        /**
         * <strong>example:</strong>
         * <p>com.test.ios</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("EncodedIcon")
        public String encodedIcon;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IndustryId")
        public Integer industryId;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>com.test.android</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Readonly")
        public Boolean readonly;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ListAppsResponseBodyAppInfosAppInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAppsResponseBodyAppInfosAppInfo self = new ListAppsResponseBodyAppInfosAppInfo();
            return TeaModel.build(map, self);
        }

        public ListAppsResponseBodyAppInfosAppInfo setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListAppsResponseBodyAppInfosAppInfo setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public ListAppsResponseBodyAppInfosAppInfo setEncodedIcon(String encodedIcon) {
            this.encodedIcon = encodedIcon;
            return this;
        }
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        public ListAppsResponseBodyAppInfosAppInfo setIndustryId(Integer industryId) {
            this.industryId = industryId;
            return this;
        }
        public Integer getIndustryId() {
            return this.industryId;
        }

        public ListAppsResponseBodyAppInfosAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAppsResponseBodyAppInfosAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ListAppsResponseBodyAppInfosAppInfo setReadonly(Boolean readonly) {
            this.readonly = readonly;
            return this;
        }
        public Boolean getReadonly() {
            return this.readonly;
        }

        public ListAppsResponseBodyAppInfosAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
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
