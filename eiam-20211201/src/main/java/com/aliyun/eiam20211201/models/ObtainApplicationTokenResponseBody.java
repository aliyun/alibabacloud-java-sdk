// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainApplicationTokenResponseBody extends TeaModel {
    @NameInMap("ApplicationToken")
    public ObtainApplicationTokenResponseBodyApplicationToken applicationToken;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ObtainApplicationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainApplicationTokenResponseBody self = new ObtainApplicationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainApplicationTokenResponseBody setApplicationToken(ObtainApplicationTokenResponseBodyApplicationToken applicationToken) {
        this.applicationToken = applicationToken;
        return this;
    }
    public ObtainApplicationTokenResponseBodyApplicationToken getApplicationToken() {
        return this.applicationToken;
    }

    public ObtainApplicationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ObtainApplicationTokenResponseBodyApplicationToken extends TeaModel {
        /**
         * <p>IDaaS EIAM 应用Id</p>
         * 
         * <strong>example:</strong>
         * <p>app_na2r73a65s7o4zbs7nj5gxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>客户端密钥</p>
         * 
         * <strong>example:</strong>
         * <p>SATFwqX8zxGf83pJcJw78KFGjmrft4erWeZYBGS8oE7NN6qoE217yaJpUdMb1UuuGqhDiF43sCA4CF91CTL5iGntqwyLuaAcS9FJ9HfGadE5a7TjiwVafwrBxxxxx</p>
         */
        @NameInMap("ApplicationToken")
        public String applicationToken;

        /**
         * <p>IDaaS EIAM 客户端ID</p>
         * 
         * <strong>example:</strong>
         * <p>token_m7aso6v4efvu2otfq3jdzxxxx</p>
         */
        @NameInMap("ApplicationTokenId")
        public String applicationTokenId;

        /**
         * <p>IDaaS EIAM 客户端密钥Id</p>
         * 
         * <strong>example:</strong>
         * <p>bearer_token</p>
         */
        @NameInMap("ApplicationTokenType")
        public String applicationTokenType;

        /**
         * <strong>example:</strong>
         * <p>1735610930000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1735610950000</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>IDaaS EIAM 实例Id</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ki6hd7ihir4ybawogqk6kqxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>IDaaS EIAM 客户端密钥最近使用时间</p>
         * 
         * <strong>example:</strong>
         * <p>1735610930000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>IDaaS EIAM 客户端密钥状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ObtainApplicationTokenResponseBodyApplicationToken build(java.util.Map<String, ?> map) throws Exception {
            ObtainApplicationTokenResponseBodyApplicationToken self = new ObtainApplicationTokenResponseBodyApplicationToken();
            return TeaModel.build(map, self);
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setApplicationToken(String applicationToken) {
            this.applicationToken = applicationToken;
            return this;
        }
        public String getApplicationToken() {
            return this.applicationToken;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setApplicationTokenId(String applicationTokenId) {
            this.applicationTokenId = applicationTokenId;
            return this;
        }
        public String getApplicationTokenId() {
            return this.applicationTokenId;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setApplicationTokenType(String applicationTokenType) {
            this.applicationTokenType = applicationTokenType;
            return this;
        }
        public String getApplicationTokenType() {
            return this.applicationTokenType;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ObtainApplicationTokenResponseBodyApplicationToken setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
