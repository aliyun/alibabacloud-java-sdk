// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasResponseBody extends TeaModel {
    /**
     * <p>The queried directory quotas.</p>
     */
    @NameInMap("DirQuotaInfos")
    public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> dirQuotaInfos;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of directories.</p>
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
         * <p>The maximum number of files that a user can create in the directory.</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>The total number of files that a user has created in the directory.</p>
         */
        @NameInMap("FileCountReal")
        public Long fileCountReal;

        /**
         * <p>The type of the quota. Valid values: Accounting and Enforcement.</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>The maximum size of files that a user can create in the directory. Unit: GiB.</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        /**
         * <p>The total size of files that a user has created in the directory. Unit: GiB.</p>
         */
        @NameInMap("SizeReal")
        public Long sizeReal;

        @NameInMap("SizeRealInByte")
        public Long sizeRealInByte;

        /**
         * <p>The ID of the user that you specify to create a quota for the directory. The value depends on the value of the UserType parameter. Valid values: Uid and Gid.</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The type of the user ID. Valid values: Uid, Gid, and AllUsers.</p>
         * <br>
         * <p>*   If the parameter is set to Uid or Gid, the value of the UserId parameter is returned.</p>
         * <p>*   If the parameter is set to AllUsers, the value of the UserID parameter is empty.</p>
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
         */
        @NameInMap("DirInode")
        public String dirInode;

        /**
         * <p>The absolute path of a directory.</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The status of the quota created for the directory. Valid values: Initializing and Normal. The Initializing state indicates that the quota is being created. The Normal state indicates that the quota is created.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The information about quotas for all users.</p>
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
