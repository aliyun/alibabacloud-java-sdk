// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetPublishFileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BuildTaskBid")
    @Validation(required = true)
    public String buildTaskBid;

    @NameInMap("FileName")
    @Validation(required = true)
    public String fileName;

    @NameInMap("CdnUrl")
    @Validation(required = true)
    public java.util.Map<String, ?> cdnUrl;

    public static GetPublishFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPublishFileResponse self = new GetPublishFileResponse();
        return TeaModel.build(map, self);
    }

    public GetPublishFileResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublishFileResponse setBuildTaskBid(String buildTaskBid) {
        this.buildTaskBid = buildTaskBid;
        return this;
    }
    public String getBuildTaskBid() {
        return this.buildTaskBid;
    }

    public GetPublishFileResponse setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetPublishFileResponse setCdnUrl(java.util.Map<String, ?> cdnUrl) {
        this.cdnUrl = cdnUrl;
        return this;
    }
    public java.util.Map<String, ?> getCdnUrl() {
        return this.cdnUrl;
    }

}
