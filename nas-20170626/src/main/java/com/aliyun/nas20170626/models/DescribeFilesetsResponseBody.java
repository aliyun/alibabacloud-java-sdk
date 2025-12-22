// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeFilesetsResponseBody extends TeaModel {
    /**
     * <p>The fileset information.</p>
     */
    @NameInMap("Entries")
    public DescribeFilesetsResponseBodyEntries entries;

    /**
     * <p>The ID of the file system.</p>
     * <ul>
     * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c\<em>\</em>\<em>\</em>.</li>
     * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>bmcpfs-290w65p03ok64ya****</p>
     */
    @NameInMap("FileSystemId")
    @Deprecated
    public String fileSystemId;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
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
     * <p>2D69A58F-345C-4FDE-88E4-BF518948****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFilesetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilesetsResponseBody self = new DescribeFilesetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFilesetsResponseBody setEntries(DescribeFilesetsResponseBodyEntries entries) {
        this.entries = entries;
        return this;
    }
    public DescribeFilesetsResponseBodyEntries getEntries() {
        return this.entries;
    }

    @Deprecated
    public DescribeFilesetsResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFilesetsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFilesetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFilesetsResponseBodyEntriesEntrieQuota extends TeaModel {
        /**
         * <p>The file quantity quota. Valid values:</p>
         * <ul>
         * <li>Minimum value: 10000.</li>
         * <li>Maximum value: 10000000000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>The capacity quota. Unit: bytes.</p>
         * <ul>
         * <li>Minimum value: 10737418240 (10 GiB).</li>
         * <li>Step size: 1073741824 (1 GiB).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10737418240</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static DescribeFilesetsResponseBodyEntriesEntrieQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsResponseBodyEntriesEntrieQuota self = new DescribeFilesetsResponseBodyEntriesEntrieQuota();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsResponseBodyEntriesEntrieQuota setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public DescribeFilesetsResponseBodyEntriesEntrieQuota setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

    public static class DescribeFilesetsResponseBodyEntriesEntrie extends TeaModel {
        /**
         * <p>The time when the fileset was created.</p>
         * <p>The time follows the ISO 8601 standard in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T10:08:08Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Specifies whether to enable deletion protection to allow you to release the fileset by using the console or by calling the <a href="https://help.aliyun.com/document_detail/2402263.html">DeleteFileset</a> operation. Valid values:</p>
         * <ul>
         * <li>true: enables release protection.</li>
         * <li>false: disables release protection.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter can protect filesets only against manual releases, but not against automatic releases.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DeletionProtection")
        public Boolean deletionProtection;

        /**
         * <p>The fileset description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The usage of the file quantity.</p>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.7.0 and later support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("FileCountUsage")
        public Long fileCountUsage;

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c\<em>\</em>\<em>\</em>.</li>
         * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya\<em>\</em>\<em>\</em>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290w65p03ok64ya****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>The fileset path.</p>
         * 
         * <strong>example:</strong>
         * <p>pathtoroot/fset</p>
         */
        @NameInMap("FileSystemPath")
        public String fileSystemPath;

        /**
         * <p>The fileset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        @NameInMap("FsetId")
        public String fsetId;

        /**
         * <p>The quota information.</p>
         * <blockquote>
         * <p> Only CPFS for Lingjun V2.7.0 and later support this parameter.</p>
         * </blockquote>
         */
        @NameInMap("Quota")
        public DescribeFilesetsResponseBodyEntriesEntrieQuota quota;

        /**
         * <p>The capacity usage. Unit: bytes.</p>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.7.0 and later support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SpaceUsage")
        public Long spaceUsage;

        /**
         * <p>The fileset status. Valid values:</p>
         * <ul>
         * <li>CREATING: The fileset is being created.</li>
         * <li>CREATED: The fileset has been created and is running properly.</li>
         * <li>RELEASING: The fileset is being released.</li>
         * <li>RELEASED: The fileset has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the fileset was last updated.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T10:08:08Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeFilesetsResponseBodyEntriesEntrie build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsResponseBodyEntriesEntrie self = new DescribeFilesetsResponseBodyEntriesEntrie();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setDeletionProtection(Boolean deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Boolean getDeletionProtection() {
            return this.deletionProtection;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setFileCountUsage(Long fileCountUsage) {
            this.fileCountUsage = fileCountUsage;
            return this;
        }
        public Long getFileCountUsage() {
            return this.fileCountUsage;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setFileSystemPath(String fileSystemPath) {
            this.fileSystemPath = fileSystemPath;
            return this;
        }
        public String getFileSystemPath() {
            return this.fileSystemPath;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setFsetId(String fsetId) {
            this.fsetId = fsetId;
            return this;
        }
        public String getFsetId() {
            return this.fsetId;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setQuota(DescribeFilesetsResponseBodyEntriesEntrieQuota quota) {
            this.quota = quota;
            return this;
        }
        public DescribeFilesetsResponseBodyEntriesEntrieQuota getQuota() {
            return this.quota;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setSpaceUsage(Long spaceUsage) {
            this.spaceUsage = spaceUsage;
            return this;
        }
        public Long getSpaceUsage() {
            return this.spaceUsage;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeFilesetsResponseBodyEntriesEntrie setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeFilesetsResponseBodyEntries extends TeaModel {
        @NameInMap("Entrie")
        public java.util.List<DescribeFilesetsResponseBodyEntriesEntrie> entrie;

        public static DescribeFilesetsResponseBodyEntries build(java.util.Map<String, ?> map) throws Exception {
            DescribeFilesetsResponseBodyEntries self = new DescribeFilesetsResponseBodyEntries();
            return TeaModel.build(map, self);
        }

        public DescribeFilesetsResponseBodyEntries setEntrie(java.util.List<DescribeFilesetsResponseBodyEntriesEntrie> entrie) {
            this.entrie = entrie;
            return this;
        }
        public java.util.List<DescribeFilesetsResponseBodyEntriesEntrie> getEntrie() {
            return this.entrie;
        }

    }

}
