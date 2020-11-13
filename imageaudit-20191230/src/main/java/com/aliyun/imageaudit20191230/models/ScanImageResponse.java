// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ScanImageResponseData data;

    public static ScanImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ScanImageResponse self = new ScanImageResponse();
        return TeaModel.build(map, self);
    }

    public ScanImageResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanImageResponse setData(ScanImageResponseData data) {
        this.data = data;
        return this;
    }
    public ScanImageResponseData getData() {
        return this.data;
    }

    public static class ScanImageResponseDataResultsSubResultsFrames extends TeaModel {
        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static ScanImageResponseDataResultsSubResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsFrames self = new ScanImageResponseDataResultsSubResultsFrames();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResultsFrames setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanImageResponseDataResultsSubResultsFrames setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class ScanImageResponseDataResultsSubResultsHintWordsInfoList extends TeaModel {
        @NameInMap("Context")
        @Validation(required = true)
        public String context;

        public static ScanImageResponseDataResultsSubResultsHintWordsInfoList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsHintWordsInfoList self = new ScanImageResponseDataResultsSubResultsHintWordsInfoList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResultsHintWordsInfoList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

    }

    public static class ScanImageResponseDataResultsSubResultsProgramCodeDataList extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        @NameInMap("Width")
        @Validation(required = true)
        public Float width;

        @NameInMap("Height")
        @Validation(required = true)
        public Float height;

        public static ScanImageResponseDataResultsSubResultsProgramCodeDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsProgramCodeDataList self = new ScanImageResponseDataResultsSubResultsProgramCodeDataList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResultsProgramCodeDataList setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScanImageResponseDataResultsSubResultsProgramCodeDataList setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ScanImageResponseDataResultsSubResultsProgramCodeDataList setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ScanImageResponseDataResultsSubResultsProgramCodeDataList setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

    }

    public static class ScanImageResponseDataResultsSubResultsLogoDataList extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        @NameInMap("Width")
        @Validation(required = true)
        public Float width;

        @NameInMap("Height")
        @Validation(required = true)
        public Float height;

        public static ScanImageResponseDataResultsSubResultsLogoDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsLogoDataList self = new ScanImageResponseDataResultsSubResultsLogoDataList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResultsLogoDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ScanImageResponseDataResultsSubResultsLogoDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScanImageResponseDataResultsSubResultsLogoDataList setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScanImageResponseDataResultsSubResultsLogoDataList setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ScanImageResponseDataResultsSubResultsLogoDataList setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ScanImageResponseDataResultsSubResultsLogoDataList setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

    }

    public static class ScanImageResponseDataResultsSubResultsSfaceDataListFaces extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static ScanImageResponseDataResultsSubResultsSfaceDataListFaces build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsSfaceDataListFaces self = new ScanImageResponseDataResultsSubResultsSfaceDataListFaces();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataListFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataListFaces setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataListFaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class ScanImageResponseDataResultsSubResultsSfaceDataList extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Float x;

        @NameInMap("Y")
        @Validation(required = true)
        public Float y;

        @NameInMap("Width")
        @Validation(required = true)
        public Float width;

        @NameInMap("Height")
        @Validation(required = true)
        public Float height;

        @NameInMap("Faces")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataListFaces> faces;

        public static ScanImageResponseDataResultsSubResultsSfaceDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsSfaceDataList self = new ScanImageResponseDataResultsSubResultsSfaceDataList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataList setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataList setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataList setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataList setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public ScanImageResponseDataResultsSubResultsSfaceDataList setFaces(java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataListFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataListFaces> getFaces() {
            return this.faces;
        }

    }

    public static class ScanImageResponseDataResultsSubResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("Scene")
        @Validation(required = true)
        public String scene;

        @NameInMap("Frames")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsFrames> frames;

        @NameInMap("HintWordsInfoList")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsHintWordsInfoList> hintWordsInfoList;

        @NameInMap("ProgramCodeDataList")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsProgramCodeDataList> programCodeDataList;

        @NameInMap("LogoDataList")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsLogoDataList> logoDataList;

        @NameInMap("SfaceDataList")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataList> sfaceDataList;

        @NameInMap("OCRDataList")
        @Validation(required = true)
        public java.util.List<String> OCRDataList;

        public static ScanImageResponseDataResultsSubResults build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResults self = new ScanImageResponseDataResultsSubResults();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResultsSubResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ScanImageResponseDataResultsSubResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public ScanImageResponseDataResultsSubResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanImageResponseDataResultsSubResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ScanImageResponseDataResultsSubResults setFrames(java.util.List<ScanImageResponseDataResultsSubResultsFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResultsFrames> getFrames() {
            return this.frames;
        }

        public ScanImageResponseDataResultsSubResults setHintWordsInfoList(java.util.List<ScanImageResponseDataResultsSubResultsHintWordsInfoList> hintWordsInfoList) {
            this.hintWordsInfoList = hintWordsInfoList;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResultsHintWordsInfoList> getHintWordsInfoList() {
            return this.hintWordsInfoList;
        }

        public ScanImageResponseDataResultsSubResults setProgramCodeDataList(java.util.List<ScanImageResponseDataResultsSubResultsProgramCodeDataList> programCodeDataList) {
            this.programCodeDataList = programCodeDataList;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResultsProgramCodeDataList> getProgramCodeDataList() {
            return this.programCodeDataList;
        }

        public ScanImageResponseDataResultsSubResults setLogoDataList(java.util.List<ScanImageResponseDataResultsSubResultsLogoDataList> logoDataList) {
            this.logoDataList = logoDataList;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResultsLogoDataList> getLogoDataList() {
            return this.logoDataList;
        }

        public ScanImageResponseDataResultsSubResults setSfaceDataList(java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataList> sfaceDataList) {
            this.sfaceDataList = sfaceDataList;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataList> getSfaceDataList() {
            return this.sfaceDataList;
        }

        public ScanImageResponseDataResultsSubResults setOCRDataList(java.util.List<String> OCRDataList) {
            this.OCRDataList = OCRDataList;
            return this;
        }
        public java.util.List<String> getOCRDataList() {
            return this.OCRDataList;
        }

    }

    public static class ScanImageResponseDataResults extends TeaModel {
        @NameInMap("DataId")
        @Validation(required = true)
        public String dataId;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("SubResults")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResults> subResults;

        public static ScanImageResponseDataResults build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResults self = new ScanImageResponseDataResults();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseDataResults setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ScanImageResponseDataResults setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ScanImageResponseDataResults setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ScanImageResponseDataResults setSubResults(java.util.List<ScanImageResponseDataResultsSubResults> subResults) {
            this.subResults = subResults;
            return this;
        }
        public java.util.List<ScanImageResponseDataResultsSubResults> getSubResults() {
            return this.subResults;
        }

    }

    public static class ScanImageResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResults> results;

        public static ScanImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseData self = new ScanImageResponseData();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseData setResults(java.util.List<ScanImageResponseDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ScanImageResponseDataResults> getResults() {
            return this.results;
        }

    }

}
