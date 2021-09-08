// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUpdatePackageResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppInfo")
    public DescribeUpdatePackageResultResponseBodyAppInfo appInfo;

    public static DescribeUpdatePackageResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdatePackageResultResponseBody self = new DescribeUpdatePackageResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpdatePackageResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpdatePackageResultResponseBody setAppInfo(DescribeUpdatePackageResultResponseBodyAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public DescribeUpdatePackageResultResponseBodyAppInfo getAppInfo() {
        return this.appInfo;
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

    public static class DescribeUpdatePackageResultResponseBodyAppInfo extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("Icon")
        public String icon;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("PackageInfo")
        public DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo packageInfo;

        @NameInMap("DebugPackageInfo")
        public DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo debugPackageInfo;

        public static DescribeUpdatePackageResultResponseBodyAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseBodyAppInfo self = new DescribeUpdatePackageResultResponseBodyAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setPackageInfo(DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }
        public DescribeUpdatePackageResultResponseBodyAppInfoPackageInfo getPackageInfo() {
            return this.packageInfo;
        }

        public DescribeUpdatePackageResultResponseBodyAppInfo setDebugPackageInfo(DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo debugPackageInfo) {
            this.debugPackageInfo = debugPackageInfo;
            return this;
        }
        public DescribeUpdatePackageResultResponseBodyAppInfoDebugPackageInfo getDebugPackageInfo() {
            return this.debugPackageInfo;
        }

    }

}
