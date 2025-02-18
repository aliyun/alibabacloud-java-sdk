// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataAssetTagsRequest extends TeaModel {
    /**
     * <p>The type of the tag.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Normal</li>
     * <li>System</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The tag key.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDataAssetTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataAssetTagsRequest self = new ListDataAssetTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataAssetTagsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListDataAssetTagsRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ListDataAssetTagsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataAssetTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
