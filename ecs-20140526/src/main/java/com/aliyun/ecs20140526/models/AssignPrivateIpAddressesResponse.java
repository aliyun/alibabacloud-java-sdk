// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AssignPrivateIpAddressesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AssignedPrivateIpAddressesSet")
    @Validation(required = true)
    public AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSet assignedPrivateIpAddressesSet;

    public static AssignPrivateIpAddressesResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignPrivateIpAddressesResponse self = new AssignPrivateIpAddressesResponse();
        return TeaModel.build(map, self);
    }

    public static class AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSetPrivateIpSet extends TeaModel {
        // PrivateIpAddress
        @NameInMap("PrivateIpAddress")
        @Validation(required = true)
        public java.util.List<String> privateIpAddress;

        public static AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSetPrivateIpSet build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSetPrivateIpSet self = new AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSetPrivateIpSet();
            return TeaModel.build(map, self);
        }

    }

    public static class AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSet extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        @NameInMap("PrivateIpSet")
        @Validation(required = true)
        public AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSetPrivateIpSet privateIpSet;

        public static AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSet build(java.util.Map<String, ?> map) throws Exception {
            AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSet self = new AssignPrivateIpAddressesResponseAssignedPrivateIpAddressesSet();
            return TeaModel.build(map, self);
        }

    }

}
