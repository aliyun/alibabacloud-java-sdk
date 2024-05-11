// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateBatchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Actions")
    public java.util.List<CreateBatchRequestActions> actions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public Input input;

    @NameInMap("Notification")
    public CreateBatchRequestNotification notification;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceRole")
    public String serviceRole;

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
        @NameInMap("FastFailPolicy")
        public FastFailPolicy fastFailPolicy;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

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
