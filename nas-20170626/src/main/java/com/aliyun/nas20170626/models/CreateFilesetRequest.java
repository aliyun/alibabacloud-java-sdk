// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFilesetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable deletion protection to allow you to release the fileset by using the console or by calling the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation.</p>
     * <ul>
     * <li>true: enables release protection.</li>
     * <li>false (default): disables release protection.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter can protect filesets only against manual releases, but not against automatic releases.</p>
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
     * <li>The name must start with a letter and cannot start with http:// or https://.</li>
     * <li>The description can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no fileset is created and no fee is incurred.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>true: performs a dry run. The system checks the required parameters, request syntax, service limits, and available Apsara File Storage NAS (NAS) resources. Otherwise, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FsetId parameter.</li>
     * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a fileset is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for Lingjun file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The absolute path of the fileset.</p>
     * <ul>
     * <li><p>CPFS path limits.</p>
     * <ul>
     * <li>The parent directory of the path that you specify must be an existing directory in the file system.</li>
     * <li>The path must be 2 to 1024 characters in length.</li>
     * <li>The path must start and end with a forward slash (/).</li>
     * </ul>
     * </li>
     * <li><p>Path limit of CPFS for Lingjun</p>
     * <ul>
     * <li>The path must be 2 to 1024 characters in length.</li>
     * <li>The path must start and end with a forward slash (/).</li>
     * <li>The fileset path must be a new path and cannot be an existing path. Fileset paths cannot be renamed and cannot be symbolic links.</li>
     * <li>The maximum depth supported by a fileset path is eight levels. The depth of the root directory / is 0 levels. For example, the fileset path /test/aaa/ccc/ has three levels.</li>
     * <li>If the fileset path is a multi-level path, the parent directory must be an existing directory.</li>
     * <li>Nested filesets are not supported. If a fileset is specified as a parent directory, its subdirectory cannot be a fileset. A fileset path supports only one quota.</li>
     * <li>The path cannot exceed 990 characters in length.</li>
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
     * <p> Only CPFS for Lingjun V2.7.0 and later support this parameter.</p>
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
         * <p>The file quantity quota. Valid values:</p>
         * <ul>
         * <li>Minimum value: 100000.</li>
         * <li>Maximum value: 10000000000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>The total quota capacity limit. Unit: bytes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Minimum value: 10,737,418,240 (10 GiB).</li>
         * <li>Step size: 1073741824 (1 GiB).</li>
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
