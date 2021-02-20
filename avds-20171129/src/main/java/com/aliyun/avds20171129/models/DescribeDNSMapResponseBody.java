// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeDNSMapResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Records")
    public java.util.List<DescribeDNSMapResponseBodyRecords> records;

    public static DescribeDNSMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDNSMapResponseBody self = new DescribeDNSMapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDNSMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDNSMapResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeDNSMapResponseBody setRecords(java.util.List<DescribeDNSMapResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribeDNSMapResponseBodyRecords> getRecords() {
        return this.records;
    }

    public static class DescribeDNSMapResponseBodyRecords extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Type")
        public String type;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        @NameInMap("Record")
        public String record;

        public static DescribeDNSMapResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeDNSMapResponseBodyRecords self = new DescribeDNSMapResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribeDNSMapResponseBodyRecords setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeDNSMapResponseBodyRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDNSMapResponseBodyRecords setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDNSMapResponseBodyRecords setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public DescribeDNSMapResponseBodyRecords setRecord(String record) {
            this.record = record;
            return this;
        }
        public String getRecord() {
            return this.record;
        }

    }

}
