// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpShotJobListResponseBody extends TeaModel {
    /**
     * <p>The information about media fingerprint analysis jobs.</p>
     */
    @NameInMap("FpShotJobList")
    public QueryFpShotJobListResponseBodyFpShotJobList fpShotJobList;

    /**
     * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
     * 
     * <strong>example:</strong>
     * <p>b11c171cced04565b1f38f1ecc39****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The IDs of the jobs that do not exist.</p>
     */
    @NameInMap("NonExistIds")
    public QueryFpShotJobListResponseBodyNonExistIds nonExistIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryFpShotJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpShotJobListResponseBody self = new QueryFpShotJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpShotJobListResponseBody setFpShotJobList(QueryFpShotJobListResponseBodyFpShotJobList fpShotJobList) {
        this.fpShotJobList = fpShotJobList;
        return this;
    }
    public QueryFpShotJobListResponseBodyFpShotJobList getFpShotJobList() {
        return this.fpShotJobList;
    }

    public QueryFpShotJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryFpShotJobListResponseBody setNonExistIds(QueryFpShotJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryFpShotJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryFpShotJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig extends TeaModel {
        /**
         * <p>The ID of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>2288c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("FpDBId")
        public String fpDBId;

        /**
         * <p>The unique primary key of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>3ca84a39a9024f19853b21be9cf9****</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><strong>nosave</strong>: The fingerprints of the job input are not saved to the media fingerprint library.</li>
         * <li><strong>save</strong>: The fingerprints of the job input are saved to the media fingerprint library only if the job input is not duplicated with media content in the media fingerprint library.</li>
         * <li><strong>forcesave</strong>: The fingerprints of the job input are forcibly saved to the media fingerprint library.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>save</p>
         */
        @NameInMap("SaveType")
        public String saveType;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
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

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication extends TeaModel {
        /**
         * <p>The duration of the similar audio clip in the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start point in time of the similar audio clip in the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public String start;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput extends TeaModel {
        /**
         * <p>The duration of the similar audio clip in the input audio.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start point in time of the similar audio clip in the input audio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public String start;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice extends TeaModel {
        /**
         * <p>The start point in time and duration of the similar audio clip in the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
         */
        @NameInMap("Duplication")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceDuplication duplication;

        /**
         * <p>The start point in time and duration of the similar audio clip in the input audio.</p>
         */
        @NameInMap("Input")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput input;

        /**
         * <p>The similarity of the input audio against the audio file that has similar fingerprints to the input audio in the audio fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Similarity")
        public String similarity;

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

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice setInput(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput input) {
            this.input = input;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSliceInput getInput() {
            return this.input;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlicesFpShotSlice setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
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
        /**
         * <p>The audio files that have similar fingerprints to the input audio in the audio fingerprint library.</p>
         */
        @NameInMap("FpShotSlices")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices fpShotSlices;

        /**
         * <p>The unique primary key of the input audio.</p>
         * 
         * <strong>example:</strong>
         * <p>498ac941373341599c4777c8d884****</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The overall similarity of the input audio against audio files that have similar fingerprints to the input audio in the audio fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Similarity")
        public String similarity;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot setFpShotSlices(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices fpShotSlices) {
            this.fpShotSlices = fpShotSlices;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShotFpShotSlices getFpShotSlices() {
            return this.fpShotSlices;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShotsFpShot setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
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
        /**
         * <p>The duration of the similar video clip in the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start point in time of the similar video clip in the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>1260</p>
         */
        @NameInMap("Start")
        public String start;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput extends TeaModel {
        /**
         * <p>The duration of the similar video clip in the input video.</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start point in time of the similar video clip in the input video.</p>
         * 
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("Start")
        public String start;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice extends TeaModel {
        /**
         * <p>The start point in time and duration of the similar video clip in the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
         */
        @NameInMap("Duplication")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceDuplication duplication;

        /**
         * <p>The start time and duration of the similar video clip in the input video.</p>
         */
        @NameInMap("Input")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput input;

        /**
         * <p>The similarity of the input video clip against the video file that has similar fingerprints to the input video in the video fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Similarity")
        public String similarity;

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

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice setInput(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput input) {
            this.input = input;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSliceInput getInput() {
            return this.input;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlicesFpShotSlice setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
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
        /**
         * <p>The video files that have similar fingerprints to the input video in the video fingerprint library.</p>
         */
        @NameInMap("FpShotSlices")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices fpShotSlices;

        /**
         * <p>The unique primary key of the input video.</p>
         * 
         * <strong>example:</strong>
         * <p>498ac941373341599c4777c8d884****</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The overall similarity of the input video against video files that have similar fingerprints to the input video in the video fingerprint library.</p>
         * <blockquote>
         * <p> The overall similarity is the average value of the similarities of the input video clips with the clips of the video that has a similar fingerprint. If multiple video files that have similar fingerprints to the input video exist in the video fingerprint library, the similarities of the input video against multiple similar video clips are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.8914769887924194</p>
         */
        @NameInMap("Similarity")
        public String similarity;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot setFpShotSlices(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices fpShotSlices) {
            this.fpShotSlices = fpShotSlices;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShotFpShotSlices getFpShotSlices() {
            return this.fpShotSlices;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShotsFpShot setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
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
        /**
         * <p>The duration of the similar text snippet in the input text.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start time of the similar text snippet in the input text.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public String start;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice extends TeaModel {
        /**
         * <p>The text snippet that has similar fingerprints to the input text in the text fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>It\&quot;s snowy today.</p>
         */
        @NameInMap("DuplicationText")
        public String duplicationText;

        /**
         * <p>The start point in time and duration of the similar text snippet in the input text.</p>
         */
        @NameInMap("InputFragment")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSliceInputFragment inputFragment;

        /**
         * <p>The input text for text fingerprint analysis.</p>
         * 
         * <strong>example:</strong>
         * <p>It\&quot;s snowy today.</p>
         */
        @NameInMap("InputText")
        public String inputText;

        /**
         * <p>The similarity of the input text against the text snippet that has similar fingerprints to the input text in the text fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Similarity")
        public String similarity;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice();
            return TeaModel.build(map, self);
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

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice setInputText(String inputText) {
            this.inputText = inputText;
            return this;
        }
        public String getInputText() {
            return this.inputText;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultTextFpShotsTextFpShotTextFpShotSlicesTextFpShotSlice setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
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
        /**
         * <p>The unique primary key of the input text.</p>
         * 
         * <strong>example:</strong>
         * <p>3e34ac649945b53a1b0f863ce030****</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The similarity of the input text against text snippets that have similar fingerprints to the input text in the text fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Similarity")
        public String similarity;

        /**
         * <p>The text snippets that have similar fingerprints to the input text in the text fingerprint library.</p>
         */
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
        /**
         * <p>The audio fingerprint analysis results.</p>
         */
        @NameInMap("AudioFpShots")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultAudioFpShots audioFpShots;

        /**
         * <p>The video fingerprint analysis results.</p>
         */
        @NameInMap("FpShots")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResultFpShots fpShots;

        /**
         * <p>The text fingerprint analysis results.</p>
         */
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

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile extends TeaModel {
        /**
         * <p>The OSS bucket in which the job input resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-test</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the job input resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-beijing</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The Object Storage Service (OSS) object that is used as the job input.</p>
         * 
         * <strong>example:</strong>
         * <p>test.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFpShotJobListResponseBodyFpShotJobListFpShotJob extends TeaModel {
        /**
         * <p>The error code returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.UUIDFormatInvalid</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-10T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The length of the input file.
         * Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The ID of the uploaded file.</p>
         * 
         * <strong>example:</strong>
         * <p>ebb51ee30f0b49aba959823fa991****</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The configurations of the job.</p>
         */
        @NameInMap("FpShotConfig")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig fpShotConfig;

        /**
         * <p>The results of the media fingerprint analysis job.</p>
         */
        @NameInMap("FpShotResult")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult fpShotResult;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The information about the job input.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;oss-test&quot;,&quot;Location&quot;:&quot;oss-cn-beijing&quot;,&quot;Object&quot;:&quot;test.mp4&quot;}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("InputFile")
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile inputFile;

        /**
         * <p>The error message returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter \&quot;Id\&quot; is invalid.A uuid must:1)be comprised of chracters[a-f],numbers[0-9];2)be 32 characters long</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the MPS queue to which the analysis job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>Queuing</strong>: The job is waiting in the queue.</li>
         * <li><strong>Analysing</strong>: The job is in progress.</li>
         * <li><strong>Success</strong>: The job is successful.</li>
         * <li><strong>Fail</strong>: The job fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-001</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static QueryFpShotJobListResponseBodyFpShotJobListFpShotJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFpShotJobListResponseBodyFpShotJobListFpShotJob self = new QueryFpShotJobListResponseBodyFpShotJobListFpShotJob();
            return TeaModel.build(map, self);
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFpShotConfig(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig fpShotConfig) {
            this.fpShotConfig = fpShotConfig;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotConfig getFpShotConfig() {
            return this.fpShotConfig;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setFpShotResult(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult fpShotResult) {
            this.fpShotResult = fpShotResult;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobFpShotResult getFpShotResult() {
            return this.fpShotResult;
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

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setInputFile(QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJobInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryFpShotJobListResponseBodyFpShotJobListFpShotJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
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
