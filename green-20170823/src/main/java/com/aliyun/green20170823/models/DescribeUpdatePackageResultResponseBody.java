// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUpdatePackageResultResponseBody extends TeaModel {
    @NameInMap("AppInfo")
    public DescribeUpdatePackageResultResponseBodyAppInfo appInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUpdatePackageResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdatePackageResultResponseBody self = new DescribeUpdatePackageResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpdatePackageResultResponseBody setAppInfo(DescribeUpdatePackageResultResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public DescribeUpdatePackageResultResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
    }

    public DescribeUpdatePackageResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo extends TeaModel {
        @NameInMap("Version")
        public String version;

        public static DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo self = new DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo extends TeaModel {
        @NameInMap("Version")
        public String version;

        public static DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo self = new DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeUpdatePackageResultResponseBodyAppInfo extends TeaModel {
        @NameInMap("DebugPackageInfo")
        public DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo debugPackageInfo;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("PackageInfo")
        public DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo packageInfo;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Type")
        public Integer type;

        public static DescribeUpdatePackageResultResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseBodyAppInfo self = new DescribeUpdatePackageResultResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setDebugPackageInfo(DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo debugPackageInfo) {
            this.debugPackageInfo = debugPackageInfo;
            return this;
        }
        public DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo getDebugPackageInfo() {
            return this.debugPackageInfo;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setPackageInfo(DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }
        public DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo getPackageInfo() {
            return this.packageInfo;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
