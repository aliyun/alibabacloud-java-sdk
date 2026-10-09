// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreatePdfTranslateTaskRequest extends TeaModel {
    /**
     * <p>The document ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>873648346573245</p>
     */
    @NameInMap("docId")
    public String docId;

    /**
     * <p>The domain knowledge referenced during translation.</p>
     * 
     * <strong>example:</strong>
     * <p>Net Profit
     * English: Net Profit
     * Chinese: Net profit (typically refers to the profit after deducting all expenses and taxes)</p>
     */
    @NameInMap("knowledge")
    public String knowledge;

    /**
     * <p>The document library ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cjshcxxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>The target language. Default value: Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>Chinese</p>
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
