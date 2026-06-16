// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractShrinkRequest extends TeaModel {
    /**
     * <p>The list of column names to extract, such as Size, Bust, and Length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Size&quot;,&quot;Bust&quot;,&quot;Length&quot;]</p>
     */
    @NameInMap("ColumnNameList")
    public String columnNameListShrink;

    /**
     * <p>The URL of the size chart image to extract.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/size_chart.jpg">https://example.com/size_chart.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The language model that controls the output language, such as en and cn.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("LanguageModel")
    public String languageModel;

    public static SizeChartExtractShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractShrinkRequest self = new SizeChartExtractShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractShrinkRequest setColumnNameListShrink(String columnNameListShrink) {
        this.columnNameListShrink = columnNameListShrink;
        return this;
    }
    public String getColumnNameListShrink() {
        return this.columnNameListShrink;
    }

    public SizeChartExtractShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SizeChartExtractShrinkRequest setLanguageModel(String languageModel) {
        this.languageModel = languageModel;
        return this;
    }
    public String getLanguageModel() {
        return this.languageModel;
    }

}
