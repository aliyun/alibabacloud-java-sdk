// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateQosRuleRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud phones to include in this rule.</p>
     */
    @NameInMap("AuthAndroidId")
    public java.util.List<String> authAndroidId;

    @NameInMap("AuthDesktopGroupId")
    public java.util.List<String> authDesktopGroupId;

    /**
     * <p>The IDs of the cloud desktops to include in this rule.</p>
     */
    @NameInMap("AuthDesktopId")
    public java.util.List<String> authDesktopId;

    /**
     * <p>The maximum downstream bandwidth. Unit: Mbps.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Download")
    public Integer download;

    /**
     * <p>The ID of the premium bandwidth plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np-cfedn7r2pe48g****</p>
     */
    @NameInMap("NetworkPackageId")
    public String networkPackageId;

    /**
     * <p>The name of the QoS rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("QosRuleName")
    public String qosRuleName;

    /**
     * <p>The maximum upstream bandwidth. Unit: Mbps.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Upload")
    public Integer upload;

    public static CreateQosRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateQosRuleRequest self = new CreateQosRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateQosRuleRequest setAuthAndroidId(java.util.List<String> authAndroidId) {
        this.authAndroidId = authAndroidId;
        return this;
    }
    public java.util.List<String> getAuthAndroidId() {
        return this.authAndroidId;
    }

    public CreateQosRuleRequest setAuthDesktopGroupId(java.util.List<String> authDesktopGroupId) {
        this.authDesktopGroupId = authDesktopGroupId;
        return this;
    }
    public java.util.List<String> getAuthDesktopGroupId() {
        return this.authDesktopGroupId;
    }

    public CreateQosRuleRequest setAuthDesktopId(java.util.List<String> authDesktopId) {
        this.authDesktopId = authDesktopId;
        return this;
    }
    public java.util.List<String> getAuthDesktopId() {
        return this.authDesktopId;
    }

    public CreateQosRuleRequest setDownload(Integer download) {
        this.download = download;
        return this;
    }
    public Integer getDownload() {
        return this.download;
    }

    public CreateQosRuleRequest setNetworkPackageId(String networkPackageId) {
        this.networkPackageId = networkPackageId;
        return this;
    }
    public String getNetworkPackageId() {
        return this.networkPackageId;
    }

    public CreateQosRuleRequest setQosRuleName(String qosRuleName) {
        this.qosRuleName = qosRuleName;
        return this;
    }
    public String getQosRuleName() {
        return this.qosRuleName;
    }

    public CreateQosRuleRequest setUpload(Integer upload) {
        this.upload = upload;
        return this;
    }
    public Integer getUpload() {
        return this.upload;
    }

}
