// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForAddingDSRecordRequest extends TeaModel {
    /**
     * <p>The encryption algorithm number. For more information, see <a href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xhtml">Domain Name System Security (DNSSEC) Algorithm Numbers</a>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: RSA/MD5.</li>
     * <li><strong>2</strong>: Diffie-Hellman.</li>
     * <li><strong>3</strong>: DSA/SHA-1.</li>
     * <li><strong>5</strong>: RSA/SHA-1.</li>
     * <li><strong>6</strong>: DSA-NSEC3-SHA1.</li>
     * <li><strong>7</strong>: RSASHA1-NSEC3-SHA1.</li>
     * <li><strong>8</strong>: RSA/SHA-256.</li>
     * <li><strong>10</strong>: RSA/SHA-512.</li>
     * <li><strong>12</strong>: GOST R 34.10-2001.</li>
     * <li><strong>13</strong>: ECDSA Curve P-256 with SHA-256.</li>
     * <li><strong>14</strong>: ECDSA Curve P-384 with SHA-384.</li>
     * <li><strong>15</strong>: Ed25519 and Ed448.</li>
     * <li><strong>252</strong>: Reserved for Indirect Keys.</li>
     * <li><strong>253</strong>: private algorithm.</li>
     * <li><strong>254</strong>: private algorithm OID.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Algorithm")
    public Integer algorithm;

    /**
     * <p>Summary.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f58fa917424383934c7b0cf1a90f61d692745680fa06f5ecdbe0924e86de9598</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>Summary algorithm type. For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms</a>. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: SHA-1;</li>
     * <li><strong>2</strong>: SHA-256;</li>
     * <li><strong>3</strong>: GOST R 34.11-94;</li>
     * <li><strong>4</strong>: SHA-384.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DigestType")
    public Integer digestType;

    /**
     * <p>Domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Key tag used to identify DNSSEC records. It is an integer less than 65536.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KeyTag")
    public Integer keyTag;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese;</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForAddingDSRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForAddingDSRecordRequest self = new SaveSingleTaskForAddingDSRecordRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForAddingDSRecordRequest setAlgorithm(Integer algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public Integer getAlgorithm() {
        return this.algorithm;
    }

    public SaveSingleTaskForAddingDSRecordRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public SaveSingleTaskForAddingDSRecordRequest setDigestType(Integer digestType) {
        this.digestType = digestType;
        return this;
    }
    public Integer getDigestType() {
        return this.digestType;
    }

    public SaveSingleTaskForAddingDSRecordRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SaveSingleTaskForAddingDSRecordRequest setKeyTag(Integer keyTag) {
        this.keyTag = keyTag;
        return this;
    }
    public Integer getKeyTag() {
        return this.keyTag;
    }

    public SaveSingleTaskForAddingDSRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForAddingDSRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
