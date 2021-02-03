// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("DsRecord")
    @Validation(required = true)
    public String dsRecord;

    @NameInMap("Digest")
    @Validation(required = true)
    public String digest;

    @NameInMap("DigestType")
    @Validation(required = true)
    public String digestType;

    @NameInMap("Algorithm")
    @Validation(required = true)
    public String algorithm;

    @NameInMap("PublicKey")
    @Validation(required = true)
    public String publicKey;

    @NameInMap("KeyTag")
    @Validation(required = true)
    public String keyTag;

    @NameInMap("Flags")
    @Validation(required = true)
    public String flags;

    public static DescribeDomainDnssecInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainDnssecInfoResponse self = new DescribeDomainDnssecInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainDnssecInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainDnssecInfoResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDomainDnssecInfoResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDomainDnssecInfoResponse setDsRecord(String dsRecord) {
        this.dsRecord = dsRecord;
        return this;
    }
    public String getDsRecord() {
        return this.dsRecord;
    }

    public DescribeDomainDnssecInfoResponse setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public DescribeDomainDnssecInfoResponse setDigestType(String digestType) {
        this.digestType = digestType;
        return this;
    }
    public String getDigestType() {
        return this.digestType;
    }

    public DescribeDomainDnssecInfoResponse setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DescribeDomainDnssecInfoResponse setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public DescribeDomainDnssecInfoResponse setKeyTag(String keyTag) {
        this.keyTag = keyTag;
        return this;
    }
    public String getKeyTag() {
        return this.keyTag;
    }

    public DescribeDomainDnssecInfoResponse setFlags(String flags) {
        this.flags = flags;
        return this;
    }
    public String getFlags() {
        return this.flags;
    }

}
