// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListChunksRequest extends TeaModel {
    /**
     * <p>An array of field names. This parameter is used to filter non-private fields (prefixed with_underscores) in the Metadata parameter returned by this operation. By default, this parameter is left empty, which means all non-private fields in the Metadata parameter are returned. If you only want specified non-private fields, such as title, set this parameter to title.</p>
     */
    @NameInMap("Fields")
    public java.util.List<String> fields;

    /**
     * <p>The primary key ID of the document, which is the <code>FieldID</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-addfile">AddFile</a> operation. This parameter is not required for structured knowledge base, but is required for unstructured knowledge base. To view the ID, you can click the ID icon next to the file name on the <a href="https://bailian.console.aliyun.com/#/data-center">Data Management</a> page. You can filter returned chunks by the document ID. This parameter is left empty by default.</p>
     * 
     * <strong>example:</strong>
     * <p>file_5f03dfea56da4050ab68d61871fc4cb3_10151493</p>
     */
    @NameInMap("Filed")
    public String filed;

    /**
     * <p>The primary key ID of the knowledge base, which is the <code>Data.Id</code> parameter returned by the <a href="https://help.aliyun.com/zh/model-studio/developer-reference/api-bailian-2023-12-29-createindex">CreateIndex</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>otoru9en4v</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The number of the pages to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of chunks to display on each page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChunksRequest self = new ListChunksRequest();
        return TeaModel.build(map, self);
    }

    public ListChunksRequest setFields(java.util.List<String> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<String> getFields() {
        return this.fields;
    }

    public ListChunksRequest setFiled(String filed) {
        this.filed = filed;
        return this;
    }
    public String getFiled() {
        return this.filed;
    }

    public ListChunksRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ListChunksRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListChunksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
