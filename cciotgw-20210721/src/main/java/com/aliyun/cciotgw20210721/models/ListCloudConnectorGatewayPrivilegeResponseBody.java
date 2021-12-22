// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListCloudConnectorGatewayPrivilegeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IoTCloudConnectorGatewayId")
    public String ioTCloudConnectorGatewayId;

    @NameInMap("IoTCloudConnectorGatewayPrivileges")
    public java.util.List<ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges> ioTCloudConnectorGatewayPrivileges;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static ListCloudConnectorGatewayPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudConnectorGatewayPrivilegeResponseBody self = new ListCloudConnectorGatewayPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudConnectorGatewayPrivilegeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCloudConnectorGatewayPrivilegeResponseBody setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
        this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
        return this;
    }
    public String getIoTCloudConnectorGatewayId() {
        return this.ioTCloudConnectorGatewayId;
    }

    public ListCloudConnectorGatewayPrivilegeResponseBody setIoTCloudConnectorGatewayPrivileges(java.util.List<ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges> ioTCloudConnectorGatewayPrivileges) {
        this.ioTCloudConnectorGatewayPrivileges = ioTCloudConnectorGatewayPrivileges;
        return this;
    }
    public java.util.List<ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges> getIoTCloudConnectorGatewayPrivileges() {
        return this.ioTCloudConnectorGatewayPrivileges;
    }

    public ListCloudConnectorGatewayPrivilegeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCloudConnectorGatewayPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudConnectorGatewayPrivilegeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges extends TeaModel {
        @NameInMap("Aliuid")
        public String aliuid;

        @NameInMap("Type")
        public String type;

        public static ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges build(java.util.Map<String, ?> map) throws Exception {
            ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges self = new ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges();
            return TeaModel.build(map, self);
        }

        public ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges setAliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public String getAliuid() {
            return this.aliuid;
        }

        public ListCloudConnectorGatewayPrivilegeResponseBodyIoTCloudConnectorGatewayPrivileges setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
