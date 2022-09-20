// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DownloadDumpfileRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("DumpFileId")
    public String dumpFileId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorType")
    public String operatorType;

    public static DownloadDumpfileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadDumpfileRequest self = new DownloadDumpfileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadDumpfileRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public DownloadDumpfileRequest setDumpFileId(String dumpFileId) {
        this.dumpFileId = dumpFileId;
        return this;
    }
    public String getDumpFileId() {
        return this.dumpFileId;
    }

    public DownloadDumpfileRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public DownloadDumpfileRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

}
