// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePADiagnosisTaskRequest extends TeaModel {
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
    public CreatePADiagnosisTaskRequestUdpExtraConfigs udpExtraConfigs;

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

    public static CreatePADiagnosisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePADiagnosisTaskRequest self = new CreatePADiagnosisTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatePADiagnosisTaskRequest setDevTag(String devTag) {
        this.devTag = devTag;
        return this;
    }
    public String getDevTag() {
        return this.devTag;
    }

    public CreatePADiagnosisTaskRequest setDiagnoseType(String diagnoseType) {
        this.diagnoseType = diagnoseType;
        return this;
    }
    public String getDiagnoseType() {
        return this.diagnoseType;
    }

    public CreatePADiagnosisTaskRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public CreatePADiagnosisTaskRequest setPopId(String popId) {
        this.popId = popId;
        return this;
    }
    public String getPopId() {
        return this.popId;
    }

    public CreatePADiagnosisTaskRequest setPopMode(String popMode) {
        this.popMode = popMode;
        return this;
    }
    public String getPopMode() {
        return this.popMode;
    }

    public CreatePADiagnosisTaskRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreatePADiagnosisTaskRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreatePADiagnosisTaskRequest setUdpExtraConfigs(CreatePADiagnosisTaskRequestUdpExtraConfigs udpExtraConfigs) {
        this.udpExtraConfigs = udpExtraConfigs;
        return this;
    }
    public CreatePADiagnosisTaskRequestUdpExtraConfigs getUdpExtraConfigs() {
        return this.udpExtraConfigs;
    }

    public CreatePADiagnosisTaskRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public CreatePADiagnosisTaskRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public static class CreatePADiagnosisTaskRequestUdpExtraConfigs extends TeaModel {
        /**
         * <p>The expected response from the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
         * <p>The UDP request content.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("RequestContent")
        public String requestContent;

        public static CreatePADiagnosisTaskRequestUdpExtraConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreatePADiagnosisTaskRequestUdpExtraConfigs self = new CreatePADiagnosisTaskRequestUdpExtraConfigs();
            return TeaModel.build(map, self);
        }

        public CreatePADiagnosisTaskRequestUdpExtraConfigs setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public CreatePADiagnosisTaskRequestUdpExtraConfigs setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

    }

}
