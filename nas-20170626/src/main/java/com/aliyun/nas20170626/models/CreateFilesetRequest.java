// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateFilesetRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the fileset.</p>
     * <br>
     * <p>*   The description must be 2 to 128 characters in length.</p>
     * <p>*   The description must start with a letter but cannot start with http:// or https://.</p>
     * <p>*   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run.</p>
     * <br>
     * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no fileset is created and no fee is incurred.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FsetId parameter.</p>
     * <p>*   false (default): performs a dry run and sends the request. If the request passes the dry run, a fileset is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The absolute path of the fileset.</p>
     * <br>
     * <p>*   The parent directory of the path that you specify must be an existing directory in the file system.</p>
     * <p>*   The path must be 2 to 1,024 characters in length.</p>
     * <p>*   The path must start and end with a forward slash (/).</p>
     */
    @NameInMap("FileSystemPath")
    public String fileSystemPath;

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

}
