// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSimQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 相似问列表
    @NameInMap("SimQuestions")
    public java.util.List<ListSimQuestionResponseBodySimQuestions> simQuestions;

    public static ListSimQuestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSimQuestionResponseBody self = new ListSimQuestionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSimQuestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSimQuestionResponseBody setSimQuestions(java.util.List<ListSimQuestionResponseBodySimQuestions> simQuestions) {
        this.simQuestions = simQuestions;
        return this;
    }
    public java.util.List<ListSimQuestionResponseBodySimQuestions> getSimQuestions() {
        return this.simQuestions;
    }

    public static class ListSimQuestionResponseBodySimQuestions extends TeaModel {
        // 创建时间(UTC 时间)
        @NameInMap("CreateTime")
        public String createTime;

        // 修改时间(UTC 时间)
        @NameInMap("ModifyTime")
        public String modifyTime;

        // 相似问ID
        @NameInMap("SimQuestionId")
        public Long simQuestionId;

        // 相似问标题
        @NameInMap("Title")
        public String title;

        public static ListSimQuestionResponseBodySimQuestions build(java.util.Map<String, ?> map) throws Exception {
            ListSimQuestionResponseBodySimQuestions self = new ListSimQuestionResponseBodySimQuestions();
            return TeaModel.build(map, self);
        }

        public ListSimQuestionResponseBodySimQuestions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSimQuestionResponseBodySimQuestions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSimQuestionResponseBodySimQuestions setSimQuestionId(Long simQuestionId) {
            this.simQuestionId = simQuestionId;
            return this;
        }
        public Long getSimQuestionId() {
            return this.simQuestionId;
        }

        public ListSimQuestionResponseBodySimQuestions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
