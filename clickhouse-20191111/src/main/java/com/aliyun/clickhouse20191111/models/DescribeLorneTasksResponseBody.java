// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TaskDetails")
    public java.util.List<DescribeLorneTasksResponseBodyTaskDetails> taskDetails;

    public static DescribeLorneTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksResponseBody self = new DescribeLorneTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLorneTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLorneTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLorneTasksResponseBody setTaskDetails(java.util.List<DescribeLorneTasksResponseBodyTaskDetails> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }
    public java.util.List<DescribeLorneTasksResponseBodyTaskDetails> getTaskDetails() {
        return this.taskDetails;
    }

    public static class DescribeLorneTasksResponseBodyTaskDetails extends TeaModel {
        @NameInMap("SinkVpcId")
        public String sinkVpcId;

        @NameInMap("State")
        public String state;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("SinkType")
        public String sinkType;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SinkUser")
        public String sinkUser;

        @NameInMap("ColumnMapper")
        public String columnMapper;

        @NameInMap("Message")
        public String message;

        @NameInMap("SinkInstance")
        public String sinkInstance;

        @NameInMap("Strict")
        public String strict;

        @NameInMap("SourceTopic")
        public String sourceTopic;

        @NameInMap("SinkRegion")
        public String sinkRegion;

        @NameInMap("Description")
        public String description;

        @NameInMap("SinkSchema")
        public String sinkSchema;

        @NameInMap("SourceProject")
        public String sourceProject;

        @NameInMap("Name")
        public String name;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("SourceRegion")
        public String sourceRegion;

        @NameInMap("Id")
        public String id;

        @NameInMap("SinkTable")
        public String sinkTable;

        public static DescribeLorneTasksResponseBodyTaskDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeLorneTasksResponseBodyTaskDetails self = new DescribeLorneTasksResponseBodyTaskDetails();
            return TeaModel.build(map, self);
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkVpcId(String sinkVpcId) {
            this.sinkVpcId = sinkVpcId;
            return this;
        }
        public String getSinkVpcId() {
            return this.sinkVpcId;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkUser(String sinkUser) {
            this.sinkUser = sinkUser;
            return this;
        }
        public String getSinkUser() {
            return this.sinkUser;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setColumnMapper(String columnMapper) {
            this.columnMapper = columnMapper;
            return this;
        }
        public String getColumnMapper() {
            return this.columnMapper;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkInstance(String sinkInstance) {
            this.sinkInstance = sinkInstance;
            return this;
        }
        public String getSinkInstance() {
            return this.sinkInstance;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setStrict(String strict) {
            this.strict = strict;
            return this;
        }
        public String getStrict() {
            return this.strict;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSourceTopic(String sourceTopic) {
            this.sourceTopic = sourceTopic;
            return this;
        }
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkRegion(String sinkRegion) {
            this.sinkRegion = sinkRegion;
            return this;
        }
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkSchema(String sinkSchema) {
            this.sinkSchema = sinkSchema;
            return this;
        }
        public String getSinkSchema() {
            return this.sinkSchema;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLorneTasksResponseBodyTaskDetails setSinkTable(String sinkTable) {
            this.sinkTable = sinkTable;
            return this;
        }
        public String getSinkTable() {
            return this.sinkTable;
        }

    }

}
