// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInventorySynchronizationJobResponseBody extends TeaModel {
    /**
     * <p>The inventory synchronization job.</p>
     */
    @NameInMap("InventorySynchronizationJob")
    public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob inventorySynchronizationJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInventorySynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInventorySynchronizationJobResponseBody self = new GetInventorySynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInventorySynchronizationJobResponseBody setInventorySynchronizationJob(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob inventorySynchronizationJob) {
        this.inventorySynchronizationJob = inventorySynchronizationJob;
        return this;
    }
    public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob getInventorySynchronizationJob() {
        return this.inventorySynchronizationJob;
    }

    public GetInventorySynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics extends TeaModel {
        /**
         * <p>The creation result statistics.</p>
         */
        @NameInMap("Created")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated created;

        /**
         * <p>The deletion result statistics.</p>
         */
        @NameInMap("Deleted")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted deleted;

        /**
         * <p>The unchanged result statistics.</p>
         */
        @NameInMap("Same")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame same;

        /**
         * <p>The update result statistics.</p>
         */
        @NameInMap("Updated")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated updated;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics setCreated(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsCreated getCreated() {
            return this.created;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics setDeleted(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics setSame(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame same) {
            this.same = same;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsSame getSame() {
            return this.same;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics setUpdated(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated extends TeaModel {
        /**
         * <p>The failure count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The skipped count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The success count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics extends TeaModel {
        /**
         * <p>The creation result statistics.</p>
         */
        @NameInMap("Created")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated created;

        /**
         * <p>The deletion result statistics.</p>
         */
        @NameInMap("Deleted")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted deleted;

        /**
         * <p>The unchanged result statistics.</p>
         */
        @NameInMap("Same")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame same;

        /**
         * <p>The update result statistics.</p>
         */
        @NameInMap("Updated")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated updated;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics setCreated(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsCreated getCreated() {
            return this.created;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics setDeleted(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics setSame(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame same) {
            this.same = same;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsSame getSame() {
            return this.same;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics setUpdated(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult extends TeaModel {
        /**
         * <p>The agent synchronization result statistics.</p>
         */
        @NameInMap("AgentStatistics")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics agentStatistics;

        /**
         * <p>The asset synchronization result statistics.</p>
         */
        @NameInMap("AssetStatistics")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics assetStatistics;

        /**
         * <p>The error code of the synchronization result.</p>
         * 
         * <strong>example:</strong>
         * <p>No ErrorCode</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message of the synchronization result.</p>
         * 
         * <strong>example:</strong>
         * <p>No Error Message</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult setAgentStatistics(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics agentStatistics) {
            this.agentStatistics = agentStatistics;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAgentStatistics getAgentStatistics() {
            return this.agentStatistics;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult setAssetStatistics(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics assetStatistics) {
            this.assetStatistics = assetStatistics;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResultAssetStatistics getAssetStatistics() {
            return this.assetStatistics;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob extends TeaModel {
        /**
         * <p>The synchronization job description.</p>
         * 
         * <strong>example:</strong>
         * <p>No Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The synchronization end time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761531556</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The inventory source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src_xxxxxx</p>
         */
        @NameInMap("InventorySourceId")
        public String inventorySourceId;

        /**
         * <p>The ID of the synchronization task.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_xxxxxxxxx</p>
         */
        @NameInMap("InventorySynchronizationJobId")
        public String inventorySynchronizationJobId;

        /**
         * <p>The synchronization node task result.</p>
         */
        @NameInMap("Result")
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult result;

        /**
         * <p>The synchronization start time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761531256</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The synchronization job status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The synchronization trigger type.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob build(java.util.Map<String, ?> map) throws Exception {
            GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob self = new GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob();
            return TeaModel.build(map, self);
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setInventorySourceId(String inventorySourceId) {
            this.inventorySourceId = inventorySourceId;
            return this;
        }
        public String getInventorySourceId() {
            return this.inventorySourceId;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setInventorySynchronizationJobId(String inventorySynchronizationJobId) {
            this.inventorySynchronizationJobId = inventorySynchronizationJobId;
            return this;
        }
        public String getInventorySynchronizationJobId() {
            return this.inventorySynchronizationJobId;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setResult(GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult result) {
            this.result = result;
            return this;
        }
        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJobResult getResult() {
            return this.result;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetInventorySynchronizationJobResponseBodyInventorySynchronizationJob setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
