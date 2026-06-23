// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetParseResultRequest extends TeaModel {
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
     * <p>The document library ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sjdgdsfg</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>Specifies whether to return the result as a URL. If true, the parsing result is in resultUrl, and result is empty. If false, the parsing result is in result, and resultUrl is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("useUrlResult")
    public Boolean useUrlResult;

    public static GetParseResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParseResultRequest self = new GetParseResultRequest();
        return TeaModel.build(map, self);
    }

    public GetParseResultRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public GetParseResultRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public GetParseResultRequest setUseUrlResult(Boolean useUrlResult) {
        this.useUrlResult = useUrlResult;
        return this;
    }
    public Boolean getUseUrlResult() {
        return this.useUrlResult;
    }

}
