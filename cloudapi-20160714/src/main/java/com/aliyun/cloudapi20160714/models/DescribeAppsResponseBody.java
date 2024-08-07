// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    /**
     * <p>The returned app information. It is an array consisting of AppItem data.</p>
     */
    @NameInMap("Apps")
    public DescribeAppsResponseBodyApps apps;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setApps(DescribeAppsResponseBodyApps apps) {
        this.apps = apps;
        return this;
    }
    public DescribeAppsResponseBodyApps getApps() {
        return this.apps;
    }

    public DescribeAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAppsResponseBodyAppsAppItem extends TeaModel {
        /**
         * <p>The ID of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>20112314518278</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <p>The name of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateApptest</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The description of the app.</p>
         * 
         * <strong>example:</strong>
         * <p>App test</p>
         */
        @NameInMap("Description")
        public String description;

        public static DescribeAppsResponseBodyAppsAppItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppsAppItem self = new DescribeAppsResponseBodyAppsAppItem();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyAppsAppItem setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public DescribeAppsResponseBodyAppsAppItem setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeAppsResponseBodyAppsAppItem setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class DescribeAppsResponseBodyApps extends TeaModel {
        @NameInMap("AppItem")
        public java.util.List<DescribeAppsResponseBodyAppsAppItem> appItem;

        public static DescribeAppsResponseBodyApps build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyApps self = new DescribeAppsResponseBodyApps();
            return TeaModel.build(map, self);
        }

        public DescribeAppsResponseBodyApps setAppItem(java.util.List<DescribeAppsResponseBodyAppsAppItem> appItem) {
            this.appItem = appItem;
            return this;
        }
        public java.util.List<DescribeAppsResponseBodyAppsAppItem> getAppItem() {
            return this.appItem;
        }

    }

}
