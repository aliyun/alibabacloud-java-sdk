// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteHundredThousandWhysDialogueResponseBody extends TeaModel {
    @NameInMap("choices")
    public java.util.List<ExecuteHundredThousandWhysDialogueResponseBodyChoices> choices;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("created")
    public Long created;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("model")
    public String model;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("object")
    public String object;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DBFA232A-1176-50E6-95AE-50F7A62A28AD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ExecuteHundredThousandWhysDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteHundredThousandWhysDialogueResponseBody self = new ExecuteHundredThousandWhysDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteHundredThousandWhysDialogueResponseBody setChoices(java.util.List<ExecuteHundredThousandWhysDialogueResponseBodyChoices> choices) {
        this.choices = choices;
        return this;
    }
    public java.util.List<ExecuteHundredThousandWhysDialogueResponseBodyChoices> getChoices() {
        return this.choices;
    }

    public ExecuteHundredThousandWhysDialogueResponseBody setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public ExecuteHundredThousandWhysDialogueResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExecuteHundredThousandWhysDialogueResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExecuteHundredThousandWhysDialogueResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public ExecuteHundredThousandWhysDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta extends TeaModel {
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>assistant</p>
         */
        @NameInMap("role")
        public String role;

        public static ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta build(java.util.Map<String, ?> map) throws Exception {
            ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta self = new ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta();
            return TeaModel.build(map, self);
        }

        public ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class ExecuteHundredThousandWhysDialogueResponseBodyChoices extends TeaModel {
        @NameInMap("delta")
        public ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta delta;

        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("finish_reason")
        public String finishReason;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public Long index;

        public static ExecuteHundredThousandWhysDialogueResponseBodyChoices build(java.util.Map<String, ?> map) throws Exception {
            ExecuteHundredThousandWhysDialogueResponseBodyChoices self = new ExecuteHundredThousandWhysDialogueResponseBodyChoices();
            return TeaModel.build(map, self);
        }

        public ExecuteHundredThousandWhysDialogueResponseBodyChoices setDelta(ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta delta) {
            this.delta = delta;
            return this;
        }
        public ExecuteHundredThousandWhysDialogueResponseBodyChoicesDelta getDelta() {
            return this.delta;
        }

        public ExecuteHundredThousandWhysDialogueResponseBodyChoices setFinishReason(String finishReason) {
            this.finishReason = finishReason;
            return this;
        }
        public String getFinishReason() {
            return this.finishReason;
        }

        public ExecuteHundredThousandWhysDialogueResponseBodyChoices setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

}
