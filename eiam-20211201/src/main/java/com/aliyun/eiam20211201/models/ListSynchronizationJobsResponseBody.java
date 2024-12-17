// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListSynchronizationJobsResponseBody extends TeaModel {
    /**
     * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynchronizationJobs")
    public java.util.List<ListSynchronizationJobsResponseBodySynchronizationJobs> synchronizationJobs;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSynchronizationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSynchronizationJobsResponseBody self = new ListSynchronizationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSynchronizationJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSynchronizationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSynchronizationJobsResponseBody setSynchronizationJobs(java.util.List<ListSynchronizationJobsResponseBodySynchronizationJobs> synchronizationJobs) {
        this.synchronizationJobs = synchronizationJobs;
        return this;
    }
    public java.util.List<ListSynchronizationJobsResponseBodySynchronizationJobs> getSynchronizationJobs() {
        return this.synchronizationJobs;
    }

    public ListSynchronizationJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated updated;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics setBinded(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsBinded getBinded() {
            return this.binded;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics setCreated(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsCreated getCreated() {
            return this.created;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics setDeleted(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics setPushed(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsPushed getPushed() {
            return this.pushed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics setSame(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame same) {
            this.same = same;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsSame getSame() {
            return this.same;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics setUpdated(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated updated;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics setBinded(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsBinded getBinded() {
            return this.binded;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics setCreated(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsCreated getCreated() {
            return this.created;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics setDeleted(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics setPushed(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsPushed getPushed() {
            return this.pushed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics setSame(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame same) {
            this.same = same;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsSame getSame() {
            return this.same;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics setUpdated(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated updated;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics setBinded(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsBinded getBinded() {
            return this.binded;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics setCreated(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsCreated getCreated() {
            return this.created;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics setDeleted(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics setPushed(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsPushed getPushed() {
            return this.pushed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics setSame(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame same) {
            this.same = same;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsSame getSame() {
            return this.same;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics setUpdated(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported extends TeaModel {
        @NameInMap("Failed")
        public Long failed;

        @NameInMap("Skipped")
        public Long skipped;

        @NameInMap("Success")
        public Long success;

        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Total")
        public Long total;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted deleted;

        @NameInMap("Exported")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported exported;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated updated;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics self = new ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setBinded(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsBinded getBinded() {
            return this.binded;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setCreated(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsCreated getCreated() {
            return this.created;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setDeleted(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setExported(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported exported) {
            this.exported = exported;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsExported getExported() {
            return this.exported;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setPushed(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsPushed getPushed() {
            return this.pushed;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setSame(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame same) {
            this.same = same;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsSame getSame() {
            return this.same;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics setUpdated(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobsResult extends TeaModel {
        /**
         * <p>同步结果错误码</p>
         * 
         * <strong>example:</strong>
         * <p>ErrorCodeNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>同步结果错误信息描述</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>组成员同步结果统计</p>
         */
        @NameInMap("GroupMemberStatistics")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics groupMemberStatistics;

        /**
         * <p>组同步结果统计</p>
         */
        @NameInMap("GroupStatistics")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics groupStatistics;

        /**
         * <p>组织同步结果统计</p>
         */
        @NameInMap("OrganizationalUnitStatistics")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics organizationalUnitStatistics;

        /**
         * <p>用户同步结果统计</p>
         */
        @NameInMap("UserStatistics")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics userStatistics;

        public static ListSynchronizationJobsResponseBodySynchronizationJobsResult build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobsResult self = new ListSynchronizationJobsResponseBodySynchronizationJobsResult();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResult setGroupMemberStatistics(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics groupMemberStatistics) {
            this.groupMemberStatistics = groupMemberStatistics;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupMemberStatistics getGroupMemberStatistics() {
            return this.groupMemberStatistics;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResult setGroupStatistics(ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics groupStatistics) {
            this.groupStatistics = groupStatistics;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultGroupStatistics getGroupStatistics() {
            return this.groupStatistics;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResult setOrganizationalUnitStatistics(ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics organizationalUnitStatistics) {
            this.organizationalUnitStatistics = organizationalUnitStatistics;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultOrganizationalUnitStatistics getOrganizationalUnitStatistics() {
            return this.organizationalUnitStatistics;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobsResult setUserStatistics(ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics userStatistics) {
            this.userStatistics = userStatistics;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResultUserStatistics getUserStatistics() {
            return this.userStatistics;
        }

    }

    public static class ListSynchronizationJobsResponseBodySynchronizationJobs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>同步任务方向</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>同步结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>同步任务结果</p>
         */
        @NameInMap("Result")
        public ListSynchronizationJobsResponseBodySynchronizationJobsResult result;

        /**
         * <p>同步开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>同步任务状态</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>同步任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>sync_0000347vjovtcf41li0fgsd98gn24q9njxxxxx</p>
         */
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        /**
         * <p>同步目标ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>同步目标类型</p>
         * 
         * <strong>example:</strong>
         * <p>identity_provider</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>同步触发类型</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        public static ListSynchronizationJobsResponseBodySynchronizationJobs build(java.util.Map<String, ?> map) throws Exception {
            ListSynchronizationJobsResponseBodySynchronizationJobs self = new ListSynchronizationJobsResponseBodySynchronizationJobs();
            return TeaModel.build(map, self);
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setResult(ListSynchronizationJobsResponseBodySynchronizationJobsResult result) {
            this.result = result;
            return this;
        }
        public ListSynchronizationJobsResponseBodySynchronizationJobsResult getResult() {
            return this.result;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListSynchronizationJobsResponseBodySynchronizationJobs setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
