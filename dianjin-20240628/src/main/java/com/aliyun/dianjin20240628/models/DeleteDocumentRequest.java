// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class DeleteDocumentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("docIds")
    public java.util.List<String> docIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3akzl28vap</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    public static DeleteDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentRequest self = new DeleteDocumentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentRequest setDocIds(java.util.List<String> docIds) {
        this.docIds = docIds;
        return this;
    }
    public java.util.List<String> getDocIds() {
        return this.docIds;
    }

    public DeleteDocumentRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
