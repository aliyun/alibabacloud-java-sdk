// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListProxiesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProxyList")
    public java.util.List<ListProxiesResponseBodyProxyList> proxyList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("HttpsPort")
        public Integer httpsPort;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("MysqlPort")
        public Integer mysqlPort;

        @NameInMap("PrivateEnable")
        public Boolean privateEnable;

        @NameInMap("PrivateHost")
        public String privateHost;

        @NameInMap("ProxyId")
        public Long proxyId;

        @NameInMap("PublicEnable")
        public Boolean publicEnable;

        @NameInMap("PublicHost")
        public String publicHost;

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

        public ListProxiesResponseBodyProxyList setMysqlPort(Integer mysqlPort) {
            this.mysqlPort = mysqlPort;
            return this;
        }
        public Integer getMysqlPort() {
            return this.mysqlPort;
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

    }

}
