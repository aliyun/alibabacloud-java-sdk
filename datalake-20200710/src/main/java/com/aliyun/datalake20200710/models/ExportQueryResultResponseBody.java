// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ExportQueryResultResponseBody extends TeaModel {
    @NameInMap("DownloadUrlList")
    public java.util.List<String> downloadUrlList;

    @NameInMap("IsReady")
    public Boolean isReady;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExportQueryResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportQueryResultResponseBody self = new ExportQueryResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportQueryResultResponseBody setDownloadUrlList(java.util.List<String> downloadUrlList) {
        this.downloadUrlList = downloadUrlList;
        return this;
    }
    public java.util.List<String> getDownloadUrlList() {
        return this.downloadUrlList;
    }

    public ExportQueryResultResponseBody setIsReady(Boolean isReady) {
        this.isReady = isReady;
        return this;
    }
    public Boolean getIsReady() {
        return this.isReady;
    }

    public ExportQueryResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportQueryResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
