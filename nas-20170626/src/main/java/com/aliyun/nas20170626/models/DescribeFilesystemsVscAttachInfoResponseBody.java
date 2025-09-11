// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesystemsVscAttachInfoResponseBody extends TeaModel {
    /**
     * <p>The number of directories to return for each query.</p>
     * <p>Valid values: 10 to 1000.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Query token, which is the NextToken value returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC7C825C-5F65-4B56-BEF6-98C56C7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of associated information.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>A collection of file system and virtual channel association data.</p>
     */
    @NameInMap("VscAttachInfo")
    public DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo vscAttachInfo;

    public static DescribeFilesystemsVscAttachInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesystemsVscAttachInfoResponseBody self = new DescribeFilesystemsVscAttachInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFilesystemsVscAttachInfoResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFilesystemsVscAttachInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFilesystemsVscAttachInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFilesystemsVscAttachInfoResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeFilesystemsVscAttachInfoResponseBody setVscAttachInfo(DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo vscAttachInfo) {
        this.vscAttachInfo = vscAttachInfo;
        return this;
    }
    public DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo getVscAttachInfo() {
        return this.vscAttachInfo;
    }

    public static class DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo extends TeaModel {
        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290t15yn4uo8lid****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The association status of the file system and virtual channel. Valid values:</p>
         * <ul>
         * <li>Attaching: The association is being made.</li>
         * <li>Attached: The association is complete.</li>
         * <li>Detaching: The association is being canceled.</li>
         * <li>Detached: The association is canceled.</li>
         * <li>Failed: The association failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the virtual storage channel.</p>
         * 
         * <strong>example:</strong>
         * <p>vsc-8vb864o3ppwfvh****</p>
         */
        @NameInMap("VscId")
        public String vscId;

        public static DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo self = new DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

    }

    public static class DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo extends TeaModel {
        @NameInMap("VscAttachInfo")
        public java.util.List<DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo> vscAttachInfo;

        public static DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo self = new DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo();
            return TeaModel.build(map, self);
        }

        public DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfo setVscAttachInfo(java.util.List<DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo> vscAttachInfo) {
            this.vscAttachInfo = vscAttachInfo;
            return this;
        }
        public java.util.List<DescribeFilesystemsVscAttachInfoResponseBodyVscAttachInfoVscAttachInfo> getVscAttachInfo() {
            return this.vscAttachInfo;
        }

    }

}
