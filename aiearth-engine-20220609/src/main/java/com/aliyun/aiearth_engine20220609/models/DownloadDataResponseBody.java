// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class DownloadDataResponseBody extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    @NameInMap("Finished")
    public Boolean finished;

    @NameInMap("Status")
    public String status;

    public static DownloadDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataResponseBody self = new DownloadDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDataResponseBody setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DownloadDataResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public DownloadDataResponseBody setFinished(Boolean finished) {
        this.finished = finished;
        return this;
    }
    public Boolean getFinished() {
        return this.finished;
    }

    public DownloadDataResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
