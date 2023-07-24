// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the accelerated domain name.</p>
     */
    @NameInMap("Domain")
    public DescribeDcdnWafDomainDetailResponseBodyDomain domain;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnWafDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainDetailResponseBody self = new DescribeDcdnWafDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainDetailResponseBody setDomain(DescribeDcdnWafDomainDetailResponseBodyDomain domain) {
        this.domain = domain;
        return this;
    }
    public DescribeDcdnWafDomainDetailResponseBodyDomain getDomain() {
        return this.domain;
    }

    public DescribeDcdnWafDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes extends TeaModel {
        /**
         * <p>The type of the protection policy. Valid values:</p>
         * <br>
         * <p>*   waf_group: basic web protection</p>
         * <p>*   custom_acl: custom protection</p>
         * <p>*   whitelist: whitelist</p>
         */
        @NameInMap("DefenseScene")
        public String defenseScene;

        /**
         * <p>The ID of the protection policy.</p>
         */
        @NameInMap("PolicyId")
        public Long policyId;

        @NameInMap("PolicyIds")
        public String policyIds;

        public static DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes self = new DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes setDefenseScene(String defenseScene) {
            this.defenseScene = defenseScene;
            return this;
        }
        public String getDefenseScene() {
            return this.defenseScene;
        }

        public DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes setPolicyId(Long policyId) {
            this.policyId = policyId;
            return this;
        }
        public Long getPolicyId() {
            return this.policyId;
        }

        public DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes setPolicyIds(String policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public String getPolicyIds() {
            return this.policyIds;
        }

    }

    public static class DescribeDcdnWafDomainDetailResponseBodyDomain extends TeaModel {
        /**
         * <p>The types of the protection policies.</p>
         */
        @NameInMap("DefenseScenes")
        public java.util.List<DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes> defenseScenes;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        public static DescribeDcdnWafDomainDetailResponseBodyDomain build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnWafDomainDetailResponseBodyDomain self = new DescribeDcdnWafDomainDetailResponseBodyDomain();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnWafDomainDetailResponseBodyDomain setDefenseScenes(java.util.List<DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes> defenseScenes) {
            this.defenseScenes = defenseScenes;
            return this;
        }
        public java.util.List<DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes> getDefenseScenes() {
            return this.defenseScenes;
        }

        public DescribeDcdnWafDomainDetailResponseBodyDomain setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

}
