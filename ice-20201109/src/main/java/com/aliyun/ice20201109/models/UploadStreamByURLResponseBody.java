// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadStreamByURLResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4">http://outin-***.oss-cn-shanghai.aliyuncs.com/stream/48555e8b-181dd5a8c07/48555e8b-181dd5a8c07.mp4</a></p>
     */
    @NameInMap("FileURL")
    public String fileURL;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>411bed50018971edb60b0764a0ec6***</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>89-C21D-4B78-AE24-3788B8</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="https://example.com/sample-stream.mp4">https://example.com/sample-stream.mp4</a></p>
     */
    @NameInMap("SourceURL")
    public String sourceURL;

    public static UploadStreamByURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadStreamByURLResponseBody self = new UploadStreamByURLResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadStreamByURLResponseBody setFileURL(String fileURL) {
        this.fileURL = fileURL;
        return this;
    }
    public String getFileURL() {
        return this.fileURL;
    }

    public UploadStreamByURLResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UploadStreamByURLResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UploadStreamByURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadStreamByURLResponseBody setSourceURL(String sourceURL) {
        this.sourceURL = sourceURL;
        return this;
    }
    public String getSourceURL() {
        return this.sourceURL;
    }

}
