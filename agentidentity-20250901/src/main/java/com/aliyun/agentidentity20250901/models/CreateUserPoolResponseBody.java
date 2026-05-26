// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class CreateUserPoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserPool")
    public CreateUserPoolResponseBodyUserPool userPool;

    public static CreateUserPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPoolResponseBody self = new CreateUserPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserPoolResponseBody setUserPool(CreateUserPoolResponseBodyUserPool userPool) {
        this.userPool = userPool;
        return this;
    }
    public CreateUserPoolResponseBodyUserPool getUserPool() {
        return this.userPool;
    }

    public static class CreateUserPoolResponseBodyUserPool extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2026-05-07T06:19:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>up_xxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("UserPoolId")
        public String userPoolId;

        /**
         * <strong>example:</strong>
         * <p>my-agent-userpool</p>
         */
        @NameInMap("UserPoolName")
        public String userPoolName;

        public static CreateUserPoolResponseBodyUserPool build(java.util.Map<String, ?> map) throws Exception {
            CreateUserPoolResponseBodyUserPool self = new CreateUserPoolResponseBodyUserPool();
            return TeaModel.build(map, self);
        }

        public CreateUserPoolResponseBodyUserPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateUserPoolResponseBodyUserPool setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateUserPoolResponseBodyUserPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CreateUserPoolResponseBodyUserPool setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public CreateUserPoolResponseBodyUserPool setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
