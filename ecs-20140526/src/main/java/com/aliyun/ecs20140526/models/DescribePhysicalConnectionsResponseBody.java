// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    @NameInMap("PhysicalConnectionSet")
    public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet> physicalConnectionSet;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribePhysicalConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponseBody self = new DescribePhysicalConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponseBody setPhysicalConnectionSet(java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet> physicalConnectionSet) {
        this.physicalConnectionSet = physicalConnectionSet;
        return this;
    }
    public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet> getPhysicalConnectionSet() {
        return this.physicalConnectionSet;
    }

    public DescribePhysicalConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePhysicalConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhysicalConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("AdLocation")
        public String adLocation;

        @NameInMap("PortNumber")
        public String portNumber;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("Description")
        public String description;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("PortType")
        public String portType;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("EnabledTime")
        public String enabledTime;

        @NameInMap("LineOperator")
        public String lineOperator;

        @NameInMap("Name")
        public String name;

        @NameInMap("RedundantPhysicalConnectionId")
        public String redundantPhysicalConnectionId;

        @NameInMap("PeerLocation")
        public String peerLocation;

        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("PhysicalConnectionId")
        public String physicalConnectionId;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

    }

}
