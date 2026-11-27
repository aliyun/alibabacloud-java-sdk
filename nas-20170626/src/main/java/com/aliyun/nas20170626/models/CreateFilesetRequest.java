// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFilesetRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. You can generate a value on your client to ensure that this parameter is unique across different requests.</p>
     * <p>The ClientToken can contain only ASCII characters and cannot exceed 64 characters. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266554*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The release protection attribute of the instance. It specifies whether the instance can be released through the console or the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation.</p>
     * <ul>
     * <li>true: Enables release protection for the instance.</li>
     * <li>false (default): Disables release protection for the instance.</li>
     * </ul>
     * <blockquote>
     * <p>This attribute limits only manual release operations and does not apply to system release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The description of the Fileset.</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with an uppercase letter, a lowercase letter, or a Chinese character. It cannot start with http:// or https://.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internal transaction directory</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this creation request.</p>
     * <p>A dry run performs checks such as parameter validity and inventory. It does not actually create the instance or incur fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a check request and does not create the instance. Check items include whether required parameters are specified, the request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the 200 HTTP status code is returned, but FsetId is empty.</li>
     * <li>false (default): Sends a normal request and creates the instance directly after the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <ul>
     * <li><p>CPFS: The ID must start with <code>cpfs-</code>. Example: cpfs-099394bd928c****.</p>
     * </li>
     * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya****.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64y*****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The absolute path of the Fileset to be created.</p>
     * <ul>
     * <li>CPFS path limits.<ul>
     * <li>The parent directory of the specified directory must be an existing directory in the file system.</li>
     * <li>The length must be 2 to 1,024 characters.</li>
     * <li>The specified directory must start and end with a forward slash (/).</li>
     * </ul>
     * </li>
     * <li>CPFS for Lingjun path limits.<ul>
     * <li>The length must be 2 to 1,024 characters.</li>
     * <li>The specified directory must start and end with a forward slash (/).</li>
     * <li>The Fileset path must be a new path and cannot be an existing path. Fileset paths cannot be renamed and cannot be symbolic links.</li>
     * <li>The maximum supported depth of a Fileset path is 8 levels. The root directory / is level 0. For example, if the Fileset path is /test/aaa/ccc/, the path depth is 3 levels.</li>
     * <li>If the Fileset path contains multiple directory levels, the parent directory must be an existing directory.</li>
     * <li>You cannot nest Filesets. If a parent directory is already specified as a Fileset, its subdirectories cannot be specified as Filesets. Each Fileset path supports only one quota.</li>
     * <li>The total path length can be up to 990 characters.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/</p>
     */
    @NameInMap("FileSystemPath")
    public String fileSystemPath;

    /**
     * <p>The quota information.</p>
     * <blockquote>
     * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
     * </blockquote>
     */
    @NameInMap("Quota")
    public CreateFilesetRequestQuota quota;

    public static CreateFilesetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFilesetRequest self = new CreateFilesetRequest();
        return TeaModel.build(map, self);
    }

    public CreateFilesetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFilesetRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateFilesetRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFilesetRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateFilesetRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateFilesetRequest setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
        return this;
    }
    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    public CreateFilesetRequest setQuota(CreateFilesetRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public CreateFilesetRequestQuota getQuota() {
        return this.quota;
    }

    public static class CreateFilesetRequestQuota extends TeaModel {
        /**
         * <p>The file count limit of the quota. Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10,000.</p>
         * </li>
         * <li><p>Maximum value: 10,000,000,000.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>The total capacity limit of the quota. Unit: Byte.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10,737,418,240 (10 GiB).</p>
         * </li>
         * <li><p>Step: 1,073,741,824 (1 GiB).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10737418240</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static CreateFilesetRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateFilesetRequestQuota self = new CreateFilesetRequestQuota();
            return TeaModel.build(map, self);
        }

        public CreateFilesetRequestQuota setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public CreateFilesetRequestQuota setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

}
