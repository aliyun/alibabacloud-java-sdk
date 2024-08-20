// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainsBySourceResponseBody extends TeaModel {
    /**
     * <p>The information about each origin server and the corresponding domain names.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainInfo")
    public java.util.List<DescribeDcdnDomainsBySourceResponseBodyDomainInfo> domainInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
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
         * 
         * <strong>example:</strong>
         * <p>2021-08-21T03:05:20+08:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The CNAME record assigned to the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.org.alikunlun.com</p>
         */
        @NameInMap("DomainCname")
        public String domainCname;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.org</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The workload type of the accelerated domain name. Valid value:</p>
         * <ul>
         * <li><strong>ipa</strong>: layer 4 acceleration</li>
         * <li><strong>dynamic</strong>: layer 7 acceleration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dynamic</p>
         */
        @NameInMap("DomainType")
        public String domainType;

        /**
         * <p>The status of the domain name. Valid value:</p>
         * <ul>
         * <li><strong>applying</strong>: The domain name is under review.</li>
         * <li><strong>configuring</strong>: The domain name is being configured.</li>
         * <li><strong>online</strong>: The domain name is working as expected.</li>
         * <li><strong>stopping</strong>: The domain name is being stopped.</li>
         * <li><strong>offline</strong>: The domain name is disabled.</li>
         * <li><strong>disabling</strong>: The domain name is being removed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the domain name was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-01T03:26:55+08:00</p>
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
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
