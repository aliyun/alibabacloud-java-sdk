// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class AttachExpressConnectRouterChildInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-j6cwxhgg0s5nuephp****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <strong>example:</strong>
     * <p>190550144868****</p>
     */
    @NameInMap("ChildInstanceOwnerId")
    public Long childInstanceOwnerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-a5xqrgbeidz1w8****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    public static AttachExpressConnectRouterChildInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachExpressConnectRouterChildInstanceRequest self = new AttachExpressConnectRouterChildInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AttachExpressConnectRouterChildInstanceRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public AttachExpressConnectRouterChildInstanceRequest setChildInstanceOwnerId(Long childInstanceOwnerId) {
        this.childInstanceOwnerId = childInstanceOwnerId;
        return this;
    }
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    public AttachExpressConnectRouterChildInstanceRequest setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public AttachExpressConnectRouterChildInstanceRequest setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public AttachExpressConnectRouterChildInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AttachExpressConnectRouterChildInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AttachExpressConnectRouterChildInstanceRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

}
