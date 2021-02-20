// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListUserPortsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListUserPortsResponseBodyRecords> records;

    public static ListUserPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPortsResponseBody self = new ListUserPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPortsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListUserPortsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPortsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUserPortsResponseBody setRecords(java.util.List<ListUserPortsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListUserPortsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListUserPortsResponseBodyRecords extends TeaModel {
        @NameInMap("Service")
        public String service;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("Version")
        public String version;

        @NameInMap("Product")
        public String product;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Id")
        public Integer id;

        public static ListUserPortsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUserPortsResponseBodyRecords self = new ListUserPortsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListUserPortsResponseBodyRecords setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListUserPortsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListUserPortsResponseBodyRecords setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public ListUserPortsResponseBodyRecords setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListUserPortsResponseBodyRecords setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListUserPortsResponseBodyRecords setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListUserPortsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListUserPortsResponseBodyRecords setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListUserPortsResponseBodyRecords setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListUserPortsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
