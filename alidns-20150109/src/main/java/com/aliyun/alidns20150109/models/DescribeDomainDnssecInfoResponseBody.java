// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoResponseBody extends TeaModel {
    @NameInMap("Algorithm")
    public String algorithm;

    @NameInMap("Digest")
    public String digest;

    @NameInMap("DigestType")
    public String digestType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DsRecord")
    public String dsRecord;

    @NameInMap("Flags")
    public String flags;

    @NameInMap("KeyTag")
    public String keyTag;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeDomainDnssecInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDnssecInfoResponseBody self = new DescribeDomainDnssecInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDnssecInfoResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DescribeDomainDnssecInfoResponseBody setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public DescribeDomainDnssecInfoResponseBody setDigestType(String digestType) {
        this.digestType = digestType;
        return this;
    }
    public String getDigestType() {
        return this.digestType;
    }

    public DescribeDomainDnssecInfoResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainDnssecInfoResponseBody setDsRecord(String dsRecord) {
        this.dsRecord = dsRecord;
        return this;
    }
    public String getDsRecord() {
        return this.dsRecord;
    }

    public DescribeDomainDnssecInfoResponseBody setFlags(String flags) {
        this.flags = flags;
        return this;
    }
    public String getFlags() {
        return this.flags;
    }

    public DescribeDomainDnssecInfoResponseBody setKeyTag(String keyTag) {
        this.keyTag = keyTag;
        return this;
    }
    public String getKeyTag() {
        return this.keyTag;
    }

    public DescribeDomainDnssecInfoResponseBody setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public DescribeDomainDnssecInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainDnssecInfoResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
