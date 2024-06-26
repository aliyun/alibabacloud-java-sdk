// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAppliesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAppliesResponseBodyResult result;

    public static DescribeAppliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppliesResponseBody self = new DescribeAppliesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppliesResponseBody setResult(DescribeAppliesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAppliesResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAppliesResponseBodyResultApplyHistoryList extends TeaModel {
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

        public static DescribeAppliesResponseBodyResultApplyHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppliesResponseBodyResultApplyHistoryList self = new DescribeAppliesResponseBodyResultApplyHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setReqAddr(String reqAddr) {
            this.reqAddr = reqAddr;
            return this;
        }
        public String getReqAddr() {
            return this.reqAddr;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setSignedAddr(String signedAddr) {
            this.signedAddr = signedAddr;
            return this;
        }
        public String getSignedAddr() {
            return this.signedAddr;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeAppliesResponseBodyResultApplyHistoryList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeAppliesResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static DescribeAppliesResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppliesResponseBodyResultPagination self = new DescribeAppliesResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAppliesResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public DescribeAppliesResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAppliesResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeAppliesResponseBodyResult extends TeaModel {
        @NameInMap("ApplyHistoryList")
        public java.util.List<DescribeAppliesResponseBodyResultApplyHistoryList> applyHistoryList;

        @NameInMap("Pagination")
        public DescribeAppliesResponseBodyResultPagination pagination;

        public static DescribeAppliesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppliesResponseBodyResult self = new DescribeAppliesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAppliesResponseBodyResult setApplyHistoryList(java.util.List<DescribeAppliesResponseBodyResultApplyHistoryList> applyHistoryList) {
            this.applyHistoryList = applyHistoryList;
            return this;
        }
        public java.util.List<DescribeAppliesResponseBodyResultApplyHistoryList> getApplyHistoryList() {
            return this.applyHistoryList;
        }

        public DescribeAppliesResponseBodyResult setPagination(DescribeAppliesResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAppliesResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
