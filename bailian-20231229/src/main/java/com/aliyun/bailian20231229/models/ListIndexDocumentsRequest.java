// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexDocumentsRequest extends TeaModel {
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("DocumentStatus")
    public String documentStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListIndexDocumentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexDocumentsRequest self = new ListIndexDocumentsRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexDocumentsRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public ListIndexDocumentsRequest setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
        return this;
    }
    public String getDocumentStatus() {
        return this.documentStatus;
    }

    public ListIndexDocumentsRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ListIndexDocumentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIndexDocumentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
