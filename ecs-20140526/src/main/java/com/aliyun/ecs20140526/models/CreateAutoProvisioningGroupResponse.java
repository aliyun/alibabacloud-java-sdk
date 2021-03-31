// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AutoProvisioningGroupId")
    @Validation(required = true)
    public String autoProvisioningGroupId;

    @NameInMap("LaunchResults")
    @Validation(required = true)
    public CreateAutoProvisioningGroupResponseLaunchResults launchResults;

    public static CreateAutoProvisioningGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupResponse self = new CreateAutoProvisioningGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoProvisioningGroupResponse setAutoProvisioningGroupId(String autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public CreateAutoProvisioningGroupResponse setLaunchResults(CreateAutoProvisioningGroupResponseLaunchResults launchResults) {
        this.launchResults = launchResults;
        return this;
    }
    public CreateAutoProvisioningGroupResponseLaunchResults getLaunchResults() {
        return this.launchResults;
    }

    public static class CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds extends TeaModel {
        // InstanceId
        @NameInMap("InstanceId")
        @Validation(required = true)
        public java.util.List<String> instanceId;

        public static CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds self = new CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult extends TeaModel {
        @NameInMap("SpotStrategy")
        @Validation(required = true)
        public String spotStrategy;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMsg")
        @Validation(required = true)
        public String errorMsg;

        @NameInMap("InstanceIds")
        @Validation(required = true)
        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds instanceIds;

        public static CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult self = new CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult setInstanceIds(CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public CreateAutoProvisioningGroupResponseLaunchResultsLaunchResultInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class CreateAutoProvisioningGroupResponseLaunchResults extends TeaModel {
        @NameInMap("LaunchResult")
        @Validation(required = true)
        public java.util.List<CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult> launchResult;

        public static CreateAutoProvisioningGroupResponseLaunchResults build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseLaunchResults self = new CreateAutoProvisioningGroupResponseLaunchResults();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseLaunchResults setLaunchResult(java.util.List<CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult> launchResult) {
            this.launchResult = launchResult;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupResponseLaunchResultsLaunchResult> getLaunchResult() {
            return this.launchResult;
        }

    }

}
