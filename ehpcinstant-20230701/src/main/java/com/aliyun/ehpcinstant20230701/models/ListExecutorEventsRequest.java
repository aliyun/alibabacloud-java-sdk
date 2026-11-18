// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListExecutorEventsRequest extends TeaModel {
    /**
     * <p>The filter conditions for querying executors.</p>
     */
    @NameInMap("Filter")
    public ListExecutorEventsRequestFilter filter;

    /**
     * <p>The page number. Starting value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The paging Settings for the number of entries per page in a paged query. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListExecutorEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorEventsRequest self = new ListExecutorEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutorEventsRequest setFilter(ListExecutorEventsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public ListExecutorEventsRequestFilter getFilter() {
        return this.filter;
    }

    public ListExecutorEventsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorEventsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListExecutorEventsRequestFilter extends TeaModel {
        /**
         * <p>The list of executor IDs. You can specify up to 100 IDs.</p>
         */
        @NameInMap("ExecutorIds")
        public java.util.List<String> executorIds;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The level of the runtime event. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * <li>Error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The start time of the events. Events that occur after this time are returned. The time must be a UNIX timestamp based on the time zone of the region (UTC+8 for the Chinese site).</p>
         * 
         * <strong>example:</strong>
         * <p>1703820113</p>
         */
        @NameInMap("TimeAfter")
        public Long timeAfter;

        /**
         * <p>The end time of the events. Events that occur before this time are returned. The time must be a UNIX timestamp based on the time zone of the region (UTC+8 for the Chinese site).</p>
         * 
         * <strong>example:</strong>
         * <p>1703819914</p>
         */
        @NameInMap("TimeBefore")
        public Long timeBefore;

        public static ListExecutorEventsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorEventsRequestFilter self = new ListExecutorEventsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListExecutorEventsRequestFilter setExecutorIds(java.util.List<String> executorIds) {
            this.executorIds = executorIds;
            return this;
        }
        public java.util.List<String> getExecutorIds() {
            return this.executorIds;
        }

        public ListExecutorEventsRequestFilter setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListExecutorEventsRequestFilter setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListExecutorEventsRequestFilter setTimeAfter(Long timeAfter) {
            this.timeAfter = timeAfter;
            return this;
        }
        public Long getTimeAfter() {
            return this.timeAfter;
        }

        public ListExecutorEventsRequestFilter setTimeBefore(Long timeBefore) {
            this.timeBefore = timeBefore;
            return this;
        }
        public Long getTimeBefore() {
            return this.timeBefore;
        }

    }

}
