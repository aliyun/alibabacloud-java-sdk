// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreatePdfTranslateTaskRequest extends TeaModel {
    /**
     * <p>Document ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>873648346573245</p>
     */
    @NameInMap("docId")
    public String docId;

    /**
     * <p>Domain knowledge used as reference during translation</p>
     * 
     * <strong>example:</strong>
     * <p>净利润 (Net Profit)
     * 英文：Net Profit
     * 中文：净利润（通常指扣除所有费用和税后的利润）</p>
     */
    @NameInMap("knowledge")
    public String knowledge;

    /**
     * <p>Document library ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cjshcxxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>Model ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>Target language. Default is Chinese</p>
     * 
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
