// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateAccountResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateAccountResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FEBA5E0C-50D0-4FA6-A794-4901E5465***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * <p>The AccessKey ID that is used to create the username and password.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI****************</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The timestamp when the username and password were created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1671175303522</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the Alibaba Cloud account or RAM user that owns the AccessKey. The AccessKey is used to create the static username and password.</p>
         * 
         * <strong>example:</strong>
         * <p>1565***********01</p>
         */
        @NameInMap("MasterUId")
        public Long masterUId;

        /**
         * <p>The created static password.</p>
         * 
         * <strong>example:</strong>
         * <p>OUYwQzM2QjZBRkUxNDRFM***************MzZCNzdDQzoxNjcxNDMwMzkyODI1</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>*** environment</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The created static username.</p>
         * 
         * <strong>example:</strong>
         * <p>MjphbXFwLWNuLXVxbTJ6cjc2djAwMzpMVEFJNX*******ZNMWVSWnRFSjZ2Zm8=</p>
         */
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

        public CreateAccountResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
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
