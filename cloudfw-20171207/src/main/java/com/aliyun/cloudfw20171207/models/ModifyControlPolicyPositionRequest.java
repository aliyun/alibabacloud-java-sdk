// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPositionRequest extends TeaModel {
    /**
     * <p>The traffic direction of the IPv4 access control policy for the Internet firewall. Valid values:</p>
     * <ul>
     * <li><p>in: inbound traffic.</p>
     * </li>
     * <li><p>out: outbound traffic.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p>zh (default): Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The new priority for the IPv4 access control policy of the Internet firewall. The priority is a number. A smaller number indicates a higher priority. The value 1 indicates the highest priority.</p>
     * <blockquote>
     * <p>The new priority value cannot be outside the range of existing priorities for IPv4 policies. Otherwise, the API call fails. Before you call this operation, call <a href="https://help.aliyun.com/document_detail/138862.html">DescribePolicyPriorUsed</a> to query the priority range of IPv4 policies for a specific traffic direction.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The current priority of the IPv4 access control policy that you want to modify.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("OldOrder")
    public String oldOrder;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
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

    @Deprecated
    public ModifyControlPolicyPositionRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
