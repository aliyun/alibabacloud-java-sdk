// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoryResponseBody extends TeaModel {
    // Details about the parameter modification records.
    @NameInMap("HistoricalParameters")
    public DescribeParameterModificationHistoryResponseBodyHistoricalParameters historicalParameters;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeParameterModificationHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoryResponseBody self = new DescribeParameterModificationHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoryResponseBody setHistoricalParameters(DescribeParameterModificationHistoryResponseBodyHistoricalParameters historicalParameters) {
        this.historicalParameters = historicalParameters;
        return this;
    }
    public DescribeParameterModificationHistoryResponseBodyHistoricalParameters getHistoricalParameters() {
        return this.historicalParameters;
    }

    public DescribeParameterModificationHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter extends TeaModel {
        // The time when the parameter was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("ModifyTime")
        public String modifyTime;

        // The parameter value after modification.
        @NameInMap("NewParameterValue")
        public String newParameterValue;

        // The parameter value before modification.
        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        // The name of the modified parameter.
        @NameInMap("ParameterName")
        public String parameterName;

        public static DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter self = new DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

    public static class DescribeParameterModificationHistoryResponseBodyHistoricalParameters extends TeaModel {
        @NameInMap("HistoricalParameter")
        public java.util.List<DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter> historicalParameter;

        public static DescribeParameterModificationHistoryResponseBodyHistoricalParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoryResponseBodyHistoricalParameters self = new DescribeParameterModificationHistoryResponseBodyHistoricalParameters();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParameters setHistoricalParameter(java.util.List<DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter> historicalParameter) {
            this.historicalParameter = historicalParameter;
            return this;
        }
        public java.util.List<DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter> getHistoricalParameter() {
            return this.historicalParameter;
        }

    }

}
