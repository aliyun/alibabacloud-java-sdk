// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpShotJobListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistPrimaryKeys")
    public QueryFpShotJobListResponseBodyNonExistPrimaryKeys nonExistPrimaryKeys;

    @NameInMap("FpShotJobList")
    public QueryFpShotJobListResponseBodyFpShotJobList fpShotJobList;

    @NameInMap("NonExistIds")
    public QueryFpShotJobListResponseBodyNonExistIds nonExistIds;

    public static QueryFpShotJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpShotJobListResponseBody self = new QueryFpShotJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpShotJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFpShotJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryFpShotJobListResponseBody setNonExistPrimaryKeys(QueryFpShotJobListResponseBodyNonExistPrimaryKeys nonExistPrimaryKeys) {
        this.nonExistPrimaryKeys = nonExistPrimaryKeys;
        return this;
    }
    public QueryFpShotJobListResponseBodyNonExistPrimaryKeys getNonExistPrimaryKeys() {
        return this.nonExistPrimaryKeys;
    }

    public QueryFpShotJobListResponseBody setFpShotJobList(QueryFpShotJobListResponseBodyFpShotJobList fpShotJobList) {
        this.fpShotJobList = fpShotJobList;
        return this;
    }
    public QueryFpShotJobListResponseBodyFpShotJobList getFpShotJobList() {
        return this.fpShotJobList;
    }

    public QueryFpShotJobListResponseBody setNonExistIds(QueryFpShotJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryFpShotJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryFpShotJobListResponseBodyNonExistPrimaryKeys extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryFpShotJobListResponseBodyNonExistPrimaryKeys build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyNonExistPrimaryKeys self = new QueryFpShotJobListResponseBodyNonExistPrimaryKeys();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyNonExistPrimaryKeys setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice extends TeaModel {
        @NameInMap("Duplication")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication duplication;

        @NameInMap("Similarity")
        public String similarity;

        @NameInMap("Input")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput input;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice setDuplication(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication duplication) {
            this.duplication = duplication;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication getDuplication() {
            return this.duplication;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice setInput(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput input) {
            this.input = input;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput getInput() {
            return this.input;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices extends TeaModel {
        @NameInMap("FpShotSlice")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice> fpShotSlice;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices setFpShotSlice(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice> fpShotSlice) {
            this.fpShotSlice = fpShotSlice;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice> getFpShotSlice() {
            return this.fpShotSlice;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot extends TeaModel {
        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("FpShotSlices")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices fpShotSlices;

        @NameInMap("Similarity")
        public String similarity;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot setFpShotSlices(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices fpShotSlices) {
            this.fpShotSlices = fpShotSlices;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices getFpShotSlices() {
            return this.fpShotSlices;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots extends TeaModel {
        @NameInMap("FpShot")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot> fpShot;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots setFpShot(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot> fpShot) {
            this.fpShot = fpShot;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot> getFpShot() {
            return this.fpShot;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice extends TeaModel {
        @NameInMap("Duplication")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication duplication;

        @NameInMap("Similarity")
        public String similarity;

        @NameInMap("Input")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput input;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice setDuplication(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication duplication) {
            this.duplication = duplication;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication getDuplication() {
            return this.duplication;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice setInput(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput input) {
            this.input = input;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput getInput() {
            return this.input;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices extends TeaModel {
        @NameInMap("FpShotSlice")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice> fpShotSlice;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices setFpShotSlice(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice> fpShotSlice) {
            this.fpShotSlice = fpShotSlice;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice> getFpShotSlice() {
            return this.fpShotSlice;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot extends TeaModel {
        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("FpShotSlices")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices fpShotSlices;

        @NameInMap("Similarity")
        public String similarity;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot setFpShotSlices(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices fpShotSlices) {
            this.fpShotSlices = fpShotSlices;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices getFpShotSlices() {
            return this.fpShotSlices;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots extends TeaModel {
        @NameInMap("FpShot")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot> fpShot;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots setFpShot(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot> fpShot) {
            this.fpShot = fpShot;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot> getFpShot() {
            return this.fpShot;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("Duration")
        public String duration;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice extends TeaModel {
        @NameInMap("Similarity")
        public String similarity;

        @NameInMap("InputText")
        public String inputText;

        @NameInMap("DuplicationText")
        public String duplicationText;

        @NameInMap("InputFragment")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment inputFragment;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice setInputText(String inputText) {
            this.inputText = inputText;
            return this;
        }
        public String getInputText() {
            return this.inputText;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice setDuplicationText(String duplicationText) {
            this.duplicationText = duplicationText;
            return this;
        }
        public String getDuplicationText() {
            return this.duplicationText;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice setInputFragment(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment inputFragment) {
            this.inputFragment = inputFragment;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment getInputFragment() {
            return this.inputFragment;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices extends TeaModel {
        @NameInMap("TextFpShotSlice")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice> textFpShotSlice;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices setTextFpShotSlice(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice> textFpShotSlice) {
            this.textFpShotSlice = textFpShotSlice;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice> getTextFpShotSlice() {
            return this.textFpShotSlice;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot extends TeaModel {
        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("Similarity")
        public String similarity;

        @NameInMap("TextFpShotSlices")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices textFpShotSlices;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot setTextFpShotSlices(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices textFpShotSlices) {
            this.textFpShotSlices = textFpShotSlices;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlices getTextFpShotSlices() {
            return this.textFpShotSlices;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots extends TeaModel {
        @NameInMap("TextFpShot")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot> textFpShot;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots setTextFpShot(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot> textFpShot) {
            this.textFpShot = textFpShot;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShot> getTextFpShot() {
            return this.textFpShot;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult extends TeaModel {
        @NameInMap("AudioFpShots")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots audioFpShots;

        @NameInMap("FpShots")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots fpShots;

        @NameInMap("TextFpShots")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots textFpShots;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult setAudioFpShots(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots audioFpShots) {
            this.audioFpShots = audioFpShots;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots getAudioFpShots() {
            return this.audioFpShots;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult setFpShots(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots fpShots) {
            this.fpShots = fpShots;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots getFpShots() {
            return this.fpShots;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult setTextFpShots(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots textFpShots) {
            this.textFpShots = textFpShots;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShots getTextFpShots() {
            return this.textFpShots;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig extends TeaModel {
        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("SaveType")
        public String saveType;

        @NameInMap("Notary")
        public String notary;

        @NameInMap("FpDBId")
        public String fpDBId;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig setNotary(String notary) {
            this.notary = notary;
            return this;
        }
        public String getNotary() {
            return this.notary;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJob extends TeaModel {
        @NameInMap("FpShotResult")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult fpShotResult;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Message")
        public String message;

        @NameInMap("TxHash")
        public String txHash;

        @NameInMap("TransactionId")
        public String transactionId;

        @NameInMap("FpShotConfig")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig fpShotConfig;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("InputFile")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile inputFile;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public String input;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJob self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJob();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFpShotResult(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult fpShotResult) {
            this.fpShotResult = fpShotResult;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult getFpShotResult() {
            return this.fpShotResult;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setTxHash(String txHash) {
            this.txHash = txHash;
            return this;
        }
        public String getTxHash() {
            return this.txHash;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFpShotConfig(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig fpShotConfig) {
            this.fpShotConfig = fpShotConfig;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig getFpShotConfig() {
            return this.fpShotConfig;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setInputFile(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobList extends TeaModel {
        @NameInMap("FpShotJob")
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJob> fpShotJob;

        public static QueryFpShotJobListResponseBodyFpShotJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobList self = new QueryFpShotJobListResponseBodyFpShotJobList();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobList setFpShotJob(java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJob> fpShotJob) {
            this.fpShotJob = fpShotJob;
            return this;
        }
        public java.util.List<QueryFpShotJobListResponseBodyFpShotJobListFpShotJob> getFpShotJob() {
            return this.fpShotJob;
        }

    }

    public static class QueryFpShotJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryFpShotJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyNonExistIds self = new QueryFpShotJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
