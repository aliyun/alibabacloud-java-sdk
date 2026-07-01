// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobRequest extends TeaModel {
    /**
     * <p>A client-generated token that ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Test ClientToken</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The job description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Configuration parameters for the video translation job, specified as a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;DetextArea&quot;:&quot;Auto&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The input parameters for the video translation job.</p>
     * <ul>
     * <li><p>The input can be a video or a subtitle file.</p>
     * </li>
     * <li><p>The value must be a JSON string.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;Video&quot;,&quot;Video&quot;:&quot;1628ae20c36******8f6f7c77a6302&quot;}</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>Output parameters for the video translation job. The output can be a video or a subtitle file.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;: &quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4&quot;}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Signature")
    public String signature;

    /**
     * <p>The system automatically populates this parameter. You do not need to set it.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto-complete, no need to write</p>
     */
    @NameInMap("SignatureMehtod")
    public String signatureMehtod;

    @NameInMap("SignatureNonce")
    public String signatureNonce;

    /**
     * <p>The system automatically populates this parameter. You do not need to set it.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto-complete, no need to write</p>
     */
    @NameInMap("SignatureType")
    public String signatureType;

    @NameInMap("SignatureVersion")
    public String signatureVersion;

    /**
     * <p>The job title.</p>
     * 
     * <strong>example:</strong>
     * <p>Test title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>User data for the job, provided as a JSON string. The string can be up to 512 bytes long.</p>
     * <ul>
     * <li>Use this parameter to <a href="https://help.aliyun.com/document_detail/451631.html">configure a custom callback URL</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a></p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitVideoTranslationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoTranslationJobRequest self = new SubmitVideoTranslationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoTranslationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitVideoTranslationJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitVideoTranslationJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitVideoTranslationJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitVideoTranslationJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitVideoTranslationJobRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public SubmitVideoTranslationJobRequest setSignatureMehtod(String signatureMehtod) {
        this.signatureMehtod = signatureMehtod;
        return this;
    }
    public String getSignatureMehtod() {
        return this.signatureMehtod;
    }

    public SubmitVideoTranslationJobRequest setSignatureNonce(String signatureNonce) {
        this.signatureNonce = signatureNonce;
        return this;
    }
    public String getSignatureNonce() {
        return this.signatureNonce;
    }

    public SubmitVideoTranslationJobRequest setSignatureType(String signatureType) {
        this.signatureType = signatureType;
        return this;
    }
    public String getSignatureType() {
        return this.signatureType;
    }

    public SubmitVideoTranslationJobRequest setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
        return this;
    }
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

    public SubmitVideoTranslationJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitVideoTranslationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
