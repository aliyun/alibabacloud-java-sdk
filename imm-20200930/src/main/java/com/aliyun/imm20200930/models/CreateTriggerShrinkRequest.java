// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateTriggerShrinkRequest extends TeaModel {
    /**
     * <p>A list of data processing templates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public String actionsShrink;

    /**
     * <p>The data source configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String inputShrink;

    /**
     * <p>The notification recipient. Various message intermediaries are supported. For details about the message format, see Asynchronous notification message. Choose one of the following methods to receive messages:</p>
     * <p>Activate and connect to EventBridge in the same region as Intelligent Media Management (IMM) to receive task notifications. For more information, see IMM events. Activate Message Service (MNS) in the same region as IMM and configure a subscription.</p>
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
     * <p>The service role that grants Intelligent Media Management (IMM) permissions to access other cloud resources, such as Object Storage Service (OSS). The default value is AliyunIMMBatchTriggerRole.</p>
     * <p>To use a custom service role, create a service role and grant permissions to the role in the Resource Access Management (RAM) console. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a service role</a> and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
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
     * <p>{&quot;key&quot;:&quot;val&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static CreateTriggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerShrinkRequest self = new CreateTriggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerShrinkRequest setActionsShrink(String actionsShrink) {
        this.actionsShrink = actionsShrink;
        return this;
    }
    public String getActionsShrink() {
        return this.actionsShrink;
    }

    public CreateTriggerShrinkRequest setInputShrink(String inputShrink) {
        this.inputShrink = inputShrink;
        return this;
    }
    public String getInputShrink() {
        return this.inputShrink;
    }

    public CreateTriggerShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateTriggerShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTriggerShrinkRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateTriggerShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
