// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListFileShrinkRequest extends TeaModel {
    /**
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <p>The category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it on the <a href="https://bailian.console.aliyun.com/?tab=app#/data-center">Application Data</a> - Files tab by clicking the ID icon next to the category name.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <p>The category ID, which is the <code>CategoryId</code> returned by the <strong>AddCategory</strong> operation. You can also obtain it on the <a href="https://modelstudio.console.alibabacloud.com/?tab=app#/data-center">Application Data</a> - Files tab by clicking the ID icon next to the category name.</p>
     * <p>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>The list of file IDs to query. A maximum of 20 files can be queried per request.</p>
     */
    @NameInMap("FileIds")
    public String fileIdsShrink;

    /**
     * <p>The file name (without extension). Only exact match is supported. Fuzzy search is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>product-overview</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The number of entries per page for paging. Valid values: 1 to 200.</p>
     * <p>Default value:
     * If the value is not set or is less than 1, the default value is 20. If the value is greater than 200, the default value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Set this to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdH70eOCSCKtacdomNzak4U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFileShrinkRequest self = new ListFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListFileShrinkRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListFileShrinkRequest setFileIdsShrink(String fileIdsShrink) {
        this.fileIdsShrink = fileIdsShrink;
        return this;
    }
    public String getFileIdsShrink() {
        return this.fileIdsShrink;
    }

    public ListFileShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListFileShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListFileShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
