// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobDetailsResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DelaySecond")
    public String delaySecond;

    @NameInMap("DestinationInstanceId")
    public String destinationInstanceId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FullDataIntializatioPercent")
    public String fullDataIntializatioPercent;

    @NameInMap("FullDataIntializatioProgress")
    public String fullDataIntializatioProgress;

    @NameInMap("FullDataIntializationStatus")
    public String fullDataIntializationStatus;

    @NameInMap("IncrementDataIntializatioDelay")
    public String incrementDataIntializatioDelay;

    @NameInMap("IncrementDataIntializatioPercent")
    public String incrementDataIntializatioPercent;

    @NameInMap("IncrementDataIntializationStatus")
    public String incrementDataIntializationStatus;

    @NameInMap("PrecheckDetails")
    public DescribeSynchronousJobDetailsResponseBodyPrecheckDetails precheckDetails;

    @NameInMap("PrecheckPercent")
    public String precheckPercent;

    @NameInMap("PrecheckStatus")
    public String precheckStatus;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("StructureIntializationPercent")
    public String structureIntializationPercent;

    @NameInMap("StructureIntializationProgress")
    public String structureIntializationProgress;

    @NameInMap("StructureIntializationStatus")
    public String structureIntializationStatus;

    @NameInMap("SynchronousFlow")
    public String synchronousFlow;

    @NameInMap("SynchronousJobId")
    public String synchronousJobId;

    @NameInMap("SynchronousJobName")
    public String synchronousJobName;

    @NameInMap("SynchronousStatus")
    public String synchronousStatus;

    @NameInMap("SynchronousTPS")
    public String synchronousTPS;

    public static DescribeSynchronousJobDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobDetailsResponseBody self = new DescribeSynchronousJobDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobDetailsResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeSynchronousJobDetailsResponseBody setDelaySecond(String delaySecond) {
        this.delaySecond = delaySecond;
        return this;
    }
    public String getDelaySecond() {
        return this.delaySecond;
    }

    public DescribeSynchronousJobDetailsResponseBody setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public DescribeSynchronousJobDetailsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSynchronousJobDetailsResponseBody setFullDataIntializatioPercent(String fullDataIntializatioPercent) {
        this.fullDataIntializatioPercent = fullDataIntializatioPercent;
        return this;
    }
    public String getFullDataIntializatioPercent() {
        return this.fullDataIntializatioPercent;
    }

    public DescribeSynchronousJobDetailsResponseBody setFullDataIntializatioProgress(String fullDataIntializatioProgress) {
        this.fullDataIntializatioProgress = fullDataIntializatioProgress;
        return this;
    }
    public String getFullDataIntializatioProgress() {
        return this.fullDataIntializatioProgress;
    }

    public DescribeSynchronousJobDetailsResponseBody setFullDataIntializationStatus(String fullDataIntializationStatus) {
        this.fullDataIntializationStatus = fullDataIntializationStatus;
        return this;
    }
    public String getFullDataIntializationStatus() {
        return this.fullDataIntializationStatus;
    }

    public DescribeSynchronousJobDetailsResponseBody setIncrementDataIntializatioDelay(String incrementDataIntializatioDelay) {
        this.incrementDataIntializatioDelay = incrementDataIntializatioDelay;
        return this;
    }
    public String getIncrementDataIntializatioDelay() {
        return this.incrementDataIntializatioDelay;
    }

    public DescribeSynchronousJobDetailsResponseBody setIncrementDataIntializatioPercent(String incrementDataIntializatioPercent) {
        this.incrementDataIntializatioPercent = incrementDataIntializatioPercent;
        return this;
    }
    public String getIncrementDataIntializatioPercent() {
        return this.incrementDataIntializatioPercent;
    }

    public DescribeSynchronousJobDetailsResponseBody setIncrementDataIntializationStatus(String incrementDataIntializationStatus) {
        this.incrementDataIntializationStatus = incrementDataIntializationStatus;
        return this;
    }
    public String getIncrementDataIntializationStatus() {
        return this.incrementDataIntializationStatus;
    }

    public DescribeSynchronousJobDetailsResponseBody setPrecheckDetails(DescribeSynchronousJobDetailsResponseBodyPrecheckDetails precheckDetails) {
        this.precheckDetails = precheckDetails;
        return this;
    }
    public DescribeSynchronousJobDetailsResponseBodyPrecheckDetails getPrecheckDetails() {
        return this.precheckDetails;
    }

    public DescribeSynchronousJobDetailsResponseBody setPrecheckPercent(String precheckPercent) {
        this.precheckPercent = precheckPercent;
        return this;
    }
    public String getPrecheckPercent() {
        return this.precheckPercent;
    }

    public DescribeSynchronousJobDetailsResponseBody setPrecheckStatus(String precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public String getPrecheckStatus() {
        return this.precheckStatus;
    }

    public DescribeSynchronousJobDetailsResponseBody setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public DescribeSynchronousJobDetailsResponseBody setStructureIntializationPercent(String structureIntializationPercent) {
        this.structureIntializationPercent = structureIntializationPercent;
        return this;
    }
    public String getStructureIntializationPercent() {
        return this.structureIntializationPercent;
    }

    public DescribeSynchronousJobDetailsResponseBody setStructureIntializationProgress(String structureIntializationProgress) {
        this.structureIntializationProgress = structureIntializationProgress;
        return this;
    }
    public String getStructureIntializationProgress() {
        return this.structureIntializationProgress;
    }

    public DescribeSynchronousJobDetailsResponseBody setStructureIntializationStatus(String structureIntializationStatus) {
        this.structureIntializationStatus = structureIntializationStatus;
        return this;
    }
    public String getStructureIntializationStatus() {
        return this.structureIntializationStatus;
    }

    public DescribeSynchronousJobDetailsResponseBody setSynchronousFlow(String synchronousFlow) {
        this.synchronousFlow = synchronousFlow;
        return this;
    }
    public String getSynchronousFlow() {
        return this.synchronousFlow;
    }

    public DescribeSynchronousJobDetailsResponseBody setSynchronousJobId(String synchronousJobId) {
        this.synchronousJobId = synchronousJobId;
        return this;
    }
    public String getSynchronousJobId() {
        return this.synchronousJobId;
    }

    public DescribeSynchronousJobDetailsResponseBody setSynchronousJobName(String synchronousJobName) {
        this.synchronousJobName = synchronousJobName;
        return this;
    }
    public String getSynchronousJobName() {
        return this.synchronousJobName;
    }

    public DescribeSynchronousJobDetailsResponseBody setSynchronousStatus(String synchronousStatus) {
        this.synchronousStatus = synchronousStatus;
        return this;
    }
    public String getSynchronousStatus() {
        return this.synchronousStatus;
    }

    public DescribeSynchronousJobDetailsResponseBody setSynchronousTPS(String synchronousTPS) {
        this.synchronousTPS = synchronousTPS;
        return this;
    }
    public String getSynchronousTPS() {
        return this.synchronousTPS;
    }

    public static class DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail extends TeaModel {
        @NameInMap("CheckItem")
        public String checkItem;

        @NameInMap("CheckItemDescription")
        public String checkItemDescription;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("FailedReson")
        public String failedReson;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail self = new DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail setCheckItemDescription(String checkItemDescription) {
            this.checkItemDescription = checkItemDescription;
            return this;
        }
        public String getCheckItemDescription() {
            return this.checkItemDescription;
        }

        public DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail setFailedReson(String failedReson) {
            this.failedReson = failedReson;
            return this;
        }
        public String getFailedReson() {
            return this.failedReson;
        }

        public DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronousJobDetailsResponseBodyPrecheckDetails extends TeaModel {
        @NameInMap("PrecheckDetail")
        public java.util.List<DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail> precheckDetail;

        public static DescribeSynchronousJobDetailsResponseBodyPrecheckDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobDetailsResponseBodyPrecheckDetails self = new DescribeSynchronousJobDetailsResponseBodyPrecheckDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobDetailsResponseBodyPrecheckDetails setPrecheckDetail(java.util.List<DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail> precheckDetail) {
            this.precheckDetail = precheckDetail;
            return this;
        }
        public java.util.List<DescribeSynchronousJobDetailsResponseBodyPrecheckDetailsPrecheckDetail> getPrecheckDetail() {
            return this.precheckDetail;
        }

    }

}
