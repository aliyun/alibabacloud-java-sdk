// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePADiagnosisTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2987b3e0-8108-2f99-4d18-3b4f1c1c36d7</p>
     */
    @NameInMap("DevTag")
    public String devTag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FullLink</p>
     */
    @NameInMap("DiagnoseType")
    public String diagnoseType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>socialapp-gateway.client9.me</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <strong>example:</strong>
     * <p>pop-3e244b62357dcafc</p>
     */
    @NameInMap("PopId")
    public String popId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ManualSelect</p>
     */
    @NameInMap("PopMode")
    public String popMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("UdpExtraConfigs")
    public CreatePADiagnosisTaskRequestUdpExtraConfigs udpExtraConfigs;

    @NameInMap("UserGroupId")
    public String userGroupId;

    /**
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
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("ExpectedResponse")
        public String expectedResponse;

        /**
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
