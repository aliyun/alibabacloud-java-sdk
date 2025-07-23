// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    /**
     * <p>The image information.</p>
     */
    @NameInMap("Image")
    public GetImageResponseBodyImage image;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setImage(GetImageResponseBodyImage image) {
        this.image = image;
        return this;
    }
    public GetImageResponseBodyImage getImage() {
        return this.image;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetImageResponseBodyImage extends TeaModel {
        /**
         * <p>The ID of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-1618017313</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The time when the image was copied. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1641275680000</p>
         */
        @NameInMap("CopyTime")
        public Long copyTime;

        /**
         * <p>The time when the image was generated. The value is accurate to the millisecond. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786776567788</p>
         */
        @NameInMap("ExportTime")
        public Long exportTime;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>image-wz9c5ths5dfuwx47****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the hardware security module (HSM).</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-9lb32vll****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The image generation mode. Valid values:</p>
         * <ul>
         * <li>PERIODIC</li>
         * <li>MANUAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The description of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the source backup.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-gfuiasdfa****</p>
         */
        @NameInMap("SourceBackupUid")
        public String sourceBackupUid;

        /**
         * <p>The ID of the source image.</p>
         * 
         * <strong>example:</strong>
         * <p>image-kklhhhh****</p>
         */
        @NameInMap("SourceImageUid")
        public String sourceImageUid;

        /**
         * <p>The ID of the source HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-wz9fnmvx190shfbk****</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The region ID of the source image.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li>NEW</li>
         * <li>DELETED</li>
         * <li>CREATING</li>
         * <li>NORMAL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NEW</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The digest of the HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>3kGeHnmQzXwSsfF0Jk9eJYhe2gP6An0/HlYIiZh1****</p>
         */
        @NameInMap("VsmDigest")
        public String vsmDigest;

        public static GetImageResponseBodyImage build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyImage self = new GetImageResponseBodyImage();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyImage setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public GetImageResponseBodyImage setCopyTime(Long copyTime) {
            this.copyTime = copyTime;
            return this;
        }
        public Long getCopyTime() {
            return this.copyTime;
        }

        public GetImageResponseBodyImage setExportTime(Long exportTime) {
            this.exportTime = exportTime;
            return this;
        }
        public Long getExportTime() {
            return this.exportTime;
        }

        public GetImageResponseBodyImage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageResponseBodyImage setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetImageResponseBodyImage setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public GetImageResponseBodyImage setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetImageResponseBodyImage setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetImageResponseBodyImage setSourceBackupUid(String sourceBackupUid) {
            this.sourceBackupUid = sourceBackupUid;
            return this;
        }
        public String getSourceBackupUid() {
            return this.sourceBackupUid;
        }

        public GetImageResponseBodyImage setSourceImageUid(String sourceImageUid) {
            this.sourceImageUid = sourceImageUid;
            return this;
        }
        public String getSourceImageUid() {
            return this.sourceImageUid;
        }

        public GetImageResponseBodyImage setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public GetImageResponseBodyImage setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public GetImageResponseBodyImage setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageResponseBodyImage setVsmDigest(String vsmDigest) {
            this.vsmDigest = vsmDigest;
            return this;
        }
        public String getVsmDigest() {
            return this.vsmDigest;
        }

    }

}
