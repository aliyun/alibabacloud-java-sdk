// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetChallengeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eyJhbGciOiJSUzM4NCIsInR5cCI6IkpXVCJ9.eyJub25jZSI6Im1OWnpNVENTc3JVT1JTd1d1WFNneDlTNG80MW1Mc3FPS21xd0d4Tzk******E3NTU5NzIzMDB9.signature-part...=</p>
     */
    @NameInMap("ChallengeToken")
    public String challengeToken;

    /**
     * <strong>example:</strong>
     * <p>mNZzMTCQ******4o1mLsqOKmqwGxO94i9c=</p>
     */
    @NameInMap("Nonce")
    public String nonce;

    /**
     * <strong>example:</strong>
     * <p>c337a6ee-27d1-465e-acb2-dddef7c3c589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChallengeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChallengeResponseBody self = new GetChallengeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChallengeResponseBody setChallengeToken(String challengeToken) {
        this.challengeToken = challengeToken;
        return this;
    }
    public String getChallengeToken() {
        return this.challengeToken;
    }

    public GetChallengeResponseBody setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public GetChallengeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
