// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetEffectiveImageByIdResponseBody extends TeaModel {
    /**
     * <p>The status code returned by the API. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The image information returned by the query.</p>
     * 
     * <strong>example:</strong>
     * <p>Object</p>
     */
    @NameInMap("Data")
    public GetEffectiveImageByIdResponseBodyData data;

    /**
     * <p>The message returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>50158E8B-992E-1286-B174-**********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values: true: Successful. false: Failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetEffectiveImageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEffectiveImageByIdResponseBody self = new GetEffectiveImageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEffectiveImageByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEffectiveImageByIdResponseBody setData(GetEffectiveImageByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEffectiveImageByIdResponseBodyData getData() {
        return this.data;
    }

    public GetEffectiveImageByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEffectiveImageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEffectiveImageByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList extends TeaModel {
        /**
         * <p>The adapter ID.</p>
         * 
         * <strong>example:</strong>
         * <p>adt-13ff3****</p>
         */
        @NameInMap("AdaptorId")
        public String adaptorId;

        /**
         * <p>The adaptor message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("AdaptorMessage")
        public String adaptorMessage;

        /**
         * <p>The adaptation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("AdaptorMode")
        public String adaptorMode;

        /**
         * <p>The adaptation phase.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISH_ADAPT</p>
         */
        @NameInMap("AdaptorStep")
        public String adaptorStep;

        /**
         * <p>The application icon.</p>
         * 
         * <strong>example:</strong>
         * <p>https://****.jpg</p>
         */
        @NameInMap("AppIconUrl")
        public String appIconUrl;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-0aae4rgle910jh689</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>idb-ent-console</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The application script.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param&quot;:&quot;test&quot;, &quot;startCmd&quot;:&quot;test.exe&quot;}</p>
         */
        @NameInMap("AppScript")
        public String appScript;

        /**
         * <p>The application type.</p>
         * 
         * <strong>example:</strong>
         * <p>USER_APP</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The application version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-****</p>
         */
        @NameInMap("AppVersionId")
        public String appVersionId;

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("AppVersionName")
        public String appVersionName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("AppVersionNumber")
        public String appVersionNumber;

        /**
         * <p>The business line ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <p>The name of the OSS bucket where the application files are located.</p>
         * 
         * <strong>example:</strong>
         * <p>xiaowutest-j</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The level-2 application category, such as design software, office, and browsers. This parameter is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The level-1 application category, such as cloud applications and cloud games. This parameter is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <p>The control parameters that can be configured by tenants and administrators. This parameter is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ControlParam")
        public String controlParam;

        /**
         * <p>The path of the executable file. This parameter is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.text</p>
         */
        @NameInMap("ExecuteFileAddress")
        public String executeFileAddress;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>filename_install.exe</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/tenant/123</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The file size. Unit: KB.</p>
         * 
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The optimization parameters configured in the backend by administrators.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("OptimizeParam")
        public String optimizeParam;

        /**
         * <p>The original application type.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_BASE</p>
         */
        @NameInMap("OriginAppType")
        public String originAppType;

        /**
         * <p>The operating system type applicable to the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The application service port. For applications that require port-based access, specify the actual port number that the application listens on.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("Port")
        public String port;

        /**
         * <p>The product type of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The runtime environment.</p>
         * 
         * <strong>example:</strong>
         * <p>WINDOWS_MULTI_SESSION</p>
         */
        @NameInMap("RuntimeEnv")
        public String runtimeEnv;

        /**
         * <p>Specifies whether silent installation is enabled. This parameter can be configured by tenants and administrators, but is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SilenceFlag")
        public String silenceFlag;

        /**
         * <p>The silent installation parameters. This parameter is not available to the public.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SilenceParam")
        public String silenceParam;

        /**
         * <p>The application adaptation status. For example, ADAPT_DONE indicates that the adaptation is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>ADAPT_DONE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The sub-application type.</p>
         * 
         * <strong>example:</strong>
         * <p>SAAS</p>
         */
        @NameInMap("SubAppType")
        public String subAppType;

        /**
         * <p>The URL path suffix for application access. This suffix and the application service port together describe the access entry point.</p>
         * 
         * <strong>example:</strong>
         * <p>/index</p>
         */
        @NameInMap("UrlSuffix")
        public String urlSuffix;

        public static GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList self = new GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAdaptorId(String adaptorId) {
            this.adaptorId = adaptorId;
            return this;
        }
        public String getAdaptorId() {
            return this.adaptorId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAdaptorMessage(String adaptorMessage) {
            this.adaptorMessage = adaptorMessage;
            return this;
        }
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAdaptorMode(String adaptorMode) {
            this.adaptorMode = adaptorMode;
            return this;
        }
        public String getAdaptorMode() {
            return this.adaptorMode;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAdaptorStep(String adaptorStep) {
            this.adaptorStep = adaptorStep;
            return this;
        }
        public String getAdaptorStep() {
            return this.adaptorStep;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setControlParam(String controlParam) {
            this.controlParam = controlParam;
            return this;
        }
        public String getControlParam() {
            return this.controlParam;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setExecuteFileAddress(String executeFileAddress) {
            this.executeFileAddress = executeFileAddress;
            return this;
        }
        public String getExecuteFileAddress() {
            return this.executeFileAddress;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setOptimizeParam(String optimizeParam) {
            this.optimizeParam = optimizeParam;
            return this;
        }
        public String getOptimizeParam() {
            return this.optimizeParam;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setRuntimeEnv(String runtimeEnv) {
            this.runtimeEnv = runtimeEnv;
            return this;
        }
        public String getRuntimeEnv() {
            return this.runtimeEnv;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setSilenceFlag(String silenceFlag) {
            this.silenceFlag = silenceFlag;
            return this;
        }
        public String getSilenceFlag() {
            return this.silenceFlag;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setSilenceParam(String silenceParam) {
            this.silenceParam = silenceParam;
            return this;
        }
        public String getSilenceParam() {
            return this.silenceParam;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList setUrlSuffix(String urlSuffix) {
            this.urlSuffix = urlSuffix;
            return this;
        }
        public String getUrlSuffix() {
            return this.urlSuffix;
        }

    }

    public static class GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList extends TeaModel {
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-0aae4rxw78****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>idb-ent-console</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList self = new GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel extends TeaModel {
        /**
         * <p>The size of the data cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        /**
         * <p>The GPU category.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GpuCategory")
        public Integer gpuCategory;

        /**
         * <p>The GPU driver version.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("GpuDriverVersion")
        public String gpuDriverVersion;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel self = new GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel setGpuCategory(Integer gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Integer getGpuCategory() {
            return this.gpuCategory;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute extends TeaModel {
        /**
         * <p>The processing information reported by the region distribution task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The distribution progress of the image in the region, expressed as a percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The ID of the region where the image is distributed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region distribution status. Valid values: CREATING: distributing. AVAILABLE: available. CREATE_FAILED: distribution failed. DELETE: deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The logical ID of the image on the unit side, which can be different from the central image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-1bdedef****</p>
         */
        @NameInMap("UnitImageId")
        public String unitImageId;

        public static GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute self = new GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute setUnitImageId(String unitImageId) {
            this.unitImageId = unitImageId;
            return this;
        }
        public String getUnitImageId() {
            return this.unitImageId;
        }

    }

    public static class GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList extends TeaModel {
        /**
         * <p>The list of adapted applications for the image version.</p>
         */
        @NameInMap("AdaptorInfoBOList")
        public java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList> adaptorInfoBOList;

        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for a system image is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>13605346******</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The application list, which displays only the application names and IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("AppList")
        public java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList> appList;

        /**
         * <p>The base image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-dewgefwc******</p>
         */
        @NameInMap("BaseImageId")
        public String baseImageId;

        /**
         * <p>The base image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-adbef134****</p>
         */
        @NameInMap("BaseImageVersion")
        public String baseImageVersion;

        /**
         * <p>The business line to which the image belongs. 1: basic business. 2: Personal Edition. 3: Cloud Office. 4: Cloud Streaming. 10: Standard Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <p>The name of the OSS bucket where the image file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>monitor-record-sh-twg2is</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The image description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is test image</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of feature tags supported by the image.</p>
         */
        @NameInMap("FeatureList")
        public java.util.List<String> featureList;

        /**
         * <p>The FOTA version.</p>
         * 
         * <strong>example:</strong>
         * <p>3.0.11-R-20260624.195825</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The creation time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-12T13:01:09Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-16T07:39:43Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The image creation method. For example, BUILDER_MANUAL indicates manual creation.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILDER_MANUAL</p>
         */
        @NameInMap("ImageCreateMode")
        public String imageCreateMode;

        /**
         * <p>The image extended information, including disk specifications and GPU driver information. VHD or Container images use the extended information of their base image and base version.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ImageExtendInfoModel")
        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel imageExtendInfoModel;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-0aae4rgk5yaa*****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>image0625</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image distribution information for the current region.</p>
         */
        @NameInMap("ImageRegionDistribute")
        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute imageRegionDistribute;

        /**
         * <p>The image source. For example, center indicates the central image service.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("ImageSource")
        public String imageSource;

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>System: system images.</li>
         * <li>User: custom images.</li>
         * <li>Shared: shared images.</li>
         * <li>Community: community images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The image language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The ID of the latest version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-1wder3ere****</p>
         */
        @NameInMap("LatestVersionId")
        public String latestVersionId;

        /**
         * <p>Indicates whether the returned version is the online version. Valid values: true: Yes. false: No.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnlineVersion")
        public Boolean onlineVersion;

        /**
         * <p>The ID of the current online version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-1wder3ere****</p>
         */
        @NameInMap("OnlineVersionId")
        public String onlineVersionId;

        /**
         * <p>The operating system type of the image. Windows: Windows system. Linux: Linux system. Android: Android system. Unknown: unknown system.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The image packaging type. Ecs: ECS image. Vhd: virtual disk image. Container: container image. Ecs_Container: combined ECS and container image. K8s_Node: Kubernetes node image.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The parent image ID, which indicates the image inheritance relationship. System images do not have parent images.</p>
         * 
         * <strong>example:</strong>
         * <p>desktopimage-windows-11-64-asp</p>
         */
        @NameInMap("ParentImageId")
        public String parentImageId;

        /**
         * <p>The parent image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-12ededgjj***</p>
         */
        @NameInMap("ParentImageVersion")
        public String parentImageVersion;

        /**
         * <p>The operating system platform ID. For example, 33 indicates Windows Server 2022.</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("Platform")
        public Integer platform;

        /**
         * <p>The operating system platform name, which corresponds to Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows Server 2022</p>
         */
        @NameInMap("PlatformName")
        public String platformName;

        /**
         * <p>The product type to which the image belongs, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), and WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The extended properties of the image version in key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("PropertyMap")
        public java.util.Map<String, String> propertyMap;

        /**
         * <p>The connection protocol used by the image. ASP: Alibaba Cloud Streaming Protocol. HDX: HDX protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The ID of the region to which the image information belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The image status. INIT: initializing. CREATING: creating. AVAILABLE: available. CREATE_FAILED: creation failed. DELETE: deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList self = new GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setAdaptorInfoBOList(java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList> adaptorInfoBOList) {
            this.adaptorInfoBOList = adaptorInfoBOList;
            return this;
        }
        public java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAdaptorInfoBOList> getAdaptorInfoBOList() {
            return this.adaptorInfoBOList;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setAppList(java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListAppList> getAppList() {
            return this.appList;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setBaseImageId(String baseImageId) {
            this.baseImageId = baseImageId;
            return this;
        }
        public String getBaseImageId() {
            return this.baseImageId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setBaseImageVersion(String baseImageVersion) {
            this.baseImageVersion = baseImageVersion;
            return this;
        }
        public String getBaseImageVersion() {
            return this.baseImageVersion;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setFeatureList(java.util.List<String> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setFotaVersion(String fotaVersion) {
            this.fotaVersion = fotaVersion;
            return this;
        }
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageCreateMode(String imageCreateMode) {
            this.imageCreateMode = imageCreateMode;
            return this;
        }
        public String getImageCreateMode() {
            return this.imageCreateMode;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageExtendInfoModel(GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel imageExtendInfoModel) {
            this.imageExtendInfoModel = imageExtendInfoModel;
            return this;
        }
        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageExtendInfoModel getImageExtendInfoModel() {
            return this.imageExtendInfoModel;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageRegionDistribute(GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute imageRegionDistribute) {
            this.imageRegionDistribute = imageRegionDistribute;
            return this;
        }
        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelListImageRegionDistribute getImageRegionDistribute() {
            return this.imageRegionDistribute;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setOnlineVersion(Boolean onlineVersion) {
            this.onlineVersion = onlineVersion;
            return this;
        }
        public Boolean getOnlineVersion() {
            return this.onlineVersion;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setOnlineVersionId(String onlineVersionId) {
            this.onlineVersionId = onlineVersionId;
            return this;
        }
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setParentImageId(String parentImageId) {
            this.parentImageId = parentImageId;
            return this;
        }
        public String getParentImageId() {
            return this.parentImageId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setParentImageVersion(String parentImageVersion) {
            this.parentImageVersion = parentImageVersion;
            return this;
        }
        public String getParentImageVersion() {
            return this.parentImageVersion;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setPlatform(Integer platform) {
            this.platform = platform;
            return this;
        }
        public Integer getPlatform() {
            return this.platform;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setPropertyMap(java.util.Map<String, String> propertyMap) {
            this.propertyMap = propertyMap;
            return this;
        }
        public java.util.Map<String, String> getPropertyMap() {
            return this.propertyMap;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetEffectiveImageByIdResponseBodyDataTagList extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>inner</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetEffectiveImageByIdResponseBodyDataTagList build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyDataTagList self = new GetEffectiveImageByIdResponseBodyDataTagList();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyDataTagList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetEffectiveImageByIdResponseBodyDataTagList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetEffectiveImageByIdResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for a system image is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The business line to which the image belongs. 1: basic business. 2: Personal Edition. 3: Cloud Office. 4: Cloud Streaming. 10: Standard Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <p>The image description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The description document of the image in Markdown format.</p>
         * 
         * <strong>example:</strong>
         * <h2>this is a test document</h2>
         */
        @NameInMap("Document")
        public String document;

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>eid-***</p>
         */
        @NameInMap("EnvironmentId")
        public String environmentId;

        /**
         * <p>The creation time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-10T01:33:37Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time. The time is in RFC 3339 format. The Z in the example indicates the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-11T02:19:27Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The URL of the image icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.jpg">https://xxx.jpg</a></p>
         */
        @NameInMap("ImageIconUrl")
        public String imageIconUrl;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>img-bp1234567890abcde</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The details of the image versions that actually take effect in each region. For the same region, the configured newer version takes precedence.</p>
         */
        @NameInMap("ImageInfoRegionModelList")
        public java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList> imageInfoRegionModelList;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoImage</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The list of region IDs supported by the image.</p>
         */
        @NameInMap("ImageRegionList")
        public java.util.List<String> imageRegionList;

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>System: system images.</li>
         * <li>User: custom images.</li>
         * <li>Shared: shared images.</li>
         * <li>Community: community images.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The ID of the latest version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("LatestVersionId")
        public String latestVersionId;

        /**
         * <p>The data cloud disk size of the online version. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OnlineVersionDataDiskSize")
        public Integer onlineVersionDataDiskSize;

        /**
         * <p>The ID of the current online version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxxx</p>
         */
        @NameInMap("OnlineVersionId")
        public String onlineVersionId;

        /**
         * <p>The system cloud disk size of the online version. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("OnlineVersionSystemDiskSize")
        public Integer onlineVersionSystemDiskSize;

        /**
         * <p>Indicates whether disk encryption is enabled for the online version. Valid values: true: Enabled. false: Disabled.</p>
         */
        @NameInMap("OnlineVersionVolumeEncryptionEnabled")
        public Boolean onlineVersionVolumeEncryptionEnabled;

        /**
         * <p>The KMS key ID used when disk encryption is enabled for the online version.</p>
         * 
         * <strong>example:</strong>
         * <p>a7b3c0c8-xxxx</p>
         */
        @NameInMap("OnlineVersionVolumeEncryptionKey")
        public String onlineVersionVolumeEncryptionKey;

        /**
         * <p>The operating system type of the image. Windows: Windows system. Linux: Linux system. Android: Android system. Unknown: unknown system.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The image packaging type. Ecs: ECS image. Vhd: virtual disk image. Container: container image. Ecs_Container: combined ECS and container image. K8s_Node: Kubernetes node image.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The parent image ID, which indicates the image inheritance relationship. System images do not have parent images.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxx</p>
         */
        @NameInMap("ParentImageId")
        public String parentImageId;

        /**
         * <p>The product type to which the image belongs, such as CloudDesktop (Cloud Desktop), CloudApp (Cloud App), and WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The connection protocol used by the image. ASP: Alibaba Cloud Streaming Protocol. HDX: HDX protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The rating score of the image, with a maximum score of 100.</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("Rating")
        public Integer rating;

        /**
         * <p>The image status. INIT: initializing. CREATING: creating. AVAILABLE: available. CREATE_FAILED: creation failed. DELETE: deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of image tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<GetEffectiveImageByIdResponseBodyDataTagList> tagList;

        /**
         * <p>The image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-agde4****</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetEffectiveImageByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEffectiveImageByIdResponseBodyData self = new GetEffectiveImageByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEffectiveImageByIdResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetEffectiveImageByIdResponseBodyData setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public GetEffectiveImageByIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEffectiveImageByIdResponseBodyData setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetEffectiveImageByIdResponseBodyData setEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public String getEnvironmentId() {
            return this.environmentId;
        }

        public GetEffectiveImageByIdResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEffectiveImageByIdResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEffectiveImageByIdResponseBodyData setImageIconUrl(String imageIconUrl) {
            this.imageIconUrl = imageIconUrl;
            return this;
        }
        public String getImageIconUrl() {
            return this.imageIconUrl;
        }

        public GetEffectiveImageByIdResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetEffectiveImageByIdResponseBodyData setImageInfoRegionModelList(java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList> imageInfoRegionModelList) {
            this.imageInfoRegionModelList = imageInfoRegionModelList;
            return this;
        }
        public java.util.List<GetEffectiveImageByIdResponseBodyDataImageInfoRegionModelList> getImageInfoRegionModelList() {
            return this.imageInfoRegionModelList;
        }

        public GetEffectiveImageByIdResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetEffectiveImageByIdResponseBodyData setImageRegionList(java.util.List<String> imageRegionList) {
            this.imageRegionList = imageRegionList;
            return this;
        }
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        public GetEffectiveImageByIdResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetEffectiveImageByIdResponseBodyData setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public GetEffectiveImageByIdResponseBodyData setOnlineVersionDataDiskSize(Integer onlineVersionDataDiskSize) {
            this.onlineVersionDataDiskSize = onlineVersionDataDiskSize;
            return this;
        }
        public Integer getOnlineVersionDataDiskSize() {
            return this.onlineVersionDataDiskSize;
        }

        public GetEffectiveImageByIdResponseBodyData setOnlineVersionId(String onlineVersionId) {
            this.onlineVersionId = onlineVersionId;
            return this;
        }
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        public GetEffectiveImageByIdResponseBodyData setOnlineVersionSystemDiskSize(Integer onlineVersionSystemDiskSize) {
            this.onlineVersionSystemDiskSize = onlineVersionSystemDiskSize;
            return this;
        }
        public Integer getOnlineVersionSystemDiskSize() {
            return this.onlineVersionSystemDiskSize;
        }

        public GetEffectiveImageByIdResponseBodyData setOnlineVersionVolumeEncryptionEnabled(Boolean onlineVersionVolumeEncryptionEnabled) {
            this.onlineVersionVolumeEncryptionEnabled = onlineVersionVolumeEncryptionEnabled;
            return this;
        }
        public Boolean getOnlineVersionVolumeEncryptionEnabled() {
            return this.onlineVersionVolumeEncryptionEnabled;
        }

        public GetEffectiveImageByIdResponseBodyData setOnlineVersionVolumeEncryptionKey(String onlineVersionVolumeEncryptionKey) {
            this.onlineVersionVolumeEncryptionKey = onlineVersionVolumeEncryptionKey;
            return this;
        }
        public String getOnlineVersionVolumeEncryptionKey() {
            return this.onlineVersionVolumeEncryptionKey;
        }

        public GetEffectiveImageByIdResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetEffectiveImageByIdResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetEffectiveImageByIdResponseBodyData setParentImageId(String parentImageId) {
            this.parentImageId = parentImageId;
            return this;
        }
        public String getParentImageId() {
            return this.parentImageId;
        }

        public GetEffectiveImageByIdResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetEffectiveImageByIdResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetEffectiveImageByIdResponseBodyData setRating(Integer rating) {
            this.rating = rating;
            return this;
        }
        public Integer getRating() {
            return this.rating;
        }

        public GetEffectiveImageByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEffectiveImageByIdResponseBodyData setTagList(java.util.List<GetEffectiveImageByIdResponseBodyDataTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<GetEffectiveImageByIdResponseBodyDataTagList> getTagList() {
            return this.tagList;
        }

        public GetEffectiveImageByIdResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
