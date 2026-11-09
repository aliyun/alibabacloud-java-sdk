// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserRestrictedURLsRequest extends TeaModel {
    /**
     * <p>The ID of the browser delivery group. You must specify either this parameter or BrowserInstanceGroupSetId, but not both. If you specify this parameter, the restricted URLs configured for the delivery group are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>big-3jm9d0abc00example</p>
     */
    @NameInMap("BrowserInstanceGroupId")
    public String browserInstanceGroupId;

    /**
     * <p>The ID of the browser delivery group set. You must specify either this parameter or BrowserInstanceGroupId, but not both.</p>
     * 
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("BrowserInstanceGroupSetId")
    public String browserInstanceGroupSetId;

    /**
     * <p>The keyword used to filter access control URLs by using a contains match. The match is case-insensitive for English characters. The keyword can be up to 1,024 characters in length after leading and trailing spaces are removed. If you do not specify this parameter or specify only spaces, no filtering is performed. Special characters are matched literally.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number during paging. Default value: 0. If the value is less than 1, such as 0, the first page is returned. If the value is less than 0, a parameter error is returned. Set this parameter to 1 or greater.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records to return on each page during paging. Valid values: 1 to 200. Default value: 200. If the value is less than or equal to 0 or greater than 200, a parameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListBrowserRestrictedURLsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserRestrictedURLsRequest self = new ListBrowserRestrictedURLsRequest();
        return TeaModel.build(map, self);
    }

    public ListBrowserRestrictedURLsRequest setBrowserInstanceGroupId(String browserInstanceGroupId) {
        this.browserInstanceGroupId = browserInstanceGroupId;
        return this;
    }
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    public ListBrowserRestrictedURLsRequest setBrowserInstanceGroupSetId(String browserInstanceGroupSetId) {
        this.browserInstanceGroupSetId = browserInstanceGroupSetId;
        return this;
    }
    public String getBrowserInstanceGroupSetId() {
        return this.browserInstanceGroupSetId;
    }

    public ListBrowserRestrictedURLsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListBrowserRestrictedURLsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowserRestrictedURLsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
