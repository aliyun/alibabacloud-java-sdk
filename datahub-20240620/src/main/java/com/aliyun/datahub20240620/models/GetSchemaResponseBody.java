// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetSchemaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1724041098000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>1559031978056215</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;Type\&quot;:\&quot;STRING\&quot;,\&quot;AllowNull\&quot;:true,\&quot;Name\&quot;:\&quot;context\&quot;}]</p>
     */
    @NameInMap("RecordSchema")
    public String recordSchema;

    /**
     * <strong>example:</strong>
     * <p>A20A7093-8FE0-058C-BE0C-3C8057D5F1A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VersionId")
    public Integer versionId;

    public static GetSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaResponseBody self = new GetSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSchemaResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public GetSchemaResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetSchemaResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetSchemaResponseBody setRecordSchema(String recordSchema) {
        this.recordSchema = recordSchema;
        return this;
    }
    public String getRecordSchema() {
        return this.recordSchema;
    }

    public GetSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSchemaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetSchemaResponseBody setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public GetSchemaResponseBody setVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }
    public Integer getVersionId() {
        return this.versionId;
    }

}
