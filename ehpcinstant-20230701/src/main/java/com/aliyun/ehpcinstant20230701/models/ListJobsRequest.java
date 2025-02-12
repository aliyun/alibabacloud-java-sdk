// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListJobsRequest extends TeaModel {
    @NameInMap("Filter")
    public ListJobsRequestFilter filter;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1703819914</p>
         */
        @NameInMap("TimeCreatedAfter")
        public Integer timeCreatedAfter;

        /**
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
         * <strong>example:</strong>
         * <p>time_start</p>
         */
        @NameInMap("Label")
        public String label;

        /**
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
