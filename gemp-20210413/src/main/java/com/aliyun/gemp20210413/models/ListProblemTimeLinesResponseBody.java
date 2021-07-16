// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemTimeLinesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListProblemTimeLinesResponseBodyData> data;

    public static ListProblemTimeLinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemTimeLinesResponseBody self = new ListProblemTimeLinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemTimeLinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProblemTimeLinesResponseBody setData(java.util.List<ListProblemTimeLinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemTimeLinesResponseBodyData> getData() {
        return this.data;
    }

    public static class ListProblemTimeLinesResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 关键节点 码表:PROBLEM_KEY_NODE (逗号分隔)
        @NameInMap("keyNode")
        public String keyNode;

        // 内容
        @NameInMap("content")
        public String content;

        // 是否是关键字 true是 false不是 默认 false
        @NameInMap("isKey")
        public Boolean isKey;

        // 修改时间
        @NameInMap("updateTime")
        public String updateTime;

        // 展示时间
        @NameInMap("time")
        public String time;

        // 时间线id
        @NameInMap("problemTimelineId")
        public Long problemTimelineId;

        public static ListProblemTimeLinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemTimeLinesResponseBodyData self = new ListProblemTimeLinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemTimeLinesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemTimeLinesResponseBodyData setKeyNode(String keyNode) {
            this.keyNode = keyNode;
            return this;
        }
        public String getKeyNode() {
            return this.keyNode;
        }

        public ListProblemTimeLinesResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListProblemTimeLinesResponseBodyData setIsKey(Boolean isKey) {
            this.isKey = isKey;
            return this;
        }
        public Boolean getIsKey() {
            return this.isKey;
        }

        public ListProblemTimeLinesResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListProblemTimeLinesResponseBodyData setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public ListProblemTimeLinesResponseBodyData setProblemTimelineId(Long problemTimelineId) {
            this.problemTimelineId = problemTimelineId;
            return this;
        }
        public Long getProblemTimelineId() {
            return this.problemTimelineId;
        }

    }

}
