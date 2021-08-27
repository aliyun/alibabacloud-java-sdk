// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PhysicalConnectionSet")
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet;

    public static DescribePhysicalConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponseBody self = new DescribePhysicalConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhysicalConnectionsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePhysicalConnectionsResponseBody setPhysicalConnectionSet(DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet physicalConnectionSet) {
        this.physicalConnectionSet = physicalConnectionSet;
        return this;
    }
    public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet getPhysicalConnectionSet() {
        return this.physicalConnectionSet;
    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType extends TeaModel {
        @NameInMap("AdLocation")
        public String adLocation;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("PortNumber")
        public String portNumber;

        @NameInMap("CircuitCode")
        public String circuitCode;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Bandwidth")
        public Long bandwidth;

        @NameInMap("Description")
        public String description;

        @NameInMap("PortType")
        public String portType;

        @NameInMap("EnabledTime")
        public String enabledTime;

        @NameInMap("BusinessStatus")
        public String businessStatus;

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

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

    }

    public static class DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> physicalConnectionType;

        public static DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet self = new DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponseBodyPhysicalConnectionSet setPhysicalConnectionType(java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> physicalConnectionType) {
            this.physicalConnectionType = physicalConnectionType;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionsResponseBodyPhysicalConnectionSetPhysicalConnectionType> getPhysicalConnectionType() {
            return this.physicalConnectionType;
        }

    }

}
