// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class ModelTypeDetermineRequest extends TeaModel {
    @NameInMap("history")
    public java.util.List<ModelTypeDetermineRequestHistory> history;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("inputText")
    public String inputText;

    public static ModelTypeDetermineRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelTypeDetermineRequest self = new ModelTypeDetermineRequest();
        return TeaModel.build(map, self);
    }

    public ModelTypeDetermineRequest setHistory(java.util.List<ModelTypeDetermineRequestHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<ModelTypeDetermineRequestHistory> getHistory() {
        return this.history;
    }

    public ModelTypeDetermineRequest setInputText(String inputText) {
        this.inputText = inputText;
        return this;
    }
    public String getInputText() {
        return this.inputText;
    }

    public static class ModelTypeDetermineRequestHistory extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("role")
        public String role;

        public static ModelTypeDetermineRequestHistory build(java.util.Map<String, ?> map) throws Exception {
            ModelTypeDetermineRequestHistory self = new ModelTypeDetermineRequestHistory();
            return TeaModel.build(map, self);
        }

        public ModelTypeDetermineRequestHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ModelTypeDetermineRequestHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
