// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBVersionInfosResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
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
         * 
         * <strong>example:</strong>
         * <p>&quot;Serverless&quot;: [
         *                 {
         *                     &quot;engineVersion&quot;: &quot;6.0&quot;,
         *                     &quot;versionInfos&quot;: [
         *                         {
         *                             &quot;kernelVersion&quot;: &quot;v2.0.0.5&quot;,
         *                             &quot;releaseDate&quot;: &quot;2023-05-28T07:48Z&quot;,
         *                             &quot;expirationDate&quot;: &quot;2026-05-28T07:48Z&quot;
         *                         },
         *                         {
         *                             &quot;kernelVersion&quot;: &quot;v2.0.0.1&quot;,
         *                             &quot;releaseDate&quot;: &quot;2023-03-27T12:44Z&quot;,
         *                             &quot;expirationDate&quot;: &quot;2026-03-27T12:44Z&quot;
         *                         },
         *                         {
         *                             &quot;kernelVersion&quot;: &quot;v1.0.5.1&quot;,
         *                             &quot;releaseDate&quot;: &quot;2023-02-22T11:39Z&quot;,
         *                             &quot;expirationDate&quot;: &quot;2026-02-22T11:39Z&quot;
         *                         }
         *                     ]
         *                 }
         * ]</p>
         */
        @NameInMap("Serverless")
        public Object serverless;

        /**
         * <p>The queried minor version information about the instance in elastic storage mode.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;StorageElasic&quot;: [
         *                 {
         *                     &quot;engineVersion&quot;: &quot;6.0&quot;,
         *                     &quot;versionInfos&quot;: [
         *                         {
         *                             &quot;kernelVersion&quot;: &quot;v6.3.11.2&quot;,
         *                             &quot;releaseDate&quot;: &quot;2023-08-17T09:14Z&quot;,
         *                             &quot;expirationDate&quot;: &quot;2026-08-17T09:14Z&quot;
         *                         }
         *           },
         *                 {
         *                     &quot;engineVersion&quot;: &quot;7.0&quot;,
         *                     &quot;versionInfos&quot;: [
         *                         {
         *                             &quot;kernelVersion&quot;: &quot;v7.0.2.0&quot;,
         *                             &quot;releaseDate&quot;: &quot;2023-08-09T06:47Z&quot;,
         *                             &quot;expirationDate&quot;: &quot;2026-08-09T06:47Z&quot;
         *                         },
         *                         {
         *                             &quot;kernelVersion&quot;: &quot;v7.0.1.8&quot;,
         *                             &quot;releaseDate&quot;: &quot;2023-05-25T06:56Z&quot;,
         *                             &quot;expirationDate&quot;: &quot;2026-05-25T06:56Z&quot;
         *                         }
         *                     ]
         *                 }
         * ]</p>
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
