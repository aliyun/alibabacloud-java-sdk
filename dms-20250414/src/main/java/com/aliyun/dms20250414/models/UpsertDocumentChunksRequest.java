// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpsertDocumentChunksRequest extends TeaModel {
    /**
     * <p>A list of document chunks to upsert.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   {
     *     &quot;Id&quot;: &quot;2e12aeb5-52cd-4834-bcd8-<strong><strong>&quot;,
     *     &quot;Content&quot;: &quot;test1&quot;
     *   },
     *   {
     *     &quot;Id&quot;: &quot;2fdnwefi5-dsad-4t35-bcd8-</strong></strong>&quot;,
     *     &quot;Content&quot;: &quot;test2&quot;
     *   }
     * ]</p>
     */
    @NameInMap("Chunks")
    public String chunks;

    /**
     * <p>The name of the document.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test.md</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>The unique identifier for the knowledge base.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kb-***</p>
     */
    @NameInMap("KbUuid")
    public String kbUuid;

    public static UpsertDocumentChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        UpsertDocumentChunksRequest self = new UpsertDocumentChunksRequest();
        return TeaModel.build(map, self);
    }

    public UpsertDocumentChunksRequest setChunks(String chunks) {
        this.chunks = chunks;
        return this;
    }
    public String getChunks() {
        return this.chunks;
    }

    public UpsertDocumentChunksRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public UpsertDocumentChunksRequest setKbUuid(String kbUuid) {
        this.kbUuid = kbUuid;
        return this;
    }
    public String getKbUuid() {
        return this.kbUuid;
    }

}
