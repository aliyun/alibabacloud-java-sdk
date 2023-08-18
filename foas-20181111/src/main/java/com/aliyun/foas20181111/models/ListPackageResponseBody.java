// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListPackageResponseBody extends TeaModel {
    @NameInMap("Packages")
    public ListPackageResponseBodyPackages packages;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPackageResponseBody self = new ListPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPackageResponseBody setPackages(ListPackageResponseBodyPackages packages) {
        this.packages = packages;
        return this;
    }
    public ListPackageResponseBodyPackages getPackages() {
        return this.packages;
    }

    public ListPackageResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListPackageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPackageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPackageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListPackageResponseBodyPackagesPackage extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifyTime")
        public Long modifyTime;

        @NameInMap("OriginName")
        public String originName;

        /**
         * <p>OssBucket</p>
         */
        @NameInMap("OssBucket")
        public String ossBucket;

        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        @NameInMap("OssOwner")
        public String ossOwner;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ScanErrorMessage")
        public String scanErrorMessage;

        @NameInMap("ScanExtBizNo")
        public String scanExtBizNo;

        @NameInMap("ScanLink")
        public String scanLink;

        @NameInMap("ScanState")
        public String scanState;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Type")
        public String type;

        public static ListPackageResponseBodyPackagesPackage build(java.util.Map<String, ?> map) throws Exception {
            ListPackageResponseBodyPackagesPackage self = new ListPackageResponseBodyPackagesPackage();
            return TeaModel.build(map, self);
        }

        public ListPackageResponseBodyPackagesPackage setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPackageResponseBodyPackagesPackage setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListPackageResponseBodyPackagesPackage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPackageResponseBodyPackagesPackage setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListPackageResponseBodyPackagesPackage setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListPackageResponseBodyPackagesPackage setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListPackageResponseBodyPackagesPackage setOriginName(String originName) {
            this.originName = originName;
            return this;
        }
        public String getOriginName() {
            return this.originName;
        }

        public ListPackageResponseBodyPackagesPackage setOssBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }
        public String getOssBucket() {
            return this.ossBucket;
        }

        public ListPackageResponseBodyPackagesPackage setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public ListPackageResponseBodyPackagesPackage setOssOwner(String ossOwner) {
            this.ossOwner = ossOwner;
            return this;
        }
        public String getOssOwner() {
            return this.ossOwner;
        }

        public ListPackageResponseBodyPackagesPackage setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ListPackageResponseBodyPackagesPackage setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ListPackageResponseBodyPackagesPackage setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListPackageResponseBodyPackagesPackage setScanErrorMessage(String scanErrorMessage) {
            this.scanErrorMessage = scanErrorMessage;
            return this;
        }
        public String getScanErrorMessage() {
            return this.scanErrorMessage;
        }

        public ListPackageResponseBodyPackagesPackage setScanExtBizNo(String scanExtBizNo) {
            this.scanExtBizNo = scanExtBizNo;
            return this;
        }
        public String getScanExtBizNo() {
            return this.scanExtBizNo;
        }

        public ListPackageResponseBodyPackagesPackage setScanLink(String scanLink) {
            this.scanLink = scanLink;
            return this;
        }
        public String getScanLink() {
            return this.scanLink;
        }

        public ListPackageResponseBodyPackagesPackage setScanState(String scanState) {
            this.scanState = scanState;
            return this;
        }
        public String getScanState() {
            return this.scanState;
        }

        public ListPackageResponseBodyPackagesPackage setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListPackageResponseBodyPackagesPackage setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPackageResponseBodyPackages extends TeaModel {
        @NameInMap("Package")
        public java.util.List<ListPackageResponseBodyPackagesPackage> _package;

        public static ListPackageResponseBodyPackages build(java.util.Map<String, ?> map) throws Exception {
            ListPackageResponseBodyPackages self = new ListPackageResponseBodyPackages();
            return TeaModel.build(map, self);
        }

        public ListPackageResponseBodyPackages set_package(java.util.List<ListPackageResponseBodyPackagesPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<ListPackageResponseBodyPackagesPackage> get_package() {
            return this._package;
        }

    }

}
