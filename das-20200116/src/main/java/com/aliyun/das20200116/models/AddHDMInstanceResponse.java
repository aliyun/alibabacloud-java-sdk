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

    }

}
