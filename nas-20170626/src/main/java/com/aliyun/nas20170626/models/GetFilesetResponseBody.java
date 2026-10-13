// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetFilesetResponseBody extends TeaModel {
    /**
     * <p>The data details.</p>
     */
    @NameInMap("Data")
    public GetFilesetResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFilesetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFilesetResponseBody self = new GetFilesetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFilesetResponseBody setData(GetFilesetResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFilesetResponseBodyData getData() {
        return this.data;
    }

    public GetFilesetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFilesetResponseBodyDataQuota extends TeaModel {
        /**
         * <p>The file count limit of the quota. Value range:</p>
         * <ul>
         * <li><p>Minimum value: 10,000.</p>
         * </li>
         * <li><p>Maximum value: 10,000,000,000.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>The total capacity limit of the quota. Unit: bytes.</p>
         * <p>Value range:</p>
         * <ul>
         * <li><p>Minimum value: 10,737,418,240 (10 GiB).</p>
         * </li>
         * <li><p>Increment: 1,073,741,824 (1 GiB).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10,737,418,240</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static GetFilesetResponseBodyDataQuota build(java.util.Map<String, ?> map) throws Exception {
            GetFilesetResponseBodyDataQuota self = new GetFilesetResponseBodyDataQuota();
            return TeaModel.build(map, self);
        }

        public GetFilesetResponseBodyDataQuota setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public GetFilesetResponseBodyDataQuota setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class GetFilesetResponseBodyData extends TeaModel {
        /**
         * <p>The time when the Fileset was created.</p>
         * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-21 12:49:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The release protection property of the instance. Specifies whether the instance can be released from the console or by calling the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation.</p>
         * <ul>
         * <li>true: Release protection is enabled.</li>
         * <li>false (default): Release protection is disabled.</li>
         * </ul>
         * <blockquote>
         * <p>This property applies only to manual release operations and does not apply to system-initiated release operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The description of the Fileset.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The file count usage.</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FileCountUsage")
        public Long fileCountUsage;

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cpfs-0244729a8ef8****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The path of the Fileset in the CPFS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>pathtoroot/fset/</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <p>The Fileset ID.</p>
         * <blockquote>
         * <p>This parameter is required if the file system type is CPFS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>fset-03250e8fe78d****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <p>The quota information.</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Quota")
        public GetFilesetResponseBodyDataQuota quota;

        /**
         * <p>The capacity usage. Unit: bytes.</p>
         * <blockquote>
         * <p>Only CPFS for Lingjun 2.7.0 and later support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SpaceUsage")
        public Long spaceUsage;

        /**
         * <p>The status of the Fileset. Valid values:</p>
         * <ul>
         * <li>CREATING: The Fileset is being created.</li>
         * <li>CREATED: The Fileset is created and running as expected. </li>
         * <li>RELEASING: The Fileset is being released.</li>
         * <li>RELEASED: The Fileset is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the Fileset was last updated.</p>
         * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-22 12:49:25</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetFilesetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFilesetResponseBodyData self = new GetFilesetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFilesetResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetFilesetResponseBodyData setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public GetFilesetResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetFilesetResponseBodyData setFileCountUsage(Long fileCountUsage) {
            this.fileCountUsage = fileCountUsage;
            return this;
        }
        public Long getFileCountUsage() {
            return this.fileCountUsage;
        }

        public GetFilesetResponseBodyData setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public GetFilesetResponseBodyData setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public GetFilesetResponseBodyData setFsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }
        public String getFsetId() {
            return this.fsetId;
        }

        public GetFilesetResponseBodyData setQuota(GetFilesetResponseBodyDataQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetFilesetResponseBodyDataQuota getQuota() {
            return this.quota;
        }

        public GetFilesetResponseBodyData setSpaceUsage(Long spaceUsage) {
            this.spaceUsage = spaceUsage;
            return this;
        }
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

        public GetFilesetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetFilesetResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
