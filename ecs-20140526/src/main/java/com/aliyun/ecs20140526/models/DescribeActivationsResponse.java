// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeActivationsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("ActivationList")
    @Validation(required = true)
    public java.util.List<DescribeActivationsResponseActivationList> activationList;

    public static DescribeActivationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActivationsResponse self = new DescribeActivationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActivationsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeActivationsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeActivationsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeActivationsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeActivationsResponse setActivationList(java.util.List<DescribeActivationsResponseActivationList> activationList) {
        this.activationList = activationList;
        return this;
    }
    public java.util.List<DescribeActivationsResponseActivationList> getActivationList() {
        return this.activationList;
    }

    public static class DescribeActivationsResponseActivationList extends TeaModel {
        @NameInMap("ActivationId")
        @Validation(required = true)
        public String activationId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("InstanceCount")
        @Validation(required = true)
        public Integer instanceCount;

        @NameInMap("TimeToLiveInHours")
        @Validation(required = true)
        public Long timeToLiveInHours;

        @NameInMap("IpAddressRange")
        @Validation(required = true)
        public String ipAddressRange;

        @NameInMap("RegisteredCount")
        @Validation(required = true)
        public Integer registeredCount;

        @NameInMap("DeregisteredCount")
        @Validation(required = true)
        public Integer deregisteredCount;

        @NameInMap("Disabled")
        @Validation(required = true)
        public Boolean disabled;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeActivationsResponseActivationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeActivationsResponseActivationList self = new DescribeActivationsResponseActivationList();
            return TeaModel.build(map, self);
        }

        public DescribeActivationsResponseActivationList setActivationId(String activationId) {
            this.activationId = activationId;
            return this;
        }
        public String getActivationId() {
            return this.activationId;
        }

        public DescribeActivationsResponseActivationList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeActivationsResponseActivationList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeActivationsResponseActivationList setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public DescribeActivationsResponseActivationList setTimeToLiveInHours(Long timeToLiveInHours) {
            this.timeToLiveInHours = timeToLiveInHours;
            return this;
        }
        public Long getTimeToLiveInHours() {
            return this.timeToLiveInHours;
        }

        public DescribeActivationsResponseActivationList setIpAddressRange(String ipAddressRange) {
            this.ipAddressRange = ipAddressRange;
            return this;
        }
        public String getIpAddressRange() {
            return this.ipAddressRange;
        }

        public DescribeActivationsResponseActivationList setRegisteredCount(Integer registeredCount) {
            this.registeredCount = registeredCount;
            return this;
        }
        public Integer getRegisteredCount() {
            return this.registeredCount;
        }

        public DescribeActivationsResponseActivationList setDeregisteredCount(Integer deregisteredCount) {
            this.deregisteredCount = deregisteredCount;
            return this;
        }
        public Integer getDeregisteredCount() {
            return this.deregisteredCount;
        }

        public DescribeActivationsResponseActivationList setDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Boolean getDisabled() {
            return this.disabled;
        }

        public DescribeActivationsResponseActivationList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

}
