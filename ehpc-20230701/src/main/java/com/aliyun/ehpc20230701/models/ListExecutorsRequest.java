// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsRequest extends TeaModel {
    @NameInMap("Filter")
    public ListExecutorsRequestFilter filter;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static ListExecutorsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorsRequest self = new ListExecutorsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutorsRequest setFilter(ListExecutorsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public ListExecutorsRequestFilter getFilter() {
        return this.filter;
    }

    public ListExecutorsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public static class ListExecutorsRequestFilter extends TeaModel {
        @NameInMap("ExecutorIds")
        public java.util.List<String> executorIds;

        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("TimeCreatedAfter")
        public Integer timeCreatedAfter;

        @NameInMap("TimeCreatedBefore")
        public Integer timeCreatedBefore;

        public static ListExecutorsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorsRequestFilter self = new ListExecutorsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListExecutorsRequestFilter setExecutorIds(java.util.List<String> executorIds) {
            this.executorIds = executorIds;
            return this;
        }
        public java.util.List<String> getExecutorIds() {
            return this.executorIds;
        }

        public ListExecutorsRequestFilter setIpAddresses(java.util.List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public java.util.List<String> getIpAddresses() {
            return this.ipAddresses;
        }

        public ListExecutorsRequestFilter setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListExecutorsRequestFilter setTimeCreatedAfter(Integer timeCreatedAfter) {
            this.timeCreatedAfter = timeCreatedAfter;
            return this;
        }
        public Integer getTimeCreatedAfter() {
            return this.timeCreatedAfter;
        }

        public ListExecutorsRequestFilter setTimeCreatedBefore(Integer timeCreatedBefore) {
            this.timeCreatedBefore = timeCreatedBefore;
            return this;
        }
        public Integer getTimeCreatedBefore() {
            return this.timeCreatedBefore;
        }

    }

}
