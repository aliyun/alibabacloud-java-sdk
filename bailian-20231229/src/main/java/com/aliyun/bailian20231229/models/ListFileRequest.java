// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListFileRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it on the <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> page by clicking the Files tab and then clicking the ID icon next to the category name.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it on the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> page by clicking the Files tab and then clicking the ID icon next to the category name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The list of file IDs to query. A maximum of 20 files can be queried in a single request.</p>
     */
    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    /**
     * <p>The file name (without the extension). Only exact match is supported. Fuzzy search is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>product-overview</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The number of entries per page for a paged query. Valid values: 1 to 200.</p>
     * <p>Default value:
     * If the value is not set or is less than 1, the default value is 20. If the value is greater than 200, the default value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdH70eOCSCKtacdomNzak4U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileRequest self = new ListFileRequest();
        return TeaModel.build(map, self);
    }

    public ListFileRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListFileRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    public ListFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListFileRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFileRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
