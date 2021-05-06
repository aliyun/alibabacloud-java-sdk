// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribePackIpListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("IpList")
    @Validation(required = true)
    public java.util.List<DescribePackIpListResponseIpList> ipList;

    public static DescribePackIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePackIpListResponse self = new DescribePackIpListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePackIpListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackIpListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePackIpListResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePackIpListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribePackIpListResponse setIpList(java.util.List<DescribePackIpListResponseIpList> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<DescribePackIpListResponseIpList> getIpList() {
        return this.ipList;
    }

    public static class DescribePackIpListResponseIpList extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        public static DescribePackIpListResponseIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribePackIpListResponseIpList self = new DescribePackIpListResponseIpList();
            return TeaModel.build(map, self);
        }

        public DescribePackIpListResponseIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePackIpListResponseIpList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribePackIpListResponseIpList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePackIpListResponseIpList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

    }

}
