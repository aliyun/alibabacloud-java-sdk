// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>04f314****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <strong>example:</strong>
     * <p>testNAS</p>
     */
    @NameInMap("FileSystemName")
    public String fileSystemName;

    /**
     * <strong>example:</strong>
     * <p>04f314****-at***.cn-hangzhou.nas.aliyuncs.com</p>
     */
    @NameInMap("MountTargetDomain")
    public String mountTargetDomain;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
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
