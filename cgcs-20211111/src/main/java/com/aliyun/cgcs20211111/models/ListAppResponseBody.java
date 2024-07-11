// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppResponseBody extends TeaModel {
    @NameInMap("Apps")
    public java.util.List<ListAppResponseBodyApps> apps;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResponseBody self = new ListAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResponseBody setApps(java.util.List<ListAppResponseBodyApps> apps) {
        this.apps = apps;
        return this;
    }
    public java.util.List<ListAppResponseBodyApps> getApps() {
        return this.apps;
    }

    public ListAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAppResponseBodyApps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4384****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>end_game</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <strong>example:</strong>
         * <p>2022-04-06 02:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2022-04-06 02:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("VersionAdaptNum")
        public Long versionAdaptNum;

        /**
         * <strong>example:</strong>
         * <p>28</p>
         */
        @NameInMap("VersionTotalNum")
        public Long versionTotalNum;

        public static ListAppResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            ListAppResponseBodyApps self = new ListAppResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public ListAppResponseBodyApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppResponseBodyApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppResponseBodyApps setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppResponseBodyApps setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppResponseBodyApps setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppResponseBodyApps setVersionAdaptNum(Long versionAdaptNum) {
            this.versionAdaptNum = versionAdaptNum;
            return this;
        }
        public Long getVersionAdaptNum() {
            return this.versionAdaptNum;
        }

        public ListAppResponseBodyApps setVersionTotalNum(Long versionTotalNum) {
            this.versionTotalNum = versionTotalNum;
            return this;
        }
        public Long getVersionTotalNum() {
            return this.versionTotalNum;
        }

    }

}
