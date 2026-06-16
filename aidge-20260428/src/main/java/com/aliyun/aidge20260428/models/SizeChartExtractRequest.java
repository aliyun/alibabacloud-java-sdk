// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartExtractRequest extends TeaModel {
    /**
     * <p>The list of column names to extract, such as Size, Bust, and Length.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Size&quot;,&quot;Bust&quot;,&quot;Length&quot;]</p>
     */
    @NameInMap("ColumnNameList")
    public java.util.List<String> columnNameList;

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

    public static SizeChartExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        SizeChartExtractRequest self = new SizeChartExtractRequest();
        return TeaModel.build(map, self);
    }

    public SizeChartExtractRequest setColumnNameList(java.util.List<String> columnNameList) {
        this.columnNameList = columnNameList;
        return this;
    }
    public java.util.List<String> getColumnNameList() {
        return this.columnNameList;
    }

    public SizeChartExtractRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SizeChartExtractRequest setLanguageModel(String languageModel) {
        this.languageModel = languageModel;
        return this;
    }
    public String getLanguageModel() {
        return this.languageModel;
    }

}
