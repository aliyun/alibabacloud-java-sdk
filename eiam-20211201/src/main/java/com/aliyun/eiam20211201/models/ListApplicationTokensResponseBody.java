// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationTokensResponseBody extends TeaModel {
    @NameInMap("ApplicationTokens")
    public java.util.List<ListApplicationTokensResponseBodyApplicationTokens> applicationTokens;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApplicationTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationTokensResponseBody self = new ListApplicationTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationTokensResponseBody setApplicationTokens(java.util.List<ListApplicationTokensResponseBodyApplicationTokens> applicationTokens) {
        this.applicationTokens = applicationTokens;
        return this;
    }
    public java.util.List<ListApplicationTokensResponseBodyApplicationTokens> getApplicationTokens() {
        return this.applicationTokens;
    }

    public ListApplicationTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApplicationTokensResponseBodyApplicationTokens extends TeaModel {
        /**
         * <p>aliUid。</p>
         * 
         * <strong>example:</strong>
         * <p>1973166921975xxxx</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>应用ID</p>
         * 
         * <strong>example:</strong>
         * <p>app_m7ar5tms4dwtggavalk3j3mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>应用token</p>
         * 
         * <strong>example:</strong>
         * <p>SATFwqX8zxGf83pJcJw78KFGjmrft4erWeZYBGS8oE7NN6qoE217yaJpUdMb1UuuGqhDiF43sCA4CF91CTL5iGntqwyLuaAcS9FJ9HfGadE5a7TjiwVafwrBYktxxxx</p>
         */
        @NameInMap("ApplicationToken")
        public String applicationToken;

        /**
         * <p>应用token ID</p>
         * 
         * <strong>example:</strong>
         * <p>token_ndfxxigahelfne2y2hodehrxxxx</p>
         */
        @NameInMap("ApplicationTokenId")
        public String applicationTokenId;

        /**
         * <p>应用token类型</p>
         * 
         * <strong>example:</strong>
         * <p>bearer_token</p>
         */
        @NameInMap("ApplicationTokenType")
        public String applicationTokenType;

        /**
         * <strong>example:</strong>
         * <p>1747796654000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>应用token描述</p>
         * 
         * <strong>example:</strong>
         * <p>jwqtts-0430</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>到期时间</p>
         * 
         * <strong>example:</strong>
         * <p>1747796654000</p>
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
         * <p>最后使用时间</p>
         * 
         * <strong>example:</strong>
         * <p>1747796654000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>应用状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListApplicationTokensResponseBodyApplicationTokens build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationTokensResponseBodyApplicationTokens self = new ListApplicationTokensResponseBodyApplicationTokens();
            return TeaModel.build(map, self);
        }

        public ListApplicationTokensResponseBodyApplicationTokens setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setApplicationToken(String applicationToken) {
            this.applicationToken = applicationToken;
            return this;
        }
        public String getApplicationToken() {
            return this.applicationToken;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setApplicationTokenId(String applicationTokenId) {
            this.applicationTokenId = applicationTokenId;
            return this;
        }
        public String getApplicationTokenId() {
            return this.applicationTokenId;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setApplicationTokenType(String applicationTokenType) {
            this.applicationTokenType = applicationTokenType;
            return this;
        }
        public String getApplicationTokenType() {
            return this.applicationTokenType;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListApplicationTokensResponseBodyApplicationTokens setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
