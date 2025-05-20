// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatListResponseBody extends TeaModel {
    /**
     * <p>Returned data structure.</p>
     */
    @NameInMap("data")
    public GetChatListResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetChatListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatListResponseBody self = new GetChatListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatListResponseBody setData(GetChatListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatListResponseBodyData getData() {
        return this.data;
    }

    public GetChatListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatListResponseBodyData extends TeaModel {
        /**
         * <p>Q&amp;A list.</p>
         */
        @NameInMap("chatList")
        public java.util.List<ChatItem> chatList;

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <p>Page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("total")
        public Long total;

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("totalPage")
        public Long totalPage;

        public static GetChatListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatListResponseBodyData self = new GetChatListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatListResponseBodyData setChatList(java.util.List<ChatItem> chatList) {
            this.chatList = chatList;
            return this;
        }
        public java.util.List<ChatItem> getChatList() {
            return this.chatList;
        }

        public GetChatListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetChatListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetChatListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetChatListResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
