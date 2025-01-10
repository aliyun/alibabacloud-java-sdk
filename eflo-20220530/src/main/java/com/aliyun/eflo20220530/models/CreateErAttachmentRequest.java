// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErAttachmentRequest extends TeaModel {
    /**
     * <p>Indicates whether to automatically receive all routes from all instances under the Lingjun HUB. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: received automatically.</li>
     * <li><strong>false</strong>: Not received.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoReceiveAllRoute")
    public Boolean autoReceiveAllRoute;

    /**
     * <p>The name of the network instance connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-attachemnt-vpd-xksd2obl</p>
     */
    @NameInMap("ErAttachmentName")
    public String erAttachmentName;

    /**
     * <p>Lingjun HUB ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>The ID of the network instance. Valid values: <strong>VPD</strong> and <strong>VCC</strong>.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/444430.html">What is Lingjun?</a></p>
     * <p>You can query <strong>Lingjun CIDR Block</strong> and <strong>Lingjun Connection</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html?">ListVccs</a> respectively.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpd-xksd2obl</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The category of the instance. Valid values:</p>
     * <ul>
     * <li><strong>VPD</strong>: indicates the Lingjun CIDR block.</li>
     * <li><strong>VCC</strong>: indicates a Lingjun connection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPD</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the tenant to which the resource belongs. This parameter is required for cross-account resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1620939556166277</p>
     */
    @NameInMap("ResourceTenantId")
    public String resourceTenantId;

    public static CreateErAttachmentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateErAttachmentRequest self = new CreateErAttachmentRequest();
        return TeaModel.build(map, self);
    }

    public CreateErAttachmentRequest setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
        this.autoReceiveAllRoute = autoReceiveAllRoute;
        return this;
    }
    public Boolean getAutoReceiveAllRoute() {
        return this.autoReceiveAllRoute;
    }

    public CreateErAttachmentRequest setErAttachmentName(String erAttachmentName) {
        this.erAttachmentName = erAttachmentName;
        return this;
    }
    public String getErAttachmentName() {
        return this.erAttachmentName;
    }

    public CreateErAttachmentRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public CreateErAttachmentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateErAttachmentRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateErAttachmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateErAttachmentRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

}
