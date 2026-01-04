// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class GetSchemaRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_topic</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSchemaRequest self = new GetSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetSchemaRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetSchemaRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public GetSchemaRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
