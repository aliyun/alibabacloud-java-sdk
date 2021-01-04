// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("DirQuotaInfos")
    public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> dirQuotaInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeDirQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirQuotasResponseBody self = new DescribeDirQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDirQuotasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDirQuotasResponseBody setDirQuotaInfos(java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> dirQuotaInfos) {
        this.dirQuotaInfos = dirQuotaInfos;
        return this;
    }
    public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfos> getDirQuotaInfos() {
        return this.dirQuotaInfos;
    }

    public DescribeDirQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDirQuotasResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDirQuotasResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos extends TeaModel {
        @NameInMap("FileCountReal")
        public Long fileCountReal;

        @NameInMap("UserType")
        public String userType;

        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("SizeLimit")
        public Long sizeLimit;

        @NameInMap("QuotaType")
        public String quotaType;

        @NameInMap("SizeReal")
        public Long sizeReal;

        public static DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos self = new DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setFileCountReal(Long fileCountReal) {
            this.fileCountReal = fileCountReal;
            return this;
        }
        public Long getFileCountReal() {
            return this.fileCountReal;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos setSizeReal(Long sizeReal) {
            this.sizeReal = sizeReal;
            return this;
        }
        public Long getSizeReal() {
            return this.sizeReal;
        }

    }

    public static class DescribeDirQuotasResponseBodyDirQuotaInfos extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Path")
        public String path;

        @NameInMap("DirInode")
        public String dirInode;

        @NameInMap("UserQuotaInfos")
        public java.util.List<DescribeDirQuotasResponseBodyDirQuotaInfosUserQuotaInfos> userQuotaInfos;

        public static DescribeDirQuotasResponseBodyDirQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirQuotasResponseBodyDirQuotaInfos self = new DescribeDirQuotasResponseBodyDirQuotaInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDirQuotasResponseBodyDirQuotaInfos setDirInode(String dirInode) {
            this.dirInode = dirInode;
            return this;
        }
        public String getDirInode() {
            return this.dirInode;
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
