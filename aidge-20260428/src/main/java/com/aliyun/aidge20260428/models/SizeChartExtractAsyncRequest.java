// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractAsyncRequest extends TeaModel {
    /**
     * <p>The list of column names to extract, such as Size, Bust, and Length.</p>
     */
    @NameInMap("ColumnNameList")
    public java.util.List<String> columnNameList;

    /**
     * <p>The image URL. The image must be in the JPG, JPEG, PNG, BMP, or WEBP format. The resolution must be between 256 × 256 pixels and 3000 × 3000 pixels. The file size cannot exceed 10 MB.</p>
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

    public static SizeChartExtractAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractAsyncRequest self = new SizeChartExtractAsyncRequest();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractAsyncRequest setColumnNameList(java.util.List<String> columnNameList) {
        this.columnNameList = columnNameList;
        return this;
    }
    public java.util.List<String> getColumnNameList() {
        return this.columnNameList;
    }

    public SizeChartExtractAsyncRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SizeChartExtractAsyncRequest setLanguageModel(String languageModel) {
        this.languageModel = languageModel;
        return this;
    }
    public String getLanguageModel() {
        return this.languageModel;
    }

}
