// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBatchRequest extends TeaModel {
    /**
     * <p>A list of processing templates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public java.util.List<CreateBatchRequestActions> actions;

    /**
     * <p>The input data source configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public Input input;

    /**
     * <p>The notification recipient. Multiple middleware services are supported. For details about the message format, see Asynchronous notification message. Select one of the following methods to receive messages:</p>
     * <p>Activate and access EventBridge in the same region as Intelligent Media Management (IMM) to promptly receive task notifications. For more information, see IMM events.
     * Activate MNS in the same region as IMM and configure a subscription.</p>
     */
    @NameInMap("Notification")
    public CreateBatchRequestNotification notification;

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
    public java.util.Map<String, ?> tags;

    public static CreateBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchRequest self = new CreateBatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchRequest setActions(java.util.List<CreateBatchRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<CreateBatchRequestActions> getActions() {
        return this.actions;
    }

    public CreateBatchRequest setInput(Input input) {
        this.input = input;
        return this;
    }
    public Input getInput() {
        return this.input;
    }

    public CreateBatchRequest setNotification(CreateBatchRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public CreateBatchRequestNotification getNotification() {
        return this.notification;
    }

    public CreateBatchRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateBatchRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateBatchRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class CreateBatchRequestActions extends TeaModel {
        /**
         * <p>The fast-fail policy configuration.</p>
         */
        @NameInMap("FastFailPolicy")
        public FastFailPolicy fastFailPolicy;

        /**
         * <p>The template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>doc/convert</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A list of template parameters.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<String> parameters;

        public static CreateBatchRequestActions build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchRequestActions self = new CreateBatchRequestActions();
            return TeaModel.build(map, self);
        }

        public CreateBatchRequestActions setFastFailPolicy(FastFailPolicy fastFailPolicy) {
            this.fastFailPolicy = fastFailPolicy;
            return this;
        }
        public FastFailPolicy getFastFailPolicy() {
            return this.fastFailPolicy;
        }

        public CreateBatchRequestActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBatchRequestActions setParameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

    }

    public static class CreateBatchRequestNotification extends TeaModel {
        /**
         * <p>The parameters for MNS notifications.</p>
         */
        @NameInMap("MNS")
        public MNS MNS;

        public static CreateBatchRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            CreateBatchRequestNotification self = new CreateBatchRequestNotification();
            return TeaModel.build(map, self);
        }

        public CreateBatchRequestNotification setMNS(MNS MNS) {
            this.MNS = MNS;
            return this;
        }
        public MNS getMNS() {
            return this.MNS;
        }

    }

}
