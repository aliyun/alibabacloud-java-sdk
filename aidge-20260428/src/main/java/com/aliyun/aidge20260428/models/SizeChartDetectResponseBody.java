// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class SizeChartDetectResponseBody extends TeaModel {
    /**
     * <p>The error code. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The size chart detection result.</p>
     */
    @NameInMap("Data")
    public SizeChartDetectResponseBodyData data;

    /**
     * <p>The error message. This parameter is not returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>E1AD60F1-BAC7-546B-9533-E7AD02B16E3F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SizeChartDetectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SizeChartDetectResponseBody self = new SizeChartDetectResponseBody();
        return TeaModel.build(map, self);
    }

    public SizeChartDetectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SizeChartDetectResponseBody setData(SizeChartDetectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SizeChartDetectResponseBodyData getData() {
        return this.data;
    }

    public SizeChartDetectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SizeChartDetectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SizeChartDetectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SizeChartDetectResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the image is a size chart.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsSizeChart")
        public Boolean isSizeChart;

        /**
         * <p>The usage information. The key is the usage name, and the value is the count.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessedImageCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static SizeChartDetectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SizeChartDetectResponseBodyData self = new SizeChartDetectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SizeChartDetectResponseBodyData setIsSizeChart(Boolean isSizeChart) {
            this.isSizeChart = isSizeChart;
            return this;
        }
        public Boolean getIsSizeChart() {
            return this.isSizeChart;
        }

        public SizeChartDetectResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
