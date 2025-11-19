// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DeleteSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ListResult<InstanceSSL></p>
     */
    @NameInMap("Data")
    public DeleteSecurityIPGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DeleteSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityIPGroupResponseBody self = new DeleteSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityIPGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSecurityIPGroupResponseBody setData(DeleteSecurityIPGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSecurityIPGroupResponseBodyData getData() {
        return this.data;
    }

    public DeleteSecurityIPGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSecurityIPGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>g-1no2rzybnqcv0m****</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        public static DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup self = new DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

    }

    public static class DeleteSecurityIPGroupResponseBodyData extends TeaModel {
        @NameInMap("GlobalSecurityIPGroup")
        public java.util.List<DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> globalSecurityIPGroup;

        public static DeleteSecurityIPGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSecurityIPGroupResponseBodyData self = new DeleteSecurityIPGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSecurityIPGroupResponseBodyData setGlobalSecurityIPGroup(java.util.List<DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
            return this;
        }
        public java.util.List<DeleteSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
            return this.globalSecurityIPGroup;
        }

    }

}
