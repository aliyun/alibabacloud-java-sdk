// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowSubTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
     * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The verification condition. The specified conditions must pass verification.</p>
     */
    @NameInMap("Condition")
    public CreateDataFlowSubTaskRequestCondition condition;

    /**
     * <p>The data flow ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>The data flow task ID.</p>
     * <blockquote>
     * <p>Only data flow streaming task IDs are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task-38aa8e890f45****</p>
     */
    @NameInMap("DataFlowTaskId")
    public String dataFlowTaskId;

    /**
     * <p>Specifies whether to perform a dry run for this request.</p>
     * <p>A dry run checks parameter validity and resource availability without actually creating an instance or incurring fees.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Sends a check request without creating the data flow. The check items include whether required parameters are specified, the request format, and business limit dependencies. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned, but DataFlowSubTaskId is empty.</li>
     * <li>false (default): Sends a normal request. After the check passes, the instance is directly created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The destination file path.
     * Limits:</p>
     * <ul>
     * <li>The path must be 1 to 1,023 characters in length.</li>
     * <li>The path must be encoded in UTF-8.</li>
     * <li>The path must start with a forward slash (/).</li>
     * <li>The path must end with a file name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/file.png</p>
     */
    @NameInMap("DstFilePath")
    public String dstFilePath;

    /**
     * <p>The file system ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The source file path.
     * Limits:</p>
     * <ul>
     * <li>The path must be 1 to 1,023 characters in length.</li>
     * <li>The path must be encoded in UTF-8.</li>
     * <li>The path must start with a forward slash (/).</li>
     * <li>The path must end with a file name.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/test/file.png</p>
     */
    @NameInMap("SrcFilePath")
    public String srcFilePath;

    public static CreateDataFlowSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataFlowSubTaskRequest self = new CreateDataFlowSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataFlowSubTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDataFlowSubTaskRequest setCondition(CreateDataFlowSubTaskRequestCondition condition) {
        this.condition = condition;
        return this;
    }
    public CreateDataFlowSubTaskRequestCondition getCondition() {
        return this.condition;
    }

    public CreateDataFlowSubTaskRequest setDataFlowId(String dataFlowId) {
        this.dataFlowId = dataFlowId;
        return this;
    }
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    public CreateDataFlowSubTaskRequest setDataFlowTaskId(String dataFlowTaskId) {
        this.dataFlowTaskId = dataFlowTaskId;
        return this;
    }
    public String getDataFlowTaskId() {
        return this.dataFlowTaskId;
    }

    public CreateDataFlowSubTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDataFlowSubTaskRequest setDstFilePath(String dstFilePath) {
        this.dstFilePath = dstFilePath;
        return this;
    }
    public String getDstFilePath() {
        return this.dstFilePath;
    }

    public CreateDataFlowSubTaskRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public CreateDataFlowSubTaskRequest setSrcFilePath(String srcFilePath) {
        this.srcFilePath = srcFilePath;
        return this;
    }
    public String getSrcFilePath() {
        return this.srcFilePath;
    }

    public static class CreateDataFlowSubTaskRequestCondition extends TeaModel {
        /**
         * <p>The modification time as a UNIX timestamp. Unit: ns.</p>
         * 
         * <strong>example:</strong>
         * <p>1725897600000000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The file size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("Size")
        public Long size;

        public static CreateDataFlowSubTaskRequestCondition build(java.util.Map<String, ?> map) throws Exception {
            CreateDataFlowSubTaskRequestCondition self = new CreateDataFlowSubTaskRequestCondition();
            return TeaModel.build(map, self);
        }

        public CreateDataFlowSubTaskRequestCondition setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public CreateDataFlowSubTaskRequestCondition setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
