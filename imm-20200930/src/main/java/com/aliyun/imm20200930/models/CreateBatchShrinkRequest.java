// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBatchShrinkRequest extends TeaModel {
    /**
     * <p>A list of processing templates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>The input data source configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The notification recipient. Multiple middleware services are supported. For details about the message format, see Asynchronous notification message. Select one of the following methods to receive messages:</p>
     * <p>Activate and access EventBridge in the same region as Intelligent Media Management (IMM) to promptly receive task notifications. For more information, see IMM events.
     * Activate MNS in the same region as IMM and configure a subscription.</p>
     */
    @NameInMap("Notification")
    public String notificationShrink;

    /**
     * <p>The project name. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">Create a project</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The service role that grants IMM the permissions to access other cloud resources, such as OSS. The default value is AliyunIMMBatchTriggerRole.</p>
     * <p>To use a custom service role, create a service role and grant permissions to the role in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a service role</a> and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunIMMBatchTriggerRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    /**
     * <p>Custom tags used to search and filter asynchronous tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;val&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateBatchShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchShrinkRequest self = new CreateBatchShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchShrinkRequest setActionsShrink(String actionsShrink) {
        this.actionsShrink = actionsShrink;
        return this;
    }
    public String getActionsShrink() {
        return this.actionsShrink;
    }

    public CreateBatchShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public CreateBatchShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateBatchShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateBatchShrinkRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateBatchShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
