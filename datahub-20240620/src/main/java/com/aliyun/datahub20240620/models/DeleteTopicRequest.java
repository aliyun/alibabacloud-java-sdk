// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class DeleteTopicRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>feeding</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liuywdb01_hh1</p>
     */
    @NameInMap("TopicName")
    public String topicName;

    public static DeleteTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicRequest self = new DeleteTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTopicRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeleteTopicRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
