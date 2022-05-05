// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UploadResponseBody extends TeaModel {
    @NameInMap("Fid")
    public String fid;

    @NameInMap("FileName")
    public String fileName;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadTime")
    public String uploadTime;

    @NameInMap("Version")
    public String version;

    public static UploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadResponseBody self = new UploadResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadResponseBody setFid(String fid) {
        this.fid = fid;
        return this;
    }
    public String getFid() {
        return this.fid;
    }

    public UploadResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadResponseBody setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
        return this;
    }
    public String getUploadTime() {
        return this.uploadTime;
    }

    public UploadResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
