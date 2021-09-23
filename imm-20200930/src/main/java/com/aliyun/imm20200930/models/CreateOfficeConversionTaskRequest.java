// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CreateOfficeConversionTaskRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SourceUri")
    public String sourceUri;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("TargetUri")
    public String targetUri;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Password")
    public String password;

    // excel 转换 sheet 的数量，默认转换所有
    @NameInMap("SheetCount")
    public String sheetCount;

    // 开始转换页，如果是 excel 需要指定 SheetIndex
    @NameInMap("StartPage")
    public String startPage;

    // 结束转换页，如果是 excel 需要指定 SheetIndex
    @NameInMap("EndPage")
    public String endPage;

    // 缩放大小 20~200，默认100，小于100缩放，大于100放大
    @NameInMap("Scale")
    public Long scale;

    // 转化质量0~100
    @NameInMap("Quality")
    public Long quality;

    // excel 标签页，从 1 开始
    @NameInMap("SheetIndex")
    public Long sheetIndex;

    // 表格转图片，所有列输出到一张图片
    @NameInMap("FitToWidth")
    public Boolean fitToWidth;

    // 表格转图片，所有行输出到一张图片
    @NameInMap("FitToHeight")
    public Boolean fitToHeight;

    // 纸张大小 A4, A2, A0，默认 A4
    @NameInMap("PaperSize")
    public String paperSize;

    // 水平放置纸张，默认 false
    @NameInMap("IsHorizontal")
    public Boolean isHorizontal;

    // 表格转图片参数，只返回表格的第一张图片，图片包含的行数列数是自动切割的结果。必须在LongPic为true的情况下才有效。默认为false
    @NameInMap("FirstPage")
    public Boolean firstPage;

    // 转图片，合成一个一张产长图，最多20张图片，默认 false
    @NameInMap("LongPic")
    public Boolean longPic;

    // 显示批注
    @NameInMap("ShowComments")
    public Boolean showComments;

    // mns 消息地址
    @NameInMap("NotifyEndpoint")
    public String notifyEndpoint;

    // mns 消息 topic
    @NameInMap("NotifyTopicName")
    public String notifyTopicName;

    // 用户自定义信息，此信息将在 Task 中回传
    @NameInMap("UserData")
    public String userData;

    public static CreateOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOfficeConversionTaskRequest self = new CreateOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateOfficeConversionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateOfficeConversionTaskRequest setSourceUri(String sourceUri) {
        this.sourceUri = sourceUri;
        return this;
    }
    public String getSourceUri() {
        return this.sourceUri;
    }

    public CreateOfficeConversionTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateOfficeConversionTaskRequest setTargetUri(String targetUri) {
        this.targetUri = targetUri;
        return this;
    }
    public String getTargetUri() {
        return this.targetUri;
    }

    public CreateOfficeConversionTaskRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public CreateOfficeConversionTaskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateOfficeConversionTaskRequest setSheetCount(String sheetCount) {
        this.sheetCount = sheetCount;
        return this;
    }
    public String getSheetCount() {
        return this.sheetCount;
    }

    public CreateOfficeConversionTaskRequest setStartPage(String startPage) {
        this.startPage = startPage;
        return this;
    }
    public String getStartPage() {
        return this.startPage;
    }

    public CreateOfficeConversionTaskRequest setEndPage(String endPage) {
        this.endPage = endPage;
        return this;
    }
    public String getEndPage() {
        return this.endPage;
    }

    public CreateOfficeConversionTaskRequest setScale(Long scale) {
        this.scale = scale;
        return this;
    }
    public Long getScale() {
        return this.scale;
    }

    public CreateOfficeConversionTaskRequest setQuality(Long quality) {
        this.quality = quality;
        return this;
    }
    public Long getQuality() {
        return this.quality;
    }

    public CreateOfficeConversionTaskRequest setSheetIndex(Long sheetIndex) {
        this.sheetIndex = sheetIndex;
        return this;
    }
    public Long getSheetIndex() {
        return this.sheetIndex;
    }

    public CreateOfficeConversionTaskRequest setFitToWidth(Boolean fitToWidth) {
        this.fitToWidth = fitToWidth;
        return this;
    }
    public Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public CreateOfficeConversionTaskRequest setFitToHeight(Boolean fitToHeight) {
        this.fitToHeight = fitToHeight;
        return this;
    }
    public Boolean getFitToHeight() {
        return this.fitToHeight;
    }

    public CreateOfficeConversionTaskRequest setPaperSize(String paperSize) {
        this.paperSize = paperSize;
        return this;
    }
    public String getPaperSize() {
        return this.paperSize;
    }

    public CreateOfficeConversionTaskRequest setIsHorizontal(Boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
        return this;
    }
    public Boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    public CreateOfficeConversionTaskRequest setFirstPage(Boolean firstPage) {
        this.firstPage = firstPage;
        return this;
    }
    public Boolean getFirstPage() {
        return this.firstPage;
    }

    public CreateOfficeConversionTaskRequest setLongPic(Boolean longPic) {
        this.longPic = longPic;
        return this;
    }
    public Boolean getLongPic() {
        return this.longPic;
    }

    public CreateOfficeConversionTaskRequest setShowComments(Boolean showComments) {
        this.showComments = showComments;
        return this;
    }
    public Boolean getShowComments() {
        return this.showComments;
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

    public CreateOfficeConversionTaskRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
