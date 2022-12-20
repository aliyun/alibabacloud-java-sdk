// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScanImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ScanImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanImageResponseBody self = new ScanImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanImageResponseBody setData(ScanImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScanImageResponseBodyData getData() {
        return this.data;
    }

    public ScanImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScanImageResponseBodyDataResultsSubResultsFrames extends TeaModel {
        @NameInMap("Rate")
        public Float rate;

        @NameInMap("URL")
        public String URL;

        public static ScanImageResponseBodyDataResultsSubResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResultsFrames self = new ScanImageResponseBodyDataResultsSubResultsFrames();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResultsFrames setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanImageResponseBodyDataResultsSubResultsFrames setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList extends TeaModel {
        @NameInMap("Context")
        public String context;

        public static ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList self = new ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

    }

    public static class ScanImageResponseBodyDataResultsSubResultsLogoDataList extends TeaModel {
        @NameInMap("Height")
        public Float height;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static ScanImageResponseBodyDataResultsSubResultsLogoDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResultsLogoDataList self = new ScanImageResponseBodyDataResultsSubResultsLogoDataList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResultsLogoDataList setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public ScanImageResponseBodyDataResultsSubResultsLogoDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScanImageResponseBodyDataResultsSubResultsLogoDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ScanImageResponseBodyDataResultsSubResultsLogoDataList setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ScanImageResponseBodyDataResultsSubResultsLogoDataList setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScanImageResponseBodyDataResultsSubResultsLogoDataList setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList extends TeaModel {
        @NameInMap("Height")
        public Float height;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList self = new ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rate")
        public Float rate;

        public static ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces self = new ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

    public static class ScanImageResponseBodyDataResultsSubResultsSfaceDataList extends TeaModel {
        @NameInMap("Faces")
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces> faces;

        @NameInMap("Height")
        public Float height;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static ScanImageResponseBodyDataResultsSubResultsSfaceDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResultsSfaceDataList self = new ScanImageResponseBodyDataResultsSubResultsSfaceDataList();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataList setFaces(java.util.List<ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsSfaceDataListFaces> getFaces() {
            return this.faces;
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataList setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataList setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataList setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public ScanImageResponseBodyDataResultsSubResultsSfaceDataList setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class ScanImageResponseBodyDataResultsSubResults extends TeaModel {
        @NameInMap("Frames")
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsFrames> frames;

        @NameInMap("HintWordsInfoList")
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList> hintWordsInfoList;

        @NameInMap("Label")
        public String label;

        @NameInMap("LogoDataList")
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsLogoDataList> logoDataList;

        // 1
        @NameInMap("OCRDataList")
        public java.util.List<String> OCRDataList;

        @NameInMap("ProgramCodeDataList")
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList> programCodeDataList;

        @NameInMap("Rate")
        public Float rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SfaceDataList")
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsSfaceDataList> sfaceDataList;

        @NameInMap("Suggestion")
        public String suggestion;

        public static ScanImageResponseBodyDataResultsSubResults build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResultsSubResults self = new ScanImageResponseBodyDataResultsSubResults();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResultsSubResults setFrames(java.util.List<ScanImageResponseBodyDataResultsSubResultsFrames> frames) {
            this.frames = frames;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsFrames> getFrames() {
            return this.frames;
        }

        public ScanImageResponseBodyDataResultsSubResults setHintWordsInfoList(java.util.List<ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList> hintWordsInfoList) {
            this.hintWordsInfoList = hintWordsInfoList;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsHintWordsInfoList> getHintWordsInfoList() {
            return this.hintWordsInfoList;
        }

        public ScanImageResponseBodyDataResultsSubResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public ScanImageResponseBodyDataResultsSubResults setLogoDataList(java.util.List<ScanImageResponseBodyDataResultsSubResultsLogoDataList> logoDataList) {
            this.logoDataList = logoDataList;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsLogoDataList> getLogoDataList() {
            return this.logoDataList;
        }

        public ScanImageResponseBodyDataResultsSubResults setOCRDataList(java.util.List<String> OCRDataList) {
            this.OCRDataList = OCRDataList;
            return this;
        }
        public java.util.List<String> getOCRDataList() {
            return this.OCRDataList;
        }

        public ScanImageResponseBodyDataResultsSubResults setProgramCodeDataList(java.util.List<ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList> programCodeDataList) {
            this.programCodeDataList = programCodeDataList;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsProgramCodeDataList> getProgramCodeDataList() {
            return this.programCodeDataList;
        }

        public ScanImageResponseBodyDataResultsSubResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ScanImageResponseBodyDataResultsSubResults setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ScanImageResponseBodyDataResultsSubResults setSfaceDataList(java.util.List<ScanImageResponseBodyDataResultsSubResultsSfaceDataList> sfaceDataList) {
            this.sfaceDataList = sfaceDataList;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResultsSfaceDataList> getSfaceDataList() {
            return this.sfaceDataList;
        }

        public ScanImageResponseBodyDataResultsSubResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class ScanImageResponseBodyDataResults extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("SubResults")
        public java.util.List<ScanImageResponseBodyDataResultsSubResults> subResults;

        @NameInMap("TaskId")
        public String taskId;

        public static ScanImageResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyDataResults self = new ScanImageResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyDataResults setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public ScanImageResponseBodyDataResults setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ScanImageResponseBodyDataResults setSubResults(java.util.List<ScanImageResponseBodyDataResultsSubResults> subResults) {
            this.subResults = subResults;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResultsSubResults> getSubResults() {
            return this.subResults;
        }

        public ScanImageResponseBodyDataResults setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ScanImageResponseBodyData extends TeaModel {
        @NameInMap("Results")
        public java.util.List<ScanImageResponseBodyDataResults> results;

        public static ScanImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseBodyData self = new ScanImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScanImageResponseBodyData setResults(java.util.List<ScanImageResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<ScanImageResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
