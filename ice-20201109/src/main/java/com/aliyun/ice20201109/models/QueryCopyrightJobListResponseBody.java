// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobListResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryCopyrightJobListResponseBodyData> data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryCopyrightJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightJobListResponseBody self = new QueryCopyrightJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightJobListResponseBody setData(java.util.List<QueryCopyrightJobListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCopyrightJobListResponseBodyData> getData() {
        return this.data;
    }

    public QueryCopyrightJobListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCopyrightJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCopyrightJobListResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryCopyrightJobListResponseBodyDataInput extends TeaModel {
        /**
         * <p>The specific input information.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ol>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryCopyrightJobListResponseBodyDataInput build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightJobListResponseBodyDataInput self = new QueryCopyrightJobListResponseBodyDataInput();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightJobListResponseBodyDataInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryCopyrightJobListResponseBodyDataInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryCopyrightJobListResponseBodyDataOutput extends TeaModel {
        /**
         * <p>The specific output information.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryCopyrightJobListResponseBodyDataOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightJobListResponseBodyDataOutput self = new QueryCopyrightJobListResponseBodyDataOutput();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightJobListResponseBodyDataOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryCopyrightJobListResponseBodyDataOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryCopyrightJobListResponseBodyData extends TeaModel {
        /**
         * <p>The creation time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1627357322</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The last modification time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1627357322</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>Information about the input video for watermarking.</p>
         */
        @NameInMap("Input")
        public QueryCopyrightJobListResponseBodyDataInput input;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The watermark level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <p>The content of the embedded watermark.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Information about the watermarked output video.</p>
         */
        @NameInMap("Output")
        public QueryCopyrightJobListResponseBodyDataOutput output;

        /**
         * <p>The job result.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Code&quot;:&quot;success&quot;,&quot;Message&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The status of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The ID of the user who initiated the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1346693***</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QueryCopyrightJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightJobListResponseBodyData self = new QueryCopyrightJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightJobListResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCopyrightJobListResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryCopyrightJobListResponseBodyData setInput(QueryCopyrightJobListResponseBodyDataInput input) {
            this.input = input;
            return this;
        }
        public QueryCopyrightJobListResponseBodyDataInput getInput() {
            return this.input;
        }

        public QueryCopyrightJobListResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryCopyrightJobListResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryCopyrightJobListResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCopyrightJobListResponseBodyData setOutput(QueryCopyrightJobListResponseBodyDataOutput output) {
            this.output = output;
            return this;
        }
        public QueryCopyrightJobListResponseBodyDataOutput getOutput() {
            return this.output;
        }

        public QueryCopyrightJobListResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryCopyrightJobListResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCopyrightJobListResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryCopyrightJobListResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
