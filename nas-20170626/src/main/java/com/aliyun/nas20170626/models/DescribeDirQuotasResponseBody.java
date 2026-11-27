// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasResponseBody extends TeaModel {
    /**
     * <p>The quota information for each directory.</p>
     */
    @NameInMap("DirQuotaInfos")
    public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> dirQuotaInfos;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of directories per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5BC5CB97-9F28-42FE-84A4-0CD0DF42****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of directories.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDirQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirQuotasResponseBody self = new DescribeDirQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirQuotasResponseBody setDirQuotaInfos(java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> dirQuotaInfos) {
        this.dirQuotaInfos = dirQuotaInfos;
        return this;
    }
    public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> getDirQuotaInfos() {
        return this.dirQuotaInfos;
    }

    public DescribeDirQuotasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDirQuotasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDirQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDirQuotasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos extends TeaModel {
        /**
         * <p>The limit on the number of files for the user in the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>The actual number of files for the user in the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>5100</p>
         */
        @NameInMap("FileCountReal")
        public Long fileCountReal;

        /**
         * <p>The quota type. Valid values:</p>
         * <ul>
         * <li>Accounting: statistical quota.</li>
         * <li>Enforcement: restriction quota.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Accounting</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>The limit on the total size of files for the user in the directory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        /**
         * <p>The actual total size of files for the user in the directory. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("SizeReal")
        public Long sizeReal;

        /**
         * <p>The actual total size of files for the user in the directory. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>858995833870</p>
         */
        @NameInMap("SizeRealInByte")
        public Long sizeRealInByte;

        /**
         * <p>The UID or GID to which the quota applies. The value depends on the UserType parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The type of the user ID. Valid values:</p>
         * <ul>
         * <li>Uid: The user ID is a UID. If this value is returned, the UserId parameter has a value.</li>
         * <li>Gid: The user ID is a GID. If this value is returned, the UserId parameter has a value.</li>
         * <li>AllUsers: The quota applies to all users. If this value is returned, the UserId parameter is empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Uid</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos self = new DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setFileCountReal(Long fileCountReal) {
            this.fileCountReal = fileCountReal;
            return this;
        }
        public Long getFileCountReal() {
            return this.fileCountReal;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setSizeReal(Long sizeReal) {
            this.sizeReal = sizeReal;
            return this;
        }
        public Long getSizeReal() {
            return this.sizeReal;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setSizeRealInByte(Long sizeRealInByte) {
            this.sizeRealInByte = sizeRealInByte;
            return this;
        }
        public Long getSizeRealInByte() {
            return this.sizeRealInByte;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class DescribeDirQuotasResponseBodyDirQuotaInfos extends TeaModel {
        /**
         * <p>The inode number of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1123</p>
         */
        @NameInMap("DirInode")
        public String dirInode;

        /**
         * <p>The absolute path of the directory in the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/sub1</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The statistical status of the directory. Valid values:</p>
         * <ul>
         * <li>Initializing: The directory is being initialized.</li>
         * <li>Normal: The directory is in a normal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The quota information for each user.</p>
         */
        @NameInMap("UserQuotaInfos")
        public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos> userQuotaInfos;

        public static DescribeDirQuotasResponseBodyDirQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirQuotasResponseBodyDirQuotaInfos self = new DescribeDirQuotasResponseBodyDirQuotaInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setDirInode(String dirInode) {
            this.dirInode = dirInode;
            return this;
        }
        public String getDirInode() {
            return this.dirInode;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setUserQuotaInfos(java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos> userQuotaInfos) {
            this.userQuotaInfos = userQuotaInfos;
            return this;
        }
        public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos> getUserQuotaInfos() {
            return this.userQuotaInfos;
        }

    }

}
