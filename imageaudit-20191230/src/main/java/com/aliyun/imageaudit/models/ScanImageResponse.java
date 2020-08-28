// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit.models;

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

    public static class ScanImageResponseDataResultsSubResultsFrames extends TeaModel {
        @NameInMap("Rate")
        @Validation(required = true)
        public Double rate;

        @NameInMap("URL")
        @Validation(required = true)
        public String URL;

        public static ScanImageResponseDataResultsSubResultsFrames build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsFrames self = new ScanImageResponseDataResultsSubResultsFrames();
            return TeaModel.build(map, self);
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

    }

    public static class ScanImageResponseDataResultsSubResultsProgramCodeDataList extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        @NameInMap("Width")
        @Validation(required = true)
        public Double width;

        @NameInMap("Height")
        @Validation(required = true)
        public Double height;

        public static ScanImageResponseDataResultsSubResultsProgramCodeDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsProgramCodeDataList self = new ScanImageResponseDataResultsSubResultsProgramCodeDataList();
            return TeaModel.build(map, self);
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
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        @NameInMap("Width")
        @Validation(required = true)
        public Double width;

        @NameInMap("Height")
        @Validation(required = true)
        public Double height;

        public static ScanImageResponseDataResultsSubResultsLogoDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsLogoDataList self = new ScanImageResponseDataResultsSubResultsLogoDataList();
            return TeaModel.build(map, self);
        }

    }

    public static class ScanImageResponseDataResultsSubResultsSfaceDataListFaces extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Rate")
        @Validation(required = true)
        public Double rate;

        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        public static ScanImageResponseDataResultsSubResultsSfaceDataListFaces build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsSfaceDataListFaces self = new ScanImageResponseDataResultsSubResultsSfaceDataListFaces();
            return TeaModel.build(map, self);
        }

    }

    public static class ScanImageResponseDataResultsSubResultsSfaceDataList extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Double x;

        @NameInMap("Y")
        @Validation(required = true)
        public Double y;

        @NameInMap("Width")
        @Validation(required = true)
        public Double width;

        @NameInMap("Height")
        @Validation(required = true)
        public Double height;

        @NameInMap("Faces")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResultsSubResultsSfaceDataListFaces> faces;

        public static ScanImageResponseDataResultsSubResultsSfaceDataList build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseDataResultsSubResultsSfaceDataList self = new ScanImageResponseDataResultsSubResultsSfaceDataList();
            return TeaModel.build(map, self);
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
        public Double rate;

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

    }

    public static class ScanImageResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<ScanImageResponseDataResults> results;

        public static ScanImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            ScanImageResponseData self = new ScanImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
