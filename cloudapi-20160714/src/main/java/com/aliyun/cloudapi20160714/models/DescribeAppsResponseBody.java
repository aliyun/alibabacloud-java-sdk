// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Apps")
    public DescribeAppsResponseBodyApps apps;

    public static DescribeAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppsResponseBody self = new DescribeAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAppsResponseBody setApps(DescribeAppsResponseBodyApps apps) {
        this.apps = apps;
        return this;
    }
    public DescribeAppsResponseBodyApps getApps() {
        return this.apps;
    }

    public static class DescribeAppsResponseBodyAppsAppItem extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Description")
        public String description;

        @NameInMap("AppId")
        public Long appId;

        public static DescribeAppsResponseBodyAppsAppItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppsResponseBodyAppsAppItem self = new DescribeAppsResponseBodyAppsAppItem();
            return TeaModel.build(map, self);
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

        public DescribeAppsResponseBodyAppsAppItem setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
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
