// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocPageInfo extends TeaModel {
    /**
     * <p>The rotation angle of the image after the page is converted to an image.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("angle")
    public Double angle;

    /**
     * <p>Reserved, can be unused for now.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("excelParseResult")
    public String excelParseResult;

    /**
     * <p>The height of the page turns to image.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("imageHeight")
    public Integer imageHeight;

    /**
     * <ul>
     * <li>The image URL after the page is converted to an image. </li>
     * <li>Note: The image URL will be inaccessible after 24 hours, so you need to save it promptly.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("imageUrl")
    public String imageUrl;

    /**
     * <p>The width of the page turns to image</p>
     * 
     * <strong>example:</strong>
     * <p>23</p>
     */
    @NameInMap("imageWidth")
    public Integer imageWidth;

    /**
     * <p>The page index in the current document, starting from 0.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("pageIdCurDoc")
    public Integer pageIdCurDoc;

    /**
     * <p>Reserved, can be unused for now.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("pdfParseResult")
    public String pdfParseResult;

    /**
     * <p>Reserved, can be unused for now.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
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
