// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsResponseBody extends TeaModel {
    // Details of the activation codes and their usage information.
    @NameInMap("ActivationList")
    public java.util.List<DescribeActivationsResponseBodyActivationList> activationList;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeActivationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsResponseBody self = new DescribeActivationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsResponseBody setActivationList(java.util.List<DescribeActivationsResponseBodyActivationList> activationList) {
        this.activationList = activationList;
        return this;
    }
    public java.util.List<DescribeActivationsResponseBodyActivationList> getActivationList() {
        return this.activationList;
    }

    public DescribeActivationsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
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

    public DescribeActivationsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeActivationsResponseBodyActivationList extends TeaModel {
        // The ID of the activation code.
        @NameInMap("ActivationId")
        public String activationId;

        // The time when the activation code was created.
        @NameInMap("CreationTime")
        public String creationTime;

        // The number of instances that were deregistered.
        @NameInMap("DeregisteredCount")
        public Integer deregisteredCount;

        // The description of the activation code.
        @NameInMap("Description")
        public String description;

        // Indicates whether the activation code is disabled.
        @NameInMap("Disabled")
        public Boolean disabled;

        // The maximum number of times that the activation code can be used to register managed instances.
        @NameInMap("InstanceCount")
        public Integer instanceCount;

        // The default instance name prefix.
        @NameInMap("InstanceName")
        public String instanceName;

        // The IP addresses of hosts that are allowed to use the activation code.
        @NameInMap("IpAddressRange")
        public String ipAddressRange;

        // The number of instances that were registered.
        @NameInMap("RegisteredCount")
        public Integer registeredCount;

        // The validity period of the activation code. Unit: hours.
        @NameInMap("TimeToLiveInHours")
        public Long timeToLiveInHours;

        public static DescribeActivationsResponseBodyActivationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationsResponseBodyActivationList self = new DescribeActivationsResponseBodyActivationList();
            return TeaModel.build(map, self);
        }

        public DescribeActivationsResponseBodyActivationList setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
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

        public DescribeActivationsResponseBodyActivationList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeActivationsResponseBodyActivationList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeActivationsResponseBodyActivationList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeActivationsResponseBodyActivationList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeActivationsResponseBodyActivationList setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DescribeActivationsResponseBodyActivationList setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DescribeActivationsResponseBodyActivationList setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

    }

}
