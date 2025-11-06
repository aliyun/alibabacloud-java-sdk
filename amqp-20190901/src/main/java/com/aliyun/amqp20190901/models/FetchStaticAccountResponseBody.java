// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class FetchStaticAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public FetchStaticAccountResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FetchStaticAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchStaticAccountResponseBody self = new FetchStaticAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchStaticAccountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FetchStaticAccountResponseBody setData(FetchStaticAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchStaticAccountResponseBodyData getData() {
        return this.data;
    }

    public FetchStaticAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchStaticAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchStaticAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchStaticAccountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <strong>example:</strong>
         * <p>1671175303522</p>
         */
        @NameInMap("CreateTimeStamp")
        public Long createTimeStamp;

        /**
         * <strong>example:</strong>
         * <p>amqp-cn-*********</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1565***********01</p>
         */
        @NameInMap("MasterUId")
        public Long masterUId;

        /**
         * <strong>example:</strong>
         * <p>OUYwQzM2QjZBRkUxNDRFM***************MzZCNzdDQzoxNjcxNDMwMzkyODI1</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>备注示例</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>MjphbXFwLWNuLXVxbTJ6cjc2djAwMzpMVEFJNX*******ZNMWVSWnRFSjZ2Zm8=</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static FetchStaticAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchStaticAccountResponseBodyData self = new FetchStaticAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchStaticAccountResponseBodyData setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public FetchStaticAccountResponseBodyData setCreateTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }
        public Long getCreateTimeStamp() {
            return this.createTimeStamp;
        }

        public FetchStaticAccountResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public FetchStaticAccountResponseBodyData setMasterUId(Long masterUId) {
            this.masterUId = masterUId;
            return this;
        }
        public Long getMasterUId() {
            return this.masterUId;
        }

        public FetchStaticAccountResponseBodyData setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public FetchStaticAccountResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FetchStaticAccountResponseBodyData setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
