// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDocumentChunksShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChunkIds")
    public String chunkIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.md</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    public static DeleteDocumentChunksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentChunksShrinkRequest self = new DeleteDocumentChunksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentChunksShrinkRequest setChunkIdsShrink(String chunkIdsShrink) {
        this.chunkIdsShrink = chunkIdsShrink;
        return this;
    }
    public String getChunkIdsShrink() {
        return this.chunkIdsShrink;
    }

    public DeleteDocumentChunksShrinkRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public DeleteDocumentChunksShrinkRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

}
