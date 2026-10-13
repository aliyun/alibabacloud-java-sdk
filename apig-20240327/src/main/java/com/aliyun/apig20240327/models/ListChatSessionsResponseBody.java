// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListChatSessionsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public ListChatSessionsResponseBodyData data;

    /**
     * <p>The maximum number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page. An empty value indicates that the last page has been reached.</p>
     * 
     * <strong>example:</strong>
     * <p>token-xxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListChatSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatSessionsResponseBody self = new ListChatSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatSessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatSessionsResponseBody setData(ListChatSessionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChatSessionsResponseBodyData getData() {
        return this.data;
    }

    public ListChatSessionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListChatSessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatSessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChatSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListChatSessionsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The name of the chat session.</p>
         * 
         * <strong>example:</strong>
         * <p>Product consultation session</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of API products associated with the session. Each element in the list is named product.</p>
         */
        @NameInMap("products")
        public java.util.List<String> products;

        /**
         * <p>The ID of the chat session. You can use this ID to locate the session in API operations such as UpdateChatSession, DeleteChatSession, and ListConversations.</p>
         * 
         * <strong>example:</strong>
         * <p>ses-xxxxxxxx</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The conversation type of the session. Valid values: MODEL and AGENT. These values are defined in the talkType enumeration of the CreateChatSession request parameter, and this response parameter does not have the @enums annotation.</p>
         * 
         * <strong>example:</strong>
         * <p>MODEL</p>
         */
        @NameInMap("talkType")
        public String talkType;

        public static ListChatSessionsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListChatSessionsResponseBodyDataContent self = new ListChatSessionsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListChatSessionsResponseBodyDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListChatSessionsResponseBodyDataContent setProducts(java.util.List<String> products) {
            this.products = products;
            return this;
        }
        public java.util.List<String> getProducts() {
            return this.products;
        }

        public ListChatSessionsResponseBodyDataContent setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListChatSessionsResponseBodyDataContent setTalkType(String talkType) {
            this.talkType = talkType;
            return this;
        }
        public String getTalkType() {
            return this.talkType;
        }

    }

    public static class ListChatSessionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of chat sessions. Each element in the list is named session and represents a chat session.</p>
         */
        @NameInMap("content")
        public java.util.List<ListChatSessionsResponseBodyDataContent> content;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static ListChatSessionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChatSessionsResponseBodyData self = new ListChatSessionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChatSessionsResponseBodyData setContent(java.util.List<ListChatSessionsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListChatSessionsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListChatSessionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListChatSessionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListChatSessionsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
