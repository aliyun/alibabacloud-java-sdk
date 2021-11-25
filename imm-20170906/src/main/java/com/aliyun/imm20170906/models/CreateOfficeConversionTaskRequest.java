// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskRequest extends TeaModel {
    @NameInMap("DisplayDpi")
    public Integer displayDpi;

    @NameInMap("EndPage")
    public Long endPage;

    @NameInMap("FitToPagesTall")
    public Boolean fitToPagesTall;

    @NameInMap("FitToPagesWide")
    public Boolean fitToPagesWide;

    @NameInMap("Hidecomments")
    public Boolean hidecomments;

    @NameInMap("IdempotentToken")
    public String idempotentToken;

    @NameInMap("MaxSheetCol")
    public Long maxSheetCol;

    @NameInMap("MaxSheetCount")
    public Long maxSheetCount;

    @NameInMap("MaxSheetRow")
    public Long maxSheetRow;

    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    @NameInMap("Password")
    public String password;

    @NameInMap("PdfVector")
    public Boolean pdfVector;

    @NameInMap("Project")
    public String project;

    @NameInMap("SheetOnePage")
    public Boolean sheetOnePage;

    @NameInMap("SrcType")
    public String srcType;

    @NameInMap("SrcUri")
    public String srcUri;

    @NameInMap("StartPage")
    public Long startPage;

    @NameInMap("TgtFilePages")
    public String tgtFilePages;

    @NameInMap("TgtFilePrefix")
    public String tgtFilePrefix;

    @NameInMap("TgtFileSuffix")
    public String tgtFileSuffix;

    @NameInMap("TgtType")
    public String tgtType;

    @NameInMap("TgtUri")
    public String tgtUri;

    @NameInMap("UserData")
    public String userData;

    public static CreateOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskRequest self = new CreateOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskRequest setDisplayDpi(Integer displayDpi) {
        this.displayDpi = displayDpi;
        return this;
    }
    public Integer getDisplayDpi() {
        return this.displayDpi;
    }

    public CreateOfficeConversionTaskRequest setEndPage(Long endPage) {
        this.endPage = endPage;
        return this;
    }
    public Long getEndPage() {
        return this.endPage;
    }

    public CreateOfficeConversionTaskRequest setFitToPagesTall(Boolean fitToPagesTall) {
        this.fitToPagesTall = fitToPagesTall;
        return this;
    }
    public Boolean getFitToPagesTall() {
        return this.fitToPagesTall;
    }

    public CreateOfficeConversionTaskRequest setFitToPagesWide(Boolean fitToPagesWide) {
        this.fitToPagesWide = fitToPagesWide;
        return this;
    }
    public Boolean getFitToPagesWide() {
        return this.fitToPagesWide;
    }

    public CreateOfficeConversionTaskRequest setHidecomments(Boolean hidecomments) {
        this.hidecomments = hidecomments;
        return this;
    }
    public Boolean getHidecomments() {
        return this.hidecomments;
    }

    public CreateOfficeConversionTaskRequest setIdempotentToken(String idempotentToken) {
        this.idempotentToken = idempotentToken;
        return this;
    }
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetCol(Long maxSheetCol) {
        this.maxSheetCol = maxSheetCol;
        return this;
    }
    public Long getMaxSheetCol() {
        return this.maxSheetCol;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetCount(Long maxSheetCount) {
        this.maxSheetCount = maxSheetCount;
        return this;
    }
    public Long getMaxSheetCount() {
        return this.maxSheetCount;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetRow(Long maxSheetRow) {
        this.maxSheetRow = maxSheetRow;
        return this;
    }
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    public CreateOfficeConversionTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public CreateOfficeConversionTaskRequest setNotifyEndpoint(String notifyEndpoint) {
        this.notifyEndpoint = notifyEndpoint;
        return this;
    }
    public String getNotifyEndpoint() {
        return this.notifyEndpoint;
    }

    public CreateOfficeConversionTaskRequest setNotifyTopicName(String notifyTopicName) {
        this.notifyTopicName = notifyTopicName;
        return this;
    }
    public String getNotifyTopicName() {
        return this.notifyTopicName;
    }

    public CreateOfficeConversionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOfficeConversionTaskRequest setPdfVector(Boolean pdfVector) {
        this.pdfVector = pdfVector;
        return this;
    }
    public Boolean getPdfVector() {
        return this.pdfVector;
    }

    public CreateOfficeConversionTaskRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateOfficeConversionTaskRequest setSheetOnePage(Boolean sheetOnePage) {
        this.sheetOnePage = sheetOnePage;
        return this;
    }
    public Boolean getSheetOnePage() {
        return this.sheetOnePage;
    }

    public CreateOfficeConversionTaskRequest setSrcType(String srcType) {
        this.srcType = srcType;
        return this;
    }
    public String getSrcType() {
        return this.srcType;
    }

    public CreateOfficeConversionTaskRequest setSrcUri(String srcUri) {
        this.srcUri = srcUri;
        return this;
    }
    public String getSrcUri() {
        return this.srcUri;
    }

    public CreateOfficeConversionTaskRequest setStartPage(Long startPage) {
        this.startPage = startPage;
        return this;
    }
    public Long getStartPage() {
        return this.startPage;
    }

    public CreateOfficeConversionTaskRequest setTgtFilePages(String tgtFilePages) {
        this.tgtFilePages = tgtFilePages;
        return this;
    }
    public String getTgtFilePages() {
        return this.tgtFilePages;
    }

    public CreateOfficeConversionTaskRequest setTgtFilePrefix(String tgtFilePrefix) {
        this.tgtFilePrefix = tgtFilePrefix;
        return this;
    }
    public String getTgtFilePrefix() {
        return this.tgtFilePrefix;
    }

    public CreateOfficeConversionTaskRequest setTgtFileSuffix(String tgtFileSuffix) {
        this.tgtFileSuffix = tgtFileSuffix;
        return this;
    }
    public String getTgtFileSuffix() {
        return this.tgtFileSuffix;
    }

    public CreateOfficeConversionTaskRequest setTgtType(String tgtType) {
        this.tgtType = tgtType;
        return this;
    }
    public String getTgtType() {
        return this.tgtType;
    }

    public CreateOfficeConversionTaskRequest setTgtUri(String tgtUri) {
        this.tgtUri = tgtUri;
        return this;
    }
    public String getTgtUri() {
        return this.tgtUri;
    }

    public CreateOfficeConversionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
