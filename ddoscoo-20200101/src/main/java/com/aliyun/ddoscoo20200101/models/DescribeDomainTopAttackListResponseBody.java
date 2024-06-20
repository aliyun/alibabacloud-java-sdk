// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainTopAttackListResponseBody extends TeaModel {
    /**
     * <p>The peak QPS of the website.</p>
     */
    @NameInMap("AttackList")
    public java.util.List<DescribeDomainTopAttackListResponseBodyAttackList> attackList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopAttackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopAttackListResponseBody self = new DescribeDomainTopAttackListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopAttackListResponseBody setAttackList(java.util.List<DescribeDomainTopAttackListResponseBodyAttackList> attackList) {
        this.attackList = attackList;
        return this;
    }
    public java.util.List<DescribeDomainTopAttackListResponseBodyAttackList> getAttackList() {
        return this.attackList;
    }

    public DescribeDomainTopAttackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopAttackListResponseBodyAttackList extends TeaModel {
        /**
         * <p>The attack QPS. Unit: QPS</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Attack")
        public Long attack;

        /**
         * <p>The number of all QPS, which includes normal and attack QPS. Unit: QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>294</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The domain name of the website.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        public static DescribeDomainTopAttackListResponseBodyAttackList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopAttackListResponseBodyAttackList self = new DescribeDomainTopAttackListResponseBodyAttackList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopAttackListResponseBodyAttackList setAttack(Long attack) {
            this.attack = attack;
            return this;
        }
        public Long getAttack() {
            return this.attack;
        }

        public DescribeDomainTopAttackListResponseBodyAttackList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainTopAttackListResponseBodyAttackList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

    }

}
