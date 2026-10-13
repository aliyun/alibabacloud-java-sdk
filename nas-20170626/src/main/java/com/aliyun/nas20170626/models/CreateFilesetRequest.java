// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFilesetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
     * <p>The release protection property of the instance. Specifies whether the instance can be released by using the console or the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation.</p>
     * <ul>
     * <li>true: Enables release protection for the instance.</li>
     * <li>false (default): Disables release protection for the instance.</li>
     * </ul>
     * <blockquote>
     * <p>This property only restricts manual release operations and does not take effect on system-initiated release operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The description of the fileset.</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter or Chinese character and cannot start with http:// or https://.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internal affairs directory</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually creating the instance or incurring charges.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a dry run request without creating the instance. The check items include required parameters, request format, business restrictions, and NAS inventory. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned, but FsetId is empty.</li>
     * <li>false (default): Sends a normal request. After the check succeeds, the instance is created.</li>
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
     * <li><p>CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-099394bd928c\<em>\</em>\<em>\</em>.</p>
     * </li>
     * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</p>
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
     * <p>The absolute path of the fileset to create.</p>
     * <ul>
     * <li>Path restrictions for CPFS:<ul>
     * <li>The parent directory of the specified directory must be an existing directory in the file system.</li>
     * <li>The path must be 2 to 1,024 characters in length.</li>
     * <li>The specified directory must start and end with a forward slash (/).</li>
     * </ul>
     * </li>
     * <li>Path restrictions for CPFS for Lingjun:<ul>
     * <li>The path must be 2 to 1,024 characters in length.</li>
     * <li>The specified directory must start and end with a forward slash (/).</li>
     * <li>The fileset path must be a new path and cannot be an existing path. Renaming a fileset path is not supported, and the path cannot be a symbolic link.</li>
     * <li>The maximum depth of a fileset path is 8 levels, with the root directory / as level 0. For example, a fileset path of /test/aaa/ccc/ has a depth of 3 levels.</li>
     * <li>If the fileset path contains multiple directory levels, the parent directory must be an existing directory.</li>
     * <li>Nesting filesets within a fileset is not supported. If a parent directory is already specified as a fileset, its subdirectories cannot be specified as filesets. Only one quota is supported for each fileset path.</li>
     * <li>The total path length cannot exceed 990 characters.</li>
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
     * <p>This parameter is supported only for CPFS for Lingjun 2.7.0 and later.</p>
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
         * <p>The total capacity limit of the quota. Unit: bytes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10,737,418,240 (10 GiB).</p>
         * </li>
         * <li><p>Increment: 1,073,741,824 (1 GiB).</p>
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
