// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateTaskRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务参数
    @NameInMap("Params")
    public String params;

    // 模板id
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskRequest self = new CreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTaskRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateTaskRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
