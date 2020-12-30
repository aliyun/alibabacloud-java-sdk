// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainNamesOfVersionResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Contents")
    public java.util.List<DescribeDomainNamesOfVersionResponseBodyContents> contents;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainNamesOfVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainNamesOfVersionResponseBody self = new DescribeDomainNamesOfVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainNamesOfVersionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDomainNamesOfVersionResponseBody setContents(java.util.List<DescribeDomainNamesOfVersionResponseBodyContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<DescribeDomainNamesOfVersionResponseBodyContents> getContents() {
        return this.contents;
    }

    public DescribeDomainNamesOfVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainNamesOfVersionResponseBodyContents extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainId")
        public String domainId;

        public static DescribeDomainNamesOfVersionResponseBodyContents build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainNamesOfVersionResponseBodyContents self = new DescribeDomainNamesOfVersionResponseBodyContents();
            return TeaModel.build(map, self);
        }

        public DescribeDomainNamesOfVersionResponseBodyContents setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainNamesOfVersionResponseBodyContents setDomainId(String domainId) {
            this.domainId = domainId;
            return this;
        }
        public String getDomainId() {
            return this.domainId;
        }

    }

}
