// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class AddCloudConnectorGatewayPrivilegeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static AddCloudConnectorGatewayPrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCloudConnectorGatewayPrivilegeResponseBody self = new AddCloudConnectorGatewayPrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCloudConnectorGatewayPrivilegeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddCloudConnectorGatewayPrivilegeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddCloudConnectorGatewayPrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddCloudConnectorGatewayPrivilegeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
