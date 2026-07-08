// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TermQueryRequest extends TeaModel {
    /**
     * <p>Extended parameters.</p>
     */
    @NameInMap("ext")
    public TermQueryRequestExt ext;

    /**
     * <p>The translation model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-turbo</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>The source language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>The target language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>The source text to search for intervention terms.</p>
     * 
     * <strong>example:</strong>
     * <p>今天的天气非常不错，我准备去跟我的好朋友去学习一些大模型相关和应用接口的知识。</p>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>The ID of the Model Studio workspace used for the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static TermQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TermQueryRequest self = new TermQueryRequest();
        return TeaModel.build(map, self);
    }

    public TermQueryRequest setExt(TermQueryRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public TermQueryRequestExt getExt() {
        return this.ext;
    }

    public TermQueryRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public TermQueryRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TermQueryRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TermQueryRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public TermQueryRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class TermQueryRequestExt extends TeaModel {
        /**
         * <p>Specifies extended parameters to isolate term interventions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;bizUserld&quot;:&quot;123456&quot;,&quot;bizType&quot;:session&quot;}</p>
         */
        @NameInMap("paramMap")
        public Object paramMap;

        public static TermQueryRequestExt build(java.util.Map<String, ?> map) throws Exception {
            TermQueryRequestExt self = new TermQueryRequestExt();
            return TeaModel.build(map, self);
        }

        public TermQueryRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

    }

}
