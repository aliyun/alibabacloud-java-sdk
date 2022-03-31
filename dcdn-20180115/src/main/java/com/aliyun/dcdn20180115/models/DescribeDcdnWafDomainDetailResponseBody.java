// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainDetailResponseBody extends TeaModel {
    @NameInMap("Domain")
    public DescribeDcdnWafDomainDetailResponseBodyDomain domain;

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
        @NameInMap("DefenseScene")
        public String defenseScene;

        @NameInMap("PolicyId")
        public Long policyId;

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

    }

    public static class DescribeDcdnWafDomainDetailResponseBodyDomain extends TeaModel {
        @NameInMap("DefenseScenes")
        public java.util.List<DescribeDcdnWafDomainDetailResponseBodyDomainDefenseScenes> defenseScenes;

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
