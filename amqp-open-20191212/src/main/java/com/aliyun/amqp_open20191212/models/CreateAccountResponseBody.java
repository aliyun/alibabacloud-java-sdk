// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateAccountResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountResponseBody self = new CreateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateAccountResponseBody setData(CreateAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAccountResponseBodyData getData() {
        return this.data;
    }

    public CreateAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateAccountResponseBodyData extends TeaModel {
        /**
         * <p>AccessKey ID。</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MasterUId")
        public Long masterUId;

        @NameInMap("Password")
        public String password;

        @NameInMap("UserName")
        public String userName;

        public static CreateAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAccountResponseBodyData self = new CreateAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAccountResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateAccountResponseBodyData setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public CreateAccountResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateAccountResponseBodyData setMasterUId(Long masterUId) {
            this.masterUId = masterUId;
            return this;
        }
        public Long getMasterUId() {
            return this.masterUId;
        }

        public CreateAccountResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public CreateAccountResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
