// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class ListOrgPortsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Records")
    public java.util.List<ListOrgPortsResponseBodyRecords> records;

    public static ListOrgPortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOrgPortsResponseBody self = new ListOrgPortsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOrgPortsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListOrgPortsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrgPortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOrgPortsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOrgPortsResponseBody setRecords(java.util.List<ListOrgPortsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListOrgPortsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class ListOrgPortsResponseBodyRecords extends TeaModel {
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

        @NameInMap("OrgId")
        public Integer orgId;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("IP")
        public String IP;

        @NameInMap("Id")
        public Integer id;

        public static ListOrgPortsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListOrgPortsResponseBodyRecords self = new ListOrgPortsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListOrgPortsResponseBodyRecords setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListOrgPortsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListOrgPortsResponseBodyRecords setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public ListOrgPortsResponseBodyRecords setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListOrgPortsResponseBodyRecords setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListOrgPortsResponseBodyRecords setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListOrgPortsResponseBodyRecords setOrgId(Integer orgId) {
            this.orgId = orgId;
            return this;
        }
        public Integer getOrgId() {
            return this.orgId;
        }

        public ListOrgPortsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public ListOrgPortsResponseBodyRecords setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListOrgPortsResponseBodyRecords setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListOrgPortsResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

}
