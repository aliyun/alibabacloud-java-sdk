// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetSynchronizationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SynchronizationJob")
    public GetSynchronizationJobResponseBodySynchronizationJob synchronizationJob;

    public static GetSynchronizationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSynchronizationJobResponseBody self = new GetSynchronizationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSynchronizationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSynchronizationJobResponseBody setSynchronizationJob(GetSynchronizationJobResponseBodySynchronizationJob synchronizationJob) {
        this.synchronizationJob = synchronizationJob;
        return this;
    }
    public GetSynchronizationJobResponseBodySynchronizationJob getSynchronizationJob() {
        return this.synchronizationJob;
    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated updated;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics setBinded(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsBinded getBinded() {
            return this.binded;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics setCreated(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsCreated getCreated() {
            return this.created;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics setDeleted(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics setPushed(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsPushed getPushed() {
            return this.pushed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics setSame(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame same) {
            this.same = same;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsSame getSame() {
            return this.same;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics setUpdated(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated updated;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics self = new GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics setBinded(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsBinded getBinded() {
            return this.binded;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics setCreated(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsCreated getCreated() {
            return this.created;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics setDeleted(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics setPushed(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsPushed getPushed() {
            return this.pushed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics setSame(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame same) {
            this.same = same;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsSame getSame() {
            return this.same;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics setUpdated(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated updated;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics self = new GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics setBinded(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsBinded getBinded() {
            return this.binded;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics setCreated(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsCreated getCreated() {
            return this.created;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics setDeleted(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics setPushed(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsPushed getPushed() {
            return this.pushed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics setSame(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame same) {
            this.same = same;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsSame getSame() {
            return this.same;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics setUpdated(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated extends TeaModel {
        /**
         * <p>失败数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>跳过数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Skipped")
        public Long skipped;

        /**
         * <p>成功数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Success")
        public Long success;

        /**
         * <p>总共数目</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated setSuccess(Long success) {
            this.success = success;
            return this;
        }
        public Long getSuccess() {
            return this.success;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics extends TeaModel {
        /**
         * <p>绑定结果统计</p>
         */
        @NameInMap("Binded")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded binded;

        /**
         * <p>创建结果统计</p>
         */
        @NameInMap("Created")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated created;

        /**
         * <p>删除结果统计</p>
         */
        @NameInMap("Deleted")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted deleted;

        /**
         * <p>推送结果统计</p>
         */
        @NameInMap("Pushed")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed pushed;

        /**
         * <p>相同结果统计</p>
         */
        @NameInMap("Same")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame same;

        /**
         * <p>更新结果统计</p>
         */
        @NameInMap("Updated")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated updated;

        public static GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics self = new GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics setBinded(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded binded) {
            this.binded = binded;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsBinded getBinded() {
            return this.binded;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics setCreated(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated created) {
            this.created = created;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsCreated getCreated() {
            return this.created;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics setDeleted(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted deleted) {
            this.deleted = deleted;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsDeleted getDeleted() {
            return this.deleted;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics setPushed(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed pushed) {
            this.pushed = pushed;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsPushed getPushed() {
            return this.pushed;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics setSame(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame same) {
            this.same = same;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsSame getSame() {
            return this.same;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics setUpdated(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated updated) {
            this.updated = updated;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatisticsUpdated getUpdated() {
            return this.updated;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJobResult extends TeaModel {
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
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics groupMemberStatistics;

        /**
         * <p>组同步结果统计</p>
         */
        @NameInMap("GroupStatistics")
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics groupStatistics;

        /**
         * <p>组织同步结果统计</p>
         */
        @NameInMap("OrganizationalUnitStatistics")
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics organizationalUnitStatistics;

        /**
         * <p>用户同步结果统计</p>
         */
        @NameInMap("UserStatistics")
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics userStatistics;

        public static GetSynchronizationJobResponseBodySynchronizationJobResult build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJobResult self = new GetSynchronizationJobResponseBodySynchronizationJobResult();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResult setGroupMemberStatistics(GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics groupMemberStatistics) {
            this.groupMemberStatistics = groupMemberStatistics;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupMemberStatistics getGroupMemberStatistics() {
            return this.groupMemberStatistics;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResult setGroupStatistics(GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics groupStatistics) {
            this.groupStatistics = groupStatistics;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultGroupStatistics getGroupStatistics() {
            return this.groupStatistics;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResult setOrganizationalUnitStatistics(GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics organizationalUnitStatistics) {
            this.organizationalUnitStatistics = organizationalUnitStatistics;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultOrganizationalUnitStatistics getOrganizationalUnitStatistics() {
            return this.organizationalUnitStatistics;
        }

        public GetSynchronizationJobResponseBodySynchronizationJobResult setUserStatistics(GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics userStatistics) {
            this.userStatistics = userStatistics;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResultUserStatistics getUserStatistics() {
            return this.userStatistics;
        }

    }

    public static class GetSynchronizationJobResponseBodySynchronizationJob extends TeaModel {
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
        public GetSynchronizationJobResponseBodySynchronizationJobResult result;

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
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>同步任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>sync_0000347vjovtcf41li0fgsd98gn24q9nj9xxxxx</p>
         */
        @NameInMap("SynchronizationJobId")
        public String synchronizationJobId;

        /**
         * <p>同步目标ID</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3nxxxxx</p>
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

        public static GetSynchronizationJobResponseBodySynchronizationJob build(java.util.Map<String, ?> map) throws Exception {
            GetSynchronizationJobResponseBodySynchronizationJob self = new GetSynchronizationJobResponseBodySynchronizationJob();
            return TeaModel.build(map, self);
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setResult(GetSynchronizationJobResponseBodySynchronizationJobResult result) {
            this.result = result;
            return this;
        }
        public GetSynchronizationJobResponseBodySynchronizationJobResult getResult() {
            return this.result;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setSynchronizationJobId(String synchronizationJobId) {
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetSynchronizationJobResponseBodySynchronizationJob setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
