// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class GetConversationListResponseBody extends TeaModel {
    @NameInMap("Messages")
    public java.util.List<java.util.Map<String, String>> messages;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCounts")
    public Long totalCounts;

    public static GetConversationListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConversationListResponseBody self = new GetConversationListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConversationListResponseBody setMessages(java.util.List<java.util.Map<String, String>> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getMessages() {
        return this.messages;
    }

    public GetConversationListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetConversationListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetConversationListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConversationListResponseBody setTotalCounts(Long totalCounts) {
        this.totalCounts = totalCounts;
        return this;
    }
    public Long getTotalCounts() {
        return this.totalCounts;
    }

}
