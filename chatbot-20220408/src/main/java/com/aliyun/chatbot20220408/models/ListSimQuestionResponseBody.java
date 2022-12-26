// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSimQuestionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("SimQuestionId")
        public Long simQuestionId;

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
