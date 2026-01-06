// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetFilesetResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFilesetResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
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
         * <strong>example:</strong>
         * <p>2025-11-21 12:49:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <strong>example:</strong>
         * <p>Description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FileCountUsage")
        public Long fileCountUsage;

        /**
         * <strong>example:</strong>
         * <p>cpfs-0244729a8ef8****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <strong>example:</strong>
         * <p>pathtoroot/fset/</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <strong>example:</strong>
         * <p>fset-03250e8fe78d****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        @NameInMap("Quota")
        public GetFilesetResponseBodyDataQuota quota;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SpaceUsage")
        public Long spaceUsage;

        /**
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
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
