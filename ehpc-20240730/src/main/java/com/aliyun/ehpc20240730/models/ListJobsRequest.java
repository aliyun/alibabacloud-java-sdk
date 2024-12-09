// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-csbua72***</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The job filter information.</p>
     */
    @NameInMap("JobFilter")
    public ListJobsRequestJobFilter jobFilter;

    /**
     * <p>The page number of the page to return.</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <ul>
     * <li>Maximum value: 50.</li>
     * <li>Default value: 10</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListJobsRequest setJobFilter(ListJobsRequestJobFilter jobFilter) {
        this.jobFilter = jobFilter;
        return this;
    }
    public ListJobsRequestJobFilter getJobFilter() {
        return this.jobFilter;
    }

    public ListJobsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public static class ListJobsRequestJobFilterDiagnosis extends TeaModel {
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Option")
        public String option;

        @NameInMap("Threshold")
        public String threshold;

        public static ListJobsRequestJobFilterDiagnosis build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestJobFilterDiagnosis self = new ListJobsRequestJobFilterDiagnosis();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestJobFilterDiagnosis setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListJobsRequestJobFilterDiagnosis setOption(String option) {
            this.option = option;
            return this;
        }
        public String getOption() {
            return this.option;
        }

        public ListJobsRequestJobFilterDiagnosis setThreshold(String threshold) {
            this.threshold = threshold;
            return this;
        }
        public String getThreshold() {
            return this.threshold;
        }

    }

    public static class ListJobsRequestJobFilterSortBy extends TeaModel {
        /**
         * <p>The order in which jobs are sorted based on their execution time. Valid values:</p>
         * <ul>
         * <li>asc: in ascending order.</li>
         * <li>desc: in descending order.</li>
         * </ul>
         * <p>Default value: desc.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("ExecuteOrder")
        public String executeOrder;

        /**
         * <p>The order in which jobs are sorted based on their queuing time. Valid values:</p>
         * <ul>
         * <li>asc: in ascending order.</li>
         * <li>desc: in descending order.</li>
         * </ul>
         * <p>Default value: desc.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("PendOrder")
        public String pendOrder;

        /**
         * <p>The order in which jobs are sorted based on their submitting time. Valid values:</p>
         * <ul>
         * <li>asc: in ascending order.</li>
         * <li>desc: in descending order.</li>
         * </ul>
         * <p>Default value: desc.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("SubmitOrder")
        public String submitOrder;

        public static ListJobsRequestJobFilterSortBy build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestJobFilterSortBy self = new ListJobsRequestJobFilterSortBy();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestJobFilterSortBy setExecuteOrder(String executeOrder) {
            this.executeOrder = executeOrder;
            return this;
        }
        public String getExecuteOrder() {
            return this.executeOrder;
        }

        public ListJobsRequestJobFilterSortBy setPendOrder(String pendOrder) {
            this.pendOrder = pendOrder;
            return this;
        }
        public String getPendOrder() {
            return this.pendOrder;
        }

        public ListJobsRequestJobFilterSortBy setSubmitOrder(String submitOrder) {
            this.submitOrder = submitOrder;
            return this;
        }
        public String getSubmitOrder() {
            return this.submitOrder;
        }

    }

    public static class ListJobsRequestJobFilter extends TeaModel {
        /**
         * <p>The time when the job was last updated. The value is a UNIX timestamp representing the number of seconds that have elapsed since 1970-01-01T00:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>1724123085</p>
         */
        @NameInMap("CreateTimeEnd")
        public String createTimeEnd;

        /**
         * <p>The time when the job started. The value is a UNIX timestamp representing the number of seconds that have elapsed since 1970-01-01T00:00:00Z.</p>
         * 
         * <strong>example:</strong>
         * <p>1724122486</p>
         */
        @NameInMap("CreateTimeStart")
        public String createTimeStart;

        @NameInMap("Diagnosis")
        public java.util.List<ListJobsRequestJobFilterDiagnosis> diagnosis;

        /**
         * <p>The job name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testjob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The job state. Valid values:</p>
         * <ul>
         * <li>all: returns all jobs.</li>
         * <li>finished: returns completed jobs.</li>
         * <li>notfinish: returns uncompleted jobs.</li>
         * </ul>
         * <p>Default value: all.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The compute nodes that run the jobs.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<String> nodes;

        /**
         * <p>The queues to which the jobs belong.</p>
         */
        @NameInMap("Queues")
        public java.util.List<String> queues;

        /**
         * <p>The result sorting configurations.</p>
         */
        @NameInMap("SortBy")
        public ListJobsRequestJobFilterSortBy sortBy;

        /**
         * <p>The users that run the jobs.</p>
         */
        @NameInMap("Users")
        public java.util.List<String> users;

        public static ListJobsRequestJobFilter build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestJobFilter self = new ListJobsRequestJobFilter();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestJobFilter setCreateTimeEnd(String createTimeEnd) {
            this.createTimeEnd = createTimeEnd;
            return this;
        }
        public String getCreateTimeEnd() {
            return this.createTimeEnd;
        }

        public ListJobsRequestJobFilter setCreateTimeStart(String createTimeStart) {
            this.createTimeStart = createTimeStart;
            return this;
        }
        public String getCreateTimeStart() {
            return this.createTimeStart;
        }

        public ListJobsRequestJobFilter setDiagnosis(java.util.List<ListJobsRequestJobFilterDiagnosis> diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }
        public java.util.List<ListJobsRequestJobFilterDiagnosis> getDiagnosis() {
            return this.diagnosis;
        }

        public ListJobsRequestJobFilter setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobsRequestJobFilter setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public ListJobsRequestJobFilter setNodes(java.util.List<String> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<String> getNodes() {
            return this.nodes;
        }

        public ListJobsRequestJobFilter setQueues(java.util.List<String> queues) {
            this.queues = queues;
            return this;
        }
        public java.util.List<String> getQueues() {
            return this.queues;
        }

        public ListJobsRequestJobFilter setSortBy(ListJobsRequestJobFilterSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }
        public ListJobsRequestJobFilterSortBy getSortBy() {
            return this.sortBy;
        }

        public ListJobsRequestJobFilter setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }
        public java.util.List<String> getUsers() {
            return this.users;
        }

    }

}
