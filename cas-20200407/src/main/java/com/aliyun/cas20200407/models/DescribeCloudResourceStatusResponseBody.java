// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCloudResourceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeCloudResourceStatusResponseBodyData> data;

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
        @NameInMap("CloudName")
        public String cloudName;

        @NameInMap("CloudProduct")
        public String cloudProduct;

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
