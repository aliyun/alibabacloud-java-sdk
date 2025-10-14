// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetExportTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ExportStatus")
    public String exportStatus;

    /**
     * <strong>example:</strong>
     * <p>incident_list</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <strong>example:</strong>
     * <p>event_1193842352994186_17344888****.xlsx</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>1605076118000</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>400185</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p><a href="https://cloud-siem-user-dataset.oss-cn-shanghai.aliyuncs.com/export_file/17661858******5/event_17661858******5_175748****.xlsx">https://cloud-siem-user-dataset.oss-cn-shanghai.aliyuncs.com/export_file/17661858******5/event_17661858******5_175748****.xlsx</a></p>
     */
    @NameInMap("Link")
    public String link;

    /**
     * <strong>example:</strong>
     * <p>66</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExportTaskResponseBody self = new GetExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExportTaskResponseBody setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
        return this;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }

    public GetExportTaskResponseBody setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public GetExportTaskResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetExportTaskResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetExportTaskResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetExportTaskResponseBody setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public GetExportTaskResponseBody setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public GetExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
