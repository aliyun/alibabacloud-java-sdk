// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractAsyncShrinkRequest extends TeaModel {
    /**
     * <p>The business order number of the caller. It is recorded when the request is accepted and returned as is when you query the asynchronous task result.</p>
     * 
     * <strong>example:</strong>
     * <p>order-20260928-001</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The list of column names to extract, such as Size, Bust, and Length.</p>
     */
    @NameInMap("ColumnNameList")
    public String columnNameListShrink;

    /**
     * <p>The image URL. The image must be in the JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 pixels and 3000 × 3000 pixels, and the file size cannot exceed 10 MB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg">https://ae01.alicdn.com/kf/S342f0070dc9f4be09a6cbed34e90dc8fs.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The output language format. If you do not specify this parameter, the original language is used. If the original image language is Chinese or English, specifying en outputs English, and specifying cn outputs Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("LanguageModel")
    public String languageModel;

    public static SizeChartExtractAsyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractAsyncShrinkRequest self = new SizeChartExtractAsyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractAsyncShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SizeChartExtractAsyncShrinkRequest setColumnNameListShrink(String columnNameListShrink) {
        this.columnNameListShrink = columnNameListShrink;
        return this;
    }
    public String getColumnNameListShrink() {
        return this.columnNameListShrink;
    }

    public SizeChartExtractAsyncShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SizeChartExtractAsyncShrinkRequest setLanguageModel(String languageModel) {
        this.languageModel = languageModel;
        return this;
    }
    public String getLanguageModel() {
        return this.languageModel;
    }

}
