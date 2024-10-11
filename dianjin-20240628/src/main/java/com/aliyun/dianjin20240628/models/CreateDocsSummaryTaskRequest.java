// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateDocsSummaryTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("docInfos")
    public java.util.List<CreateDocsSummaryTaskRequestDocInfos> docInfos;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableTable")
    public Boolean enableTable;

    @NameInMap("instruction")
    public String instruction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    public static CreateDocsSummaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDocsSummaryTaskRequest self = new CreateDocsSummaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDocsSummaryTaskRequest setDocInfos(java.util.List<CreateDocsSummaryTaskRequestDocInfos> docInfos) {
        this.docInfos = docInfos;
        return this;
    }
    public java.util.List<CreateDocsSummaryTaskRequestDocInfos> getDocInfos() {
        return this.docInfos;
    }

    public CreateDocsSummaryTaskRequest setEnableTable(Boolean enableTable) {
        this.enableTable = enableTable;
        return this;
    }
    public Boolean getEnableTable() {
        return this.enableTable;
    }

    public CreateDocsSummaryTaskRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public CreateDocsSummaryTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public static class CreateDocsSummaryTaskRequestDocInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>198386463432</p>
         */
        @NameInMap("docId")
        public String docId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("endPage")
        public Integer endPage;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rdxrmo6amk</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startPage")
        public Integer startPage;

        public static CreateDocsSummaryTaskRequestDocInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateDocsSummaryTaskRequestDocInfos self = new CreateDocsSummaryTaskRequestDocInfos();
            return TeaModel.build(map, self);
        }

        public CreateDocsSummaryTaskRequestDocInfos setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public CreateDocsSummaryTaskRequestDocInfos setEndPage(Integer endPage) {
            this.endPage = endPage;
            return this;
        }
        public Integer getEndPage() {
            return this.endPage;
        }

        public CreateDocsSummaryTaskRequestDocInfos setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public CreateDocsSummaryTaskRequestDocInfos setStartPage(Integer startPage) {
            this.startPage = startPage;
            return this;
        }
        public Integer getStartPage() {
            return this.startPage;
        }

    }

}
