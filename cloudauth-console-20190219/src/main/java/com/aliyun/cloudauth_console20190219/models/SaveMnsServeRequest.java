// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveMnsServeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TopicName")
    public String topicName;

    @NameInMap("EndPoint")
    public String endPoint;

    public static SaveMnsServeRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMnsServeRequest self = new SaveMnsServeRequest();
        return TeaModel.build(map, self);
    }

    public SaveMnsServeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public SaveMnsServeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SaveMnsServeRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public SaveMnsServeRequest setEndPoint(String endPoint) {
        this.endPoint = endPoint;
        return this;
    }
    public String getEndPoint() {
        return this.endPoint;
    }

}
