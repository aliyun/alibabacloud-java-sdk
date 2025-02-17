// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListStyleLearningResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListStyleLearningResultResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListStyleLearningResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStyleLearningResultResponseBody self = new ListStyleLearningResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStyleLearningResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListStyleLearningResultResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListStyleLearningResultResponseBody setData(java.util.List<ListStyleLearningResultResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListStyleLearningResultResponseBodyData> getData() {
        return this.data;
    }

    public ListStyleLearningResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListStyleLearningResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListStyleLearningResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStyleLearningResultResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListStyleLearningResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListStyleLearningResultResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListStyleLearningResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>AIGC 生成的内容</p>
         */
        @NameInMap("AigcResult")
        public String aigcResult;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>用户修订后内容</p>
         */
        @NameInMap("RewriteResult")
        public String rewriteResult;

        /**
         * <strong>example:</strong>
         * <p>文体风格名称</p>
         */
        @NameInMap("StyleName")
        public String styleName;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListStyleLearningResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListStyleLearningResultResponseBodyData self = new ListStyleLearningResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListStyleLearningResultResponseBodyData setAigcResult(String aigcResult) {
            this.aigcResult = aigcResult;
            return this;
        }
        public String getAigcResult() {
            return this.aigcResult;
        }

        public ListStyleLearningResultResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListStyleLearningResultResponseBodyData setRewriteResult(String rewriteResult) {
            this.rewriteResult = rewriteResult;
            return this;
        }
        public String getRewriteResult() {
            return this.rewriteResult;
        }

        public ListStyleLearningResultResponseBodyData setStyleName(String styleName) {
            this.styleName = styleName;
            return this;
        }
        public String getStyleName() {
            return this.styleName;
        }

        public ListStyleLearningResultResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
