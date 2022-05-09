// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobListResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("SynchronousJobList")
    public DescribeSynchronousJobListResponseBodySynchronousJobList synchronousJobList;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeSynchronousJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobListResponseBody self = new DescribeSynchronousJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSynchronousJobListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSynchronousJobListResponseBody setSynchronousJobList(DescribeSynchronousJobListResponseBodySynchronousJobList synchronousJobList) {
        this.synchronousJobList = synchronousJobList;
        return this;
    }
    public DescribeSynchronousJobListResponseBodySynchronousJobList getSynchronousJobList() {
        return this.synchronousJobList;
    }

    public DescribeSynchronousJobListResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob extends TeaModel {
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

        public static DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob self = new DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setDelaySecond(String delaySecond) {
            this.delaySecond = delaySecond;
            return this;
        }
        public String getDelaySecond() {
            return this.delaySecond;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setDestinationInstanceId(String destinationInstanceId) {
            this.destinationInstanceId = destinationInstanceId;
            return this;
        }
        public String getDestinationInstanceId() {
            return this.destinationInstanceId;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setFullDataIntializatioPercent(String fullDataIntializatioPercent) {
            this.fullDataIntializatioPercent = fullDataIntializatioPercent;
            return this;
        }
        public String getFullDataIntializatioPercent() {
            return this.fullDataIntializatioPercent;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setFullDataIntializatioProgress(String fullDataIntializatioProgress) {
            this.fullDataIntializatioProgress = fullDataIntializatioProgress;
            return this;
        }
        public String getFullDataIntializatioProgress() {
            return this.fullDataIntializatioProgress;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setFullDataIntializationStatus(String fullDataIntializationStatus) {
            this.fullDataIntializationStatus = fullDataIntializationStatus;
            return this;
        }
        public String getFullDataIntializationStatus() {
            return this.fullDataIntializationStatus;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setIncrementDataIntializatioDelay(String incrementDataIntializatioDelay) {
            this.incrementDataIntializatioDelay = incrementDataIntializatioDelay;
            return this;
        }
        public String getIncrementDataIntializatioDelay() {
            return this.incrementDataIntializatioDelay;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setIncrementDataIntializatioPercent(String incrementDataIntializatioPercent) {
            this.incrementDataIntializatioPercent = incrementDataIntializatioPercent;
            return this;
        }
        public String getIncrementDataIntializatioPercent() {
            return this.incrementDataIntializatioPercent;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setIncrementDataIntializationStatus(String incrementDataIntializationStatus) {
            this.incrementDataIntializationStatus = incrementDataIntializationStatus;
            return this;
        }
        public String getIncrementDataIntializationStatus() {
            return this.incrementDataIntializationStatus;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setStructureIntializationPercent(String structureIntializationPercent) {
            this.structureIntializationPercent = structureIntializationPercent;
            return this;
        }
        public String getStructureIntializationPercent() {
            return this.structureIntializationPercent;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setStructureIntializationProgress(String structureIntializationProgress) {
            this.structureIntializationProgress = structureIntializationProgress;
            return this;
        }
        public String getStructureIntializationProgress() {
            return this.structureIntializationProgress;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setStructureIntializationStatus(String structureIntializationStatus) {
            this.structureIntializationStatus = structureIntializationStatus;
            return this;
        }
        public String getStructureIntializationStatus() {
            return this.structureIntializationStatus;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setSynchronousFlow(String synchronousFlow) {
            this.synchronousFlow = synchronousFlow;
            return this;
        }
        public String getSynchronousFlow() {
            return this.synchronousFlow;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setSynchronousJobId(String synchronousJobId) {
            this.synchronousJobId = synchronousJobId;
            return this;
        }
        public String getSynchronousJobId() {
            return this.synchronousJobId;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setSynchronousJobName(String synchronousJobName) {
            this.synchronousJobName = synchronousJobName;
            return this;
        }
        public String getSynchronousJobName() {
            return this.synchronousJobName;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setSynchronousStatus(String synchronousStatus) {
            this.synchronousStatus = synchronousStatus;
            return this;
        }
        public String getSynchronousStatus() {
            return this.synchronousStatus;
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob setSynchronousTPS(String synchronousTPS) {
            this.synchronousTPS = synchronousTPS;
            return this;
        }
        public String getSynchronousTPS() {
            return this.synchronousTPS;
        }

    }

    public static class DescribeSynchronousJobListResponseBodySynchronousJobList extends TeaModel {
        @NameInMap("SynchronousJob")
        public java.util.List<DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob> synchronousJob;

        public static DescribeSynchronousJobListResponseBodySynchronousJobList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronousJobListResponseBodySynchronousJobList self = new DescribeSynchronousJobListResponseBodySynchronousJobList();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronousJobListResponseBodySynchronousJobList setSynchronousJob(java.util.List<DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob> synchronousJob) {
            this.synchronousJob = synchronousJob;
            return this;
        }
        public java.util.List<DescribeSynchronousJobListResponseBodySynchronousJobListSynchronousJob> getSynchronousJob() {
            return this.synchronousJob;
        }

    }

}
