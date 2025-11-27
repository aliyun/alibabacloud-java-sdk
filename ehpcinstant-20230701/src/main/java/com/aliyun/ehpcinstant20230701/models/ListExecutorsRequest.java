// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListExecutorsRequest extends TeaModel {
    /**
     * <p>Queries the Executor filter conditions.</p>
     */
    @NameInMap("Filter")
    public ListExecutorsRequestFilter filter;

    /**
     * <p>The current page number.\
     * Starting value: 1\
     * Default value: 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The number of entries returned per page. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    public ListExecutorsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class ListExecutorsRequestFilter extends TeaModel {
        /**
         * <p>The list of executor IDs. A maximum of 100 IDs are supported.</p>
         */
        @NameInMap("ExecutorIds")
        public java.util.List<String> executorIds;

        /**
         * <p>Executor image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-f8z0dfa96luxxxxx</p>
         */
        @NameInMap("Image")
        public String image;

        /**
         * <p>The list of internal IP addresses. A maximum of 100 IP addresses are supported.</p>
         */
        @NameInMap("IpAddresses")
        public java.util.List<String> ipAddresses;

        /**
         * <p>The job name. Exact filtering. Fuzzy query is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>testJob</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <p>Executor status list.</p>
         */
        @NameInMap("Status")
        public java.util.List<String> status;

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

        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-xxx</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

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

        public ListExecutorsRequestFilter setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
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

        public ListExecutorsRequestFilter setStatus(java.util.List<String> status) {
            this.status = status;
            return this;
        }
        public java.util.List<String> getStatus() {
            return this.status;
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

        public ListExecutorsRequestFilter setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public ListExecutorsRequestFilter setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

}
