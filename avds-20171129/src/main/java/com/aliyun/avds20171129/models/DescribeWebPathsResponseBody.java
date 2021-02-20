// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeWebPathsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeWebPathsResponseBodyRecords> records;

    public static DescribeWebPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebPathsResponseBody self = new DescribeWebPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWebPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWebPathsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeWebPathsResponseBody setRecords(java.util.List<DescribeWebPathsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeWebPathsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeWebPathsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("Site")
        public String site;

        @NameInMap("Path")
        public String path;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static DescribeWebPathsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeWebPathsResponseBodyRecords self = new DescribeWebPathsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeWebPathsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeWebPathsResponseBodyRecords setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public DescribeWebPathsResponseBodyRecords setSite(String site) {
            this.site = site;
            return this;
        }
        public String getSite() {
            return this.site;
        }

        public DescribeWebPathsResponseBodyRecords setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeWebPathsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
