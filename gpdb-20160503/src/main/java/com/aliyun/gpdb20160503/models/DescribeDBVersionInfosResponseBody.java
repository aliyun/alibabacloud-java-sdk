// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionInfosResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried minor versions.</p>
     */
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
        /**
         * <p>The queried minor version information about the instance in Serverless mode.</p>
         */
        @NameInMap("Serverless")
        public Object serverless;

        /**
         * <p>The queried minor version information about the instance in elastic storage mode.</p>
         */
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
