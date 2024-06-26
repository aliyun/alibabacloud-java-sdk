// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainApplicationResponseBodyResult result;

    public static DescribeBlockchainApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainApplicationResponseBody self = new DescribeBlockchainApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainApplicationResponseBody setResult(DescribeBlockchainApplicationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainApplicationResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainApplicationResponseBodyResultApplyHistoryList extends TeaModel {
        @NameInMap("Bizid")
        public String bizid;

        @NameInMap("Createtime")
        public Long createtime;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("RejectReason")
        public String rejectReason;

        @NameInMap("ReqAddr")
        public String reqAddr;

        @NameInMap("SignedAddr")
        public String signedAddr;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Updatetime")
        public Long updatetime;

        @NameInMap("Username")
        public String username;

        public static DescribeBlockchainApplicationResponseBodyResultApplyHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainApplicationResponseBodyResultApplyHistoryList self = new DescribeBlockchainApplicationResponseBodyResultApplyHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setReqAddr(String reqAddr) {
            this.reqAddr = reqAddr;
            return this;
        }
        public String getReqAddr() {
            return this.reqAddr;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setSignedAddr(String signedAddr) {
            this.signedAddr = signedAddr;
            return this;
        }
        public String getSignedAddr() {
            return this.signedAddr;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeBlockchainApplicationResponseBodyResultApplyHistoryList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeBlockchainApplicationResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static DescribeBlockchainApplicationResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainApplicationResponseBodyResultPagination self = new DescribeBlockchainApplicationResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainApplicationResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public DescribeBlockchainApplicationResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBlockchainApplicationResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeBlockchainApplicationResponseBodyResult extends TeaModel {
        @NameInMap("ApplyHistoryList")
        public java.util.List<DescribeBlockchainApplicationResponseBodyResultApplyHistoryList> applyHistoryList;

        @NameInMap("Pagination")
        public DescribeBlockchainApplicationResponseBodyResultPagination pagination;

        public static DescribeBlockchainApplicationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainApplicationResponseBodyResult self = new DescribeBlockchainApplicationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainApplicationResponseBodyResult setApplyHistoryList(java.util.List<DescribeBlockchainApplicationResponseBodyResultApplyHistoryList> applyHistoryList) {
            this.applyHistoryList = applyHistoryList;
            return this;
        }
        public java.util.List<DescribeBlockchainApplicationResponseBodyResultApplyHistoryList> getApplyHistoryList() {
            return this.applyHistoryList;
        }

        public DescribeBlockchainApplicationResponseBodyResult setPagination(DescribeBlockchainApplicationResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeBlockchainApplicationResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
