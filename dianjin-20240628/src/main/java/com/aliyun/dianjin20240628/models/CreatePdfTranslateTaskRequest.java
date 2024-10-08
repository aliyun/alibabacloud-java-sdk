// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreatePdfTranslateTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>873648346573245</p>
     */
    @NameInMap("docId")
    public String docId;

    @NameInMap("knowledge")
    public String knowledge;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cjshcxxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>中文</p>
     */
    @NameInMap("translateTo")
    public String translateTo;

    public static CreatePdfTranslateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdfTranslateTaskRequest self = new CreatePdfTranslateTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdfTranslateTaskRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public CreatePdfTranslateTaskRequest setKnowledge(String knowledge) {
        this.knowledge = knowledge;
        return this;
    }
    public String getKnowledge() {
        return this.knowledge;
    }

    public CreatePdfTranslateTaskRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public CreatePdfTranslateTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreatePdfTranslateTaskRequest setTranslateTo(String translateTo) {
        this.translateTo = translateTo;
        return this;
    }
    public String getTranslateTo() {
        return this.translateTo;
    }

}
