// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class GetUserPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserPool")
    public GetUserPoolResponseBodyUserPool userPool;

    public static GetUserPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPoolResponseBody self = new GetUserPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserPoolResponseBody setUserPool(GetUserPoolResponseBodyUserPool userPool) {
        this.userPool = userPool;
        return this;
    }
    public GetUserPoolResponseBodyUserPool getUserPool() {
        return this.userPool;
    }

    public static class GetUserPoolResponseBodyUserPool extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("SourcePlatform")
        public String sourcePlatform;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserPoolId")
        public String userPoolId;

        @NameInMap("UserPoolName")
        public String userPoolName;

        public static GetUserPoolResponseBodyUserPool build(java.util.Map<String, ?> map) throws Exception {
            GetUserPoolResponseBodyUserPool self = new GetUserPoolResponseBodyUserPool();
            return TeaModel.build(map, self);
        }

        public GetUserPoolResponseBodyUserPool setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUserPoolResponseBodyUserPool setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetUserPoolResponseBodyUserPool setSourcePlatform(String sourcePlatform) {
            this.sourcePlatform = sourcePlatform;
            return this;
        }
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        public GetUserPoolResponseBodyUserPool setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetUserPoolResponseBodyUserPool setUserPoolId(String userPoolId) {
            this.userPoolId = userPoolId;
            return this;
        }
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public GetUserPoolResponseBodyUserPool setUserPoolName(String userPoolName) {
            this.userPoolName = userPoolName;
            return this;
        }
        public String getUserPoolName() {
            return this.userPoolName;
        }

    }

}
