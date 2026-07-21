// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyCdsFileRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically rename the file when a file with the same name exists in the destination folder.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRename")
    public Boolean autoRename;

    /**
     * <p>The enterprise cloud drive ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+cds-352282****</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The ID of the user who is logged on to the cloud drive.</p>
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
     * <p>640985a0ca2f71f489d2497682ca0bf468de****</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The ID of the personal drive (which can be obtained from the <code>UserId</code> response parameter of the <a href="https://help.aliyun.com/document_detail/2357237.html">DescribeCloudDriveUsers</a> operation) or the team space ID (which can be obtained from the <code>GroupId</code> response parameter of the <a href="https://help.aliyun.com/document_detail/609896.html">DescribeCloudDriveGroups</a> operation) at the copy destination.</p>
     * <blockquote>
     * <p>If both <code>FileReceiverId</code> and <code>FileReceiverType</code> are empty, the file is copied to the personal drive where the file currently resides by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>user02</p>
     */
    @NameInMap("FileReceiverId")
    public String fileReceiverId;

    /**
     * <p>The type of space to which the file belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("FileReceiverType")
    public String fileReceiverType;

    /**
     * <p>The team space ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-hs3i1w39o68ma****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the parent folder at the copy destination. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the folder. Set this parameter to <code>root</code> if you want to copy the file to the root directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>root</p>
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

    public static CopyCdsFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCdsFileRequest self = new CopyCdsFileRequest();
        return TeaModel.build(map, self);
    }

    public CopyCdsFileRequest setAutoRename(Boolean autoRename) {
        this.autoRename = autoRename;
        return this;
    }
    public Boolean getAutoRename() {
        return this.autoRename;
    }

    public CopyCdsFileRequest setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CopyCdsFileRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public CopyCdsFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CopyCdsFileRequest setFileReceiverId(String fileReceiverId) {
        this.fileReceiverId = fileReceiverId;
        return this;
    }
    public String getFileReceiverId() {
        return this.fileReceiverId;
    }

    public CopyCdsFileRequest setFileReceiverType(String fileReceiverType) {
        this.fileReceiverType = fileReceiverType;
        return this;
    }
    public String getFileReceiverType() {
        return this.fileReceiverType;
    }

    public CopyCdsFileRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CopyCdsFileRequest setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
        return this;
    }
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    public CopyCdsFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
