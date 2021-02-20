// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeWebTechsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeWebTechsResponseBodyRecords> records;

    public static DescribeWebTechsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebTechsResponseBody self = new DescribeWebTechsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebTechsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebTechsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeWebTechsResponseBody setRecords(java.util.List<DescribeWebTechsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeWebTechsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeWebTechsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("PoweredBy")
        public String poweredBy;

        @NameInMap("Version")
        public String version;

        @NameInMap("URL")
        public String URL;

        @NameInMap("Server")
        public String server;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Title")
        public String title;

        @NameInMap("Name")
        public String name;

        public static DescribeWebTechsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebTechsResponseBodyRecords self = new DescribeWebTechsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeWebTechsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeWebTechsResponseBodyRecords setPoweredBy(String poweredBy) {
            this.poweredBy = poweredBy;
            return this;
        }
        public String getPoweredBy() {
            return this.poweredBy;
        }

        public DescribeWebTechsResponseBodyRecords setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeWebTechsResponseBodyRecords setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

        public DescribeWebTechsResponseBodyRecords setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

        public DescribeWebTechsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeWebTechsResponseBodyRecords setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeWebTechsResponseBodyRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
