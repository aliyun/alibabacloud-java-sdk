// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryDNAJobListResponseBody extends TeaModel {
    /**
     * <p>The queried media fingerprint analysis jobs.</p>
     */
    @NameInMap("JobList")
    public java.util.List<QueryDNAJobListResponseBodyJobList> jobList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryDNAJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDNAJobListResponseBody self = new QueryDNAJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDNAJobListResponseBody setJobList(java.util.List<QueryDNAJobListResponseBodyJobList> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<QueryDNAJobListResponseBodyJobList> getJobList() {
        return this.jobList;
    }

    public QueryDNAJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryDNAJobListResponseBodyJobListInput extends TeaModel {
        /**
         * <p>The input file. The file can be an OSS object or a media asset. The path of an OSS object can be in one of the following formats:</p>
         * <p>1\. oss://bucket/object</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * <p>In the preceding paths, bucket indicates an OSS bucket that resides in the same region as the current project, and object indicates the path of the object in the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>1b1b9cd148034739af413150fded****</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ol>
         * <li>OSS: Object Storage Service (OSS) object.</li>
         * <li>Media: media asset.</li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>Media</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryDNAJobListResponseBodyJobListInput build(java.util.Map<String, ?> map) throws Exception {
            QueryDNAJobListResponseBodyJobListInput self = new QueryDNAJobListResponseBodyJobListInput();
            return TeaModel.build(map, self);
        }

        public QueryDNAJobListResponseBodyJobListInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public QueryDNAJobListResponseBodyJobListInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryDNAJobListResponseBodyJobList extends TeaModel {
        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;InvalidParameter.ResourceNotFound&quot;</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The configurations of the media fingerprint analysis job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SaveType&quot;: &quot;save&quot;,&quot;MediaType&quot;&quot;:&quot;video&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-28T03:21:37Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the media fingerprint library.</p>
         * 
         * <strong>example:</strong>
         * <p>2288c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("DBId")
        public String DBId;

        /**
         * <p>The URL of the media fingerprint analysis result.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test_bucket.oss-cn-shanghai.aliyuncs.com/fingerprint/video/search_result/5/5.txt">http://test_bucket.oss-cn-shanghai.aliyuncs.com/fingerprint/video/search_result/5/5.txt</a></p>
         */
        @NameInMap("DNAResult")
        public String DNAResult;

        /**
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-12-28T03:21:44Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The details of the input file.</p>
         */
        @NameInMap("Input")
        public QueryDNAJobListResponseBodyJobListInput input;

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;The resource operated \&quot;a887d0b***d805ef6f7f6786302\&quot; cannot be found&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The primary key of the video. You must make sure that each primary key is unique.</p>
         * 
         * <strong>example:</strong>
         * <p>3ca84a39a9024f19853b21be9cf9****</p>
         */
        @NameInMap("PrimaryKey")
        public String primaryKey;

        /**
         * <p>The job state. Valid values:</p>
         * <ul>
         * <li><strong>Queuing</strong>: The job is waiting in the queue.</li>
         * <li><strong>Analysing</strong>: The job is in progress.</li>
         * <li><strong>Success</strong>: The job is successful.</li>
         * <li><strong>Fail</strong>: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Queuing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>testdna</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static QueryDNAJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryDNAJobListResponseBodyJobList self = new QueryDNAJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryDNAJobListResponseBodyJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryDNAJobListResponseBodyJobList setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryDNAJobListResponseBodyJobList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryDNAJobListResponseBodyJobList setDBId(String DBId) {
            this.DBId = DBId;
            return this;
        }
        public String getDBId() {
            return this.DBId;
        }

        public QueryDNAJobListResponseBodyJobList setDNAResult(String DNAResult) {
            this.DNAResult = DNAResult;
            return this;
        }
        public String getDNAResult() {
            return this.DNAResult;
        }

        public QueryDNAJobListResponseBodyJobList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryDNAJobListResponseBodyJobList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryDNAJobListResponseBodyJobList setInput(QueryDNAJobListResponseBodyJobListInput input) {
            this.input = input;
            return this;
        }
        public QueryDNAJobListResponseBodyJobListInput getInput() {
            return this.input;
        }

        public QueryDNAJobListResponseBodyJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryDNAJobListResponseBodyJobList setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public QueryDNAJobListResponseBodyJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryDNAJobListResponseBodyJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
