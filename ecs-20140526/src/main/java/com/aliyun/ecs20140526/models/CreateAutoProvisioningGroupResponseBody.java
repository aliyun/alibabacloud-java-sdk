// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponseBody extends TeaModel {
    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LaunchResults")
    public CreateAutoProvisioningGroupResponseBodyLaunchResults launchResults;

    public static CreateAutoProvisioningGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoProvisioningGroupResponseBody self = new CreateAutoProvisioningGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAutoProvisioningGroupResponseBody setAutoProvisioningGroupId(String autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public String getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public CreateAutoProvisioningGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAutoProvisioningGroupResponseBody setLaunchResults(CreateAutoProvisioningGroupResponseBodyLaunchResults launchResults) {
        this.launchResults = launchResults;
        return this;
    }
    public CreateAutoProvisioningGroupResponseBodyLaunchResults getLaunchResults() {
        return this.launchResults;
    }

    public static class CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds extends TeaModel {
        @NameInMap("InstanceId")
        public java.util.List<String> instanceId;

        public static CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds self = new CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds setInstanceId(java.util.List<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public java.util.List<String> getInstanceId() {
            return this.instanceId;
        }

    }

    public static class CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult extends TeaModel {
        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("SpotStrategy")
        public String spotStrategy;

        @NameInMap("InstanceIds")
        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds instanceIds;

        public static CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult self = new CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setInstanceIds(CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class CreateAutoProvisioningGroupResponseBodyLaunchResults extends TeaModel {
        @NameInMap("LaunchResult")
        public java.util.List<CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult> launchResult;

        public static CreateAutoProvisioningGroupResponseBodyLaunchResults build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseBodyLaunchResults self = new CreateAutoProvisioningGroupResponseBodyLaunchResults();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResults setLaunchResult(java.util.List<CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult> launchResult) {
            this.launchResult = launchResult;
            return this;
        }
        public java.util.List<CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult> getLaunchResult() {
            return this.launchResult;
        }

    }

}
