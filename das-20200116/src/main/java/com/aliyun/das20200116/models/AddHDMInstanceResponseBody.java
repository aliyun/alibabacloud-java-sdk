// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information, including the error codes and the number of entries that are returned.</p>
     */
    @NameInMap("Data")
    public AddHDMInstanceResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("Synchro")
    public String synchro;

    public static AddHDMInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceResponseBody self = new AddHDMInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddHDMInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddHDMInstanceResponseBody setData(AddHDMInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddHDMInstanceResponseBodyData getData() {
        return this.data;
    }

    public AddHDMInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddHDMInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddHDMInstanceResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public AddHDMInstanceResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public static class AddHDMInstanceResponseBodyData extends TeaModel {
        /**
         * <p>The user ID of the caller.</p>
         */
        @NameInMap("CallerUid")
        public String callerUid;

        /**
         * <p>The HTTP status code returned.</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The error message returned if the request failed.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The endpoint of the instance.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the instance owner.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The port number of the instance that you want to access.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The role of the current API caller.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The tenant ID.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The unique identifier of the instance.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static AddHDMInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddHDMInstanceResponseBodyData self = new AddHDMInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddHDMInstanceResponseBodyData setCallerUid(String callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public String getCallerUid() {
            return this.callerUid;
        }

        public AddHDMInstanceResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public AddHDMInstanceResponseBodyData setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public AddHDMInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddHDMInstanceResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AddHDMInstanceResponseBodyData setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public AddHDMInstanceResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddHDMInstanceResponseBodyData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public AddHDMInstanceResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public AddHDMInstanceResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public AddHDMInstanceResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public AddHDMInstanceResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
