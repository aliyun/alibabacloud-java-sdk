// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    /**
     * <p>A list of data processing templates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public java.util.List<CreateTriggerRequestActions> actions;

    /**
     * <p>The data source configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public Input input;

    /**
     * <p>The notification recipient. Various message intermediaries are supported. For details about the message format, see Asynchronous notification message. Choose one of the following methods to receive messages:</p>
     * <p>Activate and connect to EventBridge in the same region as Intelligent Media Management (IMM) to receive task notifications. For more information, see IMM events. Activate Message Service (MNS) in the same region as IMM and configure a subscription.</p>
     */
    @NameInMap("Notification")
    public CreateTriggerRequestNotification notification;

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
    public java.util.Map<String, ?> tags;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setActions(java.util.List<CreateTriggerRequestActions> actions) {
        this.actions = actions;
        return this;
    }
    public java.util.List<CreateTriggerRequestActions> getActions() {
        return this.actions;
    }

    public CreateTriggerRequest setInput(Input input) {
        this.input = input;
        return this;
    }
    public Input getInput() {
        return this.input;
    }

    public CreateTriggerRequest setNotification(CreateTriggerRequestNotification notification) {
        this.notification = notification;
        return this;
    }
    public CreateTriggerRequestNotification getNotification() {
        return this.notification;
    }

    public CreateTriggerRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateTriggerRequest setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
        return this;
    }
    public String getServiceRole() {
        return this.serviceRole;
    }

    public CreateTriggerRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static class CreateTriggerRequestActions extends TeaModel {
        /**
         * <p>The fast-fail policy configuration.</p>
         */
        @NameInMap("FastFailPolicy")
        public FastFailPolicy fastFailPolicy;

        /**
         * <p>The name of the template.</p>
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

        public static CreateTriggerRequestActions build(java.util.Map<String, ?> map) throws Exception {
            CreateTriggerRequestActions self = new CreateTriggerRequestActions();
            return TeaModel.build(map, self);
        }

        public CreateTriggerRequestActions setFastFailPolicy(FastFailPolicy fastFailPolicy) {
            this.fastFailPolicy = fastFailPolicy;
            return this;
        }
        public FastFailPolicy getFastFailPolicy() {
            return this.fastFailPolicy;
        }

        public CreateTriggerRequestActions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTriggerRequestActions setParameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

    }

    public static class CreateTriggerRequestNotification extends TeaModel {
        /**
         * <p>The parameter object for MNS notifications.</p>
         */
        @NameInMap("MNS")
        public MNS MNS;

        public static CreateTriggerRequestNotification build(java.util.Map<String, ?> map) throws Exception {
            CreateTriggerRequestNotification self = new CreateTriggerRequestNotification();
            return TeaModel.build(map, self);
        }

        public CreateTriggerRequestNotification setMNS(MNS MNS) {
            this.MNS = MNS;
            return this;
        }
        public MNS getMNS() {
            return this.MNS;
        }

    }

}
