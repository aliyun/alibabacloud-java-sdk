// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PhysicalConnectionSet")
    @Validation(required = true)
    public DescribePhysicalConnectionsResponsePhysicalConnectionSet physicalConnectionSet;

    public static DescribePhysicalConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsResponse self = new DescribePhysicalConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePhysicalConnectionsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePhysicalConnectionsResponse setPhysicalConnectionSet(DescribePhysicalConnectionsResponsePhysicalConnectionSet physicalConnectionSet) {
        this.physicalConnectionSet = physicalConnectionSet;
        return this;
    }
    public DescribePhysicalConnectionsResponsePhysicalConnectionSet getPhysicalConnectionSet() {
        return this.physicalConnectionSet;
    }

    public static class DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType extends TeaModel {
        @NameInMap("PhysicalConnectionId")
        @Validation(required = true)
        public String physicalConnectionId;

        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("EnabledTime")
        @Validation(required = true)
        public String enabledTime;

        @NameInMap("LineOperator")
        @Validation(required = true)
        public String lineOperator;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("PeerLocation")
        @Validation(required = true)
        public String peerLocation;

        @NameInMap("PortType")
        @Validation(required = true)
        public String portType;

        @NameInMap("RedundantPhysicalConnectionId")
        @Validation(required = true)
        public String redundantPhysicalConnectionId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("AdLocation")
        @Validation(required = true)
        public String adLocation;

        @NameInMap("PortNumber")
        @Validation(required = true)
        public String portNumber;

        @NameInMap("CircuitCode")
        @Validation(required = true)
        public String circuitCode;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Long bandwidth;

        public static DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType self = new DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setPhysicalConnectionId(String physicalConnectionId) {
            this.physicalConnectionId = physicalConnectionId;
            return this;
        }
        public String getPhysicalConnectionId() {
            return this.physicalConnectionId;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setEnabledTime(String enabledTime) {
            this.enabledTime = enabledTime;
            return this;
        }
        public String getEnabledTime() {
            return this.enabledTime;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setPeerLocation(String peerLocation) {
            this.peerLocation = peerLocation;
            return this;
        }
        public String getPeerLocation() {
            return this.peerLocation;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
            this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
            return this;
        }
        public String getRedundantPhysicalConnectionId() {
            return this.redundantPhysicalConnectionId;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setAdLocation(String adLocation) {
            this.adLocation = adLocation;
            return this;
        }
        public String getAdLocation() {
            return this.adLocation;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setPortNumber(String portNumber) {
            this.portNumber = portNumber;
            return this;
        }
        public String getPortNumber() {
            return this.portNumber;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setCircuitCode(String circuitCode) {
            this.circuitCode = circuitCode;
            return this;
        }
        public String getCircuitCode() {
            return this.circuitCode;
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType setBandwidth(Long bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Long getBandwidth() {
            return this.bandwidth;
        }

    }

    public static class DescribePhysicalConnectionsResponsePhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        @Validation(required = true)
        public java.util.List<DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType> physicalConnectionType;

        public static DescribePhysicalConnectionsResponsePhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponsePhysicalConnectionSet self = new DescribePhysicalConnectionsResponsePhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsResponsePhysicalConnectionSet setPhysicalConnectionType(java.util.List<DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType> physicalConnectionType) {
            this.physicalConnectionType = physicalConnectionType;
            return this;
        }
        public java.util.List<DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType> getPhysicalConnectionType() {
            return this.physicalConnectionType;
        }

    }

}
