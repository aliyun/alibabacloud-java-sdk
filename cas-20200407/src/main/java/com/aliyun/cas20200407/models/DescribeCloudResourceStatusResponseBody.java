// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceStatusResponseBody extends TeaModel {
    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeCloudResourceStatusResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>09470F19-CEE8-5C63-BF2C-02B5E3F07A17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudResourceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudResourceStatusResponseBody self = new DescribeCloudResourceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudResourceStatusResponseBody setData(java.util.List<DescribeCloudResourceStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCloudResourceStatusResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCloudResourceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudResourceStatusResponseBodyData extends TeaModel {
        /**
         * <p>The cloud service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("CloudName")
        public String cloudName;

        /**
         * <p>The cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("CloudProduct")
        public String cloudProduct;

        /**
         * <p>The total number of cloud resources on which certificates are deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeCloudResourceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudResourceStatusResponseBodyData self = new DescribeCloudResourceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCloudResourceStatusResponseBodyData setCloudName(String cloudName) {
            this.cloudName = cloudName;
            return this;
        }
        public String getCloudName() {
            return this.cloudName;
        }

        public DescribeCloudResourceStatusResponseBodyData setCloudProduct(String cloudProduct) {
            this.cloudProduct = cloudProduct;
            return this;
        }
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        public DescribeCloudResourceStatusResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
