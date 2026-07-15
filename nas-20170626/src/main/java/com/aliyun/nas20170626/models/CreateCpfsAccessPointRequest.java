// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateCpfsAccessPointRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RootDirectory")
    public CreateCpfsAccessPointRequestRootDirectory rootDirectory;

    public static CreateCpfsAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCpfsAccessPointRequest self = new CreateCpfsAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateCpfsAccessPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCpfsAccessPointRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateCpfsAccessPointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCpfsAccessPointRequest setRootDirectory(CreateCpfsAccessPointRequestRootDirectory rootDirectory) {
        this.rootDirectory = rootDirectory;
        return this;
    }
    public CreateCpfsAccessPointRequestRootDirectory getRootDirectory() {
        return this.rootDirectory;
    }

    public static class CreateCpfsAccessPointRequestRootDirectory extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/test/</p>
         */
        @NameInMap("RootPath")
        public String rootPath;

        public static CreateCpfsAccessPointRequestRootDirectory build(java.util.Map<String, ?> map) throws Exception {
            CreateCpfsAccessPointRequestRootDirectory self = new CreateCpfsAccessPointRequestRootDirectory();
            return TeaModel.build(map, self);
        }

        public CreateCpfsAccessPointRequestRootDirectory setRootPath(String rootPath) {
            this.rootPath = rootPath;
            return this;
        }
        public String getRootPath() {
            return this.rootPath;
        }

    }

}
