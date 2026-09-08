// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AnalyzeConversationRequest extends TeaModel {
    /**
     * <p>Call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>job-10963442671187****</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>When the TaskListJson parameter is set to &quot;fields&quot;, this parameter specifies the field content to fetch.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;code&quot;: &quot;OrderNo&quot;,
     *     &quot;name&quot;: &quot;订单号&quot;,
     *     &quot;description&quot;: &quot;订单号&quot;
     *   },
     *   {
     *     &quot;code&quot;: &quot;ProductName&quot;,
     *     &quot;name&quot;: &quot;商品名称&quot;,
     *     &quot;description&quot;: &quot;商品名称&quot;
     *   }
     * ]</p>
     */
    @NameInMap("FieldListJson")
    public String fieldListJson;

    /**
     * <p>Cloud Contact Center instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>List of Task Types for analysis. Valid values include:</p>
     * <ul>
     * <li><p>title: title</p>
     * </li>
     * <li><p>summary: summary</p>
     * </li>
     * <li><p>keywords: keywords</p>
     * </li>
     * <li><p>fields: fields</p>
     * </li>
     * </ul>
     * <p>Currently, only &quot;summary&quot; and &quot;title&quot; can be passed together. All other parameters must be passed individually.</p>
     * 
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
