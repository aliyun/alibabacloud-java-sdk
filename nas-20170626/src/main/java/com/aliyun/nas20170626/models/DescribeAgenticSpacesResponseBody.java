// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeAgenticSpacesResponseBody extends TeaModel {
    @NameInMap("AgenticSpaces")
    public DescribeAgenticSpacesResponseBodyAgenticSpaces agenticSpaces;

    /**
     * <strong>example:</strong>
     * <p>MTc2NTg1MTUyMzA1OTczNTc1OCM0NjQxMzQ****=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAgenticSpacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticSpacesResponseBody self = new DescribeAgenticSpacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticSpacesResponseBody setAgenticSpaces(DescribeAgenticSpacesResponseBodyAgenticSpaces agenticSpaces) {
        this.agenticSpaces = agenticSpaces;
        return this;
    }
    public DescribeAgenticSpacesResponseBodyAgenticSpaces getAgenticSpaces() {
        return this.agenticSpaces;
    }

    public DescribeAgenticSpacesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAgenticSpacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota extends TeaModel {
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota self = new DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace extends TeaModel {
        @NameInMap("AgenticSpaceId")
        public String agenticSpaceId;

        @NameInMap("Azone")
        public String azone;

        @NameInMap("CreateTimeUtc")
        public String createTimeUtc;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileCountUsage")
        public Long fileCountUsage;

        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        @NameInMap("Quota")
        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota quota;

        @NameInMap("SpaceUsage")
        public Long spaceUsage;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTimeUtc")
        public String updateTimeUtc;

        public static DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace self = new DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setAgenticSpaceId(String agenticSpaceId) {
            this.agenticSpaceId = agenticSpaceId;
            return this;
        }
        public String getAgenticSpaceId() {
            return this.agenticSpaceId;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setAzone(String azone) {
            this.azone = azone;
            return this;
        }
        public String getAzone() {
            return this.azone;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setCreateTimeUtc(String createTimeUtc) {
            this.createTimeUtc = createTimeUtc;
            return this;
        }
        public String getCreateTimeUtc() {
            return this.createTimeUtc;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setFileCountUsage(Long fileCountUsage) {
            this.fileCountUsage = fileCountUsage;
            return this;
        }
        public Long getFileCountUsage() {
            return this.fileCountUsage;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setQuota(DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpaceQuota getQuota() {
            return this.quota;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setSpaceUsage(Long spaceUsage) {
            this.spaceUsage = spaceUsage;
            return this;
        }
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace setUpdateTimeUtc(String updateTimeUtc) {
            this.updateTimeUtc = updateTimeUtc;
            return this;
        }
        public String getUpdateTimeUtc() {
            return this.updateTimeUtc;
        }

    }

    public static class DescribeAgenticSpacesResponseBodyAgenticSpaces extends TeaModel {
        @NameInMap("AgenticSpace")
        public java.util.List<DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace> agenticSpace;

        public static DescribeAgenticSpacesResponseBodyAgenticSpaces build(java.util.Map<String, ?> map) throws Exception {
            DescribeAgenticSpacesResponseBodyAgenticSpaces self = new DescribeAgenticSpacesResponseBodyAgenticSpaces();
            return TeaModel.build(map, self);
        }

        public DescribeAgenticSpacesResponseBodyAgenticSpaces setAgenticSpace(java.util.List<DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace> agenticSpace) {
            this.agenticSpace = agenticSpace;
            return this;
        }
        public java.util.List<DescribeAgenticSpacesResponseBodyAgenticSpacesAgenticSpace> getAgenticSpace() {
            return this.agenticSpace;
        }

    }

}
