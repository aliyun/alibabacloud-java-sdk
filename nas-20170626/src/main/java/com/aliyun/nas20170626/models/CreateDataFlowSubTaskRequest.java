// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateDataFlowSubTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Condition")
    public CreateDataFlowSubTaskRequestCondition condition;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dfid-194433a5be31****</p>
     */
    @NameInMap("DataFlowId")
    public String dataFlowId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>taskId-12345678</p>
     */
    @NameInMap("DataFlowTaskId")
    public String dataFlowTaskId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/mnt/file.png</p>
     */
    @NameInMap("DstFilePath")
    public String dstFilePath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-370lx1ev9ss27o0****</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
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
         * <strong>example:</strong>
         * <p>1725897600000000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
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
