// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceDLinkRequest extends TeaModel {
    // 要打通的客户端的网段信息，会将该网段加入到服务端的回包路由中，与VSwitchIdList可二选一
    @NameInMap("DestinationCIDRs")
    public String destinationCIDRs;

    // 客户端ECS归属的安全组
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    // 对端的主VSwitchID，会在该vswitch中创建ENI
    @NameInMap("VSwitchId")
    public String vSwitchId;

    // 要打通的客户端的vswitch列表，会将这些vswitch对应的网段加入到服务端的回包路由中
    @NameInMap("VSwitchIdList")
    public java.util.List<String> vSwitchIdList;

    public static UpdateResourceDLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceDLinkRequest self = new UpdateResourceDLinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceDLinkRequest setDestinationCIDRs(String destinationCIDRs) {
        this.destinationCIDRs = destinationCIDRs;
        return this;
    }
    public String getDestinationCIDRs() {
        return this.destinationCIDRs;
    }

    public UpdateResourceDLinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public UpdateResourceDLinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public UpdateResourceDLinkRequest setVSwitchIdList(java.util.List<String> vSwitchIdList) {
        this.vSwitchIdList = vSwitchIdList;
        return this;
    }
    public java.util.List<String> getVSwitchIdList() {
        return this.vSwitchIdList;
    }

}
