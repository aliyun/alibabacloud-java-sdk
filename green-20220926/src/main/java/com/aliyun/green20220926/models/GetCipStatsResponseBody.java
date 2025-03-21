// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetCipStatsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetCipStatsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCipStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCipStatsResponseBody self = new GetCipStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCipStatsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCipStatsResponseBody setData(GetCipStatsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCipStatsResponseBodyData getData() {
        return this.data;
    }

    public GetCipStatsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCipStatsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetCipStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCipStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCipStatsResponseBodyDataLabelStatChartImageTreeChar extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        public static GetCipStatsResponseBodyDataLabelStatChartImageTreeChar build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataLabelStatChartImageTreeChar self = new GetCipStatsResponseBodyDataLabelStatChartImageTreeChar();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataLabelStatChartImageTreeChar setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCipStatsResponseBodyDataLabelStatChartImageTreeChar setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCipStatsResponseBodyDataLabelStatChartImageTreeChar setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCipStatsResponseBodyDataLabelStatChartTreeChart extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>nickNameDetection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCipStatsResponseBodyDataLabelStatChartTreeChart build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataLabelStatChartTreeChart self = new GetCipStatsResponseBodyDataLabelStatChartTreeChart();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataLabelStatChartTreeChart setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCipStatsResponseBodyDataLabelStatChartTreeChart setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCipStatsResponseBodyDataLabelStatChartTreeChart setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>nickNameDetection</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart self = new GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCipStatsResponseBodyDataLabelStatChartY extends TeaModel {
        @NameInMap("Data")
        public java.util.List<Long> data;

        /**
         * <strong>example:</strong>
         * <p>nickNameDetection</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetCipStatsResponseBodyDataLabelStatChartY build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataLabelStatChartY self = new GetCipStatsResponseBodyDataLabelStatChartY();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataLabelStatChartY setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetCipStatsResponseBodyDataLabelStatChartY setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetCipStatsResponseBodyDataLabelStatChart extends TeaModel {
        @NameInMap("ImageTreeChar")
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartImageTreeChar> imageTreeChar;

        /**
         * <strong>example:</strong>
         * <p>nickNameDetection</p>
         */
        @NameInMap("ServiceCode")
        public String serviceCode;

        /**
         * <strong>example:</strong>
         * <p>117</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TreeChart")
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartTreeChart> treeChart;

        @NameInMap("VoiceTreeChart")
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart> voiceTreeChart;

        @NameInMap("X")
        public java.util.List<String> x;

        @NameInMap("Y")
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartY> y;

        public static GetCipStatsResponseBodyDataLabelStatChart build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataLabelStatChart self = new GetCipStatsResponseBodyDataLabelStatChart();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataLabelStatChart setImageTreeChar(java.util.List<GetCipStatsResponseBodyDataLabelStatChartImageTreeChar> imageTreeChar) {
            this.imageTreeChar = imageTreeChar;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartImageTreeChar> getImageTreeChar() {
            return this.imageTreeChar;
        }

        public GetCipStatsResponseBodyDataLabelStatChart setServiceCode(String serviceCode) {
            this.serviceCode = serviceCode;
            return this;
        }
        public String getServiceCode() {
            return this.serviceCode;
        }

        public GetCipStatsResponseBodyDataLabelStatChart setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetCipStatsResponseBodyDataLabelStatChart setTreeChart(java.util.List<GetCipStatsResponseBodyDataLabelStatChartTreeChart> treeChart) {
            this.treeChart = treeChart;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartTreeChart> getTreeChart() {
            return this.treeChart;
        }

        public GetCipStatsResponseBodyDataLabelStatChart setVoiceTreeChart(java.util.List<GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart> voiceTreeChart) {
            this.voiceTreeChart = voiceTreeChart;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartVoiceTreeChart> getVoiceTreeChart() {
            return this.voiceTreeChart;
        }

        public GetCipStatsResponseBodyDataLabelStatChart setX(java.util.List<String> x) {
            this.x = x;
            return this;
        }
        public java.util.List<String> getX() {
            return this.x;
        }

        public GetCipStatsResponseBodyDataLabelStatChart setY(java.util.List<GetCipStatsResponseBodyDataLabelStatChartY> y) {
            this.y = y;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChartY> getY() {
            return this.y;
        }

    }

    public static class GetCipStatsResponseBodyDataY extends TeaModel {
        @NameInMap("Data")
        public java.util.List<Long> data;

        /**
         * <strong>example:</strong>
         * <p>nickNameDetection</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetCipStatsResponseBodyDataY build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataY self = new GetCipStatsResponseBodyDataY();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataY setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetCipStatsResponseBodyDataY setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetCipStatsResponseBodyDataZ extends TeaModel {
        @NameInMap("Data")
        public java.util.List<Long> data;

        /**
         * <strong>example:</strong>
         * <p>nickNameDetection</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetCipStatsResponseBodyDataZ build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyDataZ self = new GetCipStatsResponseBodyDataZ();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyDataZ setData(java.util.List<Long> data) {
            this.data = data;
            return this;
        }
        public java.util.List<Long> getData() {
            return this.data;
        }

        public GetCipStatsResponseBodyDataZ setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetCipStatsResponseBodyData extends TeaModel {
        @NameInMap("LabelStatChart")
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChart> labelStatChart;

        @NameInMap("TotalStat")
        public java.util.Map<String, ?> totalStat;

        @NameInMap("Uids")
        public java.util.List<String> uids;

        @NameInMap("X")
        public java.util.List<String> x;

        @NameInMap("Y")
        public java.util.List<GetCipStatsResponseBodyDataY> y;

        @NameInMap("Z")
        public java.util.List<GetCipStatsResponseBodyDataZ> z;

        public static GetCipStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCipStatsResponseBodyData self = new GetCipStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCipStatsResponseBodyData setLabelStatChart(java.util.List<GetCipStatsResponseBodyDataLabelStatChart> labelStatChart) {
            this.labelStatChart = labelStatChart;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataLabelStatChart> getLabelStatChart() {
            return this.labelStatChart;
        }

        public GetCipStatsResponseBodyData setTotalStat(java.util.Map<String, ?> totalStat) {
            this.totalStat = totalStat;
            return this;
        }
        public java.util.Map<String, ?> getTotalStat() {
            return this.totalStat;
        }

        public GetCipStatsResponseBodyData setUids(java.util.List<String> uids) {
            this.uids = uids;
            return this;
        }
        public java.util.List<String> getUids() {
            return this.uids;
        }

        public GetCipStatsResponseBodyData setX(java.util.List<String> x) {
            this.x = x;
            return this;
        }
        public java.util.List<String> getX() {
            return this.x;
        }

        public GetCipStatsResponseBodyData setY(java.util.List<GetCipStatsResponseBodyDataY> y) {
            this.y = y;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataY> getY() {
            return this.y;
        }

        public GetCipStatsResponseBodyData setZ(java.util.List<GetCipStatsResponseBodyDataZ> z) {
            this.z = z;
            return this;
        }
        public java.util.List<GetCipStatsResponseBodyDataZ> getZ() {
            return this.z;
        }

    }

}
