// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyObjectGroupOperationRequest extends TeaModel {
    /**
     * <p>The remark for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Remark for batch whitelisting</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The traffic direction controlled by the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: Inbound traffic.</li>
     * <li><strong>out</strong>: Outbound traffic.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of objects to operate on.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectList")
    public java.util.List<String> objectList;

    /**
     * <p>Specifies the operation to perform on the object, such as adding to the whitelist, removing from the whitelist, following, or unfollowing. Valid values:</p>
     * <ul>
     * <li><strong>subscribe</strong>: Follow.</li>
     * <li><strong>unsubscribe</strong>: Unfollow.</li>
     * <li><strong>ignore</strong>: Add to the whitelist.</li>
     * <li><strong>cancelIgnore</strong>: Remove from the whitelist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("ObjectOperation")
    public String objectOperation;

    /**
     * <p>The type of the object to add to the outbound connections whitelist or follow. Valid values:</p>
     * <ul>
     * <li><strong>assetsIp</strong>: Asset IP address.</li>
     * <li><strong>destinationIp</strong>: Destination IP address.</li>
     * <li><strong>destinationPort</strong>: Destination port.</li>
     * <li><strong>destinationDomain</strong>: Destination domain name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>destinationDomain</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The source IP address of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>123.xxx.251.60</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyObjectGroupOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyObjectGroupOperationRequest self = new ModifyObjectGroupOperationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyObjectGroupOperationRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyObjectGroupOperationRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyObjectGroupOperationRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyObjectGroupOperationRequest setObjectList(java.util.List<String> objectList) {
        this.objectList = objectList;
        return this;
    }
    public java.util.List<String> getObjectList() {
        return this.objectList;
    }

    public ModifyObjectGroupOperationRequest setObjectOperation(String objectOperation) {
        this.objectOperation = objectOperation;
        return this;
    }
    public String getObjectOperation() {
        return this.objectOperation;
    }

    public ModifyObjectGroupOperationRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ModifyObjectGroupOperationRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
