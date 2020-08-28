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

    }

    public static class DescribePhysicalConnectionsResponsePhysicalConnectionSet extends TeaModel {
        @NameInMap("PhysicalConnectionType")
        @Validation(required = true)
        public java.util.List<DescribePhysicalConnectionsResponsePhysicalConnectionSetPhysicalConnectionType> physicalConnectionType;

        public static DescribePhysicalConnectionsResponsePhysicalConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsResponsePhysicalConnectionSet self = new DescribePhysicalConnectionsResponsePhysicalConnectionSet();
            return TeaModel.build(map, self);
        }

    }

}
