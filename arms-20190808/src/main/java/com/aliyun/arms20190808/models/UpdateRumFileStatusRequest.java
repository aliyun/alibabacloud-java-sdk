// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumFileStatusRequest extends TeaModel {
    /**
     * <p>The file name.</p>
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
     * <p>atc8xxxx
     * cf@d8deedfa9bf****</p>
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

    /**
     * <p>The size of the file. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public String size;

    /**
     * <p>The status of the file. Valid values: SUCCESS and INIT.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The unique ID of the file. If you do not set this parameter, the system automatically sets a UUID for you.</p>
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

    public static UpdateRumFileStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRumFileStatusRequest self = new UpdateRumFileStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRumFileStatusRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateRumFileStatusRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public UpdateRumFileStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateRumFileStatusRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public UpdateRumFileStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateRumFileStatusRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public UpdateRumFileStatusRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
