// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeCapacityReservationsResponseBody extends TeaModel {
    @NameInMap("CapacityReservations")
    public CapacityReservations capacityReservations;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCapacityReservationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapacityReservationsResponseBody self = new DescribeCapacityReservationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapacityReservationsResponseBody setCapacityReservations(CapacityReservations capacityReservations) {
        this.capacityReservations = capacityReservations;
        return this;
    }
    public CapacityReservations getCapacityReservations() {
        return this.capacityReservations;
    }

    public DescribeCapacityReservationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCapacityReservationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCapacityReservationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCapacityReservationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class CapacityReservation extends TeaModel {
        @NameInMap("AvailableInstanceCount")
        public Integer availableInstanceCount;

        @NameInMap("CapacityReservationId")
        public String capacityReservationId;

        @NameInMap("CapacityReservationName")
        public String capacityReservationName;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndDateType")
        public String endDateType;

        @NameInMap("InstanceMatchCriteria")
        public String instanceMatchCriteria;

        @NameInMap("InstancePlatform")
        public String instancePlatform;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TimeSlot")
        public String timeSlot;

        @NameInMap("TotalInstanceCount")
        public Integer totalInstanceCount;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CapacityReservation build(java.util.Map<String, ?> map) throws Exception {
            CapacityReservation self = new CapacityReservation();
            return TeaModel.build(map, self);
        }

        public CapacityReservation setAvailableInstanceCount(Integer availableInstanceCount) {
            this.availableInstanceCount = availableInstanceCount;
            return this;
        }
        public Integer getAvailableInstanceCount() {
            return this.availableInstanceCount;
        }

        public CapacityReservation setCapacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            return this;
        }
        public String getCapacityReservationId() {
            return this.capacityReservationId;
        }

        public CapacityReservation setCapacityReservationName(String capacityReservationName) {
            this.capacityReservationName = capacityReservationName;
            return this;
        }
        public String getCapacityReservationName() {
            return this.capacityReservationName;
        }

        public CapacityReservation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CapacityReservation setEndDateType(String endDateType) {
            this.endDateType = endDateType;
            return this;
        }
        public String getEndDateType() {
            return this.endDateType;
        }

        public CapacityReservation setInstanceMatchCriteria(String instanceMatchCriteria) {
            this.instanceMatchCriteria = instanceMatchCriteria;
            return this;
        }
        public String getInstanceMatchCriteria() {
            return this.instanceMatchCriteria;
        }

        public CapacityReservation setInstancePlatform(String instancePlatform) {
            this.instancePlatform = instancePlatform;
            return this;
        }
        public String getInstancePlatform() {
            return this.instancePlatform;
        }

        public CapacityReservation setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CapacityReservation setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public CapacityReservation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CapacityReservation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CapacityReservation setTimeSlot(String timeSlot) {
            this.timeSlot = timeSlot;
            return this;
        }
        public String getTimeSlot() {
            return this.timeSlot;
        }

        public CapacityReservation setTotalInstanceCount(Integer totalInstanceCount) {
            this.totalInstanceCount = totalInstanceCount;
            return this;
        }
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        public CapacityReservation setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CapacityReservations extends TeaModel {
        @NameInMap("CapacityReservation")
        public java.util.List<CapacityReservation> capacityReservation;

        public static CapacityReservations build(java.util.Map<String, ?> map) throws Exception {
            CapacityReservations self = new CapacityReservations();
            return TeaModel.build(map, self);
        }

        public CapacityReservations setCapacityReservation(java.util.List<CapacityReservation> capacityReservation) {
            this.capacityReservation = capacityReservation;
            return this;
        }
        public java.util.List<CapacityReservation> getCapacityReservation() {
            return this.capacityReservation;
        }

    }

}
