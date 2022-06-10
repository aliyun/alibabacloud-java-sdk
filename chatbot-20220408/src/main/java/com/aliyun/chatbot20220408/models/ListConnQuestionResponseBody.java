// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListConnQuestionResponseBody extends TeaModel {
    @NameInMap("Outlines")
    public java.util.List<ListConnQuestionResponseBodyOutlines> outlines;

    @NameInMap("RequestId")
    public String requestId;

    public static ListConnQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConnQuestionResponseBody self = new ListConnQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConnQuestionResponseBody setOutlines(java.util.List<ListConnQuestionResponseBodyOutlines> outlines) {
        this.outlines = outlines;
        return this;
    }
    public java.util.List<ListConnQuestionResponseBodyOutlines> getOutlines() {
        return this.outlines;
    }

    public ListConnQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListConnQuestionResponseBodyOutlines extends TeaModel {
        // 关联知识ID
        @NameInMap("ConnQuestionId")
        public Long connQuestionId;

        // 创建时间(UTC 时间)
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间(UTC 时间)
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 关联关系ID
        @NameInMap("OutlineId")
        public Long outlineId;

        // 关联知识题目
        @NameInMap("Title")
        public String title;

        public static ListConnQuestionResponseBodyOutlines build(java.util.Map<String, ?> map) throws Exception {
            ListConnQuestionResponseBodyOutlines self = new ListConnQuestionResponseBodyOutlines();
            return TeaModel.build(map, self);
        }

        public ListConnQuestionResponseBodyOutlines setConnQuestionId(Long connQuestionId) {
            this.connQuestionId = connQuestionId;
            return this;
        }
        public Long getConnQuestionId() {
            return this.connQuestionId;
        }

        public ListConnQuestionResponseBodyOutlines setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConnQuestionResponseBodyOutlines setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListConnQuestionResponseBodyOutlines setOutlineId(Long outlineId) {
            this.outlineId = outlineId;
            return this;
        }
        public Long getOutlineId() {
            return this.outlineId;
        }

        public ListConnQuestionResponseBodyOutlines setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
