// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskShrinkRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public String credentialConfigShrink;

    @NameInMap("EndPage")
    public Long endPage;

    @NameInMap("FirstPage")
    public Boolean firstPage;

    @NameInMap("FitToHeight")
    public Boolean fitToHeight;

    @NameInMap("FitToWidth")
    public Boolean fitToWidth;

    @NameInMap("HoldLineFeed")
    public Boolean holdLineFeed;

    @NameInMap("ImageDPI")
    public Long imageDPI;

    @NameInMap("LongPicture")
    public Boolean longPicture;

    @NameInMap("LongText")
    public Boolean longText;

    @NameInMap("MaxSheetColumn")
    public Long maxSheetColumn;

    @NameInMap("MaxSheetRow")
    public Long maxSheetRow;

    @NameInMap("Notification")
    public String notificationShrink;

    @NameInMap("Pages")
    public String pages;

    @NameInMap("PaperHorizontal")
    public Boolean paperHorizontal;

    @NameInMap("PaperSize")
    public String paperSize;

    @NameInMap("Password")
    public String password;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Quality")
    public Long quality;

    @NameInMap("ScalePercentage")
    public Long scalePercentage;

    @NameInMap("SheetCount")
    public Long sheetCount;

    @NameInMap("SheetIndex")
    public Long sheetIndex;

    @NameInMap("ShowComments")
    public Boolean showComments;

    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("StartPage")
    public Long startPage;

    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("TargetURI")
    public String targetURI;

    @NameInMap("TargetURIPrefix")
    public String targetURIPrefix;

    @NameInMap("TrimPolicy")
    public String trimPolicyShrink;

    @NameInMap("UserData")
    public String userData;

    public static CreateOfficeConversionTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskShrinkRequest self = new CreateOfficeConversionTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskShrinkRequest setCredentialConfigShrink(String credentialConfigShrink) {
        this.credentialConfigShrink = credentialConfigShrink;
        return this;
    }
    public String getCredentialConfigShrink() {
        return this.credentialConfigShrink;
    }

    public CreateOfficeConversionTaskShrinkRequest setEndPage(Long endPage) {
        this.endPage = endPage;
        return this;
    }
    public Long getEndPage() {
        return this.endPage;
    }

    public CreateOfficeConversionTaskShrinkRequest setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    public Boolean getFirstPage() {
        return this.firstPage;
    }

    public CreateOfficeConversionTaskShrinkRequest setFitToHeight(Boolean fitToHeight) {
        this.fitToHeight = fitToHeight;
        return this;
    }
    public Boolean getFitToHeight() {
        return this.fitToHeight;
    }

    public CreateOfficeConversionTaskShrinkRequest setFitToWidth(Boolean fitToWidth) {
        this.fitToWidth = fitToWidth;
        return this;
    }
    public Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public CreateOfficeConversionTaskShrinkRequest setHoldLineFeed(Boolean holdLineFeed) {
        this.holdLineFeed = holdLineFeed;
        return this;
    }
    public Boolean getHoldLineFeed() {
        return this.holdLineFeed;
    }

    public CreateOfficeConversionTaskShrinkRequest setImageDPI(Long imageDPI) {
        this.imageDPI = imageDPI;
        return this;
    }
    public Long getImageDPI() {
        return this.imageDPI;
    }

    public CreateOfficeConversionTaskShrinkRequest setLongPicture(Boolean longPicture) {
        this.longPicture = longPicture;
        return this;
    }
    public Boolean getLongPicture() {
        return this.longPicture;
    }

    public CreateOfficeConversionTaskShrinkRequest setLongText(Boolean longText) {
        this.longText = longText;
        return this;
    }
    public Boolean getLongText() {
        return this.longText;
    }

    public CreateOfficeConversionTaskShrinkRequest setMaxSheetColumn(Long maxSheetColumn) {
        this.maxSheetColumn = maxSheetColumn;
        return this;
    }
    public Long getMaxSheetColumn() {
        return this.maxSheetColumn;
    }

    public CreateOfficeConversionTaskShrinkRequest setMaxSheetRow(Long maxSheetRow) {
        this.maxSheetRow = maxSheetRow;
        return this;
    }
    public Long getMaxSheetRow() {
        return this.maxSheetRow;
    }

    public CreateOfficeConversionTaskShrinkRequest setNotificationShrink(String notificationShrink) {
        this.notificationShrink = notificationShrink;
        return this;
    }
    public String getNotificationShrink() {
        return this.notificationShrink;
    }

    public CreateOfficeConversionTaskShrinkRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public CreateOfficeConversionTaskShrinkRequest setPaperHorizontal(Boolean paperHorizontal) {
        this.paperHorizontal = paperHorizontal;
        return this;
    }
    public Boolean getPaperHorizontal() {
        return this.paperHorizontal;
    }

    public CreateOfficeConversionTaskShrinkRequest setPaperSize(String paperSize) {
        this.paperSize = paperSize;
        return this;
    }
    public String getPaperSize() {
        return this.paperSize;
    }

    public CreateOfficeConversionTaskShrinkRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOfficeConversionTaskShrinkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOfficeConversionTaskShrinkRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateOfficeConversionTaskShrinkRequest setScalePercentage(Long scalePercentage) {
        this.scalePercentage = scalePercentage;
        return this;
    }
    public Long getScalePercentage() {
        return this.scalePercentage;
    }

    public CreateOfficeConversionTaskShrinkRequest setSheetCount(Long sheetCount) {
        this.sheetCount = sheetCount;
        return this;
    }
    public Long getSheetCount() {
        return this.sheetCount;
    }

    public CreateOfficeConversionTaskShrinkRequest setSheetIndex(Long sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }
    public Long getSheetIndex() {
        return this.sheetIndex;
    }

    public CreateOfficeConversionTaskShrinkRequest setShowComments(Boolean showComments) {
        this.showComments = showComments;
        return this;
    }
    public Boolean getShowComments() {
        return this.showComments;
    }

    public CreateOfficeConversionTaskShrinkRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateOfficeConversionTaskShrinkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public CreateOfficeConversionTaskShrinkRequest setStartPage(Long startPage) {
        this.startPage = startPage;
        return this;
    }
    public Long getStartPage() {
        return this.startPage;
    }

    public CreateOfficeConversionTaskShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateOfficeConversionTaskShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateOfficeConversionTaskShrinkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

    public CreateOfficeConversionTaskShrinkRequest setTargetURIPrefix(String targetURIPrefix) {
        this.targetURIPrefix = targetURIPrefix;
        return this;
    }
    public String getTargetURIPrefix() {
        return this.targetURIPrefix;
    }

    public CreateOfficeConversionTaskShrinkRequest setTrimPolicyShrink(String trimPolicyShrink) {
        this.trimPolicyShrink = trimPolicyShrink;
        return this;
    }
    public String getTrimPolicyShrink() {
        return this.trimPolicyShrink;
    }

    public CreateOfficeConversionTaskShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
