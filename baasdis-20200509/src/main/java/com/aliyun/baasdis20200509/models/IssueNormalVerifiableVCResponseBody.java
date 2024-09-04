// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class IssueNormalVerifiableVCResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;4D1E29A7-17D6-48AD-B5AF-F44FAB68D87D&quot;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>&quot;OK&quot;</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>&quot;{\&quot;proof\&quot;:{\&quot;type\&quot;:\&quot;ecdsa\&quot;,\&quot;verificationMethod\&quot;:\&quot;did:mychain:xxx#keys-1\&quot;,\&quot;signatureValue\&quot;:\&quot;xxx\&quot;},\&quot;content\&quot;:{\&quot;issuanceDate\&quot;:1590127960785,\&quot;subject\&quot;:\&quot;did:mychain:xxx\&quot;,\&quot;expire\&quot;:-1,\&quot;claim\&quot;:\&quot;test\&quot;,\&quot;id\&quot;:\&quot;vc:mychain:xxx\&quot;,\&quot;type\&quot;:[\&quot;VerifiableCredential\&quot;],\&quot;version\&quot;:\&quot;0.7.0\&quot;,\&quot;@context\&quot;:\&quot;<a href="https://www.w3.org/2018/credentials/v1%5C%5C%22,%5C%5C%22issuer%5C%5C%22:%5C%5C%22did:mychain:xxx%5C%5C%22,%5C%5C%22status%5C%5C%22:%7B%5C%5C%22id%5C%5C%22:%5C%5C%22vc:mychain:xxx%5C%5C%22,%5C%5C%22type%5C%5C%22:%5C%5C%22BlockChainStatusList%5C%5C%22%7D%7D%7D">https://www.w3.org/2018/credentials/v1\\&quot;,\\&quot;issuer\\&quot;:\\&quot;did:mychain:xxx\\&quot;,\\&quot;status\\&quot;:{\\&quot;id\\&quot;:\\&quot;vc:mychain:xxx\\&quot;,\\&quot;type\\&quot;:\\&quot;BlockChainStatusList\\&quot;}}}</a>&quot;</p>
     */
    @NameInMap("VerifiableClaimContent")
    public String verifiableClaimContent;

    /**
     * <strong>example:</strong>
     * <p>&quot;vc:mychain:xxx&quot;</p>
     */
    @NameInMap("VerifiableClaimId")
    public String verifiableClaimId;

    public static IssueNormalVerifiableVCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IssueNormalVerifiableVCResponseBody self = new IssueNormalVerifiableVCResponseBody();
        return TeaModel.build(map, self);
    }

    public IssueNormalVerifiableVCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IssueNormalVerifiableVCResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public IssueNormalVerifiableVCResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public IssueNormalVerifiableVCResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IssueNormalVerifiableVCResponseBody setVerifiableClaimContent(String verifiableClaimContent) {
        this.verifiableClaimContent = verifiableClaimContent;
        return this;
    }
    public String getVerifiableClaimContent() {
        return this.verifiableClaimContent;
    }

    public IssueNormalVerifiableVCResponseBody setVerifiableClaimId(String verifiableClaimId) {
        this.verifiableClaimId = verifiableClaimId;
        return this;
    }
    public String getVerifiableClaimId() {
        return this.verifiableClaimId;
    }

}
