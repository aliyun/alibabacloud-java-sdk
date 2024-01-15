// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CopyCdsFileRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically rename the file if a file that has the same name exists in the folder to which you want to copy the file. Default value: false.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("AutoRename")
    public Boolean autoRename;

    /**
     * <p>The ID of the cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The user ID that you want to use to access the cloud disk.</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The file ID. You can call the CreateCdsFile operation to query the file ID.</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>目标复制文件所在的个人空间ID（即UserId，您可以在DescribeCloudDriveUsers接口返回的报文中获取。）或者目标复制文件所在的团队空间ID（即GroupId，您可以在DescribeCloudDriveGroups接口返回的报文中获取。）</p>
     * <p>> FileReceiverId和FileReceiverType都为空时，默认复制到文件所在的个人空间。</p>
     * <p>></p>
     */
    @NameInMap("FileReceiverId")
    public String fileReceiverId;

    /**
     * <p>文件所属的空间类型。</p>
     */
    @NameInMap("FileReceiverType")
    public String fileReceiverType;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the parent folder of the folder to which you want to copy the file. If you want to copy the file to the root directory, set this parameter to root.</p>
     */
    @NameInMap("ParentFolderId")
    public String parentFolderId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
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
