// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLogHubAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskDetail")
    @Validation(required = true)
    public DescribeLogHubAttributeResponseTaskDetail taskDetail;

    public static DescribeLogHubAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogHubAttributeResponse self = new DescribeLogHubAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogHubAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogHubAttributeResponse setTaskDetail(DescribeLogHubAttributeResponseTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public DescribeLogHubAttributeResponseTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static class DescribeLogHubAttributeResponseTaskDetail extends TeaModel {
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

        public static DescribeLogHubAttributeResponseTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogHubAttributeResponseTaskDetail self = new DescribeLogHubAttributeResponseTaskDetail();
            return TeaModel.build(map, self);
        }

        public DescribeLogHubAttributeResponseTaskDetail setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeLogHubAttributeResponseTaskDetail setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeLogHubAttributeResponseTaskDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSourceProject(String sourceProject) {
            this.sourceProject = sourceProject;
            return this;
        }
        public String getSourceProject() {
            return this.sourceProject;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSourceTopic(String sourceTopic) {
            this.sourceTopic = sourceTopic;
            return this;
        }
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkType(String sinkType) {
            this.sinkType = sinkType;
            return this;
        }
        public String getSinkType() {
            return this.sinkType;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkInstance(String sinkInstance) {
            this.sinkInstance = sinkInstance;
            return this;
        }
        public String getSinkInstance() {
            return this.sinkInstance;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkSchema(String sinkSchema) {
            this.sinkSchema = sinkSchema;
            return this;
        }
        public String getSinkSchema() {
            return this.sinkSchema;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkTable(String sinkTable) {
            this.sinkTable = sinkTable;
            return this;
        }
        public String getSinkTable() {
            return this.sinkTable;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkUser(String sinkUser) {
            this.sinkUser = sinkUser;
            return this;
        }
        public String getSinkUser() {
            return this.sinkUser;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkRegion(String sinkRegion) {
            this.sinkRegion = sinkRegion;
            return this;
        }
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        public DescribeLogHubAttributeResponseTaskDetail setSinkVpcId(String sinkVpcId) {
            this.sinkVpcId = sinkVpcId;
            return this;
        }
        public String getSinkVpcId() {
            return this.sinkVpcId;
        }

        public DescribeLogHubAttributeResponseTaskDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeLogHubAttributeResponseTaskDetail setStrict(String strict) {
            this.strict = strict;
            return this;
        }
        public String getStrict() {
            return this.strict;
        }

        public DescribeLogHubAttributeResponseTaskDetail setColumnMapper(String columnMapper) {
            this.columnMapper = columnMapper;
            return this;
        }
        public String getColumnMapper() {
            return this.columnMapper;
        }

        public DescribeLogHubAttributeResponseTaskDetail setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeLogHubAttributeResponseTaskDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
