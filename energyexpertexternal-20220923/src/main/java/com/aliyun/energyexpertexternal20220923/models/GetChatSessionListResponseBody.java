// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class GetChatSessionListResponseBody extends TeaModel {
    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public GetChatSessionListResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetChatSessionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatSessionListResponseBody self = new GetChatSessionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatSessionListResponseBody setData(GetChatSessionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatSessionListResponseBodyData getData() {
        return this.data;
    }

    public GetChatSessionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatSessionListResponseBodyDataSessionList extends TeaModel {
        /**
         * <p>Report creation timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T14:45:17Z</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <p>Folder ID, used to specify the scope of documents to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>3493370b-4884-47dd-95ed-49038769af53</p>
         */
        @NameInMap("folderId")
        public String folderId;

        /**
         * <p>Session name</p>
         * 
         * <strong>example:</strong>
         * <p>student_app_spelling</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Q&amp;A session ID, used to record multiple Q&amp;As of the same user.</p>
         * 
         * <strong>example:</strong>
         * <p>5c748ef9-3f23-4b5a-916f-966c0d2c6dcd</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>Modification time, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-30T02:05:03Z</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        /**
         * <p>User ID of the current session.</p>
         * 
         * <strong>example:</strong>
         * <p>12222</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetChatSessionListResponseBodyDataSessionList build(java.util.Map<String, ?> map) throws Exception {
            GetChatSessionListResponseBodyDataSessionList self = new GetChatSessionListResponseBodyDataSessionList();
            return TeaModel.build(map, self);
        }

        public GetChatSessionListResponseBodyDataSessionList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetChatSessionListResponseBodyDataSessionList setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public GetChatSessionListResponseBodyDataSessionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChatSessionListResponseBodyDataSessionList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetChatSessionListResponseBodyDataSessionList setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetChatSessionListResponseBodyDataSessionList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetChatSessionListResponseBodyData extends TeaModel {
        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("currentPage")
        public Long currentPage;

        /**
         * <p>分页大小。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Long pageSize;

        /**
         * <p>Session list.</p>
         */
        @NameInMap("sessionList")
        public java.util.List<GetChatSessionListResponseBodyDataSessionList> sessionList;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("total")
        public Long total;

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("totalPage")
        public Long totalPage;

        public static GetChatSessionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatSessionListResponseBodyData self = new GetChatSessionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatSessionListResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetChatSessionListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetChatSessionListResponseBodyData setSessionList(java.util.List<GetChatSessionListResponseBodyDataSessionList> sessionList) {
            this.sessionList = sessionList;
            return this;
        }
        public java.util.List<GetChatSessionListResponseBodyDataSessionList> getSessionList() {
            return this.sessionList;
        }

        public GetChatSessionListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetChatSessionListResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
