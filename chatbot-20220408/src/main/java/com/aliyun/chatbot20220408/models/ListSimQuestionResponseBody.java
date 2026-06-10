// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSimQuestionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15CD94CC-CBEB-4189-806C-A132D1F45D51</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of similar questions.</p>
     */
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
        /**
         * <p>The creation time of the similar question, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-30T02:08:33Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The modification time of the similar question, in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-13T03:49:28Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The similar question ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30001979424</p>
         */
        @NameInMap("SimQuestionId")
        public Long simQuestionId;

        /**
         * <p>The title of the similar question.</p>
         * 
         * <strong>example:</strong>
         * <p>相似问</p>
         */
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
