// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class DocumentDetailItem extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-08T17:04:28.000+08:00</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>5335c8828ccf735a500ed636590c713a94daf6cdacc90237733035cc5a152afb_1760513801010</p>
     */
    @NameInMap("docHash")
    public String docHash;

    @NameInMap("docName")
    public String docName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://carbon-aidoc.oss-cn-hangzhou.aliyuncs.com/jobs/jobid/document/documentid/docName">https://carbon-aidoc.oss-cn-hangzhou.aliyuncs.com/jobs/jobid/document/documentid/docName</a></p>
     */
    @NameInMap("docUrl")
    public String docUrl;

    /**
     * <strong>example:</strong>
     * <p>adafb91d4e014e2eb4d0a5375b547115</p>
     */
    @NameInMap("folderId")
    public String folderId;

    @NameInMap("folderName")
    public String folderName;

    /**
     * <strong>example:</strong>
     * <p>6731</p>
     */
    @NameInMap("id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>74ec62f4f4e74e5882d4086a40f2b9c6</p>
     */
    @NameInMap("jobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>PARSING_COMPLETED</p>
     */
    @NameInMap("jobStatus")
    public String jobStatus;

    @NameInMap("originDocName")
    public String originDocName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://carbon-aidoc.oss-cn-hangzhou.aliyuncs.com/jobs/jobid/document/documentid/originDocName">https://carbon-aidoc.oss-cn-hangzhou.aliyuncs.com/jobs/jobid/document/documentid/originDocName</a></p>
     */
    @NameInMap("originDocUrl")
    public String originDocUrl;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-09-08T17:04:28.000+08:00</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static DocumentDetailItem build(java.util.Map<String, ?> map) throws Exception {
        DocumentDetailItem self = new DocumentDetailItem();
        return TeaModel.build(map, self);
    }

    public DocumentDetailItem setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DocumentDetailItem setDocHash(String docHash) {
        this.docHash = docHash;
        return this;
    }
    public String getDocHash() {
        return this.docHash;
    }

    public DocumentDetailItem setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public DocumentDetailItem setDocUrl(String docUrl) {
        this.docUrl = docUrl;
        return this;
    }
    public String getDocUrl() {
        return this.docUrl;
    }

    public DocumentDetailItem setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public DocumentDetailItem setFolderName(String folderName) {
        this.folderName = folderName;
        return this;
    }
    public String getFolderName() {
        return this.folderName;
    }

    public DocumentDetailItem setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DocumentDetailItem setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DocumentDetailItem setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public DocumentDetailItem setOriginDocName(String originDocName) {
        this.originDocName = originDocName;
        return this;
    }
    public String getOriginDocName() {
        return this.originDocName;
    }

    public DocumentDetailItem setOriginDocUrl(String originDocUrl) {
        this.originDocUrl = originDocUrl;
        return this;
    }
    public String getOriginDocUrl() {
        return this.originDocUrl;
    }

    public DocumentDetailItem setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
