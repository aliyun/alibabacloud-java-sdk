// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("SignatureMehtod")
    public String signatureMehtod;

    @NameInMap("SignatureNonce")
    public String signatureNonce;

    @NameInMap("SignatureType")
    public String signatureType;

    @NameInMap("SignatureVersion")
    public String signatureVersion;

    public static GetBatchMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchMediaProducingJobRequest self = new GetBatchMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchMediaProducingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetBatchMediaProducingJobRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetBatchMediaProducingJobRequest setSignatureMehtod(String signatureMehtod) {
        this.signatureMehtod = signatureMehtod;
        return this;
    }
    public String getSignatureMehtod() {
        return this.signatureMehtod;
    }

    public GetBatchMediaProducingJobRequest setSignatureNonce(String signatureNonce) {
        this.signatureNonce = signatureNonce;
        return this;
    }
    public String getSignatureNonce() {
        return this.signatureNonce;
    }

    public GetBatchMediaProducingJobRequest setSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }
    public String getSignatureType() {
        return this.signatureType;
    }

    public GetBatchMediaProducingJobRequest setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
        return this;
    }
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

}
