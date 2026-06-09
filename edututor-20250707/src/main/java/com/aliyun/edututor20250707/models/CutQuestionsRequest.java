// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edututor20250707.models;

import com.aliyun.tea.*;

public class CutQuestionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("parameters")
    public CutQuestionsRequestParameters parameters;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-1ijrzuv3v0ivvls7</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static CutQuestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CutQuestionsRequest self = new CutQuestionsRequest();
        return TeaModel.build(map, self);
    }

    public CutQuestionsRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public CutQuestionsRequest setParameters(CutQuestionsRequestParameters parameters) {
        this.parameters = parameters;
        return this;
    }
    public CutQuestionsRequestParameters getParameters() {
        return this.parameters;
    }

    public CutQuestionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CutQuestionsRequestParameters extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("extract_images")
        public Boolean extractImages;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("struct")
        public Boolean struct;

        public static CutQuestionsRequestParameters build(java.util.Map<String, ?> map) throws Exception {
            CutQuestionsRequestParameters self = new CutQuestionsRequestParameters();
            return TeaModel.build(map, self);
        }

        public CutQuestionsRequestParameters setExtractImages(Boolean extractImages) {
            this.extractImages = extractImages;
            return this;
        }
        public Boolean getExtractImages() {
            return this.extractImages;
        }

        public CutQuestionsRequestParameters setStruct(Boolean struct) {
            this.struct = struct;
            return this;
        }
        public Boolean getStruct() {
            return this.struct;
        }

    }

}
