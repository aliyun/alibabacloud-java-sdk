// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDSRecordResponseBody extends TeaModel {
    /**
     * <p>List of DS records.</p>
     */
    @NameInMap("DSRecordList")
    public java.util.List<QueryDSRecordResponseBodyDSRecordList> DSRecordList;

    /**
     * <p>Unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>814B2AF0-ED6F-4C13-B41C-8AC0B1023583</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDSRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDSRecordResponseBody self = new QueryDSRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDSRecordResponseBody setDSRecordList(java.util.List<QueryDSRecordResponseBodyDSRecordList> DSRecordList) {
        this.DSRecordList = DSRecordList;
        return this;
    }
    public java.util.List<QueryDSRecordResponseBodyDSRecordList> getDSRecordList() {
        return this.DSRecordList;
    }

    public QueryDSRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDSRecordResponseBodyDSRecordList extends TeaModel {
        /**
         * <p>Encryption algorithm number. For more information, see <a href="https://www.iana.org/assignments/dns-sec-alg-numbers/dns-sec-alg-numbers.xhtml">Domain Name System Security (DNSSEC) Algorithm Numbers</a>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: RSA/MD5;</li>
         * <li><strong>2</strong>: Diffie-Hellman;</li>
         * <li><strong>3</strong>: DSA/SHA-1;</li>
         * <li><strong>5</strong>: RSA/SHA-1;</li>
         * <li><strong>6</strong>: DSA-NSEC3-SHA1;</li>
         * <li><strong>7</strong>: RSASHA1-NSEC3-SHA1;</li>
         * <li><strong>8</strong>: RSA/SHA-256;</li>
         * <li><strong>10</strong>: RSA/SHA-512;</li>
         * <li><strong>12</strong>: GOST R 34.10-2001;</li>
         * <li><strong>13</strong>: ECDSA Curve P-256 with SHA-256;</li>
         * <li><strong>14</strong>: ECDSA Curve P-384 with SHA-384;</li>
         * <li><strong>15</strong>: Ed25519;</li>
         * <li><strong>16</strong>: Ed448;</li>
         * <li><strong>252</strong>: Reserved for Indirect Keys;</li>
         * <li><strong>253</strong>: private algorithm;</li>
         * <li><strong>254</strong>: private algorithm OID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>Digest value.</p>
         * 
         * <strong>example:</strong>
         * <p>f58fa917424383934c7b0cf1a90f61d692745680fa06f5ecdbe0924e86de9598</p>
         */
        @NameInMap("Digest")
        public String digest;

        /**
         * <p>Digest algorithm type. For more information, see <a href="https://www.iana.org/assignments/ds-rr-types/ds-rr-types.xhtml">Delegation Signer (DS) Resource Record (RR) Type Digest Algorithms</a>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: SHA-1;</li>
         * <li><strong>2</strong>: SHA-256;</li>
         * <li><strong>3</strong>: GOST R 34.11-94;</li>
         * <li><strong>4</strong>: SHA-384.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DigestType")
        public Integer digestType;

        /**
         * <p>Key tag used to identify DNSSEC records. It is an integer less than 65536.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        public static QueryDSRecordResponseBodyDSRecordList build(java.util.Map<String, ?> map) throws Exception {
            QueryDSRecordResponseBodyDSRecordList self = new QueryDSRecordResponseBodyDSRecordList();
            return TeaModel.build(map, self);
        }

        public QueryDSRecordResponseBodyDSRecordList setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public QueryDSRecordResponseBodyDSRecordList setDigest(String digest) {
            this.digest = digest;
            return this;
        }
        public String getDigest() {
            return this.digest;
        }

        public QueryDSRecordResponseBodyDSRecordList setDigestType(Integer digestType) {
            this.digestType = digestType;
            return this;
        }
        public Integer getDigestType() {
            return this.digestType;
        }

        public QueryDSRecordResponseBodyDSRecordList setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

    }

}
