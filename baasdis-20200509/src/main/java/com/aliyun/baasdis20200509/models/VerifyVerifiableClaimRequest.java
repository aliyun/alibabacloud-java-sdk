// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class VerifyVerifiableClaimRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;proof&quot;: {&quot;type&quot;: &quot;ecdsa&quot;,&quot;verificationMethod&quot;: &quot;did:mychain:xxx#keys-1&quot;,&quot;signatureValue&quot;: &quot;xxx&quot;},&quot;content&quot;: {&quot;issuanceDate&quot;: 1589964299367,&quot;subject&quot;: &quot;did:mychain:xxx&quot;,&quot;expire&quot;: -1,&quot;claim&quot;: &quot;test01&quot;,&quot;id&quot;: &quot;vc:mychain:xxx&quot;,&quot;type&quot;: [&quot;VerifiableCredential&quot;],&quot;version&quot;: &quot;0.7.0&quot;,&quot;@context&quot;: &quot;<a href="https://www.w3.org/2018/credentials/v1%22,%22issuer">https://www.w3.org/2018/credentials/v1&quot;,&quot;issuer</a>&quot;: &quot;did:mychain:xxx&quot;,&quot;status&quot;: {&quot;id&quot;: &quot;vc:mychain:xxx&quot;,&quot;type&quot;: &quot;BlockChainStatusList&quot;}}}</p>
     */
    @NameInMap("VCContent")
    public String VCContent;

    public static VerifyVerifiableClaimRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyVerifiableClaimRequest self = new VerifyVerifiableClaimRequest();
        return TeaModel.build(map, self);
    }

    public VerifyVerifiableClaimRequest setVCContent(String VCContent) {
        this.VCContent = VCContent;
        return this;
    }
    public String getVCContent() {
        return this.VCContent;
    }

}
