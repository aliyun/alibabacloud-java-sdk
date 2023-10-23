// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainsBySourceResponseBody extends TeaModel {
    @NameInMap("DomainInfo")
    public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfo> domainInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainsBySourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainsBySourceResponseBody self = new DescribeDcdnDomainsBySourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainsBySourceResponseBody setDomainInfo(java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfo> domainInfo) {
        this.domainInfo = domainInfo;
        return this;
    }
    public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfo> getDomainInfo() {
        return this.domainInfo;
    }

    public DescribeDcdnDomainsBySourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>CNAME。</p>
         */
        @NameInMap("DomainCname")
        public String domainCname;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainType")
        public String domainType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList self = new DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList setDomainCname(String domainCname) {
            this.domainCname = domainCname;
            return this;
        }
        public String getDomainCname() {
            return this.domainCname;
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList setDomainType(String domainType) {
            this.domainType = domainType;
            return this;
        }
        public String getDomainType() {
            return this.domainType;
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeDcdnDomainsBySourceResponseBodyDomainInfo extends TeaModel {
        @NameInMap("DomainList")
        public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList> domainList;

        @NameInMap("Source")
        public String source;

        public static DescribeDcdnDomainsBySourceResponseBodyDomainInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainsBySourceResponseBodyDomainInfo self = new DescribeDcdnDomainsBySourceResponseBodyDomainInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfo setDomainList(java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList> domainList) {
            this.domainList = domainList;
            return this;
        }
        public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList> getDomainList() {
            return this.domainList;
        }

        public DescribeDcdnDomainsBySourceResponseBodyDomainInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
