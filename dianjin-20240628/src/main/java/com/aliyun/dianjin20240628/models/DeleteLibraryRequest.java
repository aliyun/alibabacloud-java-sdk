// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class DeleteLibraryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>skdfefxxx</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    public static DeleteLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLibraryRequest self = new DeleteLibraryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLibraryRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

}
