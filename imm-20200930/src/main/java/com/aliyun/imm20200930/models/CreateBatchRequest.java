// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBatchRequest extends TeaModel {
    /**
     * <p>The processing templates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public java.util.List<CreateBatchRequestActions> actions;

    /**
     * <p>The data source configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public Input input;

    /**
     * <p>The notification settings. The operation supports multiple messaging middleware options. For more information about notification messages, see Asynchronous message examples. You can use one of the following methods to receive notification messages:</p>
     * <p>Activate and connect to EventBridge in the same region as the IMM project. For more information, see IMM events. Activate Simple Message Queue in the same region as the IMM project and configure a subscription.</p>
     */
    @NameInMap("Notification")
    public CreateBatchRequestNotification notification;

    /**
     * <p>The name of the project.<a href="~~478153~~"></a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The service role. IMM assumes the service role so that it can access resources in other cloud services, such as OSS. Default value: AliyunIMMBatchTriggerRole.</p>
     * <p>You can also create a custom service role in the RAM console and grant the required permissions to the role based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a regular service role</a> and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a role</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunIMMDefaultRole</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

    /**
     * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
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
         * <p>The policy configurations for handling failures.</p>
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
         * <p>The template parameters.</p>
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
         * <p>The Simple Message Queue notification message configurations.</p>
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
