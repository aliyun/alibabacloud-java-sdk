// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyMigrationInstancesResponseBody extends TeaModel {
    @NameInMap("InstancesFailModels")
    public InstancesFailModels instancesFailModels;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyMigrationInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationInstancesResponseBody self = new ModifyMigrationInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationInstancesResponseBody setInstancesFailModels(InstancesFailModels instancesFailModels) {
        this.instancesFailModels = instancesFailModels;
        return this;
    }
    public InstancesFailModels getInstancesFailModels() {
        return this.instancesFailModels;
    }

    public ModifyMigrationInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FailModel extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static FailModel build(java.util.Map<String, ?> map) throws Exception {
            FailModel self = new FailModel();
            return TeaModel.build(map, self);
        }

        public FailModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public FailModel setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class FailModels extends TeaModel {
        @NameInMap("FailModel")
        public java.util.List<FailModel> failModel;

        public static FailModels build(java.util.Map<String, ?> map) throws Exception {
            FailModels self = new FailModels();
            return TeaModel.build(map, self);
        }

        public FailModels setFailModel(java.util.List<FailModel> failModel) {
            this.failModel = failModel;
            return this;
        }
        public java.util.List<FailModel> getFailModel() {
            return this.failModel;
        }

    }

    public static class InstancesFailModel extends TeaModel {
        @NameInMap("FailModels")
        public FailModels failModels;

        @NameInMap("InstanceId")
        public String instanceId;

        public static InstancesFailModel build(java.util.Map<String, ?> map) throws Exception {
            InstancesFailModel self = new InstancesFailModel();
            return TeaModel.build(map, self);
        }

        public InstancesFailModel setFailModels(FailModels failModels) {
            this.failModels = failModels;
            return this;
        }
        public FailModels getFailModels() {
            return this.failModels;
        }

        public InstancesFailModel setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class InstancesFailModels extends TeaModel {
        @NameInMap("InstancesFailModel")
        public java.util.List<InstancesFailModel> instancesFailModel;

        public static InstancesFailModels build(java.util.Map<String, ?> map) throws Exception {
            InstancesFailModels self = new InstancesFailModels();
            return TeaModel.build(map, self);
        }

        public InstancesFailModels setInstancesFailModel(java.util.List<InstancesFailModel> instancesFailModel) {
            this.instancesFailModel = instancesFailModel;
            return this;
        }
        public java.util.List<InstancesFailModel> getInstancesFailModel() {
            return this.instancesFailModel;
        }

    }

}
