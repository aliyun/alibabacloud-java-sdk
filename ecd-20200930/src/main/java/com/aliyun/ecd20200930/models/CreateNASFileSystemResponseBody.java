// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemResponseBody extends TeaModel {
    // The ID of the NAS file system.
    @NameInMap("FileSystemId")
    public String fileSystemId;

    // The name of the NAS file system.
    @NameInMap("FileSystemName")
    public String fileSystemName;

    // The domain name of the mount target.
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNASFileSystemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNASFileSystemResponseBody self = new CreateNASFileSystemResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNASFileSystemResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateNASFileSystemResponseBody setFileSystemName(String fileSystemName) {
        this.fileSystemName = fileSystemName;
        return this;
    }
    public String getFileSystemName() {
        return this.fileSystemName;
    }

    public CreateNASFileSystemResponseBody setMountTargetDomain(String mountTargetDomain) {
        this.mountTargetDomain = mountTargetDomain;
        return this;
    }
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    public CreateNASFileSystemResponseBody setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public CreateNASFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
