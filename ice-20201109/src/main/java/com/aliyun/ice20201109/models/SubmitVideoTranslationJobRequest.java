// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitVideoTranslationJobRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>Test ClientToken</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The task description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The configuration parameters for the video translation task. Must be in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;SourceLanguage&quot;:&quot;zh&quot;,&quot;TargetLanguage&quot;:&quot;en&quot;,&quot;DetextArea&quot;:&quot;Auto&quot;}</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <p>The input parameters for the video translation task.</p>
     * <ul>
     * <li>Supports videos and subtitle files as input.</li>
     * <li>Must be in JSON format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;Video&quot;,&quot;Video&quot;:&quot;1628ae20c36******8f6f7c77a6302&quot;}</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The output parameters for the video translation task. Supports video and subtitle file types as output.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;: &quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/your-object.mp4&quot;}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Automatically populated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto-complete, no need to write</p>
     */
    @NameInMap("SignatureMehtod")
    public String signatureMehtod;

    @NameInMap("SignatureNonce")
    public String signatureNonce;

    /**
     * <p>Automatically populated. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Auto-complete, no need to write</p>
     */
    @NameInMap("SignatureType")
    public String signatureType;

    @NameInMap("SignatureVersion")
    public String signatureVersion;

    /**
     * <p>The task title.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Title</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The custom information in JSON format. The maximum length is 512 bytes.</p>
     * <ul>
     * <li><a href="https://help.aliyun.com/document_detail/451631.html">Supports custom callback URL configuration</a></li>
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
