// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListSolutionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Solutions")
    public java.util.List<ListSolutionResponseBodySolutions> solutions;

    public static ListSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSolutionResponseBody self = new ListSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSolutionResponseBody setSolutions(java.util.List<ListSolutionResponseBodySolutions> solutions) {
        this.solutions = solutions;
        return this;
    }
    public java.util.List<ListSolutionResponseBodySolutions> getSolutions() {
        return this.solutions;
    }

    public static class ListSolutionResponseBodySolutions extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public Integer contentType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("PerspectiveCodes")
        public java.util.List<String> perspectiveCodes;

        @NameInMap("PlainText")
        public String plainText;

        @NameInMap("SolutionId")
        public Long solutionId;

        public static ListSolutionResponseBodySolutions build(java.util.Map<String, ?> map) throws Exception {
            ListSolutionResponseBodySolutions self = new ListSolutionResponseBodySolutions();
            return TeaModel.build(map, self);
        }

        public ListSolutionResponseBodySolutions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListSolutionResponseBodySolutions setContentType(Integer contentType) {
            this.contentType = contentType;
            return this;
        }
        public Integer getContentType() {
            return this.contentType;
        }

        public ListSolutionResponseBodySolutions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSolutionResponseBodySolutions setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListSolutionResponseBodySolutions setPerspectiveCodes(java.util.List<String> perspectiveCodes) {
            this.perspectiveCodes = perspectiveCodes;
            return this;
        }
        public java.util.List<String> getPerspectiveCodes() {
            return this.perspectiveCodes;
        }

        public ListSolutionResponseBodySolutions setPlainText(String plainText) {
            this.plainText = plainText;
            return this;
        }
        public String getPlainText() {
            return this.plainText;
        }

        public ListSolutionResponseBodySolutions setSolutionId(Long solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public Long getSolutionId() {
            return this.solutionId;
        }

    }

}
