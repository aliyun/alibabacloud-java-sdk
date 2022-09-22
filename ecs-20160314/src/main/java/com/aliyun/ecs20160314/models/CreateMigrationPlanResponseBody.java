// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateMigrationPlanResponseBody extends TeaModel {
    @NameInMap("InstancesFailModels")
    public InstancesFailModels instancesFailModels;

    @NameInMap("MigrationPlanId")
    public String migrationPlanId;

    @NameInMap("PlanFailModels")
    public PlanFailModels planFailModels;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SgFailModels")
    public SgFailModels sgFailModels;

    public static CreateMigrationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationPlanResponseBody self = new CreateMigrationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMigrationPlanResponseBody setInstancesFailModels(InstancesFailModels instancesFailModels) {
        this.instancesFailModels = instancesFailModels;
        return this;
    }
    public InstancesFailModels getInstancesFailModels() {
        return this.instancesFailModels;
    }

    public CreateMigrationPlanResponseBody setMigrationPlanId(String migrationPlanId) {
        this.migrationPlanId = migrationPlanId;
        return this;
    }
    public String getMigrationPlanId() {
        return this.migrationPlanId;
    }

    public CreateMigrationPlanResponseBody setPlanFailModels(PlanFailModels planFailModels) {
        this.planFailModels = planFailModels;
        return this;
    }
    public PlanFailModels getPlanFailModels() {
        return this.planFailModels;
    }

    public CreateMigrationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMigrationPlanResponseBody setSgFailModels(SgFailModels sgFailModels) {
        this.sgFailModels = sgFailModels;
        return this;
    }
    public SgFailModels getSgFailModels() {
        return this.sgFailModels;
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

    public static class PlanFailModel extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static PlanFailModel build(java.util.Map<String, ?> map) throws Exception {
            PlanFailModel self = new PlanFailModel();
            return TeaModel.build(map, self);
        }

        public PlanFailModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PlanFailModel setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class PlanFailModels extends TeaModel {
        @NameInMap("PlanFailModel")
        public java.util.List<PlanFailModel> planFailModel;

        public static PlanFailModels build(java.util.Map<String, ?> map) throws Exception {
            PlanFailModels self = new PlanFailModels();
            return TeaModel.build(map, self);
        }

        public PlanFailModels setPlanFailModel(java.util.List<PlanFailModel> planFailModel) {
            this.planFailModel = planFailModel;
            return this;
        }
        public java.util.List<PlanFailModel> getPlanFailModel() {
            return this.planFailModel;
        }

    }

    public static class FailModelsFailModel extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static FailModelsFailModel build(java.util.Map<String, ?> map) throws Exception {
            FailModelsFailModel self = new FailModelsFailModel();
            return TeaModel.build(map, self);
        }

        public FailModelsFailModel setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public FailModelsFailModel setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class SgFailModelFailModels extends TeaModel {
        @NameInMap("FailModel")
        public java.util.List<FailModelsFailModel> failModel;

        public static SgFailModelFailModels build(java.util.Map<String, ?> map) throws Exception {
            SgFailModelFailModels self = new SgFailModelFailModels();
            return TeaModel.build(map, self);
        }

        public SgFailModelFailModels setFailModel(java.util.List<FailModelsFailModel> failModel) {
            this.failModel = failModel;
            return this;
        }
        public java.util.List<FailModelsFailModel> getFailModel() {
            return this.failModel;
        }

    }

    public static class SgFailModel extends TeaModel {
        @NameInMap("FailModels")
        public SgFailModelFailModels failModels;

        @NameInMap("GroupNo")
        public String groupNo;

        public static SgFailModel build(java.util.Map<String, ?> map) throws Exception {
            SgFailModel self = new SgFailModel();
            return TeaModel.build(map, self);
        }

        public SgFailModel setFailModels(SgFailModelFailModels failModels) {
            this.failModels = failModels;
            return this;
        }
        public SgFailModelFailModels getFailModels() {
            return this.failModels;
        }

        public SgFailModel setGroupNo(String groupNo) {
            this.groupNo = groupNo;
            return this;
        }
        public String getGroupNo() {
            return this.groupNo;
        }

    }

    public static class SgFailModels extends TeaModel {
        @NameInMap("SgFailModel")
        public java.util.List<SgFailModel> sgFailModel;

        public static SgFailModels build(java.util.Map<String, ?> map) throws Exception {
            SgFailModels self = new SgFailModels();
            return TeaModel.build(map, self);
        }

        public SgFailModels setSgFailModel(java.util.List<SgFailModel> sgFailModel) {
            this.sgFailModel = sgFailModel;
            return this;
        }
        public java.util.List<SgFailModel> getSgFailModel() {
            return this.sgFailModel;
        }

    }

}
