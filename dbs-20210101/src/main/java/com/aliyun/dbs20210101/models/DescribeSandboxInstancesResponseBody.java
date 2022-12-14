// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxInstancesResponseBody extends TeaModel {
    // The error code.
    @NameInMap("Code")
    public String code;

    // The response parameters.
    // 
    // *   **connectionString**: the connection string of the sandbox instance, in the format of IP address:Port number. This parameter indicates the endpoint of the sandbox instance if the value of the SandboxType parameter is **Sandbox**. This parameter indicates the Network File System (NFS) mount address if the value of the SandboxType parameter is **NFS**.
    // *   **restoreSeconds**: the time required to create the sandbox instance. Unit: seconds.
    // *   **restoreTime**: the point in time to which the sandbox instance is restored. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
    // *   **instanceId**: the ID of the sandbox instance.
    // *   **backupSetId**: the ID of the backup set.
    // *   **createTime**: the point in time when the sandbox instance was created. The time follows the ISO 8601 standard in the yyyy-MM-ddThh:mm:ssZ format. The time is displayed in UTC.
    // *   **backupPlanId**: the ID of the backup schedule.
    // *   **vpcId**: the ID of the virtual private cloud (VPC).
    // *   **vpcSwitchId**: the ID of the VSwitch.
    // *   **sandboxSpecification**: the specifications of the sandbox instance.
    // *   **status**: the status of the sandbox instance. Valid values: **running**, **check_pass**, and **stop**.
    @NameInMap("Data")
    public String data;

    // The error code.
    @NameInMap("ErrCode")
    public String errCode;

    // The error message.
    @NameInMap("ErrMessage")
    public String errMessage;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful.
    @NameInMap("Success")
    public String success;

    public static DescribeSandboxInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxInstancesResponseBody self = new DescribeSandboxInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSandboxInstancesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSandboxInstancesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSandboxInstancesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSandboxInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSandboxInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSandboxInstancesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
