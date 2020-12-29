// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20180713.models;

import com.aliyun.tea.*;

public class DescribeOrderInstanceListResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderList")
    public java.util.List<DescribeOrderInstanceListResponseBodyOrderList> orderList;

    public static DescribeOrderInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrderInstanceListResponseBody self = new DescribeOrderInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrderInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeOrderInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrderInstanceListResponseBody setOrderList(java.util.List<DescribeOrderInstanceListResponseBodyOrderList> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<DescribeOrderInstanceListResponseBodyOrderList> getOrderList() {
        return this.orderList;
    }

    public static class DescribeOrderInstanceListResponseBodyOrderList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Id")
        public Long id;

        public static DescribeOrderInstanceListResponseBodyOrderList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrderInstanceListResponseBodyOrderList self = new DescribeOrderInstanceListResponseBodyOrderList();
            return TeaModel.build(map, self);
        }

        public DescribeOrderInstanceListResponseBodyOrderList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeOrderInstanceListResponseBodyOrderList setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeOrderInstanceListResponseBodyOrderList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeOrderInstanceListResponseBodyOrderList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeOrderInstanceListResponseBodyOrderList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
