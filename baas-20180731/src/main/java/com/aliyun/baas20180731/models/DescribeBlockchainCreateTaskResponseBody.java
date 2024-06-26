// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainCreateTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeBlockchainCreateTaskResponseBodyResult result;

    public static DescribeBlockchainCreateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainCreateTaskResponseBody self = new DescribeBlockchainCreateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainCreateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBlockchainCreateTaskResponseBody setResult(DescribeBlockchainCreateTaskResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeBlockchainCreateTaskResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks extends TeaModel {
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

        public static DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks self = new DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks setBizid(String bizid) {
            this.bizid = bizid;
            return this;
        }
        public String getBizid() {
            return this.bizid;
        }

        public DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeBlockchainCreateTaskResponseBodyResultPagination extends TeaModel {
        @NameInMap("Current")
        public Integer current;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static DescribeBlockchainCreateTaskResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainCreateTaskResponseBodyResultPagination self = new DescribeBlockchainCreateTaskResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainCreateTaskResponseBodyResultPagination setCurrent(Integer current) {
            this.current = current;
            return this;
        }
        public Integer getCurrent() {
            return this.current;
        }

        public DescribeBlockchainCreateTaskResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBlockchainCreateTaskResponseBodyResultPagination setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class DescribeBlockchainCreateTaskResponseBodyResult extends TeaModel {
        @NameInMap("BlockchainCreateTasks")
        public java.util.List<DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks> blockchainCreateTasks;

        @NameInMap("Pagination")
        public DescribeBlockchainCreateTaskResponseBodyResultPagination pagination;

        public static DescribeBlockchainCreateTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockchainCreateTaskResponseBodyResult self = new DescribeBlockchainCreateTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeBlockchainCreateTaskResponseBodyResult setBlockchainCreateTasks(java.util.List<DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks> blockchainCreateTasks) {
            this.blockchainCreateTasks = blockchainCreateTasks;
            return this;
        }
        public java.util.List<DescribeBlockchainCreateTaskResponseBodyResultBlockchainCreateTasks> getBlockchainCreateTasks() {
            return this.blockchainCreateTasks;
        }

        public DescribeBlockchainCreateTaskResponseBodyResult setPagination(DescribeBlockchainCreateTaskResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeBlockchainCreateTaskResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
