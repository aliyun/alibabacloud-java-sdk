// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetJobInstanceSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetJobInstanceSummaryResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetJobInstanceSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceSummaryResponseBody self = new GetJobInstanceSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceSummaryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetJobInstanceSummaryResponseBody setData(GetJobInstanceSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobInstanceSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetJobInstanceSummaryResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetJobInstanceSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobInstanceSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobInstanceSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationKs extends TeaModel {
        @NameInMap("Fpr")
        public java.util.List<Double> fpr;

        @NameInMap("Threshold")
        public java.util.List<Double> threshold;

        @NameInMap("Tpr")
        public java.util.List<Double> tpr;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationKs build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationKs self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationKs();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationKs setFpr(java.util.List<Double> fpr) {
            this.fpr = fpr;
            return this;
        }
        public java.util.List<Double> getFpr() {
            return this.fpr;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationKs setThreshold(java.util.List<Double> threshold) {
            this.threshold = threshold;
            return this;
        }
        public java.util.List<Double> getThreshold() {
            return this.threshold;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationKs setTpr(java.util.List<Double> tpr) {
            this.tpr = tpr;
            return this;
        }
        public java.util.List<Double> getTpr() {
            return this.tpr;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationMse extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationMse build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationMse self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationMse();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationMse setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationMse setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationMse setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public Double value;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc extends TeaModel {
        @NameInMap("Fpr")
        public java.util.List<Double> fpr;

        @NameInMap("Tpr")
        public java.util.List<Double> tpr;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc self = new GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc setFpr(java.util.List<Double> fpr) {
            this.fpr = fpr;
            return this;
        }
        public java.util.List<Double> getFpr() {
            return this.fpr;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc setTpr(java.util.List<Double> tpr) {
            this.tpr = tpr;
            return this;
        }
        public java.util.List<Double> getTpr() {
            return this.tpr;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyDataModelEvaluation extends TeaModel {
        @NameInMap("Accuracy")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy accuracy;

        @NameInMap("Auc")
        public Double auc;

        @NameInMap("F1Score")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score f1Score;

        @NameInMap("Indicators")
        public java.util.List<GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators> indicators;

        @NameInMap("Ks")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationKs ks;

        @NameInMap("KsIndex")
        public Integer ksIndex;

        @NameInMap("KsValue")
        public Double ksValue;

        @NameInMap("Loss")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss loss;

        @NameInMap("Model")
        public String model;

        @NameInMap("Mse")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationMse mse;

        @NameInMap("Precision")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision precision;

        @NameInMap("Recall")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall recall;

        @NameInMap("Roc")
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc roc;

        @NameInMap("Version")
        public String version;

        public static GetJobInstanceSummaryResponseBodyDataModelEvaluation build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyDataModelEvaluation self = new GetJobInstanceSummaryResponseBodyDataModelEvaluation();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setAccuracy(GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy accuracy) {
            this.accuracy = accuracy;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationAccuracy getAccuracy() {
            return this.accuracy;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setAuc(Double auc) {
            this.auc = auc;
            return this;
        }
        public Double getAuc() {
            return this.auc;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setF1Score(GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score f1Score) {
            this.f1Score = f1Score;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationF1Score getF1Score() {
            return this.f1Score;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setIndicators(java.util.List<GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators> indicators) {
            this.indicators = indicators;
            return this;
        }
        public java.util.List<GetJobInstanceSummaryResponseBodyDataModelEvaluationIndicators> getIndicators() {
            return this.indicators;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setKs(GetJobInstanceSummaryResponseBodyDataModelEvaluationKs ks) {
            this.ks = ks;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationKs getKs() {
            return this.ks;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setKsIndex(Integer ksIndex) {
            this.ksIndex = ksIndex;
            return this;
        }
        public Integer getKsIndex() {
            return this.ksIndex;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setKsValue(Double ksValue) {
            this.ksValue = ksValue;
            return this;
        }
        public Double getKsValue() {
            return this.ksValue;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setLoss(GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss loss) {
            this.loss = loss;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationLoss getLoss() {
            return this.loss;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setMse(GetJobInstanceSummaryResponseBodyDataModelEvaluationMse mse) {
            this.mse = mse;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationMse getMse() {
            return this.mse;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setPrecision(GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision precision) {
            this.precision = precision;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationPrecision getPrecision() {
            return this.precision;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setRecall(GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall recall) {
            this.recall = recall;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRecall getRecall() {
            return this.recall;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setRoc(GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc roc) {
            this.roc = roc;
            return this;
        }
        public GetJobInstanceSummaryResponseBodyDataModelEvaluationRoc getRoc() {
            return this.roc;
        }

        public GetJobInstanceSummaryResponseBodyDataModelEvaluation setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetJobInstanceSummaryResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("MemberId")
        public Long memberId;

        @NameInMap("ModelEvaluation")
        public java.util.List<GetJobInstanceSummaryResponseBodyDataModelEvaluation> modelEvaluation;

        public static GetJobInstanceSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobInstanceSummaryResponseBodyData self = new GetJobInstanceSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobInstanceSummaryResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetJobInstanceSummaryResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetJobInstanceSummaryResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetJobInstanceSummaryResponseBodyData setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetJobInstanceSummaryResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetJobInstanceSummaryResponseBodyData setMemberId(Long memberId) {
            this.memberId = memberId;
            return this;
        }
        public Long getMemberId() {
            return this.memberId;
        }

        public GetJobInstanceSummaryResponseBodyData setModelEvaluation(java.util.List<GetJobInstanceSummaryResponseBodyDataModelEvaluation> modelEvaluation) {
            this.modelEvaluation = modelEvaluation;
            return this;
        }
        public java.util.List<GetJobInstanceSummaryResponseBodyDataModelEvaluation> getModelEvaluation() {
            return this.modelEvaluation;
        }

    }

}
