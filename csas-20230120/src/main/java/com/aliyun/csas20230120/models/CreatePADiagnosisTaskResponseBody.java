// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePADiagnosisTaskResponseBody extends TeaModel {
    @NameInMap("DiagnosisTask")
    public CreatePADiagnosisTaskResponseBodyDiagnosisTask diagnosisTask;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5F79AE39-6622-5292-87EF-DE45631DE4D7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePADiagnosisTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePADiagnosisTaskResponseBody self = new CreatePADiagnosisTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePADiagnosisTaskResponseBody setDiagnosisTask(CreatePADiagnosisTaskResponseBodyDiagnosisTask diagnosisTask) {
        this.diagnosisTask = diagnosisTask;
        return this;
    }
    public CreatePADiagnosisTaskResponseBodyDiagnosisTask getDiagnosisTask() {
        return this.diagnosisTask;
    }

    public CreatePADiagnosisTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs extends TeaModel {
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

        public static CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs self = new CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs();
            return TeaModel.build(map, self);
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs setExpectedResponse(String expectedResponse) {
            this.expectedResponse = expectedResponse;
            return this;
        }
        public String getExpectedResponse() {
            return this.expectedResponse;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

    }

    public static class CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ug-xxxxxxxx</p>
         */
        @NameInMap("UserGroupId")
        public String userGroupId;

        /**
         * <strong>example:</strong>
         * <p>IT</p>
         */
        @NameInMap("UserGroupName")
        public String userGroupName;

        public static CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup build(java.util.Map<String, ?> map) throws Exception {
            CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup self = new CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup();
            return TeaModel.build(map, self);
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup setUserGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            return this;
        }
        public String getUserGroupName() {
            return this.userGroupName;
        }

    }

    public static class CreatePADiagnosisTaskResponseBodyDiagnosisTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>E9EE1CE7-4AA0-521D-B8E1-E13E47F05E94</p>
         */
        @NameInMap("DevTag")
        public String devTag;

        /**
         * <strong>example:</strong>
         * <p>diag-3e0d36d6c15a0502</p>
         */
        @NameInMap("DiagnoseId")
        public String diagnoseId;

        /**
         * <strong>example:</strong>
         * <p>FullLink</p>
         */
        @NameInMap("DiagnoseType")
        public String diagnoseType;

        /**
         * <strong>example:</strong>
         * <p>172.16.6.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>pop-8ded63ce9d3d317e</p>
         */
        @NameInMap("PopId")
        public String popId;

        /**
         * <strong>example:</strong>
         * <p>AutoSelect</p>
         */
        @NameInMap("PopMode")
        public String popMode;

        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UdpExtraConfigs")
        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs udpExtraConfigs;

        @NameInMap("UserGroup")
        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup userGroup;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Username")
        public String username;

        public static CreatePADiagnosisTaskResponseBodyDiagnosisTask build(java.util.Map<String, ?> map) throws Exception {
            CreatePADiagnosisTaskResponseBodyDiagnosisTask self = new CreatePADiagnosisTaskResponseBodyDiagnosisTask();
            return TeaModel.build(map, self);
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setDevTag(String devTag) {
            this.devTag = devTag;
            return this;
        }
        public String getDevTag() {
            return this.devTag;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setDiagnoseType(String diagnoseType) {
            this.diagnoseType = diagnoseType;
            return this;
        }
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setPopId(String popId) {
            this.popId = popId;
            return this;
        }
        public String getPopId() {
            return this.popId;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setPopMode(String popMode) {
            this.popMode = popMode;
            return this;
        }
        public String getPopMode() {
            return this.popMode;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setUdpExtraConfigs(CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs udpExtraConfigs) {
            this.udpExtraConfigs = udpExtraConfigs;
            return this;
        }
        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUdpExtraConfigs getUdpExtraConfigs() {
            return this.udpExtraConfigs;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setUserGroup(CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup userGroup) {
            this.userGroup = userGroup;
            return this;
        }
        public CreatePADiagnosisTaskResponseBodyDiagnosisTaskUserGroup getUserGroup() {
            return this.userGroup;
        }

        public CreatePADiagnosisTaskResponseBodyDiagnosisTask setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
