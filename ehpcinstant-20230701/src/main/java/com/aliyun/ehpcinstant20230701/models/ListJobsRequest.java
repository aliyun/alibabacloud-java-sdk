// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    /**
     * <p>Queries job filter conditions.</p>
     */
    @NameInMap("Filter")
    public ListJobsRequestFilter filter;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page. Default value: 50. Maximum value: 100.</p>
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

    public static class ListJobsRequestFilter extends TeaModel {
        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The job name. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>initing</li>
         * <li>Succeed</li>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>Exception</li>
         * <li>Retrying</li>
         * <li>Expired</li>
         * <li>Suspended</li>
         * <li>Restarting</li>
         * <li>Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>For jobs submitted after this time, the time in the region is converted into a UNIX timestamp (UI8).</p>
         * 
         * <strong>example:</strong>
         * <p>1703819914</p>
         */
        @NameInMap("TimeCreatedAfter")
        public Integer timeCreatedAfter;

        /**
         * <p>For jobs submitted before this time, the time in the region is converted into a Unix timestamp (for domestic sites, the UI8 region).</p>
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

        public ListJobsRequestFilter setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListJobsRequestFilter setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
         * <p>The sorting label. Valid values:</p>
         * <ul>
         * <li>time_start</li>
         * <li>job_name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>time_start</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>The sorting order. Valid values:</p>
         * <ul>
         * <li>ASC (default): ascending order</li>
         * <li>DESC: descending order</li>
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
