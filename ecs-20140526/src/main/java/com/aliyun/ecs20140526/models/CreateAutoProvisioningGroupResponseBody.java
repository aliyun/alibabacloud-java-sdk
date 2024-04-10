// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoProvisioningGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the auto provisioning group.</p>
     */
    @NameInMap("AutoProvisioningGroupId")
    public String autoProvisioningGroupId;

    /**
     * <p>The instances created by the auto provisioning group. The values of the parameters in this array are returned only when AutoProvisioningGroupType is set to `instant`.</p>
     */
    @NameInMap("LaunchResults")
    public CreateAutoProvisioningGroupResponseBodyLaunchResults launchResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public CreateAutoProvisioningGroupResponseBody setLaunchResults(CreateAutoProvisioningGroupResponseBodyLaunchResults launchResults) {
        this.launchResults = launchResults;
        return this;
    }
    public CreateAutoProvisioningGroupResponseBodyLaunchResults getLaunchResults() {
        return this.launchResults;
    }

    public CreateAutoProvisioningGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        /**
         * <p>The number of created instances.</p>
         */
        @NameInMap("Amount")
        public Integer amount;

        /**
         * <p>The error code returned when the instance cannot be created.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the instance cannot be created.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The IDs of created instances.</p>
         */
        @NameInMap("InstanceIds")
        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds instanceIds;

        /**
         * <p>The instance type of the instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The bidding policy for the pay-as-you-go instance. Valid values:</p>
         * <br>
         * <p>*   NoSpot: The instance is a regular pay-as-you-go instance.</p>
         * <p>*   SpotWithPriceLimit: The instance is a preemptible instance for which you specify the maximum hourly price.</p>
         * <p>*   SpotAsPriceGo: The instance is a preemptible instance for which the market price at the time of purchase is used as the bid price.</p>
         */
        @NameInMap("SpotStrategy")
        public String spotStrategy;

        /**
         * <p>The zone ID of the instance.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult self = new CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult();
            return TeaModel.build(map, self);
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setInstanceIds(CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResultInstanceIds getInstanceIds() {
            return this.instanceIds;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setSpotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }
        public String getSpotStrategy() {
            return this.spotStrategy;
        }

        public CreateAutoProvisioningGroupResponseBodyLaunchResultsLaunchResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
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
