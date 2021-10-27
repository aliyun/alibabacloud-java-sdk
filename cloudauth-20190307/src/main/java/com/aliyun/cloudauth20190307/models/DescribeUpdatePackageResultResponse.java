// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeUpdatePackageResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AppInfo")
    @Validation(required = true)
    public DescribeUpdatePackageResultResponseAppInfo appInfo;

    public static DescribeUpdatePackageResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpdatePackageResultResponse self = new DescribeUpdatePackageResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUpdatePackageResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpdatePackageResultResponse setAppInfo(DescribeUpdatePackageResultResponseAppInfo appInfo) {
        this.appInfo = appInfo;
        return this;
    }
    public DescribeUpdatePackageResultResponseAppInfo getAppInfo() {
        return this.appInfo;
    }

    public static class DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo self = new DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeUpdatePackageResultResponseAppInfoPackageInfo extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        public static DescribeUpdatePackageResultResponseAppInfoPackageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseAppInfoPackageInfo self = new DescribeUpdatePackageResultResponseAppInfoPackageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseAppInfoPackageInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeUpdatePackageResultResponseAppInfo extends TeaModel {
        @NameInMap("EndDate")
        @Validation(required = true)
        public String endDate;

        @NameInMap("Icon")
        @Validation(required = true)
        public String icon;

        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("PackageName")
        @Validation(required = true)
        public String packageName;

        @NameInMap("StartDate")
        @Validation(required = true)
        public String startDate;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("DebugPackageInfo")
        @Validation(required = true)
        public DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo debugPackageInfo;

        @NameInMap("PackageInfo")
        @Validation(required = true)
        public DescribeUpdatePackageResultResponseAppInfoPackageInfo packageInfo;

        public static DescribeUpdatePackageResultResponseAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpdatePackageResultResponseAppInfo self = new DescribeUpdatePackageResultResponseAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeUpdatePackageResultResponseAppInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public DescribeUpdatePackageResultResponseAppInfo setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public DescribeUpdatePackageResultResponseAppInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeUpdatePackageResultResponseAppInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUpdatePackageResultResponseAppInfo setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public DescribeUpdatePackageResultResponseAppInfo setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public DescribeUpdatePackageResultResponseAppInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeUpdatePackageResultResponseAppInfo setDebugPackageInfo(DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo debugPackageInfo) {
            this.debugPackageInfo = debugPackageInfo;
            return this;
        }
        public DescribeUpdatePackageResultResponseAppInfoDebugPackageInfo getDebugPackageInfo() {
            return this.debugPackageInfo;
        }

        public DescribeUpdatePackageResultResponseAppInfo setPackageInfo(DescribeUpdatePackageResultResponseAppInfoPackageInfo packageInfo) {
            this.packageInfo = packageInfo;
            return this;
        }
        public DescribeUpdatePackageResultResponseAppInfoPackageInfo getPackageInfo() {
            return this.packageInfo;
        }

    }

}
