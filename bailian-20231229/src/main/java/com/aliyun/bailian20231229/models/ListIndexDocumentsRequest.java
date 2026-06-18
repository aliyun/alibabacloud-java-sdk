// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexDocumentsRequest extends TeaModel {
    /**
     * <p>Filters the returned file list by file name (without the file extension). Default value: empty, which means the results are not filtered by file name.</p>
     * 
     * <strong>example:</strong>
     * <p>product-overview</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>Filters the returned file list by file import status. Valid values:</p>
     * <ul>
     * <li>INSERT_ERROR: The file failed to be imported.</li>
     * <li>RUNNING: The file is being imported.</li>
     * <li>DELETED: The file has been deleted.</li>
     * <li>FINISH: The file was imported.</li>
     * </ul>
     * <p>Default value: empty, which means the results are not filtered by file import status.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("DocumentStatus")
    public String documentStatus;

    /**
     * <p>Specifies whether to enable fuzzy matching for file names. This parameter is used together with the <code>DocumentName</code> parameter. Valid values:</p>
     * <ul>
     * <li>true: Fuzzy matching is used to filter the returned file list by file name.</li>
     * <li>false: Exact matching is used to filter the returned file list by file name.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableNameLike")
    public String enableNameLike;

    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of files to display per page in a paging query. No maximum limit.
     * Default value: 10.</p>
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
