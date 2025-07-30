// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListDomainProxyTokensResponseBody extends TeaModel {
    /**
     * <p>The proxy tokens of the domain name.</p>
     */
    @NameInMap("DomainProxyTokens")
    public java.util.List<ListDomainProxyTokensResponseBodyDomainProxyTokens> domainProxyTokens;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
         * <p>The time when the proxy token of the domain name was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_examplexxxx</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The proxy token of the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxxxxxx</p>
         */
        @NameInMap("DomainProxyToken")
        public String domainProxyToken;

        /**
         * <p>The ID of the proxy token of the domain.</p>
         * 
         * <strong>example:</strong>
         * <p>pt_examplexxxx</p>
         */
        @NameInMap("DomainProxyTokenId")
        public String domainProxyTokenId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the proxy token of the domain name was last used. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The state of the proxy token. Valid values:</p>
         * <ul>
         * <li>enabled</li>
         * <li>disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the proxy token of the domain name was last updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
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
