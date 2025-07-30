// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetDomainDnsChallengeResponseBody extends TeaModel {
    /**
     * <p>The DNS challenge records.</p>
     */
    @NameInMap("DomainDnsChallenge")
    public GetDomainDnsChallengeResponseBodyDomainDnsChallenge domainDnsChallenge;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
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
         * <p>The name of the DNS challenge record.</p>
         * 
         * <strong>example:</strong>
         * <p>_idaas-challenge.${domain}</p>
         */
        @NameInMap("DnsChallengeName")
        public String dnsChallengeName;

        /**
         * <p>The value of the DNS challenge record.</p>
         * 
         * <strong>example:</strong>
         * <p>exmple123xxx</p>
         */
        @NameInMap("DnsChallengeValue")
        public String dnsChallengeValue;

        /**
         * <p>The type of the DNS challenge record.</p>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
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
