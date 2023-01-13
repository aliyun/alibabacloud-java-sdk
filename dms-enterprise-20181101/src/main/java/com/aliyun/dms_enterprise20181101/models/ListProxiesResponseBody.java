// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxiesResponseBody extends TeaModel {
    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>An array that consists of secure access proxies.</p>
     */
    @NameInMap("ProxyList")
    public java.util.List<ListProxiesResponseBodyProxyList> proxyList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>- **true**: The request was successful.</p>
     * <p>- **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListProxiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProxiesResponseBody self = new ListProxiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProxiesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProxiesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListProxiesResponseBody setProxyList(java.util.List<ListProxiesResponseBodyProxyList> proxyList) {
        this.proxyList = proxyList;
        return this;
    }
    public java.util.List<ListProxiesResponseBodyProxyList> getProxyList() {
        return this.proxyList;
    }

    public ListProxiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProxiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProxiesResponseBodyProxyList extends TeaModel {
        /**
         * <p>The ID of the user who enabled the secure access proxy feature.</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <p>The nickname of the user who enabled the secure access proxy feature.</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The port that was used by HTTPS clients to connect to the database instance.</p>
         */
        @NameInMap("HttpsPort")
        public Integer httpsPort;

        /**
         * <p>The ID of the database instance.</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>Indicates whether the internal endpoint is enabled. Default value: **true**.</p>
         */
        @NameInMap("PrivateEnable")
        public Boolean privateEnable;

        /**
         * <p>The internal endpoint.</p>
         */
        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("ProtocolPort")
        public Integer protocolPort;

        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The ID of the secure access proxy.</p>
         */
        @NameInMap("ProxyId")
        public Long proxyId;

        /**
         * <p>Indicates whether the public endpoint is enabled. Valid values:</p>
         * <br>
         * <p>- **true**: The public endpoint is enabled.</p>
         * <p>- **false**: The public endpoint is disabled.</p>
         */
        @NameInMap("PublicEnable")
        public Boolean publicEnable;

        /**
         * <p>The public endpoint. A public endpoint is returned no matter whether the public endpoint is enabled or disabled.  </p>
         * <br>
         * <p>> - If the value of the PublicEnable parameter is **true**, a valid public endpoint that can be resolved by using Alibaba Cloud DNS (DNS) is returned.</p>
         * <p>> - If the value of the PublicEnable parameter is **false**, an invalid public endpoint that cannot be resolved by using DNS is returned.</p>
         */
        @NameInMap("PublicHost")
        public String publicHost;

        @NameInMap("RegionId")
        public String regionId;

        public static ListProxiesResponseBodyProxyList build(java.util.Map<String, ?> map) throws Exception {
            ListProxiesResponseBodyProxyList self = new ListProxiesResponseBodyProxyList();
            return TeaModel.build(map, self);
        }

        public ListProxiesResponseBodyProxyList setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListProxiesResponseBodyProxyList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListProxiesResponseBodyProxyList setHttpsPort(Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }
        public Integer getHttpsPort() {
            return this.httpsPort;
        }

        public ListProxiesResponseBodyProxyList setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListProxiesResponseBodyProxyList setPrivateEnable(Boolean privateEnable) {
            this.privateEnable = privateEnable;
            return this;
        }
        public Boolean getPrivateEnable() {
            return this.privateEnable;
        }

        public ListProxiesResponseBodyProxyList setPrivateHost(String privateHost) {
            this.privateHost = privateHost;
            return this;
        }
        public String getPrivateHost() {
            return this.privateHost;
        }

        public ListProxiesResponseBodyProxyList setProtocolPort(Integer protocolPort) {
            this.protocolPort = protocolPort;
            return this;
        }
        public Integer getProtocolPort() {
            return this.protocolPort;
        }

        public ListProxiesResponseBodyProxyList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public ListProxiesResponseBodyProxyList setProxyId(Long proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public Long getProxyId() {
            return this.proxyId;
        }

        public ListProxiesResponseBodyProxyList setPublicEnable(Boolean publicEnable) {
            this.publicEnable = publicEnable;
            return this;
        }
        public Boolean getPublicEnable() {
            return this.publicEnable;
        }

        public ListProxiesResponseBodyProxyList setPublicHost(String publicHost) {
            this.publicHost = publicHost;
            return this;
        }
        public String getPublicHost() {
            return this.publicHost;
        }

        public ListProxiesResponseBodyProxyList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
