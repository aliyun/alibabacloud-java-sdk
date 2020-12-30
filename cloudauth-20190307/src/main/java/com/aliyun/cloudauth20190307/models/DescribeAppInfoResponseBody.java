// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAppInfoResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("AppInfoList")
    public java.util.List<DescribeAppInfoResponseBodyAppInfoList> appInfoList;

    public static DescribeAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInfoResponseBody self = new DescribeAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppInfoResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppInfoResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAppInfoResponseBody setAppInfoList(java.util.List<DescribeAppInfoResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<DescribeAppInfoResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public static class DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo extends TeaModel {
        @NameInMap("Version")
        public String version;

        public static DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo self = new DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAppInfoResponseBodyAppInfoListPackageInfo extends TeaModel {
        @NameInMap("Version")
        public String version;

        public static DescribeAppInfoResponseBodyAppInfoListPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInfoResponseBodyAppInfoListPackageInfo self = new DescribeAppInfoResponseBodyAppInfoListPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAppInfoResponseBodyAppInfoListPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAppInfoResponseBodyAppInfoList extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("DebugPackageInfo")
        public DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo debugPackageInfo;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("PackageInfo")
        public DescribeAppInfoResponseBodyAppInfoListPackageInfo packageInfo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static DescribeAppInfoResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInfoResponseBodyAppInfoList self = new DescribeAppInfoResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAppInfoResponseBodyAppInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeAppInfoResponseBodyAppInfoList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeAppInfoResponseBodyAppInfoList setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeAppInfoResponseBodyAppInfoList setDebugPackageInfo(DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo debugPackageInfo) {
            this.debugPackageInfo = debugPackageInfo;
            return this;
        }
        public DescribeAppInfoResponseBodyAppInfoListDebugPackageInfo getDebugPackageInfo() {
            return this.debugPackageInfo;
        }

        public DescribeAppInfoResponseBodyAppInfoList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeAppInfoResponseBodyAppInfoList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeAppInfoResponseBodyAppInfoList setPackageInfo(DescribeAppInfoResponseBodyAppInfoListPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }
        public DescribeAppInfoResponseBodyAppInfoListPackageInfo getPackageInfo() {
            return this.packageInfo;
        }

        public DescribeAppInfoResponseBodyAppInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppInfoResponseBodyAppInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
