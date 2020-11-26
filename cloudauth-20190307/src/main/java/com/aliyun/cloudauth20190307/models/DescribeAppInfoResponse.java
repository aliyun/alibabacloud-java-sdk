// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAppInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("AppInfoList")
    @Validation(required = true)
    public java.util.List<DescribeAppInfoResponseAppInfoList> appInfoList;

    public static DescribeAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppInfoResponse self = new DescribeAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppInfoResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppInfoResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAppInfoResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeAppInfoResponse setAppInfoList(java.util.List<DescribeAppInfoResponseAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<DescribeAppInfoResponseAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public static class DescribeAppInfoResponseAppInfoListPackageInfo extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static DescribeAppInfoResponseAppInfoListPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInfoResponseAppInfoListPackageInfo self = new DescribeAppInfoResponseAppInfoListPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAppInfoResponseAppInfoListPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAppInfoResponseAppInfoListDebugPackageInfo extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static DescribeAppInfoResponseAppInfoListDebugPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInfoResponseAppInfoListDebugPackageInfo self = new DescribeAppInfoResponseAppInfoListDebugPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAppInfoResponseAppInfoListDebugPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeAppInfoResponseAppInfoList extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        @NameInMap("Icon")
        @Validation(required = true)
        public String icon;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("PackageInfo")
        @Validation(required = true)
        public DescribeAppInfoResponseAppInfoListPackageInfo packageInfo;

        @NameInMap("DebugPackageInfo")
        @Validation(required = true)
        public DescribeAppInfoResponseAppInfoListDebugPackageInfo debugPackageInfo;

        public static DescribeAppInfoResponseAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppInfoResponseAppInfoList self = new DescribeAppInfoResponseAppInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAppInfoResponseAppInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeAppInfoResponseAppInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeAppInfoResponseAppInfoList setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeAppInfoResponseAppInfoList setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeAppInfoResponseAppInfoList setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeAppInfoResponseAppInfoList setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeAppInfoResponseAppInfoList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeAppInfoResponseAppInfoList setPackageInfo(DescribeAppInfoResponseAppInfoListPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }
        public DescribeAppInfoResponseAppInfoListPackageInfo getPackageInfo() {
            return this.packageInfo;
        }

        public DescribeAppInfoResponseAppInfoList setDebugPackageInfo(DescribeAppInfoResponseAppInfoListDebugPackageInfo debugPackageInfo) {
            this.debugPackageInfo = debugPackageInfo;
            return this;
        }
        public DescribeAppInfoResponseAppInfoListDebugPackageInfo getDebugPackageInfo() {
            return this.debugPackageInfo;
        }

    }

}
