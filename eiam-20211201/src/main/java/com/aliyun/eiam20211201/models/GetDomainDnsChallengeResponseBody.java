// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainDnsChallengeResponseBody extends TeaModel {
    @NameInMap("DomainDnsChallenge")
    public GetDomainDnsChallengeResponseBodyDomainDnsChallenge domainDnsChallenge;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDomainDnsChallengeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDomainDnsChallengeResponseBody self = new GetDomainDnsChallengeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDomainDnsChallengeResponseBody setDomainDnsChallenge(GetDomainDnsChallengeResponseBodyDomainDnsChallenge domainDnsChallenge) {
        this.domainDnsChallenge = domainDnsChallenge;
        return this;
    }
    public GetDomainDnsChallengeResponseBodyDomainDnsChallenge getDomainDnsChallenge() {
        return this.domainDnsChallenge;
    }

    public GetDomainDnsChallengeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDomainDnsChallengeResponseBodyDomainDnsChallenge extends TeaModel {
        /**
         * <p>DNS challenge名称。</p>
         */
        @NameInMap("DnsChallengeName")
        public String dnsChallengeName;

        /**
         * <p>DNS challenge值。</p>
         */
        @NameInMap("DnsChallengeValue")
        public String dnsChallengeValue;

        /**
         * <p>DNS记录类型。</p>
         */
        @NameInMap("DnsType")
        public String dnsType;

        public static GetDomainDnsChallengeResponseBodyDomainDnsChallenge build(java.util.Map<String, ?> map) throws Exception {
            GetDomainDnsChallengeResponseBodyDomainDnsChallenge self = new GetDomainDnsChallengeResponseBodyDomainDnsChallenge();
            return TeaModel.build(map, self);
        }

        public GetDomainDnsChallengeResponseBodyDomainDnsChallenge setDnsChallengeName(String dnsChallengeName) {
            this.dnsChallengeName = dnsChallengeName;
            return this;
        }
        public String getDnsChallengeName() {
            return this.dnsChallengeName;
        }

        public GetDomainDnsChallengeResponseBodyDomainDnsChallenge setDnsChallengeValue(String dnsChallengeValue) {
            this.dnsChallengeValue = dnsChallengeValue;
            return this;
        }
        public String getDnsChallengeValue() {
            return this.dnsChallengeValue;
        }

        public GetDomainDnsChallengeResponseBodyDomainDnsChallenge setDnsType(String dnsType) {
            this.dnsType = dnsType;
            return this;
        }
        public String getDnsType() {
            return this.dnsType;
        }

    }

}
