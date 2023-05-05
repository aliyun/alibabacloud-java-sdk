// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTenantAppResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTenantAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppResponseBody self = new ListTenantAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTenantAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTenantAppResponseBody setData(java.util.List<ListTenantAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTenantAppResponseBodyData> getData() {
        return this.data;
    }

    public ListTenantAppResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTenantAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTenantAppResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTenantAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTenantAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTenantAppResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTenantAppResponseBodyData extends TeaModel {
        @NameInMap("AdminTag")
        public java.util.List<String> adminTag;

        @NameInMap("AppAdminTag")
        public String appAdminTag;

        @NameInMap("AppRegInfo")
        public String appRegInfo;

        @NameInMap("AppTag")
        public java.util.List<String> appTag;

        @NameInMap("AppUid")
        public String appUid;

        @NameInMap("AutoInstallFlag")
        public Boolean autoInstallFlag;

        @NameInMap("AutoInstallType")
        public String autoInstallType;

        @NameInMap("CateId")
        public Integer cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("ClusterUid")
        public String clusterUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("DiscountPrice")
        public Double discountPrice;

        @NameInMap("DistributeType")
        public String distributeType;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileRealName")
        public String fileRealName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HasCert")
        public Boolean hasCert;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("IconUrlInternal")
        public String iconUrlInternal;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Install")
        public Boolean install;

        @NameInMap("IsFree")
        public String isFree;

        @NameInMap("IsGame")
        public Boolean isGame;

        @NameInMap("IsWhiteList")
        public Integer isWhiteList;

        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("LicenseType")
        public String licenseType;

        @NameInMap("ManageCateEnName")
        public String manageCateEnName;

        @NameInMap("ManageCateId")
        public Integer manageCateId;

        @NameInMap("ManageCateName")
        public String manageCateName;

        @NameInMap("Name")
        public String name;

        @NameInMap("OriginAppType")
        public String originAppType;

        @NameInMap("OriginalPrice")
        public Double originalPrice;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("OwnerOs")
        public String ownerOs;

        @NameInMap("PaymentType")
        public Integer paymentType;

        @NameInMap("Price")
        public String price;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("SearchTag")
        public String searchTag;

        @NameInMap("SilenceDeleteFlag")
        public Integer silenceDeleteFlag;

        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceFlag")
        public Integer silenceFlag;

        @NameInMap("SilenceParam")
        public String silenceParam;

        @NameInMap("Size")
        public Long size;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubSourceType")
        public String subSourceType;

        @NameInMap("SubscribeCount")
        public Long subscribeCount;

        @NameInMap("SupplierId")
        public Long supplierId;

        @NameInMap("UserTag")
        public java.util.List<String> userTag;

        @NameInMap("Version")
        public String version;

        @NameInMap("VersionName")
        public String versionName;

        @NameInMap("WamFileName")
        public String wamFileName;

        @NameInMap("WamFilePath")
        public String wamFilePath;

        @NameInMap("WamFileRealName")
        public String wamFileRealName;

        @NameInMap("WamFileSize")
        public Long wamFileSize;

        public static ListTenantAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTenantAppResponseBodyData self = new ListTenantAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTenantAppResponseBodyData setAdminTag(java.util.List<String> adminTag) {
            this.adminTag = adminTag;
            return this;
        }
        public java.util.List<String> getAdminTag() {
            return this.adminTag;
        }

        public ListTenantAppResponseBodyData setAppAdminTag(String appAdminTag) {
            this.appAdminTag = appAdminTag;
            return this;
        }
        public String getAppAdminTag() {
            return this.appAdminTag;
        }

        public ListTenantAppResponseBodyData setAppRegInfo(String appRegInfo) {
            this.appRegInfo = appRegInfo;
            return this;
        }
        public String getAppRegInfo() {
            return this.appRegInfo;
        }

        public ListTenantAppResponseBodyData setAppTag(java.util.List<String> appTag) {
            this.appTag = appTag;
            return this;
        }
        public java.util.List<String> getAppTag() {
            return this.appTag;
        }

        public ListTenantAppResponseBodyData setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ListTenantAppResponseBodyData setAutoInstallFlag(Boolean autoInstallFlag) {
            this.autoInstallFlag = autoInstallFlag;
            return this;
        }
        public Boolean getAutoInstallFlag() {
            return this.autoInstallFlag;
        }

        public ListTenantAppResponseBodyData setAutoInstallType(String autoInstallType) {
            this.autoInstallType = autoInstallType;
            return this;
        }
        public String getAutoInstallType() {
            return this.autoInstallType;
        }

        public ListTenantAppResponseBodyData setCateId(Integer cateId) {
            this.cateId = cateId;
            return this;
        }
        public Integer getCateId() {
            return this.cateId;
        }

        public ListTenantAppResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public ListTenantAppResponseBodyData setClusterUid(String clusterUid) {
            this.clusterUid = clusterUid;
            return this;
        }
        public String getClusterUid() {
            return this.clusterUid;
        }

        public ListTenantAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTenantAppResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public ListTenantAppResponseBodyData setDiscountPrice(Double discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Double getDiscountPrice() {
            return this.discountPrice;
        }

        public ListTenantAppResponseBodyData setDistributeType(String distributeType) {
            this.distributeType = distributeType;
            return this;
        }
        public String getDistributeType() {
            return this.distributeType;
        }

        public ListTenantAppResponseBodyData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListTenantAppResponseBodyData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ListTenantAppResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListTenantAppResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListTenantAppResponseBodyData setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public ListTenantAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTenantAppResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListTenantAppResponseBodyData setHasCert(Boolean hasCert) {
            this.hasCert = hasCert;
            return this;
        }
        public Boolean getHasCert() {
            return this.hasCert;
        }

        public ListTenantAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public ListTenantAppResponseBodyData setIconUrlInternal(String iconUrlInternal) {
            this.iconUrlInternal = iconUrlInternal;
            return this;
        }
        public String getIconUrlInternal() {
            return this.iconUrlInternal;
        }

        public ListTenantAppResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListTenantAppResponseBodyData setInstall(Boolean install) {
            this.install = install;
            return this;
        }
        public Boolean getInstall() {
            return this.install;
        }

        public ListTenantAppResponseBodyData setIsFree(String isFree) {
            this.isFree = isFree;
            return this;
        }
        public String getIsFree() {
            return this.isFree;
        }

        public ListTenantAppResponseBodyData setIsGame(Boolean isGame) {
            this.isGame = isGame;
            return this;
        }
        public Boolean getIsGame() {
            return this.isGame;
        }

        public ListTenantAppResponseBodyData setIsWhiteList(Integer isWhiteList) {
            this.isWhiteList = isWhiteList;
            return this;
        }
        public Integer getIsWhiteList() {
            return this.isWhiteList;
        }

        public ListTenantAppResponseBodyData setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public ListTenantAppResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListTenantAppResponseBodyData setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public ListTenantAppResponseBodyData setManageCateEnName(String manageCateEnName) {
            this.manageCateEnName = manageCateEnName;
            return this;
        }
        public String getManageCateEnName() {
            return this.manageCateEnName;
        }

        public ListTenantAppResponseBodyData setManageCateId(Integer manageCateId) {
            this.manageCateId = manageCateId;
            return this;
        }
        public Integer getManageCateId() {
            return this.manageCateId;
        }

        public ListTenantAppResponseBodyData setManageCateName(String manageCateName) {
            this.manageCateName = manageCateName;
            return this;
        }
        public String getManageCateName() {
            return this.manageCateName;
        }

        public ListTenantAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTenantAppResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public ListTenantAppResponseBodyData setOriginalPrice(Double originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Double getOriginalPrice() {
            return this.originalPrice;
        }

        public ListTenantAppResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListTenantAppResponseBodyData setOwnerOs(String ownerOs) {
            this.ownerOs = ownerOs;
            return this;
        }
        public String getOwnerOs() {
            return this.ownerOs;
        }

        public ListTenantAppResponseBodyData setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Integer getPaymentType() {
            return this.paymentType;
        }

        public ListTenantAppResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public ListTenantAppResponseBodyData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListTenantAppResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListTenantAppResponseBodyData setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public ListTenantAppResponseBodyData setSearchTag(String searchTag) {
            this.searchTag = searchTag;
            return this;
        }
        public String getSearchTag() {
            return this.searchTag;
        }

        public ListTenantAppResponseBodyData setSilenceDeleteFlag(Integer silenceDeleteFlag) {
            this.silenceDeleteFlag = silenceDeleteFlag;
            return this;
        }
        public Integer getSilenceDeleteFlag() {
            return this.silenceDeleteFlag;
        }

        public ListTenantAppResponseBodyData setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public ListTenantAppResponseBodyData setSilenceFlag(Integer silenceFlag) {
            this.silenceFlag = silenceFlag;
            return this;
        }
        public Integer getSilenceFlag() {
            return this.silenceFlag;
        }

        public ListTenantAppResponseBodyData setSilenceParam(String silenceParam) {
            this.silenceParam = silenceParam;
            return this;
        }
        public String getSilenceParam() {
            return this.silenceParam;
        }

        public ListTenantAppResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListTenantAppResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListTenantAppResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListTenantAppResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTenantAppResponseBodyData setSubSourceType(String subSourceType) {
            this.subSourceType = subSourceType;
            return this;
        }
        public String getSubSourceType() {
            return this.subSourceType;
        }

        public ListTenantAppResponseBodyData setSubscribeCount(Long subscribeCount) {
            this.subscribeCount = subscribeCount;
            return this;
        }
        public Long getSubscribeCount() {
            return this.subscribeCount;
        }

        public ListTenantAppResponseBodyData setSupplierId(Long supplierId) {
            this.supplierId = supplierId;
            return this;
        }
        public Long getSupplierId() {
            return this.supplierId;
        }

        public ListTenantAppResponseBodyData setUserTag(java.util.List<String> userTag) {
            this.userTag = userTag;
            return this;
        }
        public java.util.List<String> getUserTag() {
            return this.userTag;
        }

        public ListTenantAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListTenantAppResponseBodyData setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListTenantAppResponseBodyData setWamFileName(String wamFileName) {
            this.wamFileName = wamFileName;
            return this;
        }
        public String getWamFileName() {
            return this.wamFileName;
        }

        public ListTenantAppResponseBodyData setWamFilePath(String wamFilePath) {
            this.wamFilePath = wamFilePath;
            return this;
        }
        public String getWamFilePath() {
            return this.wamFilePath;
        }

        public ListTenantAppResponseBodyData setWamFileRealName(String wamFileRealName) {
            this.wamFileRealName = wamFileRealName;
            return this;
        }
        public String getWamFileRealName() {
            return this.wamFileRealName;
        }

        public ListTenantAppResponseBodyData setWamFileSize(Long wamFileSize) {
            this.wamFileSize = wamFileSize;
            return this;
        }
        public Long getWamFileSize() {
            return this.wamFileSize;
        }

    }

}
