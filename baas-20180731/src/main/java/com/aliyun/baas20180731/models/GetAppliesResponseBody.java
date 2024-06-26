// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetAppliesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAppliesResponseBodyResult result;

    public static GetAppliesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppliesResponseBody self = new GetAppliesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppliesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppliesResponseBody setResult(GetAppliesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAppliesResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAppliesResponseBodyResultApplyHistoryList extends TeaModel {
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

        public static GetAppliesResponseBodyResultApplyHistoryList build(java.util.Map<String, ?> map) throws Exception {
            GetAppliesResponseBodyResultApplyHistoryList self = new GetAppliesResponseBodyResultApplyHistoryList();
            return TeaModel.build(map, self);
        }

        public GetAppliesResponseBodyResultApplyHistoryList setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setRejectReason(String rejectReason) {
            this.rejectReason = rejectReason;
            return this;
        }
        public String getRejectReason() {
            return this.rejectReason;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setReqAddr(String reqAddr) {
            this.reqAddr = reqAddr;
            return this;
        }
        public String getReqAddr() {
            return this.reqAddr;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setSignedAddr(String signedAddr) {
            this.signedAddr = signedAddr;
            return this;
        }
        public String getSignedAddr() {
            return this.signedAddr;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public GetAppliesResponseBodyResultApplyHistoryList setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class GetAppliesResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetAppliesResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            GetAppliesResponseBodyResultPagination self = new GetAppliesResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public GetAppliesResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public GetAppliesResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAppliesResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetAppliesResponseBodyResult extends TeaModel {
        @NameInMap("ApplyHistoryList")
        public java.util.List<GetAppliesResponseBodyResultApplyHistoryList> applyHistoryList;

        @NameInMap("Pagination")
        public GetAppliesResponseBodyResultPagination pagination;

        public static GetAppliesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAppliesResponseBodyResult self = new GetAppliesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAppliesResponseBodyResult setApplyHistoryList(java.util.List<GetAppliesResponseBodyResultApplyHistoryList> applyHistoryList) {
            this.applyHistoryList = applyHistoryList;
            return this;
        }
        public java.util.List<GetAppliesResponseBodyResultApplyHistoryList> getApplyHistoryList() {
            return this.applyHistoryList;
        }

        public GetAppliesResponseBodyResult setPagination(GetAppliesResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public GetAppliesResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
