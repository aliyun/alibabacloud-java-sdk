// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateCpfsAccessPointRequest extends TeaModel {
    /**
     * <p>The description of the access point.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter.</li>
     * <li>The description cannot start with http:// or https://.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>Cloud Parallel File Storage (CPFS): must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-099394bd928c****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

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
     * <p>The root directory of the access point. Default value: &quot;/&quot;.</p>
     */
    @NameInMap("RootDirectory")
    public CreateCpfsAccessPointRequestRootDirectory rootDirectory;

    /**
     * <p>The list of tags for the CPFS access point.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateCpfsAccessPointRequestTag> tag;

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

    public CreateCpfsAccessPointRequest setTag(java.util.List<CreateCpfsAccessPointRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateCpfsAccessPointRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateCpfsAccessPointRequestRootDirectory extends TeaModel {
        /**
         * <p>The root directory of the access point. The value must start and end with a forward slash (/).</p>
         * 
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

    public static class CreateCpfsAccessPointRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateCpfsAccessPointRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateCpfsAccessPointRequestTag self = new CreateCpfsAccessPointRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateCpfsAccessPointRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateCpfsAccessPointRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
