// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("List")
    @Validation(required = true)
    public java.util.List<DescribeShardTaskListResponseList> list;

    public static DescribeShardTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskListResponse self = new DescribeShardTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardTaskListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeShardTaskListResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeShardTaskListResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeShardTaskListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeShardTaskListResponse setList(java.util.List<DescribeShardTaskListResponseList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeShardTaskListResponseList> getList() {
        return this.list;
    }

    public static class DescribeShardTaskListResponseList extends TeaModel {
        @NameInMap("SourceTableName")
        @Validation(required = true)
        public String sourceTableName;

        @NameInMap("TargetTableName")
        @Validation(required = true)
        public String targetTableName;

        @NameInMap("Expired")
        @Validation(required = true)
        public String expired;

        @NameInMap("Stage")
        @Validation(required = true)
        public Integer stage;

        @NameInMap("Progress")
        @Validation(required = true)
        public Integer progress;

        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        public static DescribeShardTaskListResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskListResponseList self = new DescribeShardTaskListResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskListResponseList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public DescribeShardTaskListResponseList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public DescribeShardTaskListResponseList setExpired(String expired) {
            this.expired = expired;
            return this;
        }
        public String getExpired() {
            return this.expired;
        }

        public DescribeShardTaskListResponseList setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
        }

        public DescribeShardTaskListResponseList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskListResponseList setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

}
