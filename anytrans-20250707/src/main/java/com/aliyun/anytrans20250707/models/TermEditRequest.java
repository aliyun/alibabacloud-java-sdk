// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.anytrans20250707.models;

import com.aliyun.tea.*;

public class TermEditRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ext")
    public TermEditRequestExt ext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-turbo</p>
     */
    @NameInMap("scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("sourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("targetLanguage")
    public String targetLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-kqtrcpdee4xm29xx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static TermEditRequest build(java.util.Map<String, ?> map) throws Exception {
        TermEditRequest self = new TermEditRequest();
        return TeaModel.build(map, self);
    }

    public TermEditRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public TermEditRequest setExt(TermEditRequestExt ext) {
        this.ext = ext;
        return this;
    }
    public TermEditRequestExt getExt() {
        return this.ext;
    }

    public TermEditRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public TermEditRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TermEditRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TermEditRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class TermEditRequestExtTerms extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("src")
        public String src;

        /**
         * <strong>example:</strong>
         * <p>92669964</p>
         */
        @NameInMap("termId")
        public String termId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LLM</p>
         */
        @NameInMap("tgt")
        public String tgt;

        public static TermEditRequestExtTerms build(java.util.Map<String, ?> map) throws Exception {
            TermEditRequestExtTerms self = new TermEditRequestExtTerms();
            return TeaModel.build(map, self);
        }

        public TermEditRequestExtTerms setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public TermEditRequestExtTerms setTermId(String termId) {
            this.termId = termId;
            return this;
        }
        public String getTermId() {
            return this.termId;
        }

        public TermEditRequestExtTerms setTgt(String tgt) {
            this.tgt = tgt;
            return this;
        }
        public String getTgt() {
            return this.tgt;
        }

    }

    public static class TermEditRequestExt extends TeaModel {
        @NameInMap("paramMap")
        public Object paramMap;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("terms")
        public java.util.List<TermEditRequestExtTerms> terms;

        public static TermEditRequestExt build(java.util.Map<String, ?> map) throws Exception {
            TermEditRequestExt self = new TermEditRequestExt();
            return TeaModel.build(map, self);
        }

        public TermEditRequestExt setParamMap(Object paramMap) {
            this.paramMap = paramMap;
            return this;
        }
        public Object getParamMap() {
            return this.paramMap;
        }

        public TermEditRequestExt setTerms(java.util.List<TermEditRequestExtTerms> terms) {
            this.terms = terms;
            return this;
        }
        public java.util.List<TermEditRequestExtTerms> getTerms() {
            return this.terms;
        }

    }

}
