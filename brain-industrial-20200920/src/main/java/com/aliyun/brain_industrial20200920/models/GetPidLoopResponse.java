// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidLoopResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("LoopConfiguration")
    @Validation(required = true)
    public GetPidLoopResponseLoopConfiguration loopConfiguration;

    public static GetPidLoopResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPidLoopResponse self = new GetPidLoopResponse();
        return TeaModel.build(map, self);
    }

    public GetPidLoopResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPidLoopResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPidLoopResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPidLoopResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPidLoopResponse setLoopConfiguration(GetPidLoopResponseLoopConfiguration loopConfiguration) {
        this.loopConfiguration = loopConfiguration;
        return this;
    }
    public GetPidLoopResponseLoopConfiguration getLoopConfiguration() {
        return this.loopConfiguration;
    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamPvRange extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamPvRange build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamPvRange self = new GetPidLoopResponseLoopConfigurationBaseParamPvRange();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamPvRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamPvRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamSpOperate extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamSpOperate build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamSpOperate self = new GetPidLoopResponseLoopConfigurationBaseParamSpOperate();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamSpOperate setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamSpOperate setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope self = new GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOpParamRange extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOpParamRange build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOpParamRange self = new GetPidLoopResponseLoopConfigurationBaseParamOpParamRange();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate self = new GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement extends TeaModel {
        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement self = new GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOpParam extends TeaModel {
        @NameInMap("Trend")
        @Validation(required = true)
        public Integer trend;

        @NameInMap("OpScope")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope opScope;

        @NameInMap("Range")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamRange range;

        @NameInMap("Operate")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate operate;

        @NameInMap("Increment")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement increment;

        public static GetPidLoopResponseLoopConfigurationBaseParamOpParam build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOpParam self = new GetPidLoopResponseLoopConfigurationBaseParamOpParam();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParam setTrend(Integer trend) {
            this.trend = trend;
            return this;
        }
        public Integer getTrend() {
            return this.trend;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParam setOpScope(GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope opScope) {
            this.opScope = opScope;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOpScope getOpScope() {
            return this.opScope;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParam setRange(GetPidLoopResponseLoopConfigurationBaseParamOpParamRange range) {
            this.range = range;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamRange getRange() {
            return this.range;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParam setOperate(GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate operate) {
            this.operate = operate;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamOperate getOperate() {
            return this.operate;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOpParam setIncrement(GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement increment) {
            this.increment = increment;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOpParamIncrement getIncrement() {
            return this.increment;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope self = new GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange self = new GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate self = new GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement extends TeaModel {
        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement self = new GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp1Param extends TeaModel {
        @NameInMap("Trend")
        @Validation(required = true)
        public Integer trend;

        @NameInMap("OpScope")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope opScope;

        @NameInMap("Range")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange range;

        @NameInMap("Operate")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate operate;

        @NameInMap("Increment")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement increment;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp1Param build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp1Param self = new GetPidLoopResponseLoopConfigurationBaseParamOp1Param();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param setTrend(Integer trend) {
            this.trend = trend;
            return this;
        }
        public Integer getTrend() {
            return this.trend;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param setOpScope(GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope opScope) {
            this.opScope = opScope;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOpScope getOpScope() {
            return this.opScope;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param setRange(GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange range) {
            this.range = range;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamRange getRange() {
            return this.range;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param setOperate(GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate operate) {
            this.operate = operate;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamOperate getOperate() {
            return this.operate;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param setIncrement(GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement increment) {
            this.increment = increment;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp1ParamIncrement getIncrement() {
            return this.increment;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope self = new GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange self = new GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate self = new GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement extends TeaModel {
        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement self = new GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamOp2Param extends TeaModel {
        @NameInMap("Trend")
        @Validation(required = true)
        public Integer trend;

        @NameInMap("OpScope")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope opScope;

        @NameInMap("Range")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange range;

        @NameInMap("Operate")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate operate;

        @NameInMap("Increment")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement increment;

        public static GetPidLoopResponseLoopConfigurationBaseParamOp2Param build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamOp2Param self = new GetPidLoopResponseLoopConfigurationBaseParamOp2Param();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param setTrend(Integer trend) {
            this.trend = trend;
            return this;
        }
        public Integer getTrend() {
            return this.trend;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param setOpScope(GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope opScope) {
            this.opScope = opScope;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOpScope getOpScope() {
            return this.opScope;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param setRange(GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange range) {
            this.range = range;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamRange getRange() {
            return this.range;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param setOperate(GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate operate) {
            this.operate = operate;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamOperate getOperate() {
            return this.operate;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param setIncrement(GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement increment) {
            this.increment = increment;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp2ParamIncrement getIncrement() {
            return this.increment;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamKp extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static GetPidLoopResponseLoopConfigurationBaseParamKp build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamKp self = new GetPidLoopResponseLoopConfigurationBaseParamKp();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamKp setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamKp setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamTd extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static GetPidLoopResponseLoopConfigurationBaseParamTd build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamTd self = new GetPidLoopResponseLoopConfigurationBaseParamTd();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamTd setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamTd setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamTi extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static GetPidLoopResponseLoopConfigurationBaseParamTi build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamTi self = new GetPidLoopResponseLoopConfigurationBaseParamTi();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamTi setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamTi setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParamKd extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        public String tagKey;

        @NameInMap("TagValue")
        @Validation(required = true)
        public String tagValue;

        public static GetPidLoopResponseLoopConfigurationBaseParamKd build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParamKd self = new GetPidLoopResponseLoopConfigurationBaseParamKd();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParamKd setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetPidLoopResponseLoopConfigurationBaseParamKd setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationBaseParam extends TeaModel {
        @NameInMap("OpenLoopTime")
        @Validation(required = true)
        public Integer openLoopTime;

        @NameInMap("SampleTime")
        @Validation(required = true)
        public Integer sampleTime;

        @NameInMap("SuitCtrlTime")
        @Validation(required = true)
        public Integer suitCtrlTime;

        @NameInMap("Pv")
        @Validation(required = true)
        public String pv;

        @NameInMap("Sp")
        @Validation(required = true)
        public String sp;

        @NameInMap("SplitRangeControl")
        @Validation(required = true)
        public Boolean splitRangeControl;

        @NameInMap("Op")
        @Validation(required = true)
        public String op;

        @NameInMap("Op1")
        @Validation(required = true)
        public String op1;

        @NameInMap("Op2")
        @Validation(required = true)
        public String op2;

        @NameInMap("ControlSwitch")
        @Validation(required = true)
        public String controlSwitch;

        @NameInMap("Mv")
        @Validation(required = true)
        public String mv;

        @NameInMap("ForwardController")
        @Validation(required = true)
        public Boolean forwardController;

        @NameInMap("ForwardVariable")
        @Validation(required = true)
        public String forwardVariable;

        @NameInMap("Integral")
        @Validation(required = true)
        public Boolean integral;

        @NameInMap("PvRange")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamPvRange pvRange;

        @NameInMap("SpOperate")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamSpOperate spOperate;

        @NameInMap("OpParam")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOpParam opParam;

        @NameInMap("Op1Param")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param op1Param;

        @NameInMap("Op2Param")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param op2Param;

        @NameInMap("Kp")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamKp kp;

        @NameInMap("Td")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamTd td;

        @NameInMap("Ti")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamTi ti;

        @NameInMap("Kd")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParamKd kd;

        public static GetPidLoopResponseLoopConfigurationBaseParam build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationBaseParam self = new GetPidLoopResponseLoopConfigurationBaseParam();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOpenLoopTime(Integer openLoopTime) {
            this.openLoopTime = openLoopTime;
            return this;
        }
        public Integer getOpenLoopTime() {
            return this.openLoopTime;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setSampleTime(Integer sampleTime) {
            this.sampleTime = sampleTime;
            return this;
        }
        public Integer getSampleTime() {
            return this.sampleTime;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setSuitCtrlTime(Integer suitCtrlTime) {
            this.suitCtrlTime = suitCtrlTime;
            return this;
        }
        public Integer getSuitCtrlTime() {
            return this.suitCtrlTime;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setPv(String pv) {
            this.pv = pv;
            return this;
        }
        public String getPv() {
            return this.pv;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setSp(String sp) {
            this.sp = sp;
            return this;
        }
        public String getSp() {
            return this.sp;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setSplitRangeControl(Boolean splitRangeControl) {
            this.splitRangeControl = splitRangeControl;
            return this;
        }
        public Boolean getSplitRangeControl() {
            return this.splitRangeControl;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOp1(String op1) {
            this.op1 = op1;
            return this;
        }
        public String getOp1() {
            return this.op1;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOp2(String op2) {
            this.op2 = op2;
            return this;
        }
        public String getOp2() {
            return this.op2;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setControlSwitch(String controlSwitch) {
            this.controlSwitch = controlSwitch;
            return this;
        }
        public String getControlSwitch() {
            return this.controlSwitch;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setMv(String mv) {
            this.mv = mv;
            return this;
        }
        public String getMv() {
            return this.mv;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setForwardController(Boolean forwardController) {
            this.forwardController = forwardController;
            return this;
        }
        public Boolean getForwardController() {
            return this.forwardController;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setForwardVariable(String forwardVariable) {
            this.forwardVariable = forwardVariable;
            return this;
        }
        public String getForwardVariable() {
            return this.forwardVariable;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setIntegral(Boolean integral) {
            this.integral = integral;
            return this;
        }
        public Boolean getIntegral() {
            return this.integral;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setPvRange(GetPidLoopResponseLoopConfigurationBaseParamPvRange pvRange) {
            this.pvRange = pvRange;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamPvRange getPvRange() {
            return this.pvRange;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setSpOperate(GetPidLoopResponseLoopConfigurationBaseParamSpOperate spOperate) {
            this.spOperate = spOperate;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamSpOperate getSpOperate() {
            return this.spOperate;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOpParam(GetPidLoopResponseLoopConfigurationBaseParamOpParam opParam) {
            this.opParam = opParam;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOpParam getOpParam() {
            return this.opParam;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOp1Param(GetPidLoopResponseLoopConfigurationBaseParamOp1Param op1Param) {
            this.op1Param = op1Param;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp1Param getOp1Param() {
            return this.op1Param;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setOp2Param(GetPidLoopResponseLoopConfigurationBaseParamOp2Param op2Param) {
            this.op2Param = op2Param;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamOp2Param getOp2Param() {
            return this.op2Param;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setKp(GetPidLoopResponseLoopConfigurationBaseParamKp kp) {
            this.kp = kp;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamKp getKp() {
            return this.kp;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setTd(GetPidLoopResponseLoopConfigurationBaseParamTd td) {
            this.td = td;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamTd getTd() {
            return this.td;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setTi(GetPidLoopResponseLoopConfigurationBaseParamTi ti) {
            this.ti = ti;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamTi getTi() {
            return this.ti;
        }

        public GetPidLoopResponseLoopConfigurationBaseParam setKd(GetPidLoopResponseLoopConfigurationBaseParamKd kd) {
            this.kd = kd;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParamKd getKd() {
            return this.kd;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationIdentParam extends TeaModel {
        @NameInMap("ModelType")
        @Validation(required = true)
        public Integer modelType;

        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        public static GetPidLoopResponseLoopConfigurationIdentParam build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationIdentParam self = new GetPidLoopResponseLoopConfigurationIdentParam();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationIdentParam setModelType(Integer modelType) {
            this.modelType = modelType;
            return this;
        }
        public Integer getModelType() {
            return this.modelType;
        }

        public GetPidLoopResponseLoopConfigurationIdentParam setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

    }

    public static class GetPidLoopResponseLoopConfigurationResetParam extends TeaModel {
        @NameInMap("CtrlMode")
        @Validation(required = true)
        public Integer ctrlMode;

        @NameInMap("CtrlStuc")
        @Validation(required = true)
        public Integer ctrlStuc;

        public static GetPidLoopResponseLoopConfigurationResetParam build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfigurationResetParam self = new GetPidLoopResponseLoopConfigurationResetParam();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfigurationResetParam setCtrlMode(Integer ctrlMode) {
            this.ctrlMode = ctrlMode;
            return this;
        }
        public Integer getCtrlMode() {
            return this.ctrlMode;
        }

        public GetPidLoopResponseLoopConfigurationResetParam setCtrlStuc(Integer ctrlStuc) {
            this.ctrlStuc = ctrlStuc;
            return this;
        }
        public Integer getCtrlStuc() {
            return this.ctrlStuc;
        }

    }

    public static class GetPidLoopResponseLoopConfiguration extends TeaModel {
        @NameInMap("BaseParam")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationBaseParam baseParam;

        @NameInMap("IdentParam")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationIdentParam identParam;

        @NameInMap("ResetParam")
        @Validation(required = true)
        public GetPidLoopResponseLoopConfigurationResetParam resetParam;

        public static GetPidLoopResponseLoopConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopResponseLoopConfiguration self = new GetPidLoopResponseLoopConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPidLoopResponseLoopConfiguration setBaseParam(GetPidLoopResponseLoopConfigurationBaseParam baseParam) {
            this.baseParam = baseParam;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationBaseParam getBaseParam() {
            return this.baseParam;
        }

        public GetPidLoopResponseLoopConfiguration setIdentParam(GetPidLoopResponseLoopConfigurationIdentParam identParam) {
            this.identParam = identParam;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationIdentParam getIdentParam() {
            return this.identParam;
        }

        public GetPidLoopResponseLoopConfiguration setResetParam(GetPidLoopResponseLoopConfigurationResetParam resetParam) {
            this.resetParam = resetParam;
            return this;
        }
        public GetPidLoopResponseLoopConfigurationResetParam getResetParam() {
            return this.resetParam;
        }

    }

}
