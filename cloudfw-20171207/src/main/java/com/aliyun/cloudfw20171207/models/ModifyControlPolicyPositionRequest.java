// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPositionRequest extends TeaModel {
    /**
     * <p>The direction of the traffic to which the IPv4 access control policy applies. Valid values:</p>
     * <ul>
     * <li>in: inbound traffic</li>
     * <li>out: outbound traffic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese (default)</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The new priority of the IPv4 access control policy. You must specify a numeric value for this parameter. The value 1 indicates the highest priority. A larger value indicates a lower priority.</p>
     * <blockquote>
     * <p> The new priority cannot exceed the priority range of the IPv4 access control policy. Otherwise, an error occurs when you call this operation. Before you call this operation, we recommend that you use the <a href="https://help.aliyun.com/document_detail/138862.html">DescribePolicyPriorUsed</a> operation to query the priority range of the IPv4 access control policy in the specified direction.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NewOrder")
    public String newOrder;

    /**
     * <p>The original priority of the IPv4 access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("OldOrder")
    public String oldOrder;

    /**
     * <p>The source IP address of the request.</p>
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
