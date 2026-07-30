// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileRequest extends TeaModel {
    /**
     * <p>The enterprise cloud disk ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-643267****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The conflict resolution policy when a file with the same name exists.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("ConflictPolicy")
    public String conflictPolicy;

    /**
     * <p>The ID of the user who uses the cloud disk.</p>
     * 
     * <strong>example:</strong>
     * <p>user01</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The file name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NewFileName.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-i1ruuudp92qpj****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileRequest self = new ModifyCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public ModifyCdsFileRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public ModifyCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public ModifyCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ModifyCdsFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ModifyCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
