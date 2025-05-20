// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocPageInfo extends TeaModel {
    @NameInMap("angle")
    public Double angle;

    @NameInMap("excelParseResult")
    public String excelParseResult;

    @NameInMap("imageHeight")
    public Integer imageHeight;

    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("imageWidth")
    public Integer imageWidth;

    @NameInMap("pageIdCurDoc")
    public Integer pageIdCurDoc;

    @NameInMap("pdfParseResult")
    public String pdfParseResult;

    @NameInMap("wordParseResult")
    public String wordParseResult;

    public static ChatRefDocPageInfo build(java.util.Map<String, ?> map) throws Exception {
        ChatRefDocPageInfo self = new ChatRefDocPageInfo();
        return TeaModel.build(map, self);
    }

    public ChatRefDocPageInfo setAngle(Double angle) {
        this.angle = angle;
        return this;
    }
    public Double getAngle() {
        return this.angle;
    }

    public ChatRefDocPageInfo setExcelParseResult(String excelParseResult) {
        this.excelParseResult = excelParseResult;
        return this;
    }
    public String getExcelParseResult() {
        return this.excelParseResult;
    }

    public ChatRefDocPageInfo setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }
    public Integer getImageHeight() {
        return this.imageHeight;
    }

    public ChatRefDocPageInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ChatRefDocPageInfo setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }
    public Integer getImageWidth() {
        return this.imageWidth;
    }

    public ChatRefDocPageInfo setPageIdCurDoc(Integer pageIdCurDoc) {
        this.pageIdCurDoc = pageIdCurDoc;
        return this;
    }
    public Integer getPageIdCurDoc() {
        return this.pageIdCurDoc;
    }

    public ChatRefDocPageInfo setPdfParseResult(String pdfParseResult) {
        this.pdfParseResult = pdfParseResult;
        return this;
    }
    public String getPdfParseResult() {
        return this.pdfParseResult;
    }

    public ChatRefDocPageInfo setWordParseResult(String wordParseResult) {
        this.wordParseResult = wordParseResult;
        return this;
    }
    public String getWordParseResult() {
        return this.wordParseResult;
    }

}
