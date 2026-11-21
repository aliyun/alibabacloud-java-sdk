// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListMaintainWindowsResponseBody extends TeaModel {
    /**
     * <p>The list of silence policies. An empty list is returned if no matches are found. List items do not include workspaceFilterSetting.</p>
     */
    @NameInMap("maintainWindowList")
    public java.util.List<MaintainWindowForView> maintainWindowList;

    /**
     * <p>The maximum number of records returned for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The starting cursor for the next page. If this value is not empty, you can continue to query, but the next page may still be empty. An empty value indicates the end of pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>Y21zRXZlbnRCYXNlUGFnZT0y</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique ID of the request, which is used for troubleshooting and ticket tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A0D1C36</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMaintainWindowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMaintainWindowsResponseBody self = new ListMaintainWindowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMaintainWindowsResponseBody setMaintainWindowList(java.util.List<MaintainWindowForView> maintainWindowList) {
        this.maintainWindowList = maintainWindowList;
        return this;
    }
    public java.util.List<MaintainWindowForView> getMaintainWindowList() {
        return this.maintainWindowList;
    }

    public ListMaintainWindowsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMaintainWindowsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMaintainWindowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
