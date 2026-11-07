// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserBookmarksRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>big-0c7loey7fzjq****</p>
     */
    @NameInMap("BrowserInstanceGroupId")
    public String browserInstanceGroupId;

    /**
     * <strong>example:</strong>
     * <p>set-3jm9d0abc00example</p>
     */
    @NameInMap("BrowserInstanceGroupSetId")
    public String browserInstanceGroupSetId;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
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
