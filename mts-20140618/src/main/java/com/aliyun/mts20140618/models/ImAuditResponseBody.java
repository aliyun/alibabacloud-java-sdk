// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ImAuditResponseBody extends TeaModel {
    @NameInMap("ImageQuotaExceed")
    public Boolean imageQuotaExceed;

    @NameInMap("ImageResults")
    public ImAuditResponseBodyImageResults imageResults;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TextQuotaExceed")
    public Boolean textQuotaExceed;

    @NameInMap("TextResults")
    public ImAuditResponseBodyTextResults textResults;

    public static ImAuditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImAuditResponseBody self = new ImAuditResponseBody();
        return TeaModel.build(map, self);
    }

    public ImAuditResponseBody setImageQuotaExceed(Boolean imageQuotaExceed) {
        this.imageQuotaExceed = imageQuotaExceed;
        return this;
    }
    public Boolean getImageQuotaExceed() {
        return this.imageQuotaExceed;
    }

    public ImAuditResponseBody setImageResults(ImAuditResponseBodyImageResults imageResults) {
        this.imageResults = imageResults;
        return this;
    }
    public ImAuditResponseBodyImageResults getImageResults() {
        return this.imageResults;
    }

    public ImAuditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImAuditResponseBody setTextQuotaExceed(Boolean textQuotaExceed) {
        this.textQuotaExceed = textQuotaExceed;
        return this;
    }
    public Boolean getTextQuotaExceed() {
        return this.textQuotaExceed;
    }

    public ImAuditResponseBody setTextResults(ImAuditResponseBodyTextResults textResults) {
        this.textResults = textResults;
        return this;
    }
    public ImAuditResponseBodyTextResults getTextResults() {
        return this.textResults;
    }

    public static class ImAuditResponseBodyImageResultsResultResultsFrames extends TeaModel {
        @NameInMap("rate")
        public Float rate;

        @NameInMap("url")
        public String url;

        public static ImAuditResponseBodyImageResultsResultResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsFrames self = new ImAuditResponseBodyImageResultsResultResultsFrames();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsFrames setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyImageResultsResultResultsFrames setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsHintWordsInfo extends TeaModel {
        @NameInMap("context")
        public String context;

        public static ImAuditResponseBodyImageResultsResultResultsHintWordsInfo build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsHintWordsInfo self = new ImAuditResponseBodyImageResultsResultResultsHintWordsInfo();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsHintWordsInfo setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsLogoData extends TeaModel {
        @NameInMap("h")
        public Float h;

        @NameInMap("name")
        public String name;

        @NameInMap("type")
        public String type;

        @NameInMap("w")
        public Float w;

        @NameInMap("x")
        public Float x;

        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsLogoData build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsLogoData self = new ImAuditResponseBodyImageResultsResultResultsLogoData();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsLogoData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsProgramCodeData extends TeaModel {
        @NameInMap("h")
        public Float h;

        @NameInMap("w")
        public Float w;

        @NameInMap("x")
        public Float x;

        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsProgramCodeData build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsProgramCodeData self = new ImAuditResponseBodyImageResultsResultResultsProgramCodeData();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsProgramCodeData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsQrcodeLocations extends TeaModel {
        @NameInMap("h")
        public Float h;

        @NameInMap("qrcode")
        public String qrcode;

        @NameInMap("w")
        public Float w;

        @NameInMap("x")
        public Float x;

        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsQrcodeLocations build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsQrcodeLocations self = new ImAuditResponseBodyImageResultsResultResultsQrcodeLocations();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setQrcode(String qrcode) {
            this.qrcode = qrcode;
            return this;
        }
        public String getQrcode() {
            return this.qrcode;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsQrcodeLocations setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces extends TeaModel {
        @NameInMap("idid")
        public String idid;

        @NameInMap("name")
        public String name;

        @NameInMap("re")
        public Float re;

        public static ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces self = new ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces setIdid(String idid) {
            this.idid = idid;
            return this;
        }
        public String getIdid() {
            return this.idid;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces setRe(Float re) {
            this.re = re;
            return this;
        }
        public Float getRe() {
            return this.re;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResultsSfaceData extends TeaModel {
        @NameInMap("faces")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces> faces;

        @NameInMap("h")
        public Float h;

        @NameInMap("w")
        public Float w;

        @NameInMap("x")
        public Float x;

        @NameInMap("y")
        public Float y;

        public static ImAuditResponseBodyImageResultsResultResultsSfaceData build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResultsSfaceData self = new ImAuditResponseBodyImageResultsResultResultsSfaceData();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setFaces(java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceDataFaces> getFaces() {
            return this.faces;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setH(Float h) {
            this.h = h;
            return this;
        }
        public Float getH() {
            return this.h;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setW(Float w) {
            this.w = w;
            return this;
        }
        public Float getW() {
            return this.w;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ImAuditResponseBodyImageResultsResultResultsSfaceData setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ImAuditResponseBodyImageResultsResultResults extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Double rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("frames")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsFrames> frames;

        @NameInMap("hintWordsInfo")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsHintWordsInfo> hintWordsInfo;

        @NameInMap("logoData")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsLogoData> logoData;

        @NameInMap("ocrData")
        public java.util.List<String> ocrData;

        @NameInMap("programCodeData")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsProgramCodeData> programCodeData;

        @NameInMap("qrcodeData")
        public java.util.List<String> qrcodeData;

        @NameInMap("qrcodeLocations")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsQrcodeLocations> qrcodeLocations;

        @NameInMap("sfaceData")
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceData> sfaceData;

        public static ImAuditResponseBodyImageResultsResultResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResultResults self = new ImAuditResponseBodyImageResultsResultResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResultResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyImageResultsResultResults setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyImageResultsResultResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImAuditResponseBodyImageResultsResultResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ImAuditResponseBodyImageResultsResultResults setFrames(java.util.List<ImAuditResponseBodyImageResultsResultResultsFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsFrames> getFrames() {
            return this.frames;
        }

        public ImAuditResponseBodyImageResultsResultResults setHintWordsInfo(java.util.List<ImAuditResponseBodyImageResultsResultResultsHintWordsInfo> hintWordsInfo) {
            this.hintWordsInfo = hintWordsInfo;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsHintWordsInfo> getHintWordsInfo() {
            return this.hintWordsInfo;
        }

        public ImAuditResponseBodyImageResultsResultResults setLogoData(java.util.List<ImAuditResponseBodyImageResultsResultResultsLogoData> logoData) {
            this.logoData = logoData;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsLogoData> getLogoData() {
            return this.logoData;
        }

        public ImAuditResponseBodyImageResultsResultResults setOcrData(java.util.List<String> ocrData) {
            this.ocrData = ocrData;
            return this;
        }
        public java.util.List<String> getOcrData() {
            return this.ocrData;
        }

        public ImAuditResponseBodyImageResultsResultResults setProgramCodeData(java.util.List<ImAuditResponseBodyImageResultsResultResultsProgramCodeData> programCodeData) {
            this.programCodeData = programCodeData;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsProgramCodeData> getProgramCodeData() {
            return this.programCodeData;
        }

        public ImAuditResponseBodyImageResultsResultResults setQrcodeData(java.util.List<String> qrcodeData) {
            this.qrcodeData = qrcodeData;
            return this;
        }
        public java.util.List<String> getQrcodeData() {
            return this.qrcodeData;
        }

        public ImAuditResponseBodyImageResultsResultResults setQrcodeLocations(java.util.List<ImAuditResponseBodyImageResultsResultResultsQrcodeLocations> qrcodeLocations) {
            this.qrcodeLocations = qrcodeLocations;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsQrcodeLocations> getQrcodeLocations() {
            return this.qrcodeLocations;
        }

        public ImAuditResponseBodyImageResultsResultResults setSfaceData(java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceData> sfaceData) {
            this.sfaceData = sfaceData;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResultsSfaceData> getSfaceData() {
            return this.sfaceData;
        }

    }

    public static class ImAuditResponseBodyImageResultsResult extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("dataId")
        public String dataId;

        @NameInMap("extras")
        public java.util.Map<String, ?> extras;

        @NameInMap("msg")
        public String msg;

        @NameInMap("results")
        public java.util.List<ImAuditResponseBodyImageResultsResultResults> results;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("url")
        public String url;

        public static ImAuditResponseBodyImageResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResultsResult self = new ImAuditResponseBodyImageResultsResult();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResultsResult setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImAuditResponseBodyImageResultsResult setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImAuditResponseBodyImageResultsResult setExtras(java.util.Map<String, ?> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.Map<String, ?> getExtras() {
            return this.extras;
        }

        public ImAuditResponseBodyImageResultsResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ImAuditResponseBodyImageResultsResult setResults(java.util.List<ImAuditResponseBodyImageResultsResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResultResults> getResults() {
            return this.results;
        }

        public ImAuditResponseBodyImageResultsResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ImAuditResponseBodyImageResultsResult setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ImAuditResponseBodyImageResults extends TeaModel {
        @NameInMap("result")
        public java.util.List<ImAuditResponseBodyImageResultsResult> result;

        public static ImAuditResponseBodyImageResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyImageResults self = new ImAuditResponseBodyImageResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyImageResults setResult(java.util.List<ImAuditResponseBodyImageResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImAuditResponseBodyImageResultsResult> getResult() {
            return this.result;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResultsDetailsContexts extends TeaModel {
        @NameInMap("context")
        public String context;

        @NameInMap("libCode")
        public String libCode;

        @NameInMap("libName")
        public String libName;

        @NameInMap("positions")
        public java.util.List<String> positions;

        @NameInMap("ruleType")
        public String ruleType;

        public static ImAuditResponseBodyTextResultsResultResultsDetailsContexts build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResultsDetailsContexts self = new ImAuditResponseBodyTextResultsResultResultsDetailsContexts();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setLibCode(String libCode) {
            this.libCode = libCode;
            return this;
        }
        public String getLibCode() {
            return this.libCode;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setLibName(String libName) {
            this.libName = libName;
            return this;
        }
        public String getLibName() {
            return this.libName;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setPositions(java.util.List<String> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<String> getPositions() {
            return this.positions;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetailsContexts setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResultsDetails extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("contexts")
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetailsContexts> contexts;

        public static ImAuditResponseBodyTextResultsResultResultsDetails build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResultsDetails self = new ImAuditResponseBodyTextResultsResultResultsDetails();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResultsDetails setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyTextResultsResultResultsDetails setContexts(java.util.List<ImAuditResponseBodyTextResultsResultResultsDetailsContexts> contexts) {
            this.contexts = contexts;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetailsContexts> getContexts() {
            return this.contexts;
        }

    }

    public static class ImAuditResponseBodyTextResultsResultResults extends TeaModel {
        @NameInMap("details")
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> details;

        @NameInMap("label")
        public String label;

        @NameInMap("rate")
        public Double rate;

        @NameInMap("scene")
        public String scene;

        @NameInMap("suggestion")
        public String suggestion;

        public static ImAuditResponseBodyTextResultsResultResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResultResults self = new ImAuditResponseBodyTextResultsResultResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResultResults setDetails(java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResultsDetails> getDetails() {
            return this.details;
        }

        public ImAuditResponseBodyTextResultsResultResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ImAuditResponseBodyTextResultsResultResults setRate(Double rate) {
            this.rate = rate;
            return this;
        }
        public Double getRate() {
            return this.rate;
        }

        public ImAuditResponseBodyTextResultsResultResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ImAuditResponseBodyTextResultsResultResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ImAuditResponseBodyTextResultsResult extends TeaModel {
        @NameInMap("code")
        public Long code;

        @NameInMap("content")
        public String content;

        @NameInMap("dataId")
        public String dataId;

        @NameInMap("msg")
        public String msg;

        @NameInMap("results")
        public java.util.List<ImAuditResponseBodyTextResultsResultResults> results;

        @NameInMap("taskId")
        public String taskId;

        public static ImAuditResponseBodyTextResultsResult build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResultsResult self = new ImAuditResponseBodyTextResultsResult();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResultsResult setCode(Long code) {
            this.code = code;
            return this;
        }
        public Long getCode() {
            return this.code;
        }

        public ImAuditResponseBodyTextResultsResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImAuditResponseBodyTextResultsResult setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ImAuditResponseBodyTextResultsResult setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ImAuditResponseBodyTextResultsResult setResults(java.util.List<ImAuditResponseBodyTextResultsResultResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResultResults> getResults() {
            return this.results;
        }

        public ImAuditResponseBodyTextResultsResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ImAuditResponseBodyTextResults extends TeaModel {
        @NameInMap("result")
        public java.util.List<ImAuditResponseBodyTextResultsResult> result;

        public static ImAuditResponseBodyTextResults build(java.util.Map<String, ?> map) throws Exception {
            ImAuditResponseBodyTextResults self = new ImAuditResponseBodyTextResults();
            return TeaModel.build(map, self);
        }

        public ImAuditResponseBodyTextResults setResult(java.util.List<ImAuditResponseBodyTextResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ImAuditResponseBodyTextResultsResult> getResult() {
            return this.result;
        }

    }

}
