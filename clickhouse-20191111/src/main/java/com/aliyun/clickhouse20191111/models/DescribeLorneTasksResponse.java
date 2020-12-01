// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TaskDetails")
    @Validation(required = true)
    public java.util.List<DescribeLorneTasksResponseTaskDetails> taskDetails;

    public static DescribeLorneTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksResponse self = new DescribeLorneTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneTasksResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLorneTasksResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLorneTasksResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLorneTasksResponse setTaskDetails(java.util.List<DescribeLorneTasksResponseTaskDetails> taskDetails) {
        this.taskDetails = taskDetails;
        return this;
    }
    public java.util.List<DescribeLorneTasksResponseTaskDetails> getTaskDetails() {
        return this.taskDetails;
    }

    public static class DescribeLorneTasksResponseTaskDetails extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SourceType")
        @Validation(required = true)
        public String sourceType;

        @NameInMap("SourceProject")
        @Validation(required = true)
        public String sourceProject;

        @NameInMap("SourceTopic")
        @Validation(required = true)
        public String sourceTopic;

        @NameInMap("SourceRegion")
        @Validation(required = true)
        public String sourceRegion;

        @NameInMap("SinkType")
        @Validation(required = true)
        public String sinkType;

        @NameInMap("SinkInstance")
        @Validation(required = true)
        public String sinkInstance;

        @NameInMap("SinkSchema")
        @Validation(required = true)
        public String sinkSchema;

        @NameInMap("SinkTable")
        @Validation(required = true)
        public String sinkTable;

        @NameInMap("SinkUser")
        @Validation(required = true)
        public String sinkUser;

        @NameInMap("SinkRegion")
        @Validation(required = true)
        public String sinkRegion;

        @NameInMap("SinkVpcId")
        @Validation(required = true)
        public String sinkVpcId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("Strict")
        @Validation(required = true)
        public String strict;

        @NameInMap("ColumnMapper")
        @Validation(required = true)
        public String columnMapper;

        @NameInMap("Checkpoint")
        @Validation(required = true)
        public String checkpoint;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static DescribeLorneTasksResponseTaskDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeLorneTasksResponseTaskDetails self = new DescribeLorneTasksResponseTaskDetails();
            return TeaModel.build(map, self);
        }

        public DescribeLorneTasksResponseTaskDetails setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLorneTasksResponseTaskDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLorneTasksResponseTaskDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLorneTasksResponseTaskDetails setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeLorneTasksResponseTaskDetails setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public DescribeLorneTasksResponseTaskDetails setSourceTopic(String sourceTopic) {
            this.sourceTopic = sourceTopic;
            return this;
        }
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        public DescribeLorneTasksResponseTaskDetails setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkInstance(String sinkInstance) {
            this.sinkInstance = sinkInstance;
            return this;
        }
        public String getSinkInstance() {
            return this.sinkInstance;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkSchema(String sinkSchema) {
            this.sinkSchema = sinkSchema;
            return this;
        }
        public String getSinkSchema() {
            return this.sinkSchema;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkTable(String sinkTable) {
            this.sinkTable = sinkTable;
            return this;
        }
        public String getSinkTable() {
            return this.sinkTable;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkUser(String sinkUser) {
            this.sinkUser = sinkUser;
            return this;
        }
        public String getSinkUser() {
            return this.sinkUser;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkRegion(String sinkRegion) {
            this.sinkRegion = sinkRegion;
            return this;
        }
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        public DescribeLorneTasksResponseTaskDetails setSinkVpcId(String sinkVpcId) {
            this.sinkVpcId = sinkVpcId;
            return this;
        }
        public String getSinkVpcId() {
            return this.sinkVpcId;
        }

        public DescribeLorneTasksResponseTaskDetails setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeLorneTasksResponseTaskDetails setStrict(String strict) {
            this.strict = strict;
            return this;
        }
        public String getStrict() {
            return this.strict;
        }

        public DescribeLorneTasksResponseTaskDetails setColumnMapper(String columnMapper) {
            this.columnMapper = columnMapper;
            return this;
        }
        public String getColumnMapper() {
            return this.columnMapper;
        }

        public DescribeLorneTasksResponseTaskDetails setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeLorneTasksResponseTaskDetails setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLorneTasksResponseTaskDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
