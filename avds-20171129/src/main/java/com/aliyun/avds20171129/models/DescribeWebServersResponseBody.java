// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeWebServersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeWebServersResponseBodyRecords> records;

    public static DescribeWebServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebServersResponseBody self = new DescribeWebServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebServersResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeWebServersResponseBody setRecords(java.util.List<DescribeWebServersResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeWebServersResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeWebServersResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Host")
        public String host;

        @NameInMap("Scheme")
        public String scheme;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Port")
        public String port;

        public static DescribeWebServersResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebServersResponseBodyRecords self = new DescribeWebServersResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeWebServersResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeWebServersResponseBodyRecords setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public DescribeWebServersResponseBodyRecords setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public DescribeWebServersResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeWebServersResponseBodyRecords setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

}
