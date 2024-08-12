// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("docId")
    public String docId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc123</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <strong>example:</strong>
     * <p>{
     *         &quot;businessId&quot;: &quot;12321&quot;
     *     }</p>
     */
    @NameInMap("meta")
    public java.util.Map<String, ?> meta;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("title")
    public String title;

    public static UpdateDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDocumentRequest self = new UpdateDocumentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDocumentRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public UpdateDocumentRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public UpdateDocumentRequest setMeta(java.util.Map<String, ?> meta) {
        this.meta = meta;
        return this;
    }
    public java.util.Map<String, ?> getMeta() {
        return this.meta;
    }

    public UpdateDocumentRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
