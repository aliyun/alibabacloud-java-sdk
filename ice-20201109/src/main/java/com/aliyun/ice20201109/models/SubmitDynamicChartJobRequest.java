// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitDynamicChartJobRequest extends TeaModel {
    @NameInMap("AxisParams")
    public String axisParams;

    @NameInMap("Background")
    public String background;

    @NameInMap("ChartConfig")
    public String chartConfig;

    @NameInMap("ChartTitle")
    public String chartTitle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChartType")
    public String chartType;

    @NameInMap("DataSource")
    public String dataSource;

    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public String input;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("Subtitle")
    public String subtitle;

    @NameInMap("Title")
    public String title;

    @NameInMap("Unit")
    public String unit;

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
