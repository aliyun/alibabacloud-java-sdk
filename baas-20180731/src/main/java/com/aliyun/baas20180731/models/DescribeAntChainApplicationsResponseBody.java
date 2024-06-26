// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainApplicationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainApplicationsResponseBodyResult result;

    public static DescribeAntChainApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainApplicationsResponseBody self = new DescribeAntChainApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainApplicationsResponseBody setResult(DescribeAntChainApplicationsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainApplicationsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainApplicationsResponseBodyResultApplyHistoryList extends TeaModel {
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

        public static DescribeAntChainApplicationsResponseBodyResultApplyHistoryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainApplicationsResponseBodyResultApplyHistoryList self = new DescribeAntChainApplicationsResponseBodyResultApplyHistoryList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setReqAddr(String reqAddr) {
            this.reqAddr = reqAddr;
            return this;
        }
        public String getReqAddr() {
            return this.reqAddr;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setSignedAddr(String signedAddr) {
            this.signedAddr = signedAddr;
            return this;
        }
        public String getSignedAddr() {
            return this.signedAddr;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeAntChainApplicationsResponseBodyResultApplyHistoryList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeAntChainApplicationsResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static DescribeAntChainApplicationsResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainApplicationsResponseBodyResultPagination self = new DescribeAntChainApplicationsResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainApplicationsResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public DescribeAntChainApplicationsResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainApplicationsResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeAntChainApplicationsResponseBodyResult extends TeaModel {
        @NameInMap("ApplyHistoryList")
        public java.util.List<DescribeAntChainApplicationsResponseBodyResultApplyHistoryList> applyHistoryList;

        @NameInMap("Pagination")
        public DescribeAntChainApplicationsResponseBodyResultPagination pagination;

        public static DescribeAntChainApplicationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainApplicationsResponseBodyResult self = new DescribeAntChainApplicationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainApplicationsResponseBodyResult setApplyHistoryList(java.util.List<DescribeAntChainApplicationsResponseBodyResultApplyHistoryList> applyHistoryList) {
            this.applyHistoryList = applyHistoryList;
            return this;
        }
        public java.util.List<DescribeAntChainApplicationsResponseBodyResultApplyHistoryList> getApplyHistoryList() {
            return this.applyHistoryList;
        }

        public DescribeAntChainApplicationsResponseBodyResult setPagination(DescribeAntChainApplicationsResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainApplicationsResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
