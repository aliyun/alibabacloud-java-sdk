// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("ActivationList")
    public java.util.List<DescribeActivationsResponseBodyActivationList> activationList;

    public static DescribeActivationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsResponseBody self = new DescribeActivationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeActivationsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeActivationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActivationsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActivationsResponseBody setActivationList(java.util.List<DescribeActivationsResponseBodyActivationList> activationList) {
        this.activationList = activationList;
        return this;
    }
    public java.util.List<DescribeActivationsResponseBodyActivationList> getActivationList() {
        return this.activationList;
    }

    public static class DescribeActivationsResponseBodyActivationList extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("Disabled")
        public Boolean disabled;

        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        @NameInMap("ActivationId")
        public String activationId;

        public static DescribeActivationsResponseBodyActivationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationsResponseBodyActivationList self = new DescribeActivationsResponseBodyActivationList();
            return TeaModel.build(map, self);
        }

        public DescribeActivationsResponseBodyActivationList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeActivationsResponseBodyActivationList setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DescribeActivationsResponseBodyActivationList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeActivationsResponseBodyActivationList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeActivationsResponseBodyActivationList setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DescribeActivationsResponseBodyActivationList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeActivationsResponseBodyActivationList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeActivationsResponseBodyActivationList setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DescribeActivationsResponseBodyActivationList setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public DescribeActivationsResponseBodyActivationList setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

    }

}
