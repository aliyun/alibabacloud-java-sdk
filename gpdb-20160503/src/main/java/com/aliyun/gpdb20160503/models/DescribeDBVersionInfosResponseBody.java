// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionInfosResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionDetails")
    public DescribeDBVersionInfosResponseBodyVersionDetails versionDetails;

    public static DescribeDBVersionInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBVersionInfosResponseBody self = new DescribeDBVersionInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBVersionInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBVersionInfosResponseBody setVersionDetails(DescribeDBVersionInfosResponseBodyVersionDetails versionDetails) {
        this.versionDetails = versionDetails;
        return this;
    }
    public DescribeDBVersionInfosResponseBodyVersionDetails getVersionDetails() {
        return this.versionDetails;
    }

    public static class DescribeDBVersionInfosResponseBodyVersionDetails extends TeaModel {
        @NameInMap("Serverless")
        public Object serverless;

        @NameInMap("StorageElastic")
        public Object storageElastic;

        public static DescribeDBVersionInfosResponseBodyVersionDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBVersionInfosResponseBodyVersionDetails self = new DescribeDBVersionInfosResponseBodyVersionDetails();
            return TeaModel.build(map, self);
        }

        public DescribeDBVersionInfosResponseBodyVersionDetails setServerless(Object serverless) {
            this.serverless = serverless;
            return this;
        }
        public Object getServerless() {
            return this.serverless;
        }

        public DescribeDBVersionInfosResponseBodyVersionDetails setStorageElastic(Object storageElastic) {
            this.storageElastic = storageElastic;
            return this;
        }
        public Object getStorageElastic() {
            return this.storageElastic;
        }

    }

}
