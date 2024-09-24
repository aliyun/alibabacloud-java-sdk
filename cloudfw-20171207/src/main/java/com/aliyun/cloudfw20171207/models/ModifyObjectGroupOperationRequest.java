// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyObjectGroupOperationRequest extends TeaModel {
    /**
     * <p>The remarks of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The direction of the traffic to which the access control policy applies.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound.</li>
     * <li><strong>out</strong>: outbound.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation objects.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ObjectList")
    public java.util.List<String> objectList;

    /**
     * <p>The operation. Valid values:</p>
     * <ul>
     * <li><strong>ignore</strong>: adds the operation object to the whitelist.</li>
     * <li><strong>cancelIgnore</strong>: removes the operation object from the whitelist.</li>
     * <li><strong>subscribe</strong>: follows the operation object.</li>
     * <li><strong>unsubscribe</strong>: unfollows the operation object.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("ObjectOperation")
    public String objectOperation;

    /**
     * <p>The type of the operation object.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>assetsIp</strong>: the asset IP address.</li>
     * <li><strong>destinationIp</strong>: the destination IP address.</li>
     * <li><strong>destinationPort</strong>: the destination port.</li>
     * <li><strong>destinationDomain</strong>: the destination domain name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>destinationDomain</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The source IP address of the request.</p>
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
