// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPositionRequest extends TeaModel {
    // The direction of the traffic to which the IPv4 access control policy applies. Valid values:
    // 
    // *   in: inbound traffic
    // *   out: outbound traffic
    @NameInMap("Direction")
    public String direction;

    // The language of the content within the response. Valid values:
    // 
    // *   zh: Chinese (default)
    // *   en: English
    @NameInMap("Lang")
    public String lang;

    // The new priority of the IPv4 access control policy.
    // 
    // You must specify a numeric value for this parameter. The value 1 indicates the highest priority. A larger value indicates a lower priority.
    // 
    // >  The value of this parameter must be within the priority range of existing IPv4 access control policies. Otherwise, an error occurs when you call this operation.
    // 
    // We recommend that you first call the [DescribePolicyPriorUsed](~~138862~~) operation to query the priority range of existing IPv4 access control policies that apply to the traffic of the specified direction.
    @NameInMap("NewOrder")
    public String newOrder;

    // The original priority of the IPv4 access control policy.
    @NameInMap("OldOrder")
    public String oldOrder;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyControlPolicyPositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPositionRequest self = new ModifyControlPolicyPositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPositionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyControlPolicyPositionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyControlPolicyPositionRequest setNewOrder(String newOrder) {
        this.newOrder = newOrder;
        return this;
    }
    public String getNewOrder() {
        return this.newOrder;
    }

    public ModifyControlPolicyPositionRequest setOldOrder(String oldOrder) {
        this.oldOrder = oldOrder;
        return this;
    }
    public String getOldOrder() {
        return this.oldOrder;
    }

    public ModifyControlPolicyPositionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
