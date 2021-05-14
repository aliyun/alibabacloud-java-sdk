// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeShardTaskListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("List")
    public java.util.List<DescribeShardTaskListResponseBodyList> list;

    public static DescribeShardTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShardTaskListResponseBody self = new DescribeShardTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShardTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShardTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeShardTaskListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeShardTaskListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeShardTaskListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeShardTaskListResponseBody setList(java.util.List<DescribeShardTaskListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeShardTaskListResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeShardTaskListResponseBodyList extends TeaModel {
        @NameInMap("SourceTableName")
        public String sourceTableName;

        @NameInMap("TargetTableName")
        public String targetTableName;

        @NameInMap("Expired")
        public Long expired;

        @NameInMap("Stage")
        public Integer stage;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Delay")
        public Integer delay;

        public static DescribeShardTaskListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeShardTaskListResponseBodyList self = new DescribeShardTaskListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeShardTaskListResponseBodyList setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public DescribeShardTaskListResponseBodyList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

        public DescribeShardTaskListResponseBodyList setExpired(Long expired) {
            this.expired = expired;
            return this;
        }
        public Long getExpired() {
            return this.expired;
        }

        public DescribeShardTaskListResponseBodyList setStage(Integer stage) {
            this.stage = stage;
            return this;
        }
        public Integer getStage() {
            return this.stage;
        }

        public DescribeShardTaskListResponseBodyList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeShardTaskListResponseBodyList setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

}
