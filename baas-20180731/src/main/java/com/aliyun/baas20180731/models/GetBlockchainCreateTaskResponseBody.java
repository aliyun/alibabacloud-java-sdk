// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBlockchainCreateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetBlockchainCreateTaskResponseBodyResult result;

    public static GetBlockchainCreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainCreateTaskResponseBody self = new GetBlockchainCreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBlockchainCreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBlockchainCreateTaskResponseBody setResult(GetBlockchainCreateTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetBlockchainCreateTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks extends TeaModel {
        @NameInMap("Bizid")
        public String bizid;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        public static GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks build(java.util.Map<String, ?> map) throws Exception {
            GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks self = new GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks();
            return TeaModel.build(map, self);
        }

        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks extends TeaModel {
        @NameInMap("BlockchainCreateTasks")
        public java.util.List<GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks> blockchainCreateTasks;

        public static GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks build(java.util.Map<String, ?> map) throws Exception {
            GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks self = new GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks();
            return TeaModel.build(map, self);
        }

        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks setBlockchainCreateTasks(java.util.List<GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks> blockchainCreateTasks) {
            this.blockchainCreateTasks = blockchainCreateTasks;
            return this;
        }
        public java.util.List<GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasksBlockchainCreateTasks> getBlockchainCreateTasks() {
            return this.blockchainCreateTasks;
        }

    }

    public static class GetBlockchainCreateTaskResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetBlockchainCreateTaskResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            GetBlockchainCreateTaskResponseBodyResultPagination self = new GetBlockchainCreateTaskResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public GetBlockchainCreateTaskResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public GetBlockchainCreateTaskResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetBlockchainCreateTaskResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetBlockchainCreateTaskResponseBodyResult extends TeaModel {
        @NameInMap("BlockchainCreateTasks")
        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks blockchainCreateTasks;

        @NameInMap("Pagination")
        public GetBlockchainCreateTaskResponseBodyResultPagination pagination;

        public static GetBlockchainCreateTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetBlockchainCreateTaskResponseBodyResult self = new GetBlockchainCreateTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetBlockchainCreateTaskResponseBodyResult setBlockchainCreateTasks(GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks blockchainCreateTasks) {
            this.blockchainCreateTasks = blockchainCreateTasks;
            return this;
        }
        public GetBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks getBlockchainCreateTasks() {
            return this.blockchainCreateTasks;
        }

        public GetBlockchainCreateTaskResponseBodyResult setPagination(GetBlockchainCreateTaskResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public GetBlockchainCreateTaskResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
