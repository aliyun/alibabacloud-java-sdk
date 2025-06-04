// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexDocumentsRequest extends TeaModel {
    /**
     * <p>The names of the queried documents. The default value is null, which means the names are not used to filter the results.</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>The import status of the documents to be queried. Valid values:</p>
     * <ul>
     * <li>INSERT_ERROR</li>
     * <li>RUNNING</li>
     * <li>DELETED</li>
     * <li>FINISH</li>
     * </ul>
     * <p>The default value is null, which means the import status is not used to filter the results.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("DocumentStatus")
    public String documentStatus;

    @NameInMap("EnableNameLike")
    public String enableNameLike;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://www.alibabacloud.com/help/en/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0aly8zw</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The page numbers of the pages to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of documents displayed on each page. No maximum value. Default value: 10.</p>
     * 
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

    public ListIndexDocumentsRequest setEnableNameLike(String enableNameLike) {
        this.enableNameLike = enableNameLike;
        return this;
    }
    public String getEnableNameLike() {
        return this.enableNameLike;
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
