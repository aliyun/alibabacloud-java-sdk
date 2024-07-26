// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dybaseapi20170525.models;

import com.aliyun.tea.*;

public class QueryTokenForMnsQueueResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("MessageTokenDTO")
    public QueryTokenForMnsQueueResponseBodyMessageTokenDTO messageTokenDTO;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryTokenForMnsQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenForMnsQueueResponseBody self = new QueryTokenForMnsQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTokenForMnsQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTokenForMnsQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTokenForMnsQueueResponseBody setMessageTokenDTO(QueryTokenForMnsQueueResponseBodyMessageTokenDTO messageTokenDTO) {
        this.messageTokenDTO = messageTokenDTO;
        return this;
    }
    public QueryTokenForMnsQueueResponseBodyMessageTokenDTO getMessageTokenDTO() {
        return this.messageTokenDTO;
    }

    public QueryTokenForMnsQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTokenForMnsQueueResponseBodyMessageTokenDTO extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("SecurityToken")
        public String securityToken;

        public static QueryTokenForMnsQueueResponseBodyMessageTokenDTO build(java.util.Map<String, ?> map) throws Exception {
            QueryTokenForMnsQueueResponseBodyMessageTokenDTO self = new QueryTokenForMnsQueueResponseBodyMessageTokenDTO();
            return TeaModel.build(map, self);
        }

        public QueryTokenForMnsQueueResponseBodyMessageTokenDTO setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public QueryTokenForMnsQueueResponseBodyMessageTokenDTO setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public QueryTokenForMnsQueueResponseBodyMessageTokenDTO setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTokenForMnsQueueResponseBodyMessageTokenDTO setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QueryTokenForMnsQueueResponseBodyMessageTokenDTO setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

}
