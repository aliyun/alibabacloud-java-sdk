// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>The filter conditions for querying jobs.</p>
     */
    @NameInMap("Filter")
    public ListJobsRequestFilter filter;

    /**
     * <p>The current page number.</p>
     * <p>Start value: 1</p>
     * <p>Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 50. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting method.</p>
     */
    @NameInMap("SortBy")
    public ListJobsRequestSortBy sortBy;

    public static ListJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsRequest self = new ListJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsRequest setFilter(ListJobsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public ListJobsRequestFilter getFilter() {
        return this.filter;
    }

    public ListJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobsRequest setSortBy(ListJobsRequestSortBy sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public ListJobsRequestSortBy getSortBy() {
        return this.sortBy;
    }

    public static class ListJobsRequestFilterTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListJobsRequestFilterTag build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestFilterTag self = new ListJobsRequestFilterTag();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestFilterTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobsRequestFilterTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListJobsRequestFilter extends TeaModel {
        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobIds")
        public java.util.List<String> jobIds;

        /**
         * <p>The name of the job. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>jt-xxxx</p>
         */
        @NameInMap("JobTemplateId")
        public String jobTemplateId;

        /**
         * <strong>example:</strong>
         * <p>MyPool</p>
         */
        @NameInMap("PoolName")
        public String poolName;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><p>Pending: The job is in the queue.</p>
         * </li>
         * <li><p>Initing: The job is initializing.</p>
         * </li>
         * <li><p>Succeeded: The job was successful.</p>
         * </li>
         * <li><p>Failed: The job failed.</p>
         * </li>
         * <li><p>Running: The job is running.</p>
         * </li>
         * <li><p>Exception: A scheduling exception occurred.</p>
         * </li>
         * <li><p>Retrying: The job is being retried.</p>
         * </li>
         * <li><p>Expired: The job timed out.</p>
         * </li>
         * <li><p>Suspended: The job is in hibernation.</p>
         * </li>
         * <li><p>Restarting: The job is restarting.</p>
         * </li>
         * <li><p>Deleted: The job is deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public java.util.List<ListJobsRequestFilterTag> tag;

        /**
         * <p>The time after which the jobs were submitted. This is a UNIX timestamp based on the local time of the region. For sites in the Chinese mainland, the time zone is UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>1703819914</p>
         */
        @NameInMap("TimeCreatedAfter")
        public Integer timeCreatedAfter;

        /**
         * <p>The time before which the jobs were submitted. This is a UNIX timestamp based on the local time of the region. For sites in the Chinese mainland, the time zone is UTC+8.</p>
         * 
         * <strong>example:</strong>
         * <p>1703820113</p>
         */
        @NameInMap("TimeCreatedBefore")
        public Integer timeCreatedBefore;

        public static ListJobsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestFilter self = new ListJobsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestFilter setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobsRequestFilter setJobIds(java.util.List<String> jobIds) {
            this.jobIds = jobIds;
            return this;
        }
        public java.util.List<String> getJobIds() {
            return this.jobIds;
        }

        public ListJobsRequestFilter setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobsRequestFilter setJobTemplateId(String jobTemplateId) {
            this.jobTemplateId = jobTemplateId;
            return this;
        }
        public String getJobTemplateId() {
            return this.jobTemplateId;
        }

        public ListJobsRequestFilter setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public ListJobsRequestFilter setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobsRequestFilter setTag(java.util.List<ListJobsRequestFilterTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListJobsRequestFilterTag> getTag() {
            return this.tag;
        }

        public ListJobsRequestFilter setTimeCreatedAfter(Integer timeCreatedAfter) {
            this.timeCreatedAfter = timeCreatedAfter;
            return this;
        }
        public Integer getTimeCreatedAfter() {
            return this.timeCreatedAfter;
        }

        public ListJobsRequestFilter setTimeCreatedBefore(Integer timeCreatedBefore) {
            this.timeCreatedBefore = timeCreatedBefore;
            return this;
        }
        public Integer getTimeCreatedBefore() {
            return this.timeCreatedBefore;
        }

    }

    public static class ListJobsRequestSortBy extends TeaModel {
        /**
         * <p>The field to sort by. Valid values:</p>
         * <ul>
         * <li><p>time_start</p>
         * </li>
         * <li><p>job_name</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>time_start</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p>ASC (default): Ascending</p>
         * </li>
         * <li><p>DESC: Descending</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        @NameInMap("Order")
        public String order;

        public static ListJobsRequestSortBy build(java.util.Map<String, ?> map) throws Exception {
            ListJobsRequestSortBy self = new ListJobsRequestSortBy();
            return TeaModel.build(map, self);
        }

        public ListJobsRequestSortBy setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ListJobsRequestSortBy setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

    }

}
