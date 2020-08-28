// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DescribeDirQuotasResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("DirQuotaInfos")
    @Validation(required = true)
    public java.util.List<DescribeDirQuotasResponseDirQuotaInfos> dirQuotaInfos;

    public static DescribeDirQuotasResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDirQuotasResponse self = new DescribeDirQuotasResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDirQuotasResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDirQuotasResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeDirQuotasResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDirQuotasResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDirQuotasResponse setDirQuotaInfos(java.util.List<DescribeDirQuotasResponseDirQuotaInfos> dirQuotaInfos) {
        this.dirQuotaInfos = dirQuotaInfos;
        return this;
    }
    public java.util.List<DescribeDirQuotasResponseDirQuotaInfos> getDirQuotaInfos() {
        return this.dirQuotaInfos;
    }

    public static class DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos extends TeaModel {
        @NameInMap("UserType")
        @Validation(required = true)
        public String userType;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("QuotaType")
        @Validation(required = true)
        public String quotaType;

        @NameInMap("SizeLimit")
        @Validation(required = true)
        public Long sizeLimit;

        @NameInMap("SizeReal")
        @Validation(required = true)
        public Long sizeReal;

        @NameInMap("FileCountLimit")
        @Validation(required = true)
        public Long fileCountLimit;

        @NameInMap("FileCountReal")
        @Validation(required = true)
        public Long fileCountReal;

        public static DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos self = new DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setSizeReal(Long sizeReal) {
            this.sizeReal = sizeReal;
            return this;
        }
        public Long getSizeReal() {
            return this.sizeReal;
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos setFileCountReal(Long fileCountReal) {
            this.fileCountReal = fileCountReal;
            return this;
        }
        public Long getFileCountReal() {
            return this.fileCountReal;
        }

    }

    public static class DescribeDirQuotasResponseDirQuotaInfos extends TeaModel {
        @NameInMap("Path")
        @Validation(required = true)
        public String path;

        @NameInMap("DirInode")
        @Validation(required = true)
        public String dirInode;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("UserQuotaInfos")
        @Validation(required = true)
        public java.util.List<DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos> userQuotaInfos;

        public static DescribeDirQuotasResponseDirQuotaInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDirQuotasResponseDirQuotaInfos self = new DescribeDirQuotasResponseDirQuotaInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDirQuotasResponseDirQuotaInfos setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeDirQuotasResponseDirQuotaInfos setDirInode(String dirInode) {
            this.dirInode = dirInode;
            return this;
        }
        public String getDirInode() {
            return this.dirInode;
        }

        public DescribeDirQuotasResponseDirQuotaInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDirQuotasResponseDirQuotaInfos setUserQuotaInfos(java.util.List<DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos> userQuotaInfos) {
            this.userQuotaInfos = userQuotaInfos;
            return this;
        }
        public java.util.List<DescribeDirQuotasResponseDirQuotaInfosUserQuotaInfos> getUserQuotaInfos() {
            return this.userQuotaInfos;
        }

    }

}
