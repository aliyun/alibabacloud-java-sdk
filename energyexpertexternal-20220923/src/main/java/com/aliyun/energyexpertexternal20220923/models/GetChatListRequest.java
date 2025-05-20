// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatListRequest extends TeaModel {
    /**
     * <p>Pagination parameter, page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>Q&amp;A session ID, used to record multiple Q&amp;As for the same user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bfce2248-1546-4298-8bcf-70ac26e69646</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static GetChatListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatListRequest self = new GetChatListRequest();
        return TeaModel.build(map, self);
    }

    public GetChatListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public GetChatListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetChatListRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
