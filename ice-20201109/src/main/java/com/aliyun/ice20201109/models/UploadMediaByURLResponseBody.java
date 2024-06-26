// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadMediaByURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>83B7-7F87-4792-BFE9-63CD2137</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadJobs")
    public java.util.List<UploadMediaByURLResponseBodyUploadJobs> uploadJobs;

    public static UploadMediaByURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaByURLResponseBody self = new UploadMediaByURLResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMediaByURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadMediaByURLResponseBody setUploadJobs(java.util.List<UploadMediaByURLResponseBodyUploadJobs> uploadJobs) {
        this.uploadJobs = uploadJobs;
        return this;
    }
    public java.util.List<UploadMediaByURLResponseBodyUploadJobs> getUploadJobs() {
        return this.uploadJobs;
    }

    public static class UploadMediaByURLResponseBodyUploadJobs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20ce1e05dba64576b96e9683879f0***</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>f476988629f54a7b8a4ba90d1a6c7***</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example****.mp4">http://example****.mp4</a></p>
         */
        @NameInMap("SourceURL")
        public String sourceURL;

        public static UploadMediaByURLResponseBodyUploadJobs build(java.util.Map<String, ?> map) throws Exception {
            UploadMediaByURLResponseBodyUploadJobs self = new UploadMediaByURLResponseBodyUploadJobs();
            return TeaModel.build(map, self);
        }

        public UploadMediaByURLResponseBodyUploadJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public UploadMediaByURLResponseBodyUploadJobs setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public UploadMediaByURLResponseBodyUploadJobs setSourceURL(String sourceURL) {
            this.sourceURL = sourceURL;
            return this;
        }
        public String getSourceURL() {
            return this.sourceURL;
        }

    }

}
