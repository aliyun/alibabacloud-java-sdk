// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateFinReportSummaryTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("docId")
    public String docId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableTable")
    public Boolean enableTable;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("endPage")
    public Integer endPage;

    @NameInMap("instruction")
    public String instruction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3akzl28vap</p>
     */
    @NameInMap("libraryId")
    public String libraryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("startPage")
    public Integer startPage;

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("taskType")
    public String taskType;

    public static CreateFinReportSummaryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFinReportSummaryTaskRequest self = new CreateFinReportSummaryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateFinReportSummaryTaskRequest setDocId(String docId) {
        this.docId = docId;
        return this;
    }
    public String getDocId() {
        return this.docId;
    }

    public CreateFinReportSummaryTaskRequest setEnableTable(Boolean enableTable) {
        this.enableTable = enableTable;
        return this;
    }
    public Boolean getEnableTable() {
        return this.enableTable;
    }

    public CreateFinReportSummaryTaskRequest setEndPage(Integer endPage) {
        this.endPage = endPage;
        return this;
    }
    public Integer getEndPage() {
        return this.endPage;
    }

    public CreateFinReportSummaryTaskRequest setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public CreateFinReportSummaryTaskRequest setLibraryId(String libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public String getLibraryId() {
        return this.libraryId;
    }

    public CreateFinReportSummaryTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateFinReportSummaryTaskRequest setStartPage(Integer startPage) {
        this.startPage = startPage;
        return this;
    }
    public Integer getStartPage() {
        return this.startPage;
    }

    public CreateFinReportSummaryTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
