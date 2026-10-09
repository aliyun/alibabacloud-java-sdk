// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateAnnualDocSummaryTaskRequest extends TeaModel {
    /**
     * <p>The list of analysis years.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("anaYears")
    public java.util.List<Integer> anaYears;

    /**
     * <p>The list of document information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("docInfos")
    public java.util.List<CreateAnnualDocSummaryTaskRequestDocInfos> docInfos;

    /**
     * <p>Specifies whether to enable tables. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableTable")
    public Boolean enableTable;

    /**
     * <p>The instruction.</p>
     * 
     * <strong>example:</strong>
     * <p>You are a senior securities researcher conducting performance analysis on listed companies for the year XX. Based on the reference information, provide a detailed analysis covering the following aspects:</p>
     * <ol>
     * <li>Overall performance changes, including detailed metrics such as revenue and profit.</li>
     * <li>Specific reasons for performance changes, including changes in each business segment.
     * Strictly output only the information for the year XX</li>
     * </ol>
     */
    @NameInMap("instruction")
    public String instruction;

    /**
     * <p>The model ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-plus</p>
     */
    @NameInMap("modelId")
    public String modelId;

    public static CreateAnnualDocSummaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnualDocSummaryTaskRequest self = new CreateAnnualDocSummaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateAnnualDocSummaryTaskRequest setAnaYears(java.util.List<Integer> anaYears) {
        this.anaYears = anaYears;
        return this;
    }
    public java.util.List<Integer> getAnaYears() {
        return this.anaYears;
    }

    public CreateAnnualDocSummaryTaskRequest setDocInfos(java.util.List<CreateAnnualDocSummaryTaskRequestDocInfos> docInfos) {
        this.docInfos = docInfos;
        return this;
    }
    public java.util.List<CreateAnnualDocSummaryTaskRequestDocInfos> getDocInfos() {
        return this.docInfos;
    }

    public CreateAnnualDocSummaryTaskRequest setEnableTable(Boolean enableTable) {
        this.enableTable = enableTable;
        return this;
    }
    public Boolean getEnableTable() {
        return this.enableTable;
    }

    public CreateAnnualDocSummaryTaskRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public CreateAnnualDocSummaryTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public static class CreateAnnualDocSummaryTaskRequestDocInfos extends TeaModel {
        /**
         * <p>The document ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>198386463432</p>
         */
        @NameInMap("docId")
        public String docId;

        /**
         * <p>The document year.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023</p>
         */
        @NameInMap("docYear")
        public Integer docYear;

        /**
         * <p>The end page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("endPage")
        public Integer endPage;

        /**
         * <p>The document library ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rdxrmo6amk</p>
         */
        @NameInMap("libraryId")
        public String libraryId;

        /**
         * <p>The start page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startPage")
        public Integer startPage;

        public static CreateAnnualDocSummaryTaskRequestDocInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateAnnualDocSummaryTaskRequestDocInfos self = new CreateAnnualDocSummaryTaskRequestDocInfos();
            return TeaModel.build(map, self);
        }

        public CreateAnnualDocSummaryTaskRequestDocInfos setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public CreateAnnualDocSummaryTaskRequestDocInfos setDocYear(Integer docYear) {
            this.docYear = docYear;
            return this;
        }
        public Integer getDocYear() {
            return this.docYear;
        }

        public CreateAnnualDocSummaryTaskRequestDocInfos setEndPage(Integer endPage) {
            this.endPage = endPage;
            return this;
        }
        public Integer getEndPage() {
            return this.endPage;
        }

        public CreateAnnualDocSummaryTaskRequestDocInfos setLibraryId(String libraryId) {
            this.libraryId = libraryId;
            return this;
        }
        public String getLibraryId() {
            return this.libraryId;
        }

        public CreateAnnualDocSummaryTaskRequestDocInfos setStartPage(Integer startPage) {
            this.startPage = startPage;
            return this;
        }
        public Integer getStartPage() {
            return this.startPage;
        }

    }

}
