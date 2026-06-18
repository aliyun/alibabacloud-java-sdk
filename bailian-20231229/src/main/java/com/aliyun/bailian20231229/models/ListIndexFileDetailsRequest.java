// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexFileDetailsRequest extends TeaModel {
    /**
     * <p>The name of the documents to return. If you do not specify this parameter, the results are not filtered by name.</p>
     * 
     * <strong>example:</strong>
     * <p>翻译平台运维文档</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>The import status of the documents to return. Valid values:</p>
     * <ul>
     * <li><p>INSERT_ERROR: The document failed to be imported.</p>
     * </li>
     * <li><p>RUNNING: The document is being imported.</p>
     * </li>
     * <li><p>DELETED: The document has been deleted.</p>
     * </li>
     * <li><p>FINISH: The document was imported successfully.</p>
     * </li>
     * </ul>
     * <p>If you do not specify this parameter, the results are not filtered by import status.</p>
     * 
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("DocumentStatus")
    public String documentStatus;

    /**
     * <p>Specifies whether to perform a fuzzy search based on the document name. This parameter is used with the <code>DocumentName</code> parameter. Valid values:</p>
     * <ul>
     * <li><p>true: Performs a fuzzy search based on the document name.</p>
     * </li>
     * <li><p>false: Performs an exact match based on the document name.</p>
     * </li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableNameLike")
    public String enableNameLike;

    /**
     * <p>The ID of the knowledge base. This is the value of the <code>Data.Id</code> parameter returned by the <strong>CreateIndex</strong> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The number of the page to return. The value starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of documents to return on each page. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListIndexFileDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexFileDetailsRequest self = new ListIndexFileDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexFileDetailsRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public ListIndexFileDetailsRequest setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
        return this;
    }
    public String getDocumentStatus() {
        return this.documentStatus;
    }

    public ListIndexFileDetailsRequest setEnableNameLike(String enableNameLike) {
        this.enableNameLike = enableNameLike;
        return this;
    }
    public String getEnableNameLike() {
        return this.enableNameLike;
    }

    public ListIndexFileDetailsRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ListIndexFileDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIndexFileDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
