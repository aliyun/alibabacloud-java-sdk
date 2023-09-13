// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainProxyTokensResponseBody extends TeaModel {
    @NameInMap("DomainProxyTokens")
    public java.util.List<ListDomainProxyTokensResponseBodyDomainProxyTokens> domainProxyTokens;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDomainProxyTokensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDomainProxyTokensResponseBody self = new ListDomainProxyTokensResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDomainProxyTokensResponseBody setDomainProxyTokens(java.util.List<ListDomainProxyTokensResponseBodyDomainProxyTokens> domainProxyTokens) {
        this.domainProxyTokens = domainProxyTokens;
        return this;
    }
    public java.util.List<ListDomainProxyTokensResponseBodyDomainProxyTokens> getDomainProxyTokens() {
        return this.domainProxyTokens;
    }

    public ListDomainProxyTokensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDomainProxyTokensResponseBodyDomainProxyTokens extends TeaModel {
        /**
         * <p>域名代理Token创建时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>域名ID。</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>域名代理Token。</p>
         */
        @NameInMap("DomainProxyToken")
        public String domainProxyToken;

        /**
         * <p>域名代理Token ID。</p>
         */
        @NameInMap("DomainProxyTokenId")
        public String domainProxyTokenId;

        /**
         * <p>实例ID。</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>域名代理Token最近使用时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>token状态，枚举类型：(enabled）启用,（disabled）禁用。</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>域名代理Token最近更新时间，Unix时间戳格式，单位为毫秒。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListDomainProxyTokensResponseBodyDomainProxyTokens build(java.util.Map<String, ?> map) throws Exception {
            ListDomainProxyTokensResponseBodyDomainProxyTokens self = new ListDomainProxyTokensResponseBodyDomainProxyTokens();
            return TeaModel.build(map, self);
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setDomainProxyToken(String domainProxyToken) {
            this.domainProxyToken = domainProxyToken;
            return this;
        }
        public String getDomainProxyToken() {
            return this.domainProxyToken;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setDomainProxyTokenId(String domainProxyTokenId) {
            this.domainProxyTokenId = domainProxyTokenId;
            return this;
        }
        public String getDomainProxyTokenId() {
            return this.domainProxyTokenId;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDomainProxyTokensResponseBodyDomainProxyTokens setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
