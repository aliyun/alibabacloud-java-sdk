// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListChunksRequest extends TeaModel {
    /**
     * <p>An array of field names used to filter non-private fields (those not prefixed with an underscore _) in the Metadata field returned by this operation. By default, Fields is empty, and all non-private fields in Metadata are returned. To return only specific non-private fields in Metadata, such as title, pass title in this parameter.</p>
     * <p>Default value: empty.</p>
     */
    @NameInMap("Fields")
    public java.util.List<String> fields;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. This field is not required for data query or image Q&amp;A knowledge bases. This field is required for document search or audio/video search knowledge bases. You can also obtain the file ID by clicking the ID icon next to the file name on the Files tab of <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a>. You can use the file ID to filter the returned chunks. Default value: empty.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The file ID, which is the <code>FileId</code> returned by the <strong>AddFile</strong> operation. This field is not required for data query or image Q&amp;A knowledge bases. This field is required for document search knowledge bases. You can also obtain the file ID by clicking the ID icon next to the file name on the Files tab of
     * <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a>. You can use the file ID to filter the returned chunks. Default value: empty.</p>
     * <p>.</p>
     * 
     * <strong>example:</strong>
     * <p>file_5f03dfea56da4050ab68d61871fc4cb3_xxxxxxxx</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The file ID field in the legacy Model Studio SDK. The usage and default value are identical to those of the <code>FileId</code> field. If you are using the following versions (or later) of the Model Studio SDK, use the <code>FileId</code> field instead. If you are using the SWIFT Model Studio SDK, continue to use this field.</p>
     * <ul>
     * <li>Java (async): 1.0.18</li>
     * <li>Java: 1.10.2</li>
     * <li>TypeScript: 1.10.2</li>
     * <li>Go: 1.10.2</li>
     * <li>PHP: 1.10.2</li>
     * <li>Python: 1.10.2</li>
     * <li>C#: 1.10.2</li>
     * <li>C++: 1.10.17</li>
     * </ul>
     * <blockquote>
     * <p><strong>How to check the Model Studio SDK version</strong>: Visit the &lt;props=&quot;china&quot;&gt;<a href="https://api.aliyun.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK center</a>&lt;props=&quot;intl&quot;&gt;<a href="https://api.alibabacloud.com/api-tools/sdk/bailian?version=2023-12-29">Model Studio SDK center</a>, click &quot;<strong>Install</strong>&quot; in the left-side navigation pane, set the API version to &quot;<strong>2023-12-29</strong>&quot;, select your programming language, and then click &quot;<strong>History Versions</strong>&quot; to view the version.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>file_5f03dfea56da4050ab68d61871fc4cb3_xxxxxxxx</p>
     */
    @NameInMap("Filed")
    public String filed;

    /**
     * <p>The knowledge base ID, which is the <code>Data.Id</code> returned by the <strong>CreateIndex</strong> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>otoru9xxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <p>The page number to query. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of text chunks to display per page in a paged query. Maximum value: 100. Default value: 10.</p>
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

    public ListChunksRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
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
