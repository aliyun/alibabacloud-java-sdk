// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeResourceDLinkResponseBody extends TeaModel {
    // 已打通直连的副VSwitch ID
    @NameInMap("AuxVSwitchList")
    public java.util.List<String> auxVSwitchList;

    // 要打通的客户端的网段信息，会将该网段加入到服务端的回包路由中，与VSwitchIdList可二选一
    @NameInMap("DestinationCIDRs")
    public String destinationCIDRs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 已打通直连的主VSwitch ID
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // 已打通直接的Vpc ID
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeResourceDLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDLinkResponseBody self = new DescribeResourceDLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDLinkResponseBody setAuxVSwitchList(java.util.List<String> auxVSwitchList) {
        this.auxVSwitchList = auxVSwitchList;
        return this;
    }
    public java.util.List<String> getAuxVSwitchList() {
        return this.auxVSwitchList;
    }

    public DescribeResourceDLinkResponseBody setDestinationCIDRs(String destinationCIDRs) {
        this.destinationCIDRs = destinationCIDRs;
        return this;
    }
    public String getDestinationCIDRs() {
        return this.destinationCIDRs;
    }

    public DescribeResourceDLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceDLinkResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeResourceDLinkResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
