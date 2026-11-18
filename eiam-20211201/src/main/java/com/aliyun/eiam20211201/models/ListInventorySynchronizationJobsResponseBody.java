// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListInventorySynchronizationJobsResponseBody extends TeaModel {
    /**
     * <p>The synchronization jobs.</p>
     */
    @NameInMap("InventorySynchronizationJobs")
    public java.util.List<ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs> inventorySynchronizationJobs;

    /**
     * <p>The maximum number of returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned by the current call for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInventorySynchronizationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInventorySynchronizationJobsResponseBody self = new ListInventorySynchronizationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInventorySynchronizationJobsResponseBody setInventorySynchronizationJobs(java.util.List<ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs> inventorySynchronizationJobs) {
        this.inventorySynchronizationJobs = inventorySynchronizationJobs;
        return this;
    }
    public java.util.List<ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs> getInventorySynchronizationJobs() {
        return this.inventorySynchronizationJobs;
    }

    public ListInventorySynchronizationJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInventorySynchronizationJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInventorySynchronizationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInventorySynchronizationJobsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics extends TeaModel {
        /**
         * <p>The statistics on the creation results.</p>
         */
        @NameInMap("Created")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated created;

        /**
         * <p>The statistics on the deletion results.</p>
         */
        @NameInMap("Deleted")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted deleted;

        /**
         * <p>The statistics on the unchanged results.</p>
         */
        @NameInMap("Same")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame same;

        /**
         * <p>The statistics on the update results.</p>
         */
        @NameInMap("Updated")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated updated;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics setCreated(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsCreated getCreated() {
            return this.created;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics setDeleted(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics setSame(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame same) {
            this.same = same;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsSame getSame() {
            return this.same;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics setUpdated(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated extends TeaModel {
        /**
         * <p>The number of failed items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The number of skipped items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>The number of successful items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics extends TeaModel {
        /**
         * <p>The statistics on the creation results.</p>
         */
        @NameInMap("Created")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated created;

        /**
         * <p>The statistics on the deletion results.</p>
         */
        @NameInMap("Deleted")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted deleted;

        /**
         * <p>The statistics on the unchanged results.</p>
         */
        @NameInMap("Same")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame same;

        /**
         * <p>The statistics on the update results.</p>
         */
        @NameInMap("Updated")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated updated;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics setCreated(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsCreated getCreated() {
            return this.created;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics setDeleted(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics setSame(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame same) {
            this.same = same;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsSame getSame() {
            return this.same;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics setUpdated(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult extends TeaModel {
        /**
         * <p>The statistics on the agent synchronization results.</p>
         */
        @NameInMap("AgentStatistics")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics agentStatistics;

        /**
         * <p>The statistics on the asset synchronization results.</p>
         */
        @NameInMap("AssetStatistics")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics assetStatistics;

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

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult setAgentStatistics(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics agentStatistics) {
            this.agentStatistics = agentStatistics;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAgentStatistics getAgentStatistics() {
            return this.agentStatistics;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult setAssetStatistics(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics assetStatistics) {
            this.assetStatistics = assetStatistics;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResultAssetStatistics getAssetStatistics() {
            return this.assetStatistics;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs extends TeaModel {
        /**
         * <p>The description of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>No Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end time of the synchronization. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761533214</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The IDs of the synchronization targets.</p>
         * 
         * <strong>example:</strong>
         * <p>src_xxxxx</p>
         */
        @NameInMap("InventorySourceId")
        public String inventorySourceId;

        /**
         * <p>The ID of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>sync_xxxxxxx</p>
         */
        @NameInMap("InventorySynchronizationJobId")
        public String inventorySynchronizationJobId;

        /**
         * <p>The task result of the synchronization node.</p>
         */
        @NameInMap("Result")
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult result;

        /**
         * <p>The start time of the synchronization. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1761531256</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The trigger type of the synchronization.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs build(java.util.Map<String, ?> map) throws Exception {
            ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs self = new ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs();
            return TeaModel.build(map, self);
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setInventorySourceId(String inventorySourceId) {
            this.inventorySourceId = inventorySourceId;
            return this;
        }
        public String getInventorySourceId() {
            return this.inventorySourceId;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setInventorySynchronizationJobId(String inventorySynchronizationJobId) {
            this.inventorySynchronizationJobId = inventorySynchronizationJobId;
            return this;
        }
        public String getInventorySynchronizationJobId() {
            return this.inventorySynchronizationJobId;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setResult(ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult result) {
            this.result = result;
            return this;
        }
        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobsResult getResult() {
            return this.result;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInventorySynchronizationJobsResponseBodyInventorySynchronizationJobs setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
