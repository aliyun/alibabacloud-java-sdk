// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class IssueNormalVerifiableVCRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BareClaimStructBody")
    public java.util.List<IssueNormalVerifiableVCRequestBareClaimStructBody> bareClaimStructBody;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01357967-61d1-42a9-8a90-f0dd8a161411</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxx&quot;</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxx&quot;</p>
     */
    @NameInMap("Subject")
    public String subject;

    public static IssueNormalVerifiableVCRequest build(java.util.Map<String, ?> map) throws Exception {
        IssueNormalVerifiableVCRequest self = new IssueNormalVerifiableVCRequest();
        return TeaModel.build(map, self);
    }

    public IssueNormalVerifiableVCRequest setBareClaimStructBody(java.util.List<IssueNormalVerifiableVCRequestBareClaimStructBody> bareClaimStructBody) {
        this.bareClaimStructBody = bareClaimStructBody;
        return this;
    }
    public java.util.List<IssueNormalVerifiableVCRequestBareClaimStructBody> getBareClaimStructBody() {
        return this.bareClaimStructBody;
    }

    public IssueNormalVerifiableVCRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public IssueNormalVerifiableVCRequest setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public IssueNormalVerifiableVCRequest setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public IssueNormalVerifiableVCRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public static class IssueNormalVerifiableVCRequestBareClaimStructBody extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;test&quot;</p>
         */
        @NameInMap("Claim")
        public String claim;

        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("ClaimType")
        public String claimType;

        public static IssueNormalVerifiableVCRequestBareClaimStructBody build(java.util.Map<String, ?> map) throws Exception {
            IssueNormalVerifiableVCRequestBareClaimStructBody self = new IssueNormalVerifiableVCRequestBareClaimStructBody();
            return TeaModel.build(map, self);
        }

        public IssueNormalVerifiableVCRequestBareClaimStructBody setClaim(String claim) {
            this.claim = claim;
            return this;
        }
        public String getClaim() {
            return this.claim;
        }

        public IssueNormalVerifiableVCRequestBareClaimStructBody setClaimType(String claimType) {
            this.claimType = claimType;
            return this;
        }
        public String getClaimType() {
            return this.claimType;
        }

    }

}
