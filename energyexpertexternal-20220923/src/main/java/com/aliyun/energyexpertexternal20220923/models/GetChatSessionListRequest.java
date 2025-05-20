// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatSessionListRequest extends TeaModel {
    /**
     * <p>Pagination parameter, page number, default is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Session name.</p>
     * 
     * <strong>example:</strong>
     * <p>oklabs</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Page size, default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the user. If not provided, the SDK calling account will be used as the user ID by default.</p>
     * 
     * <strong>example:</strong>
     * <p>12222</p>
     */
    @NameInMap("userId")
    public String userId;

    public static GetChatSessionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatSessionListRequest self = new GetChatSessionListRequest();
        return TeaModel.build(map, self);
    }

    public GetChatSessionListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetChatSessionListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetChatSessionListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetChatSessionListRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
