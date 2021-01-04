// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeAppDailySdkVersionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AppDailySdkVersions")
    public java.util.List<DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions> appDailySdkVersions;

    public static DescribeAppDailySdkVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppDailySdkVersionsResponseBody self = new DescribeAppDailySdkVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppDailySdkVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppDailySdkVersionsResponseBody setAppDailySdkVersions(java.util.List<DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions> appDailySdkVersions) {
        this.appDailySdkVersions = appDailySdkVersions;
        return this;
    }
    public java.util.List<DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions> getAppDailySdkVersions() {
        return this.appDailySdkVersions;
    }

    public static class DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions extends TeaModel {
        @NameInMap("Index")
        public Long index;

        @NameInMap("Version")
        public String version;

        @NameInMap("Count")
        public Long count;

        public static DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions self = new DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions();
            return TeaModel.build(map, self);
        }

        public DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeAppDailySdkVersionsResponseBodyAppDailySdkVersions setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
