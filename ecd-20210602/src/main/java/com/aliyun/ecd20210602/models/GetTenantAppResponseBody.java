// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetTenantAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTenantAppResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetTenantAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTenantAppResponseBody self = new GetTenantAppResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTenantAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTenantAppResponseBody setData(GetTenantAppResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTenantAppResponseBodyData getData() {
        return this.data;
    }

    public GetTenantAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTenantAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTenantAppResponseBodyData extends TeaModel {
        @NameInMap("AppRegInfo")
        public String appRegInfo;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("CateName")
        public String cateName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("Developer")
        public String developer;

        @NameInMap("DiscountPrice")
        public Long discountPrice;

        @NameInMap("DistributeType")
        public String distributeType;

        @NameInMap("ExecuteFile")
        public String executeFile;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("FileRealName")
        public String fileRealName;

        @NameInMap("HasCert")
        public Boolean hasCert;

        @NameInMap("IconUrl")
        public String iconUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsFree")
        public String isFree;

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
        public Long originalPrice;

        @NameInMap("OssAppUrl")
        public String ossAppUrl;

        @NameInMap("Price")
        public String price;

        @NameInMap("PublishDate")
        public String publishDate;

        @NameInMap("PublishType")
        public String publishType;

        @NameInMap("SearchTag")
        public String searchTag;

        @NameInMap("SilenceDeleteFlag")
        public Long silenceDeleteFlag;

        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        @NameInMap("SilenceFlag")
        public Long silenceFlag;

        @NameInMap("SilenceParam")
        public String silenceParam;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("Version")
        public String version;

        @NameInMap("WebUrl")
        public String webUrl;

        public static GetTenantAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantAppResponseBodyData self = new GetTenantAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantAppResponseBodyData setAppRegInfo(String appRegInfo) {
            this.appRegInfo = appRegInfo;
            return this;
        }
        public String getAppRegInfo() {
            return this.appRegInfo;
        }

        public GetTenantAppResponseBodyData setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public GetTenantAppResponseBodyData setCateName(String cateName) {
            this.cateName = cateName;
            return this;
        }
        public String getCateName() {
            return this.cateName;
        }

        public GetTenantAppResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTenantAppResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetTenantAppResponseBodyData setDeveloper(String developer) {
            this.developer = developer;
            return this;
        }
        public String getDeveloper() {
            return this.developer;
        }

        public GetTenantAppResponseBodyData setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public GetTenantAppResponseBodyData setDistributeType(String distributeType) {
            this.distributeType = distributeType;
            return this;
        }
        public String getDistributeType() {
            return this.distributeType;
        }

        public GetTenantAppResponseBodyData setExecuteFile(String executeFile) {
            this.executeFile = executeFile;
            return this;
        }
        public String getExecuteFile() {
            return this.executeFile;
        }

        public GetTenantAppResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetTenantAppResponseBodyData setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetTenantAppResponseBodyData setFileRealName(String fileRealName) {
            this.fileRealName = fileRealName;
            return this;
        }
        public String getFileRealName() {
            return this.fileRealName;
        }

        public GetTenantAppResponseBodyData setHasCert(Boolean hasCert) {
            this.hasCert = hasCert;
            return this;
        }
        public Boolean getHasCert() {
            return this.hasCert;
        }

        public GetTenantAppResponseBodyData setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }
        public String getIconUrl() {
            return this.iconUrl;
        }

        public GetTenantAppResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTenantAppResponseBodyData setIsFree(String isFree) {
            this.isFree = isFree;
            return this;
        }
        public String getIsFree() {
            return this.isFree;
        }

        public GetTenantAppResponseBodyData setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public GetTenantAppResponseBodyData setManageCateEnName(String manageCateEnName) {
            this.manageCateEnName = manageCateEnName;
            return this;
        }
        public String getManageCateEnName() {
            return this.manageCateEnName;
        }

        public GetTenantAppResponseBodyData setManageCateId(Integer manageCateId) {
            this.manageCateId = manageCateId;
            return this;
        }
        public Integer getManageCateId() {
            return this.manageCateId;
        }

        public GetTenantAppResponseBodyData setManageCateName(String manageCateName) {
            this.manageCateName = manageCateName;
            return this;
        }
        public String getManageCateName() {
            return this.manageCateName;
        }

        public GetTenantAppResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTenantAppResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public GetTenantAppResponseBodyData setOriginalPrice(Long originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Long getOriginalPrice() {
            return this.originalPrice;
        }

        public GetTenantAppResponseBodyData setOssAppUrl(String ossAppUrl) {
            this.ossAppUrl = ossAppUrl;
            return this;
        }
        public String getOssAppUrl() {
            return this.ossAppUrl;
        }

        public GetTenantAppResponseBodyData setPrice(String price) {
            this.price = price;
            return this;
        }
        public String getPrice() {
            return this.price;
        }

        public GetTenantAppResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public GetTenantAppResponseBodyData setPublishType(String publishType) {
            this.publishType = publishType;
            return this;
        }
        public String getPublishType() {
            return this.publishType;
        }

        public GetTenantAppResponseBodyData setSearchTag(String searchTag) {
            this.searchTag = searchTag;
            return this;
        }
        public String getSearchTag() {
            return this.searchTag;
        }

        public GetTenantAppResponseBodyData setSilenceDeleteFlag(Long silenceDeleteFlag) {
            this.silenceDeleteFlag = silenceDeleteFlag;
            return this;
        }
        public Long getSilenceDeleteFlag() {
            return this.silenceDeleteFlag;
        }

        public GetTenantAppResponseBodyData setSilenceDeleteParam(String silenceDeleteParam) {
            this.silenceDeleteParam = silenceDeleteParam;
            return this;
        }
        public String getSilenceDeleteParam() {
            return this.silenceDeleteParam;
        }

        public GetTenantAppResponseBodyData setSilenceFlag(Long silenceFlag) {
            this.silenceFlag = silenceFlag;
            return this;
        }
        public Long getSilenceFlag() {
            return this.silenceFlag;
        }

        public GetTenantAppResponseBodyData setSilenceParam(String silenceParam) {
            this.silenceParam = silenceParam;
            return this;
        }
        public String getSilenceParam() {
            return this.silenceParam;
        }

        public GetTenantAppResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetTenantAppResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTenantAppResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetTenantAppResponseBodyData setWebUrl(String webUrl) {
            this.webUrl = webUrl;
            return this;
        }
        public String getWebUrl() {
            return this.webUrl;
        }

    }

}
