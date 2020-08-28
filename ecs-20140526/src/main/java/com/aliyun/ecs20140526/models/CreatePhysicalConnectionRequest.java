// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AccessPointId")
    @Validation(required = true)
    public String accessPointId;

    @NameInMap("Type")
    public String type;

    @NameInMap("LineOperator")
    @Validation(required = true)
    public String lineOperator;

    @NameInMap("bandwidth")
    public Integer bandwidth;

    @NameInMap("PeerLocation")
    @Validation(required = true)
    public String peerLocation;

    @NameInMap("PortType")
    public String portType;

    @NameInMap("RedundantPhysicalConnectionId")
    public String redundantPhysicalConnectionId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("CircuitCode")
    public String circuitCode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("UserCidr")
    public String userCidr;

    public static CreatePhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionRequest self = new CreatePhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

}
