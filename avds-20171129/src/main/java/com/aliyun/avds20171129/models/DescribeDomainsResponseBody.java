// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeDomainsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeDomainsResponseBodyRecords> records;

    public static DescribeDomainsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainsResponseBody self = new DescribeDomainsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDomainsResponseBody setRecords(java.util.List<DescribeDomainsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeDomainsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeDomainsResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static DescribeDomainsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainsResponseBodyRecords self = new DescribeDomainsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDomainsResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeDomainsResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDomainsResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
