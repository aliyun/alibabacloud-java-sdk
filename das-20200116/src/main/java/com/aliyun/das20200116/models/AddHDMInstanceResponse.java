// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Synchro")
    @Validation(required = true)
    public String synchro;

    @NameInMap("Data")
    @Validation(required = true)
    public AddHDMInstanceResponseData data;

    public static AddHDMInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceResponse self = new AddHDMInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddHDMInstanceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddHDMInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHDMInstanceResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AddHDMInstanceResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public AddHDMInstanceResponse setData(AddHDMInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public AddHDMInstanceResponseData getData() {
        return this.data;
    }

    public static class AddHDMInstanceResponseData extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Uuid")
        @Validation(required = true)
        public String uuid;

        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("Code")
        @Validation(required = true)
        public Integer code;

        @NameInMap("Error")
        @Validation(required = true)
        public String error;

        @NameInMap("TenantId")
        @Validation(required = true)
        public String tenantId;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("CallerUid")
        @Validation(required = true)
        public String callerUid;

        public static AddHDMInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            AddHDMInstanceResponseData self = new AddHDMInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public AddHDMInstanceResponseData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddHDMInstanceResponseData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public AddHDMInstanceResponseData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AddHDMInstanceResponseData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddHDMInstanceResponseData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public AddHDMInstanceResponseData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AddHDMInstanceResponseData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AddHDMInstanceResponseData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public AddHDMInstanceResponseData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public AddHDMInstanceResponseData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public AddHDMInstanceResponseData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public AddHDMInstanceResponseData setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

    }

}
