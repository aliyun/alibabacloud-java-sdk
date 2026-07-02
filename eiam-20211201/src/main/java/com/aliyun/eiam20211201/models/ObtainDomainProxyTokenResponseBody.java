// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ObtainDomainProxyTokenResponseBody extends TeaModel {
    /**
     * <p>The proxy token information object.</p>
     */
    @NameInMap("DomainProxyToken")
    public ObtainDomainProxyTokenResponseBodyDomainProxyToken domainProxyToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ObtainDomainProxyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ObtainDomainProxyTokenResponseBody self = new ObtainDomainProxyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ObtainDomainProxyTokenResponseBody setDomainProxyToken(ObtainDomainProxyTokenResponseBodyDomainProxyToken domainProxyToken) {
        this.domainProxyToken = domainProxyToken;
        return this;
    }
    public ObtainDomainProxyTokenResponseBodyDomainProxyToken getDomainProxyToken() {
        return this.domainProxyToken;
    }

    public ObtainDomainProxyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ObtainDomainProxyTokenResponseBodyDomainProxyToken extends TeaModel {
        /**
         * <p>The time when the domain proxy token was created, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The domain name ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dm_examplexxxx</p>
         */
        @NameInMap("DomainId")
        public String domainId;

        /**
         * <p>The domain proxy token.</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxxxxxx</p>
         */
        @NameInMap("DomainProxyToken")
        public String domainProxyToken;

        /**
         * <p>The domain proxy token ID.</p>
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
         * <p>The time when the domain proxy token was last used, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The token status. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the domain proxy token was last updated, in UNIX timestamp format. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830226000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ObtainDomainProxyTokenResponseBodyDomainProxyToken build(java.util.Map<String, ?> map) throws Exception {
            ObtainDomainProxyTokenResponseBodyDomainProxyToken self = new ObtainDomainProxyTokenResponseBodyDomainProxyToken();
            return TeaModel.build(map, self);
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setDomainProxyToken(String domainProxyToken) {
            this.domainProxyToken = domainProxyToken;
            return this;
        }
        public String getDomainProxyToken() {
            return this.domainProxyToken;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setDomainProxyTokenId(String domainProxyTokenId) {
            this.domainProxyTokenId = domainProxyTokenId;
            return this;
        }
        public String getDomainProxyTokenId() {
            return this.domainProxyTokenId;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ObtainDomainProxyTokenResponseBodyDomainProxyToken setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
