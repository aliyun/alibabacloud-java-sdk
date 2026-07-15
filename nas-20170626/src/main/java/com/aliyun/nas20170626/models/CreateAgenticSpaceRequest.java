// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAgenticSpaceRequest extends TeaModel {
    /**
     * <p>The zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("Azone")
    public String azone;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the AgenticSpace.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The description must be 2 to 128 characters in length.</li>
     * <li>The description must start with a letter or a Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AgenticSpace Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually modifying the instance or incurring fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: sends a dry run request without modifying the protocol service. The system checks whether required parameters are specified, whether the request format is valid, and whether business limit dependencies are met. If the check fails, the corresponding error is returned. If the check succeeds, HTTP status code 200 is returned.</li>
     * <li>false (default): sends a normal request. After the check is passed, the protocol service is directly modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>31a8e4****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The absolute path of the file. Only first-level directories are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/path/</p>
     */
    @NameInMap("FileSystemPath")
    public String fileSystemPath;

    /**
     * <p>The quota information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Quota")
    public CreateAgenticSpaceRequestQuota quota;

    public static CreateAgenticSpaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgenticSpaceRequest self = new CreateAgenticSpaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgenticSpaceRequest setAzone(String azone) {
        this.azone = azone;
        return this;
    }
    public String getAzone() {
        return this.azone;
    }

    public CreateAgenticSpaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAgenticSpaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgenticSpaceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAgenticSpaceRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateAgenticSpaceRequest setFileSystemPath(String fileSystemPath) {
        this.fileSystemPath = fileSystemPath;
        return this;
    }
    public String getFileSystemPath() {
        return this.fileSystemPath;
    }

    public CreateAgenticSpaceRequest setQuota(CreateAgenticSpaceRequestQuota quota) {
        this.quota = quota;
        return this;
    }
    public CreateAgenticSpaceRequestQuota getQuota() {
        return this.quota;
    }

    public static class CreateAgenticSpaceRequestQuota extends TeaModel {
        /**
         * <p>The maximum number of files allowed by the quota. Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10000.</p>
         * </li>
         * <li><p>Maximum value: 100000000.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <li>Minimum value: 10737418240 (10 GiB).</li>
         * <li>Maximum value: 1099511627776000 (1024000 GiB).</li>
         * <li>Increment: 1073741824 (1 GiB).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10737418240</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static CreateAgenticSpaceRequestQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateAgenticSpaceRequestQuota self = new CreateAgenticSpaceRequestQuota();
            return TeaModel.build(map, self);
        }

        public CreateAgenticSpaceRequestQuota setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public CreateAgenticSpaceRequestQuota setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

}
