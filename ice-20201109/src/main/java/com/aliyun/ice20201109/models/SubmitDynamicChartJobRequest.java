// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicChartJobRequest extends TeaModel {
    /**
     * <p>The axis configurations. If XAxisFontInterval is set to 0 or left empty, the system automatically determines an optimal interval.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FontFile&quot;:&quot;Microsoft YaHei&quot;,&quot;XAxisFontSize&quot;:&quot;30&quot;,&quot;YAxisFontSize&quot;:&quot;30&quot;,&quot;XAxisFontInterval&quot;:&quot;30&quot;,&quot;AxisColor&quot;:&quot;30&quot;}</p>
     */
    @NameInMap("AxisParams")
    public String axisParams;

    /**
     * <p>The chart background.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Color&quot;:&quot;#000000&quot;,&quot;ImageUrl&quot;:&quot;<a href="http://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.jpg%22%7D">http://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.jpg&quot;}</a></p>
     */
    @NameInMap("Background")
    public String background;

    /**
     * <p>The chart configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Style&quot;:&quot;Normal&quot;,&quot;TitleStartTime&quot;:&quot;3000&quot;,&quot;ChartStartTime&quot;:&quot;3000&quot;,&quot;VideoDuration&quot;:&quot;15000&quot;}</p>
     */
    @NameInMap("ChartConfig")
    public String chartConfig;

    /**
     * <p>The chart title.</p>
     */
    @NameInMap("ChartTitle")
    public String chartTitle;

    /**
     * <p>The chart type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Line: line chart</li>
     * <li>Histogram: bar chart</li>
     * <li>Pie: pie chart</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Line</p>
     */
    @NameInMap("ChartType")
    public String chartType;

    /**
     * <p>The data source.</p>
     */
    @NameInMap("DataSource")
    public String dataSource;

    /**
     * <p>The job description.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input data for the chart.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;XlsFile&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.xls%22%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.xls&quot;}</a></p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>The output configurations.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;MediaURL&quot;:&quot;<a href="https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.mp4%22,%22Bitrate%22:2000,%22Width%22:800,%22Height%22:680%7D">https://your-bucket.oss-cn-shanghai.aliyuncs.com/obj.mp4&quot;,&quot;Bitrate&quot;:2000,&quot;Width&quot;:800,&quot;Height&quot;:680}</a></p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The subtitle.</p>
     */
    @NameInMap("Subtitle")
    public String subtitle;

    /**
     * <p>The job title.</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Unit</p>
     */
    @NameInMap("Unit")
    public String unit;

    /**
     * <p>The custom data in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;user&quot;:&quot;data&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitDynamicChartJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDynamicChartJobRequest self = new SubmitDynamicChartJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDynamicChartJobRequest setAxisParams(String axisParams) {
        this.axisParams = axisParams;
        return this;
    }
    public String getAxisParams() {
        return this.axisParams;
    }

    public SubmitDynamicChartJobRequest setBackground(String background) {
        this.background = background;
        return this;
    }
    public String getBackground() {
        return this.background;
    }

    public SubmitDynamicChartJobRequest setChartConfig(String chartConfig) {
        this.chartConfig = chartConfig;
        return this;
    }
    public String getChartConfig() {
        return this.chartConfig;
    }

    public SubmitDynamicChartJobRequest setChartTitle(String chartTitle) {
        this.chartTitle = chartTitle;
        return this;
    }
    public String getChartTitle() {
        return this.chartTitle;
    }

    public SubmitDynamicChartJobRequest setChartType(String chartType) {
        this.chartType = chartType;
        return this;
    }
    public String getChartType() {
        return this.chartType;
    }

    public SubmitDynamicChartJobRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public SubmitDynamicChartJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitDynamicChartJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitDynamicChartJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitDynamicChartJobRequest setSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }
    public String getSubtitle() {
        return this.subtitle;
    }

    public SubmitDynamicChartJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitDynamicChartJobRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public SubmitDynamicChartJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
