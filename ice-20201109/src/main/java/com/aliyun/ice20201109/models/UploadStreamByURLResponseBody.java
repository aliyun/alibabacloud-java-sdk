// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UploadStreamByURLResponseBody extends TeaModel {
    @NameInMap("FileURL")
    public String fileURL;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RequestId")
    public String requestId;

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
