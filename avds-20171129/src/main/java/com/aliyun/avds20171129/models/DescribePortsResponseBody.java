// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribePortsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribePortsResponseBodyRecords> records;

    public static DescribePortsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortsResponseBody self = new DescribePortsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribePortsResponseBody setRecords(java.util.List<DescribePortsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribePortsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribePortsResponseBodyRecords extends TeaModel {
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
        public String port;

        @NameInMap("IP")
        public String IP;

        public static DescribePortsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribePortsResponseBodyRecords self = new DescribePortsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribePortsResponseBodyRecords setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribePortsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribePortsResponseBodyRecords setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribePortsResponseBodyRecords setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribePortsResponseBodyRecords setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribePortsResponseBodyRecords setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribePortsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribePortsResponseBodyRecords setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribePortsResponseBodyRecords setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

    }

}
