// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetAgenticSpaceResponseBody extends TeaModel {
    @NameInMap("AgenticSpace")
    public GetAgenticSpaceResponseBodyAgenticSpace agenticSpace;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D****3E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAgenticSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticSpaceResponseBody self = new GetAgenticSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgenticSpaceResponseBody setAgenticSpace(GetAgenticSpaceResponseBodyAgenticSpace agenticSpace) {
        this.agenticSpace = agenticSpace;
        return this;
    }
    public GetAgenticSpaceResponseBodyAgenticSpace getAgenticSpace() {
        return this.agenticSpace;
    }

    public GetAgenticSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAgenticSpaceResponseBodyAgenticSpaceQuota extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10000000</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <strong>example:</strong>
         * <p>10737418240</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static GetAgenticSpaceResponseBodyAgenticSpaceQuota build(java.util.Map<String, ?> map) throws Exception {
            GetAgenticSpaceResponseBodyAgenticSpaceQuota self = new GetAgenticSpaceResponseBodyAgenticSpaceQuota();
            return TeaModel.build(map, self);
        }

        public GetAgenticSpaceResponseBodyAgenticSpaceQuota setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public GetAgenticSpaceResponseBodyAgenticSpaceQuota setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class GetAgenticSpaceResponseBodyAgenticSpace extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agentic-229oypxjgpau2****</p>
         */
        @NameInMap("AgenticSpaceId")
        public String agenticSpaceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("Azone")
        public String azone;

        /**
         * <strong>example:</strong>
         * <p>2026-06-10T10:08:08Z</p>
         */
        @NameInMap("CreateTimeUtc")
        public String createTimeUtc;

        /**
         * <strong>example:</strong>
         * <p>AgenticSpace Description。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FileCountUsage")
        public Long fileCountUsage;

        /**
         * <strong>example:</strong>
         * <p>06229oypxjgox0u****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <strong>example:</strong>
         * <p>/test/</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        @NameInMap("Quota")
        public GetAgenticSpaceResponseBodyAgenticSpaceQuota quota;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SpaceUsage")
        public Long spaceUsage;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2026-06-10T10:08:08Z</p>
         */
        @NameInMap("UpdateTimeUtc")
        public String updateTimeUtc;

        public static GetAgenticSpaceResponseBodyAgenticSpace build(java.util.Map<String, ?> map) throws Exception {
            GetAgenticSpaceResponseBodyAgenticSpace self = new GetAgenticSpaceResponseBodyAgenticSpace();
            return TeaModel.build(map, self);
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setAgenticSpaceId(String agenticSpaceId) {
            this.agenticSpaceId = agenticSpaceId;
            return this;
        }
        public String getAgenticSpaceId() {
            return this.agenticSpaceId;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setCreateTimeUtc(String createTimeUtc) {
            this.createTimeUtc = createTimeUtc;
            return this;
        }
        public String getCreateTimeUtc() {
            return this.createTimeUtc;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setFileCountUsage(Long fileCountUsage) {
            this.fileCountUsage = fileCountUsage;
            return this;
        }
        public Long getFileCountUsage() {
            return this.fileCountUsage;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setQuota(GetAgenticSpaceResponseBodyAgenticSpaceQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetAgenticSpaceResponseBodyAgenticSpaceQuota getQuota() {
            return this.quota;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setSpaceUsage(Long spaceUsage) {
            this.spaceUsage = spaceUsage;
            return this;
        }
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAgenticSpaceResponseBodyAgenticSpace setUpdateTimeUtc(String updateTimeUtc) {
            this.updateTimeUtc = updateTimeUtc;
            return this;
        }
        public String getUpdateTimeUtc() {
            return this.updateTimeUtc;
        }

    }

}
