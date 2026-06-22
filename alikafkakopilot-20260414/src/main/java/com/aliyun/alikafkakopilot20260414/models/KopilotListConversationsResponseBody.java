// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotListConversationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public KopilotListConversationsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static KopilotListConversationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotListConversationsResponseBody self = new KopilotListConversationsResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotListConversationsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public KopilotListConversationsResponseBody setData(KopilotListConversationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public KopilotListConversationsResponseBodyData getData() {
        return this.data;
    }

    public KopilotListConversationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotListConversationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class KopilotListConversationsResponseBodyData extends TeaModel {
        @NameInMap("ConversationIds")
        public java.util.List<String> conversationIds;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Page")
        public Integer page;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Long total;

        @NameInMap("TotalPages")
        public Integer totalPages;

        @NameInMap("UserId")
        public String userId;

        public static KopilotListConversationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            KopilotListConversationsResponseBodyData self = new KopilotListConversationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public KopilotListConversationsResponseBodyData setConversationIds(java.util.List<String> conversationIds) {
            this.conversationIds = conversationIds;
            return this;
        }
        public java.util.List<String> getConversationIds() {
            return this.conversationIds;
        }

        public KopilotListConversationsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public KopilotListConversationsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public KopilotListConversationsResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public KopilotListConversationsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public KopilotListConversationsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public KopilotListConversationsResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
