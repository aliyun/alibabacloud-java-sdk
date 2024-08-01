// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainDnssecInfoResponseBody extends TeaModel {
    /**
     * <p>The algorithm type. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The digest. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>C1A0424B97A049F1F9B2EA139CC298533219668164E343BD21203ABC4608C02A</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The digest type. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>SHA256</p>
     */
    @NameInMap("DigestType")
    public String digestType;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The delegation signer (DS) record. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com. 3600 IN DS 2371 13 2 C1A0424B97A049F1F9B2EA139CC298533219668164E343BD21203ABC4608C02A</p>
     */
    @NameInMap("DsRecord")
    public String dsRecord;

    /**
     * <p>The flag. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>257 (KSK)</p>
     */
    @NameInMap("Flags")
    public String flags;

    /**
     * <p>The key tag. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>54931</p>
     */
    @NameInMap("KeyTag")
    public String keyTag;

    /**
     * <p>The public key. This parameter is returned if DNSSEC is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>mdsswUyr3DPW132mOi8V9xESWE8jTo0dxCjjnopKl+GqJxpVXckHAeF+KkxLbxILfDLUT0rAK9iUzy1L53eKGQ==</p>
     */
    @NameInMap("PublicKey")
    public String publicKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the DNSSEC. Valid values:</p>
     * <ul>
     * <li>ON</li>
     * <li>OFF</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ON</p>
     */
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
