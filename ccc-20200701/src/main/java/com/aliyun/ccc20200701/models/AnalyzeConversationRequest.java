// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnalyzeConversationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>job-10963442671187****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    @NameInMap("FieldListJson")
    public String fieldListJson;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;keywords&quot;]</p>
     */
    @NameInMap("TaskListJson")
    public String taskListJson;

    public static AnalyzeConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeConversationRequest self = new AnalyzeConversationRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeConversationRequest setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public AnalyzeConversationRequest setFieldListJson(String fieldListJson) {
        this.fieldListJson = fieldListJson;
        return this;
    }
    public String getFieldListJson() {
        return this.fieldListJson;
    }

    public AnalyzeConversationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AnalyzeConversationRequest setTaskListJson(String taskListJson) {
        this.taskListJson = taskListJson;
        return this;
    }
    public String getTaskListJson() {
        return this.taskListJson;
    }

}
