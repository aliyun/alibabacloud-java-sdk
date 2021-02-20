// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeSubdomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeSubdomainsResponseBodyRecords> records;

    public static DescribeSubdomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubdomainsResponseBody self = new DescribeSubdomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubdomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubdomainsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeSubdomainsResponseBody setRecords(java.util.List<DescribeSubdomainsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeSubdomainsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeSubdomainsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("RootDomain")
        public String rootDomain;

        public static DescribeSubdomainsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubdomainsResponseBodyRecords self = new DescribeSubdomainsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSubdomainsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeSubdomainsResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeSubdomainsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeSubdomainsResponseBodyRecords setRootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }
        public String getRootDomain() {
            return this.rootDomain;
        }

    }

}
