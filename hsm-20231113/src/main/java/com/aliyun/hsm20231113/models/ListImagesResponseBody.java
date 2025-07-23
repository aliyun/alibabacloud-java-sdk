// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The images returned.</p>
     */
    @NameInMap("Images")
    public java.util.List<ListImagesResponseBodyImages> images;

    /**
     * <p>The number of images per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of images returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListImagesResponseBody setImages(java.util.List<ListImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListImagesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListImagesResponseBodyImages extends TeaModel {
        /**
         * <p>The ID of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>backup-fdb897sdf****</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The time when the image was copied. Unit: milliseconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1641275680000</p>
         */
        @NameInMap("CopyTime")
        public String copyTime;

        /**
         * <p>The time when the image was generated. Unit: milliseconds. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782849566738</p>
         */
        @NameInMap("ExportTime")
        public Long exportTime;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>image-d79x4k11pmg19****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The ID of the hardware security module (HSM).</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-6ja1xknf****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The image generation mode. Valid values:</p>
         * <ul>
         * <li>PERIODIC: It is automatically generated.</li>
         * <li>MANUAL: It is manually generated.</li>
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
         * <p>backup-hodfhaol****</p>
         */
        @NameInMap("SourceBackupUid")
        public String sourceBackupUid;

        /**
         * <p>The ID of the source image.</p>
         * 
         * <strong>example:</strong>
         * <p>image-ooopjygsn****</p>
         */
        @NameInMap("SourceImageUid")
        public String sourceImageUid;

        /**
         * <p>The ID of the source HSM.</p>
         * 
         * <strong>example:</strong>
         * <p>hsm-cn-wz9i2dmefudfxtmb****</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The ID of the region in which the source image resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("SourceRegionId")
        public String sourceRegionId;

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li>NEW: It is disabled.</li>
         * <li>DELETED: It is deleted.</li>
         * <li>CREATING: It is being created.</li>
         * <li>NORMAL: It is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
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

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public ListImagesResponseBodyImages setCopyTime(String copyTime) {
            this.copyTime = copyTime;
            return this;
        }
        public String getCopyTime() {
            return this.copyTime;
        }

        public ListImagesResponseBodyImages setExportTime(Long exportTime) {
            this.exportTime = exportTime;
            return this;
        }
        public Long getExportTime() {
            return this.exportTime;
        }

        public ListImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyImages setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListImagesResponseBodyImages setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public ListImagesResponseBodyImages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListImagesResponseBodyImages setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListImagesResponseBodyImages setSourceBackupUid(String sourceBackupUid) {
            this.sourceBackupUid = sourceBackupUid;
            return this;
        }
        public String getSourceBackupUid() {
            return this.sourceBackupUid;
        }

        public ListImagesResponseBodyImages setSourceImageUid(String sourceImageUid) {
            this.sourceImageUid = sourceImageUid;
            return this;
        }
        public String getSourceImageUid() {
            return this.sourceImageUid;
        }

        public ListImagesResponseBodyImages setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public ListImagesResponseBodyImages setSourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }
        public String getSourceRegionId() {
            return this.sourceRegionId;
        }

        public ListImagesResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListImagesResponseBodyImages setVsmDigest(String vsmDigest) {
            this.vsmDigest = vsmDigest;
            return this;
        }
        public String getVsmDigest() {
            return this.vsmDigest;
        }

    }

}
