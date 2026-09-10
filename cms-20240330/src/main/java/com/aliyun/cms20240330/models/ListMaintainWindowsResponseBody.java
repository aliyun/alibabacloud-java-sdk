// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListMaintainWindowsResponseBody extends TeaModel {
    @NameInMap("maintainWindowList")
    public java.util.List<MaintainWindowForView> maintainWindowList;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>xxxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
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
