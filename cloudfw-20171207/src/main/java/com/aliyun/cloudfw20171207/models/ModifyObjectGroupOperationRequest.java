// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyObjectGroupOperationRequest extends TeaModel {
    /**
     * <p>The comment for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
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
     * <p>The language for receiving messages. Valid values:</p>
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
     * <p>The operation to perform on the object, such as adding to or removing from a whitelist, or subscribing to or unsubscribing from the object. Valid values:</p>
     * <ul>
     * <li><strong>subscribe</strong>: Subscribes to the object.</li>
     * <li><strong>unsubscribe</strong>: Unsubscribes from the object.</li>
     * <li><strong>ignore</strong>: Adds the object to the whitelist.</li>
     * <li><strong>cancelIgnore</strong>: Removes the object from the whitelist.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("ObjectOperation")
    public String objectOperation;

    /**
     * <p>The type of the outbound connection whitelist or subscription. Valid values:</p>
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
     * <p>The source IP address of the visitor.</p>
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
