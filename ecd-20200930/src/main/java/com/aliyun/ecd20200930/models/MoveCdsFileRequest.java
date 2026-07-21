// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MoveCdsFileRequest extends TeaModel {
    /**
     * <p>The enterprise cloud disk ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-346063****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The policy for handling files with the same name.</p>
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
     * 
     * <strong>example:</strong>
     * <p>63f3257b68b018170b194d87b875512d108f****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-hvyou5jbob3b0****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the parent folder at the destination. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the file. Set this parameter to <code>root</code> if you want to move the file to the root directory.</p>
     * 
     * <strong>example:</strong>
     * <p>6409848a6da91d6240604e7ba7337d85ba8a1****</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static MoveCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveCdsFileRequest self = new MoveCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public MoveCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public MoveCdsFileRequest setConflictPolicy(String conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    public MoveCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public MoveCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public MoveCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MoveCdsFileRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public MoveCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
