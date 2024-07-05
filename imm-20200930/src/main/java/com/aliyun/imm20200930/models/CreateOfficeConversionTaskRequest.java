// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
    @NameInMap("EndPage")
    public Long endPage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FirstPage")
    public Boolean firstPage;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FitToHeight")
    public Boolean fitToHeight;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FitToWidth")
    public Boolean fitToWidth;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HoldLineFeed")
    public Boolean holdLineFeed;

    /**
     * <strong>example:</strong>
     * <p>96</p>
     */
    @NameInMap("ImageDPI")
    public Long imageDPI;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LongPicture")
    public Boolean longPicture;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LongText")
    public Boolean longText;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSheetColumn")
    public Long maxSheetColumn;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxSheetRow")
    public Long maxSheetRow;

    @NameInMap("Notification")
    public Notification notification;

    /**
     * <strong>example:</strong>
     * <p>1,2-4,7</p>
     */
    @NameInMap("Pages")
    public String pages;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PaperHorizontal")
    public Boolean paperHorizontal;

    /**
     * <strong>example:</strong>
     * <p>A4</p>
     */
    @NameInMap("PaperSize")
    public String paperSize;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immtest</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Quality")
    public Long quality;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ScalePercentage")
    public Long scalePercentage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SheetCount")
    public Long sheetCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SheetIndex")
    public Long sheetIndex;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShowComments")
    public Boolean showComments;

    /**
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartPage")
    public Long startPage;

    /**
     * <strong>example:</strong>
     * <p>{&quot;test&quot;:&quot;val1&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>png</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <strong>example:</strong>
     * <p>oss://{bucket}/{tags.custom}/{dirname}/{barename}.{autoext}</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    /**
     * <strong>example:</strong>
     * <p>oss://bucket1/</p>
     */
    @NameInMap("TargetURIPrefix")
    public String targetURIPrefix;

    @NameInMap("TrimPolicy")
    public TrimPolicy trimPolicy;

    /**
     * <strong>example:</strong>
     * <p>{&quot;file_id&quot;: &quot;abc&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CreateOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskRequest self = new CreateOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CreateOfficeConversionTaskRequest setEndPage(Long endPage) {
        this.endPage = endPage;
        return this;
    }
    public Long getEndPage() {
        return this.endPage;
    }

    public CreateOfficeConversionTaskRequest setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    public Boolean getFirstPage() {
        return this.firstPage;
    }

    public CreateOfficeConversionTaskRequest setFitToHeight(Boolean fitToHeight) {
        this.fitToHeight = fitToHeight;
        return this;
    }
    public Boolean getFitToHeight() {
        return this.fitToHeight;
    }

    public CreateOfficeConversionTaskRequest setFitToWidth(Boolean fitToWidth) {
        this.fitToWidth = fitToWidth;
        return this;
    }
    public Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public CreateOfficeConversionTaskRequest setHoldLineFeed(Boolean holdLineFeed) {
        this.holdLineFeed = holdLineFeed;
        return this;
    }
    public Boolean getHoldLineFeed() {
        return this.holdLineFeed;
    }

    public CreateOfficeConversionTaskRequest setImageDPI(Long imageDPI) {
        this.imageDPI = imageDPI;
        return this;
    }
    public Long getImageDPI() {
        return this.imageDPI;
    }

    public CreateOfficeConversionTaskRequest setLongPicture(Boolean longPicture) {
        this.longPicture = longPicture;
        return this;
    }
    public Boolean getLongPicture() {
        return this.longPicture;
    }

    public CreateOfficeConversionTaskRequest setLongText(Boolean longText) {
        this.longText = longText;
        return this;
    }
    public Boolean getLongText() {
        return this.longText;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetColumn(Long maxSheetColumn) {
        this.maxSheetColumn = maxSheetColumn;
        return this;
    }
    public Long getMaxSheetColumn() {
        return this.maxSheetColumn;
    }

    public CreateOfficeConversionTaskRequest setMaxSheetRow(Long maxSheetRow) {
        this.maxSheetRow = maxSheetRow;
        return this;
    }
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    public CreateOfficeConversionTaskRequest setNotification(Notification notification) {
        this.notification = notification;
        return this;
    }
    public Notification getNotification() {
        return this.notification;
    }

    public CreateOfficeConversionTaskRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public CreateOfficeConversionTaskRequest setPaperHorizontal(Boolean paperHorizontal) {
        this.paperHorizontal = paperHorizontal;
        return this;
    }
    public Boolean getPaperHorizontal() {
        return this.paperHorizontal;
    }

    public CreateOfficeConversionTaskRequest setPaperSize(String paperSize) {
        this.paperSize = paperSize;
        return this;
    }
    public String getPaperSize() {
        return this.paperSize;
    }

    public CreateOfficeConversionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOfficeConversionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOfficeConversionTaskRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateOfficeConversionTaskRequest setScalePercentage(Long scalePercentage) {
        this.scalePercentage = scalePercentage;
        return this;
    }
    public Long getScalePercentage() {
        return this.scalePercentage;
    }

    public CreateOfficeConversionTaskRequest setSheetCount(Long sheetCount) {
        this.sheetCount = sheetCount;
        return this;
    }
    public Long getSheetCount() {
        return this.sheetCount;
    }

    public CreateOfficeConversionTaskRequest setSheetIndex(Long sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }
    public Long getSheetIndex() {
        return this.sheetIndex;
    }

    public CreateOfficeConversionTaskRequest setShowComments(Boolean showComments) {
        this.showComments = showComments;
        return this;
    }
    public Boolean getShowComments() {
        return this.showComments;
    }

    public CreateOfficeConversionTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateOfficeConversionTaskRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateOfficeConversionTaskRequest setStartPage(Long startPage) {
        this.startPage = startPage;
        return this;
    }
    public Long getStartPage() {
        return this.startPage;
    }

    public CreateOfficeConversionTaskRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateOfficeConversionTaskRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateOfficeConversionTaskRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateOfficeConversionTaskRequest setTargetURIPrefix(String targetURIPrefix) {
        this.targetURIPrefix = targetURIPrefix;
        return this;
    }
    public String getTargetURIPrefix() {
        return this.targetURIPrefix;
    }

    public CreateOfficeConversionTaskRequest setTrimPolicy(TrimPolicy trimPolicy) {
        this.trimPolicy = trimPolicy;
        return this;
    }
    public TrimPolicy getTrimPolicy() {
        return this.trimPolicy;
    }

    public CreateOfficeConversionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
