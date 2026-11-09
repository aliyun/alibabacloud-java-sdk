// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserBookmarksRequest extends TeaModel {
    /**
     * <p>The ID of the cloud browser group. You must specify either this parameter or BrowserInstanceGroupSetId, but not both.</p>
     * 
     * <strong>example:</strong>
     * <p>big-0c7loey7fzjq****</p>
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
     * <p>The keyword used for substring matching in bookmark names or URLs. The matching is case-insensitive for English characters. The keyword can be up to 1,024 characters in length after leading and trailing spaces are removed. If this parameter is not specified or contains only spaces, no filtering is applied. Special characters are matched literally.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The page number of the page to return. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 200.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListBrowserBookmarksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserBookmarksRequest self = new ListBrowserBookmarksRequest();
        return TeaModel.build(map, self);
    }

    public ListBrowserBookmarksRequest setBrowserInstanceGroupId(String browserInstanceGroupId) {
        this.browserInstanceGroupId = browserInstanceGroupId;
        return this;
    }
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    public ListBrowserBookmarksRequest setBrowserInstanceGroupSetId(String browserInstanceGroupSetId) {
        this.browserInstanceGroupSetId = browserInstanceGroupSetId;
        return this;
    }
    public String getBrowserInstanceGroupSetId() {
        return this.browserInstanceGroupSetId;
    }

    public ListBrowserBookmarksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListBrowserBookmarksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowserBookmarksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
