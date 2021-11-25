// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateMediaComplexTaskRequest extends TeaModel {
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("Project")
    public String project;

    public static CreateMediaComplexTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaComplexTaskRequest self = new CreateMediaComplexTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaComplexTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateMediaComplexTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateMediaComplexTaskRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public CreateMediaComplexTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

}
