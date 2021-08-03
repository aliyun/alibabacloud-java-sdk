// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemResponseBody extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("FileSystemName")
    public String fileSystemName;

    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

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

    public CreateNASFileSystemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateNASFileSystemResponseBody setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

}
