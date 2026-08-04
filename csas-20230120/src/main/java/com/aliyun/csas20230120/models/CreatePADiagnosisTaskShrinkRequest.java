// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePADiagnosisTaskShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the terminal device.</p>
     * 
     * <strong>example:</strong>
     * <p>2987b3e0-8108-2f99-4d18-3b4f1c1c36d7</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>The diagnosis type. Valid values:</p>
     * <ul>
     * <li><strong>FullLink</strong>: full-link diagnosis.</li>
     * <li><strong>Application</strong>: application diagnosis.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullLink</p>
     */
    @NameInMap("DiagnoseType")
    public String diagnoseType;

    /**
     * <p>The address to diagnose.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>socialapp-gateway.client9.me</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The POP point ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pop-3e244b62357dcafc</p>
     */
    @NameInMap("PopId")
    public String popId;

    /**
     * <p>The POP point selection mode. Valid values:</p>
     * <ul>
     * <li><strong>AutoSelect</strong>: automatic selection.</li>
     * <li><strong>ManualSelect</strong>: manual selection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualSelect</p>
     */
    @NameInMap("PopMode")
    public String popMode;

    /**
     * <p>The port.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The protocol used by the internal network access application. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The extra configurations for UDP diagnosis. If this parameter is not specified, any response received is considered a success.</p>
     */
    @NameInMap("UdpExtraConfigs")
    public String udpExtraConfigsShrink;

    /**
     * <p>The user group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>用户组ID。</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhaosi</p>
     */
    @NameInMap("Username")
    public String username;

    public static CreatePADiagnosisTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePADiagnosisTaskShrinkRequest self = new CreatePADiagnosisTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePADiagnosisTaskShrinkRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public CreatePADiagnosisTaskShrinkRequest setDiagnoseType(String diagnoseType) {
        this.diagnoseType = diagnoseType;
        return this;
    }
    public String getDiagnoseType() {
        return this.diagnoseType;
    }

    public CreatePADiagnosisTaskShrinkRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreatePADiagnosisTaskShrinkRequest setPopId(String popId) {
        this.popId = popId;
        return this;
    }
    public String getPopId() {
        return this.popId;
    }

    public CreatePADiagnosisTaskShrinkRequest setPopMode(String popMode) {
        this.popMode = popMode;
        return this;
    }
    public String getPopMode() {
        return this.popMode;
    }

    public CreatePADiagnosisTaskShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreatePADiagnosisTaskShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreatePADiagnosisTaskShrinkRequest setUdpExtraConfigsShrink(String udpExtraConfigsShrink) {
        this.udpExtraConfigsShrink = udpExtraConfigsShrink;
        return this;
    }
    public String getUdpExtraConfigsShrink() {
        return this.udpExtraConfigsShrink;
    }

    public CreatePADiagnosisTaskShrinkRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public CreatePADiagnosisTaskShrinkRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
