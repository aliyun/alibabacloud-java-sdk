// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainsBySourceResponseBody extends TeaModel {
    /**
     * <p>The information about each origin server and the corresponding domain names.</p>
     */
    @NameInMap("DomainInfo")
    public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfo> domainInfo;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The CNAME record assigned to the domain name.</p>
         */
        @NameInMap("DomainCname")
        public String domainCname;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The workload type of the accelerated domain name. Valid value:</p>
         * <br>
         * <p>*   **ipa**: layer 4 acceleration</p>
         * <p>*   **dynamic**: layer 7 acceleration</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The status of the domain name. Valid value:</p>
         * <br>
         * <p>*   **applying**: The domain name is under review.</p>
         * <p>*   **configuring**: The domain name is being configured.</p>
         * <p>*   **online**: The domain name is working as expected.</p>
         * <p>*   **stopping**: The domain name is being stopped.</p>
         * <p>*   **offline**: The domain name is disabled.</p>
         * <p>*   **disabling**: The domain name is being removed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the domain name was updated.</p>
         */
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
        /**
         * <p>The information about the domain names.</p>
         */
        @NameInMap("DomainList")
        public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfoDomainList> domainList;

        /**
         * <p>The origin server.</p>
         */
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
