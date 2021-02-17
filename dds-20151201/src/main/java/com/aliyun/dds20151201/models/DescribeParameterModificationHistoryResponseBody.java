// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HistoricalParameters")
    public DescribeParameterModificationHistoryResponseBodyHistoricalParameters historicalParameters;

    public static DescribeParameterModificationHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoryResponseBody self = new DescribeParameterModificationHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterModificationHistoryResponseBody setHistoricalParameters(DescribeParameterModificationHistoryResponseBodyHistoricalParameters historicalParameters) {
        this.historicalParameters = historicalParameters;
        return this;
    }
    public DescribeParameterModificationHistoryResponseBodyHistoricalParameters getHistoricalParameters() {
        return this.historicalParameters;
    }

    public static class DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter extends TeaModel {
        @NameInMap("ParameterName")
        public String parameterName;

        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        @NameInMap("NewParameterValue")
        public String newParameterValue;

        @NameInMap("ModifyTime")
        public String modifyTime;

        public static DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter self = new DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter();
            return TeaModel.build(map, self);
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeParameterModificationHistoryResponseBodyHistoricalParametersHistoricalParameter setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
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
