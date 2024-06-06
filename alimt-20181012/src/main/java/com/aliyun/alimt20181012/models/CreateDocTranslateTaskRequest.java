// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class CreateDocTranslateTaskRequest extends TeaModel {
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static CreateDocTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocTranslateTaskRequest self = new CreateDocTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocTranslateTaskRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public CreateDocTranslateTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDocTranslateTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateDocTranslateTaskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateDocTranslateTaskRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public CreateDocTranslateTaskRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
