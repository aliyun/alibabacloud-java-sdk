// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class GetPidLoopParameterResponse extends TeaModel {
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

    @NameInMap("PidLoopParameter")
    @Validation(required = true)
    public GetPidLoopParameterResponsePidLoopParameter pidLoopParameter;

    public static GetPidLoopParameterResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPidLoopParameterResponse self = new GetPidLoopParameterResponse();
        return TeaModel.build(map, self);
    }

    public GetPidLoopParameterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPidLoopParameterResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPidLoopParameterResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPidLoopParameterResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPidLoopParameterResponse setPidLoopParameter(GetPidLoopParameterResponsePidLoopParameter pidLoopParameter) {
        this.pidLoopParameter = pidLoopParameter;
        return this;
    }
    public GetPidLoopParameterResponsePidLoopParameter getPidLoopParameter() {
        return this.pidLoopParameter;
    }

    public static class GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax extends TeaModel {
        @NameInMap("K")
        @Validation(required = true)
        public Float k;

        @NameInMap("Tau")
        @Validation(required = true)
        public Float tau;

        @NameInMap("T1")
        @Validation(required = true)
        public Float t1;

        @NameInMap("T2")
        @Validation(required = true)
        public Float t2;

        public static GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax self = new GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax setK(Float k) {
            this.k = k;
            return this;
        }
        public Float getK() {
            return this.k;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax setTau(Float tau) {
            this.tau = tau;
            return this;
        }
        public Float getTau() {
            return this.tau;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax setT1(Float t1) {
            this.t1 = t1;
            return this;
        }
        public Float getT1() {
            return this.t1;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax setT2(Float t2) {
            this.t2 = t2;
            return this;
        }
        public Float getT2() {
            return this.t2;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin extends TeaModel {
        @NameInMap("K")
        @Validation(required = true)
        public Float k;

        @NameInMap("Tau")
        @Validation(required = true)
        public Float tau;

        @NameInMap("T1")
        @Validation(required = true)
        public Float t1;

        @NameInMap("T2")
        @Validation(required = true)
        public Float t2;

        public static GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin self = new GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin setK(Float k) {
            this.k = k;
            return this;
        }
        public Float getK() {
            return this.k;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin setTau(Float tau) {
            this.tau = tau;
            return this;
        }
        public Float getTau() {
            return this.tau;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin setT1(Float t1) {
            this.t1 = t1;
            return this;
        }
        public Float getT1() {
            return this.t1;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin setT2(Float t2) {
            this.t2 = t2;
            return this;
        }
        public Float getT2() {
            return this.t2;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel extends TeaModel {
        @NameInMap("K")
        @Validation(required = true)
        public Float k;

        @NameInMap("Tau")
        @Validation(required = true)
        public Float tau;

        @NameInMap("T1")
        @Validation(required = true)
        public Float t1;

        @NameInMap("T2")
        @Validation(required = true)
        public Float t2;

        public static GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel self = new GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel setK(Float k) {
            this.k = k;
            return this;
        }
        public Float getK() {
            return this.k;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel setTau(Float tau) {
            this.tau = tau;
            return this;
        }
        public Float getTau() {
            return this.tau;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel setT1(Float t1) {
            this.t1 = t1;
            return this;
        }
        public Float getT1() {
            return this.t1;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel setT2(Float t2) {
            this.t2 = t2;
            return this;
        }
        public Float getT2() {
            return this.t2;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPidIdentParam extends TeaModel {
        @NameInMap("ModelType")
        @Validation(required = true)
        public Integer modelType;

        @NameInMap("Integral")
        @Validation(required = true)
        public Boolean integral;

        @NameInMap("TrendControl")
        @Validation(required = true)
        public Boolean trendControl;

        @NameInMap("Delay")
        @Validation(required = true)
        public Integer delay;

        @NameInMap("Smooth")
        @Validation(required = true)
        public Integer smooth;

        @NameInMap("Robust")
        @Validation(required = true)
        public Integer robust;

        @NameInMap("LimitSw")
        @Validation(required = true)
        public Boolean limitSw;

        @NameInMap("ManualTrend")
        @Validation(required = true)
        public Boolean manualTrend;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("PidDataProcessId")
        @Validation(required = true)
        public Long pidDataProcessId;

        @NameInMap("LimitMax")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax limitMax;

        @NameInMap("LimitMin")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin limitMin;

        @NameInMap("ManualModel")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel manualModel;

        public static GetPidLoopParameterResponsePidLoopParameterPidIdentParam build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPidIdentParam self = new GetPidLoopParameterResponsePidLoopParameterPidIdentParam();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setModelType(Integer modelType) {
            this.modelType = modelType;
            return this;
        }
        public Integer getModelType() {
            return this.modelType;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setIntegral(Boolean integral) {
            this.integral = integral;
            return this;
        }
        public Boolean getIntegral() {
            return this.integral;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setTrendControl(Boolean trendControl) {
            this.trendControl = trendControl;
            return this;
        }
        public Boolean getTrendControl() {
            return this.trendControl;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setSmooth(Integer smooth) {
            this.smooth = smooth;
            return this;
        }
        public Integer getSmooth() {
            return this.smooth;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setRobust(Integer robust) {
            this.robust = robust;
            return this;
        }
        public Integer getRobust() {
            return this.robust;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setLimitSw(Boolean limitSw) {
            this.limitSw = limitSw;
            return this;
        }
        public Boolean getLimitSw() {
            return this.limitSw;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setManualTrend(Boolean manualTrend) {
            this.manualTrend = manualTrend;
            return this;
        }
        public Boolean getManualTrend() {
            return this.manualTrend;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setPidDataProcessId(Long pidDataProcessId) {
            this.pidDataProcessId = pidDataProcessId;
            return this;
        }
        public Long getPidDataProcessId() {
            return this.pidDataProcessId;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setLimitMax(GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax limitMax) {
            this.limitMax = limitMax;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMax getLimitMax() {
            return this.limitMax;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setLimitMin(GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin limitMin) {
            this.limitMin = limitMin;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamLimitMin getLimitMin() {
            return this.limitMin;
        }

        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam setManualModel(GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel manualModel) {
            this.manualModel = manualModel;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParamManualModel getManualModel() {
            return this.manualModel;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange self = new GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange extends TeaModel {
        @NameInMap("Min")
        @Validation(required = true)
        public Float min;

        @NameInMap("Max")
        @Validation(required = true)
        public Float max;

        public static GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange self = new GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange setMin(Float min) {
            this.min = min;
            return this;
        }
        public Float getMin() {
            return this.min;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange setMax(Float max) {
            this.max = max;
            return this;
        }
        public Float getMax() {
            return this.max;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl extends TeaModel {
        @NameInMap("Kp")
        @Validation(required = true)
        public Float kp;

        @NameInMap("Ti")
        @Validation(required = true)
        public Float ti;

        @NameInMap("Td")
        @Validation(required = true)
        public Float td;

        public static GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl self = new GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl setKp(Float kp) {
            this.kp = kp;
            return this;
        }
        public Float getKp() {
            return this.kp;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl setTi(Float ti) {
            this.ti = ti;
            return this;
        }
        public Float getTi() {
            return this.ti;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl setTd(Float td) {
            this.td = td;
            return this;
        }
        public Float getTd() {
            return this.td;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameterPIdResetParam extends TeaModel {
        @NameInMap("DcsType")
        @Validation(required = true)
        public String dcsType;

        @NameInMap("Model")
        @Validation(required = true)
        public String model;

        @NameInMap("ModelType")
        @Validation(required = true)
        public Integer modelType;

        @NameInMap("Integral")
        @Validation(required = true)
        public Boolean integral;

        @NameInMap("CtrlMode")
        @Validation(required = true)
        public Integer ctrlMode;

        @NameInMap("CtrlStuc")
        @Validation(required = true)
        public Integer ctrlStuc;

        @NameInMap("Robust")
        @Validation(required = true)
        public Integer robust;

        @NameInMap("Dynamic")
        @Validation(required = true)
        public Float dynamic;

        @NameInMap("ManualTrend")
        @Validation(required = true)
        public Boolean manualTrend;

        @NameInMap("MeasuredValueRange")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange measuredValueRange;

        @NameInMap("ValvePositionRange")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange valvePositionRange;

        @NameInMap("ManualCtrl")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl manualCtrl;

        public static GetPidLoopParameterResponsePidLoopParameterPIdResetParam build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameterPIdResetParam self = new GetPidLoopParameterResponsePidLoopParameterPIdResetParam();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setDcsType(String dcsType) {
            this.dcsType = dcsType;
            return this;
        }
        public String getDcsType() {
            return this.dcsType;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setModelType(Integer modelType) {
            this.modelType = modelType;
            return this;
        }
        public Integer getModelType() {
            return this.modelType;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setIntegral(Boolean integral) {
            this.integral = integral;
            return this;
        }
        public Boolean getIntegral() {
            return this.integral;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setCtrlMode(Integer ctrlMode) {
            this.ctrlMode = ctrlMode;
            return this;
        }
        public Integer getCtrlMode() {
            return this.ctrlMode;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setCtrlStuc(Integer ctrlStuc) {
            this.ctrlStuc = ctrlStuc;
            return this;
        }
        public Integer getCtrlStuc() {
            return this.ctrlStuc;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setRobust(Integer robust) {
            this.robust = robust;
            return this;
        }
        public Integer getRobust() {
            return this.robust;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setDynamic(Float dynamic) {
            this.dynamic = dynamic;
            return this;
        }
        public Float getDynamic() {
            return this.dynamic;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setManualTrend(Boolean manualTrend) {
            this.manualTrend = manualTrend;
            return this;
        }
        public Boolean getManualTrend() {
            return this.manualTrend;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setMeasuredValueRange(GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange measuredValueRange) {
            this.measuredValueRange = measuredValueRange;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamMeasuredValueRange getMeasuredValueRange() {
            return this.measuredValueRange;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setValvePositionRange(GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange valvePositionRange) {
            this.valvePositionRange = valvePositionRange;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamValvePositionRange getValvePositionRange() {
            return this.valvePositionRange;
        }

        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam setManualCtrl(GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl manualCtrl) {
            this.manualCtrl = manualCtrl;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParamManualCtrl getManualCtrl() {
            return this.manualCtrl;
        }

    }

    public static class GetPidLoopParameterResponsePidLoopParameter extends TeaModel {
        @NameInMap("PidLoopParameterId")
        @Validation(required = true)
        public String pidLoopParameterId;

        @NameInMap("PidProjectId")
        @Validation(required = true)
        public String pidProjectId;

        @NameInMap("PidLoopId")
        @Validation(required = true)
        public String pidLoopId;

        @NameInMap("PidIdentTaskDate")
        @Validation(required = true)
        public String pidIdentTaskDate;

        @NameInMap("PidResetTaskDate")
        @Validation(required = true)
        public String pidResetTaskDate;

        @NameInMap("PidIdentParam")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam pidIdentParam;

        @NameInMap("PIdResetParam")
        @Validation(required = true)
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam PIdResetParam;

        public static GetPidLoopParameterResponsePidLoopParameter build(java.util.Map<String, ?> map) throws Exception {
            GetPidLoopParameterResponsePidLoopParameter self = new GetPidLoopParameterResponsePidLoopParameter();
            return TeaModel.build(map, self);
        }

        public GetPidLoopParameterResponsePidLoopParameter setPidLoopParameterId(String pidLoopParameterId) {
            this.pidLoopParameterId = pidLoopParameterId;
            return this;
        }
        public String getPidLoopParameterId() {
            return this.pidLoopParameterId;
        }

        public GetPidLoopParameterResponsePidLoopParameter setPidProjectId(String pidProjectId) {
            this.pidProjectId = pidProjectId;
            return this;
        }
        public String getPidProjectId() {
            return this.pidProjectId;
        }

        public GetPidLoopParameterResponsePidLoopParameter setPidLoopId(String pidLoopId) {
            this.pidLoopId = pidLoopId;
            return this;
        }
        public String getPidLoopId() {
            return this.pidLoopId;
        }

        public GetPidLoopParameterResponsePidLoopParameter setPidIdentTaskDate(String pidIdentTaskDate) {
            this.pidIdentTaskDate = pidIdentTaskDate;
            return this;
        }
        public String getPidIdentTaskDate() {
            return this.pidIdentTaskDate;
        }

        public GetPidLoopParameterResponsePidLoopParameter setPidResetTaskDate(String pidResetTaskDate) {
            this.pidResetTaskDate = pidResetTaskDate;
            return this;
        }
        public String getPidResetTaskDate() {
            return this.pidResetTaskDate;
        }

        public GetPidLoopParameterResponsePidLoopParameter setPidIdentParam(GetPidLoopParameterResponsePidLoopParameterPidIdentParam pidIdentParam) {
            this.pidIdentParam = pidIdentParam;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPidIdentParam getPidIdentParam() {
            return this.pidIdentParam;
        }

        public GetPidLoopParameterResponsePidLoopParameter setPIdResetParam(GetPidLoopParameterResponsePidLoopParameterPIdResetParam PIdResetParam) {
            this.PIdResetParam = PIdResetParam;
            return this;
        }
        public GetPidLoopParameterResponsePidLoopParameterPIdResetParam getPIdResetParam() {
            return this.PIdResetParam;
        }

    }

}
