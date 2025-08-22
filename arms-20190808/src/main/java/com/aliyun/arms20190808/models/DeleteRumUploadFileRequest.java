// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRumUploadFileRequest extends TeaModel {
    /**
     * <p>Information of files to be deleted in JSON array format. If a single file needs to be deleted, this field should be left empty. If multiple files need to be deleted, just fill in this field.</p>
     * 
     * <strong>example:</strong>
     * <p>[{
     *     &quot;fileName&quot; : &quot;test.js.map&quot;,
     *     &quot;version&quot; : &quot;1.0.0&quot;
     *   },
     *   {
     *     &quot;fileName&quot; : &quot;test.dSYM&quot;,
     *     &quot;version&quot; : &quot;1.20.1&quot;,
     *     &quot;uuid&quot; : &quot;xxxx-xxxx-xxxx-xxxx&quot;
     *   }]</p>
     */
    @NameInMap("BatchItems")
    public String batchItems;

    /**
     * <p>The file name, with the extension.</p>
     * 
     * <strong>example:</strong>
     * <p>test.js.map</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>MS4wLjAtbWFpbi4wZjM0NzRlOSxxxxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The version number of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    @NameInMap("Workspace")
    public String workspace;

    public static DeleteRumUploadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRumUploadFileRequest self = new DeleteRumUploadFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRumUploadFileRequest setBatchItems(String batchItems) {
        this.batchItems = batchItems;
        return this;
    }
    public String getBatchItems() {
        return this.batchItems;
    }

    public DeleteRumUploadFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DeleteRumUploadFileRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public DeleteRumUploadFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRumUploadFileRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DeleteRumUploadFileRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DeleteRumUploadFileRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DeleteRumUploadFileRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
