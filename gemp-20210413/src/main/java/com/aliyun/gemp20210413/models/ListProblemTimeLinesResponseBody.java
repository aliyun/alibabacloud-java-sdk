// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemTimeLinesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListProblemTimeLinesResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProblemTimeLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemTimeLinesResponseBody self = new ListProblemTimeLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemTimeLinesResponseBody setData(java.util.List<ListProblemTimeLinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemTimeLinesResponseBodyData> getData() {
        return this.data;
    }

    public ListProblemTimeLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProblemTimeLinesResponseBodyDataUsersInContent extends TeaModel {
        @NameInMap("isValid")
        public Long isValid;

        /**
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("userId")
        public Long userId;

        /**
         * <strong>example:</strong>
         * <p>张老萨</p>
         */
        @NameInMap("username")
        public String username;

        public static ListProblemTimeLinesResponseBodyDataUsersInContent build(java.util.Map<String, ?> map) throws Exception {
            ListProblemTimeLinesResponseBodyDataUsersInContent self = new ListProblemTimeLinesResponseBodyDataUsersInContent();
            return TeaModel.build(map, self);
        }

        public ListProblemTimeLinesResponseBodyDataUsersInContent setIsValid(Long isValid) {
            this.isValid = isValid;
            return this;
        }
        public Long getIsValid() {
            return this.isValid;
        }

        public ListProblemTimeLinesResponseBodyDataUsersInContent setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListProblemTimeLinesResponseBodyDataUsersInContent setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class ListProblemTimeLinesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>内容</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2020-08-08 15:38:38</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isKey")
        public Boolean isKey;

        /**
         * <strong>example:</strong>
         * <p>PROBLEM_INJECTION,PROBLEM_HAPPEN</p>
         */
        @NameInMap("keyNode")
        public String keyNode;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("problemTimelineId")
        public Long problemTimelineId;

        /**
         * <strong>example:</strong>
         * <p>2020-08-08 15:38:38</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p>2020-08-08 15:38:38</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("usersInContent")
        public java.util.List<ListProblemTimeLinesResponseBodyDataUsersInContent> usersInContent;

        public static ListProblemTimeLinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemTimeLinesResponseBodyData self = new ListProblemTimeLinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemTimeLinesResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListProblemTimeLinesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemTimeLinesResponseBodyData setIsKey(Boolean isKey) {
            this.isKey = isKey;
            return this;
        }
        public Boolean getIsKey() {
            return this.isKey;
        }

        public ListProblemTimeLinesResponseBodyData setKeyNode(String keyNode) {
            this.keyNode = keyNode;
            return this;
        }
        public String getKeyNode() {
            return this.keyNode;
        }

        public ListProblemTimeLinesResponseBodyData setProblemTimelineId(Long problemTimelineId) {
            this.problemTimelineId = problemTimelineId;
            return this;
        }
        public Long getProblemTimelineId() {
            return this.problemTimelineId;
        }

        public ListProblemTimeLinesResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListProblemTimeLinesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListProblemTimeLinesResponseBodyData setUsersInContent(java.util.List<ListProblemTimeLinesResponseBodyDataUsersInContent> usersInContent) {
            this.usersInContent = usersInContent;
            return this;
        }
        public java.util.List<ListProblemTimeLinesResponseBodyDataUsersInContent> getUsersInContent() {
            return this.usersInContent;
        }

    }

}
