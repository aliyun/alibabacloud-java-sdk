// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListKeylessServersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListKeylessServersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>54362329990032</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListKeylessServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKeylessServersResponseBody self = new ListKeylessServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKeylessServersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListKeylessServersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListKeylessServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKeylessServersResponseBody setResult(java.util.List<ListKeylessServersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListKeylessServersResponseBodyResult> getResult() {
        return this.result;
    }

    public ListKeylessServersResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListKeylessServersResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public ListKeylessServersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListKeylessServersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----****</p>
         */
        @NameInMap("CaCertificate")
        public String caCertificate;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----****</p>
         */
        @NameInMap("ClientCertificate")
        public String clientCertificate;

        /**
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY-----****</p>
         */
        @NameInMap("ClientPrivateKey")
        public String clientPrivateKey;

        /**
         * <strong>example:</strong>
         * <p>2024-06-24 07:48:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Keyless server ID。</p>
         * 
         * <strong>example:</strong>
         * <p>babab9db65ee5efcca9f3d41d4b5****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <strong>example:</strong>
         * <p>2024-07-20 06:18:42</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Verify")
        public Boolean verify;

        public static ListKeylessServersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListKeylessServersResponseBodyResult self = new ListKeylessServersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListKeylessServersResponseBodyResult setCaCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            return this;
        }
        public String getCaCertificate() {
            return this.caCertificate;
        }

        public ListKeylessServersResponseBodyResult setClientCertificate(String clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }
        public String getClientCertificate() {
            return this.clientCertificate;
        }

        public ListKeylessServersResponseBodyResult setClientPrivateKey(String clientPrivateKey) {
            this.clientPrivateKey = clientPrivateKey;
            return this;
        }
        public String getClientPrivateKey() {
            return this.clientPrivateKey;
        }

        public ListKeylessServersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListKeylessServersResponseBodyResult setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListKeylessServersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListKeylessServersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKeylessServersResponseBodyResult setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListKeylessServersResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListKeylessServersResponseBodyResult setVerify(Boolean verify) {
            this.verify = verify;
            return this;
        }
        public Boolean getVerify() {
            return this.verify;
        }

    }

}
