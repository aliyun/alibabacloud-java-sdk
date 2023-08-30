// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationObjectModifyStatusResponseBody extends TeaModel {
    @NameInMap("DataInitializationStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus dataInitializationStatus;

    @NameInMap("DataSynchronizationStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PrecheckStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus precheckStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("StructureInitializationStatus")
    public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus structureInitializationStatus;

    public static DescribeSynchronizationObjectModifyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationObjectModifyStatusResponseBody self = new DescribeSynchronizationObjectModifyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setDataInitializationStatus(DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus dataInitializationStatus) {
        this.dataInitializationStatus = dataInitializationStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus getDataInitializationStatus() {
        return this.dataInitializationStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setDataSynchronizationStatus(DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus dataSynchronizationStatus) {
        this.dataSynchronizationStatus = dataSynchronizationStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus getDataSynchronizationStatus() {
        return this.dataSynchronizationStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setPrecheckStatus(DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus precheckStatus) {
        this.precheckStatus = precheckStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus getPrecheckStatus() {
        return this.precheckStatus;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSynchronizationObjectModifyStatusResponseBody setStructureInitializationStatus(DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus structureInitializationStatus) {
        this.structureInitializationStatus = structureInitializationStatus;
        return this;
    }
    public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus getStructureInitializationStatus() {
        return this.structureInitializationStatus;
    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus extends TeaModel {
        @NameInMap("Delay")
        public String delay;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setDelay(String delay) {
            this.delay = delay;
            return this;
        }
        public String getDelay() {
            return this.delay;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyDataSynchronizationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail extends TeaModel {
        @NameInMap("CheckStatus")
        public String checkStatus;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("RepairMethod")
        public String repairMethod;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail self = new DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail setRepairMethod(String repairMethod) {
            this.repairMethod = repairMethod;
            return this;
        }
        public String getRepairMethod() {
            return this.repairMethod;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus extends TeaModel {
        @NameInMap("Detail")
        public java.util.List<DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail> detail;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus setDetail(java.util.List<DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatusDetail> getDetail() {
            return this.detail;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyPrecheckStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Percent")
        public String percent;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus self = new DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setPercent(String percent) {
            this.percent = percent;
            return this;
        }
        public String getPercent() {
            return this.percent;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeSynchronizationObjectModifyStatusResponseBodyStructureInitializationStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
