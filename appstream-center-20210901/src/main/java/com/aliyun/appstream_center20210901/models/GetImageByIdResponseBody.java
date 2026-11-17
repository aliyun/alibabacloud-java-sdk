// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetImageByIdResponseBody extends TeaModel {
    /**
     * <p>The response code. 200 indicates success. If the call fails, the corresponding error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The image information returned by the query.</p>
     */
    @NameInMap("Data")
    public GetImageByIdResponseBodyData data;

    /**
     * <p>The message returned by the API.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: Successful.</li>
     * <li>false: Failed.</li>
     * </ul>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetImageByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageByIdResponseBody self = new GetImageByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetImageByIdResponseBody setData(GetImageByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageByIdResponseBodyData getData() {
        return this.data;
    }

    public GetImageByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetImageByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageByIdResponseBodyDataAdaptorInfoBOList extends TeaModel {
        /**
         * <p>The adaptor ID.</p>
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
         * <p>The execution mode.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("AdaptorMode")
        public String adaptorMode;

        /**
         * <p>The execution step.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISH_ADAPT</p>
         */
        @NameInMap("AdaptorStep")
        public String adaptorStep;

        /**
         * <p>The numeric ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Aid")
        public Long aid;

        /**
         * <p>The ID of the Alibaba Cloud account to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

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
         * <p>The theme color.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFFFFF</p>
         */
        @NameInMap("AppThemeColor")
        public String appThemeColor;

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
         * <p>The number of the business line to which the application belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <p>The name of the OSS bucket where the application file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>appstream-example</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The level-2 category of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CategoryId")
        public Integer categoryId;

        /**
         * <p>The level-1 category of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CategoryType")
        public Integer categoryType;

        /**
         * <p>The control parameters that can be configured by tenants and administrators.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ControlParam")
        public String controlParam;

        /**
         * <p>The ID of the disk where the application file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1example****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The path of the executable file after the cloud application is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>abc.text</p>
         */
        @NameInMap("ExecuteFileAddress")
        public String executeFileAddress;

        /**
         * <p>The extension information of the adapted application.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extend")
        public String extend;

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
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>102400</p>
         */
        @NameInMap("FileSize")
        public Long fileSize;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The optimization parameters that can be configured by administrators in the backend.</p>
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
         * <p>The product type to which the application belongs.</p>
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
         * <p>Specifies whether to skip installation. This parameter can be configured by tenants and administrators.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SilenceFlag")
        public String silenceFlag;

        /**
         * <p>The installation parameters that can be configured by tenants and administrators.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("SilenceParam")
        public String silenceParam;

        /**
         * <p>The application adaptation status. For example, ADAPT_DONE indicates that the adaptation is complete.</p>
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

        public static GetImageByIdResponseBodyDataAdaptorInfoBOList build(java.util.Map<String, ?> map) throws Exception {
            GetImageByIdResponseBodyDataAdaptorInfoBOList self = new GetImageByIdResponseBodyDataAdaptorInfoBOList();
            return TeaModel.build(map, self);
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAdaptorId(String adaptorId) {
            this.adaptorId = adaptorId;
            return this;
        }
        public String getAdaptorId() {
            return this.adaptorId;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAdaptorMessage(String adaptorMessage) {
            this.adaptorMessage = adaptorMessage;
            return this;
        }
        public String getAdaptorMessage() {
            return this.adaptorMessage;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAdaptorMode(String adaptorMode) {
            this.adaptorMode = adaptorMode;
            return this;
        }
        public String getAdaptorMode() {
            return this.adaptorMode;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAdaptorStep(String adaptorStep) {
            this.adaptorStep = adaptorStep;
            return this;
        }
        public String getAdaptorStep() {
            return this.adaptorStep;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAid(Long aid) {
            this.aid = aid;
            return this;
        }
        public Long getAid() {
            return this.aid;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppScript(String appScript) {
            this.appScript = appScript;
            return this;
        }
        public String getAppScript() {
            return this.appScript;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppThemeColor(String appThemeColor) {
            this.appThemeColor = appThemeColor;
            return this;
        }
        public String getAppThemeColor() {
            return this.appThemeColor;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setAppVersionNumber(String appVersionNumber) {
            this.appVersionNumber = appVersionNumber;
            return this;
        }
        public String getAppVersionNumber() {
            return this.appVersionNumber;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setCategoryType(Integer categoryType) {
            this.categoryType = categoryType;
            return this;
        }
        public Integer getCategoryType() {
            return this.categoryType;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setControlParam(String controlParam) {
            this.controlParam = controlParam;
            return this;
        }
        public String getControlParam() {
            return this.controlParam;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setExecuteFileAddress(String executeFileAddress) {
            this.executeFileAddress = executeFileAddress;
            return this;
        }
        public String getExecuteFileAddress() {
            return this.executeFileAddress;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setOptimizeParam(String optimizeParam) {
            this.optimizeParam = optimizeParam;
            return this;
        }
        public String getOptimizeParam() {
            return this.optimizeParam;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setRuntimeEnv(String runtimeEnv) {
            this.runtimeEnv = runtimeEnv;
            return this;
        }
        public String getRuntimeEnv() {
            return this.runtimeEnv;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setSilenceFlag(String silenceFlag) {
            this.silenceFlag = silenceFlag;
            return this;
        }
        public String getSilenceFlag() {
            return this.silenceFlag;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setSilenceParam(String silenceParam) {
            this.silenceParam = silenceParam;
            return this;
        }
        public String getSilenceParam() {
            return this.silenceParam;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageByIdResponseBodyDataAdaptorInfoBOList setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
        }

    }

    public static class GetImageByIdResponseBodyDataImageExtendInfoModel extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for system images is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The size of the data cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DataDiskSize")
        public Integer dataDiskSize;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

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
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image package type. Valid values:</p>
         * <ul>
         * <li>Ecs: ECS image</li>
         * <li>Vhd: Virtual disk image</li>
         * <li>Container: Container image</li>
         * <li>Ecs_Container: ECS and container composite image</li>
         * <li>K8s_Node: Kubernetes node image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The size of the system cloud disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        /**
         * <p>The image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetImageByIdResponseBodyDataImageExtendInfoModel build(java.util.Map<String, ?> map) throws Exception {
            GetImageByIdResponseBodyDataImageExtendInfoModel self = new GetImageByIdResponseBodyDataImageExtendInfoModel();
            return TeaModel.build(map, self);
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setDataDiskSize(Integer dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        public Integer getDataDiskSize() {
            return this.dataDiskSize;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setGpuCategory(Integer gpuCategory) {
            this.gpuCategory = gpuCategory;
            return this;
        }
        public Integer getGpuCategory() {
            return this.gpuCategory;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setGpuDriverVersion(String gpuDriverVersion) {
            this.gpuDriverVersion = gpuDriverVersion;
            return this;
        }
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

        public GetImageByIdResponseBodyDataImageExtendInfoModel setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetImageByIdResponseBodyDataImageRegionDistributeList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for system images is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the ECS image corresponding to the region.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1example****</p>
         */
        @NameInMap("EcsImageId")
        public String ecsImageId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The processing message reported by the region distribution task.</p>
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
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The region distribution status. Valid values:</p>
         * <ul>
         * <li>CREATING: Distributing</li>
         * <li>AVAILABLE: Available</li>
         * <li>CREATE_FAILED: Distribution failed</li>
         * <li>DELETE: Deleted</li>
         * </ul>
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

        /**
         * <p>The image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetImageByIdResponseBodyDataImageRegionDistributeList build(java.util.Map<String, ?> map) throws Exception {
            GetImageByIdResponseBodyDataImageRegionDistributeList self = new GetImageByIdResponseBodyDataImageRegionDistributeList();
            return TeaModel.build(map, self);
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setEcsImageId(String ecsImageId) {
            this.ecsImageId = ecsImageId;
            return this;
        }
        public String getEcsImageId() {
            return this.ecsImageId;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setUnitImageId(String unitImageId) {
            this.unitImageId = unitImageId;
            return this;
        }
        public String getUnitImageId() {
            return this.unitImageId;
        }

        public GetImageByIdResponseBodyDataImageRegionDistributeList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetImageByIdResponseBodyData extends TeaModel {
        /**
         * <p>The list of adapted applications for the image version.</p>
         */
        @NameInMap("AdaptorInfoBOList")
        public java.util.List<GetImageByIdResponseBodyDataAdaptorInfoBOList> adaptorInfoBOList;

        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs. The account ID for system images is 0.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The ID of the base image.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxx</p>
         */
        @NameInMap("BaseImageId")
        public String baseImageId;

        /**
         * <p>The base image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("BaseImageVersion")
        public String baseImageVersion;

        /**
         * <p>The business line to which the image belongs. Valid values:</p>
         * <ul>
         * <li>1: basic business</li>
         * <li>2: personal edition</li>
         * <li>3: cloud office</li>
         * <li>4: cloud streaming</li>
         * <li>10: standard edition</li>
         * </ul>
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
         * <p>appstream-example</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
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
         * <p>2.3.0-xxx</p>
         */
        @NameInMap("FotaVersion")
        public String fotaVersion;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-25 15:13:57</p>
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
         * <p>The image extended information, which includes cloud disk specifications and GPU driver information. For VHD or container images, the extended information of the base image and base version is used.</p>
         */
        @NameInMap("ImageExtendInfoModel")
        public GetImageByIdResponseBodyDataImageExtendInfoModel imageExtendInfoModel;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxxx</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoImage</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The list of region distribution information for the image version.</p>
         */
        @NameInMap("ImageRegionDistributeList")
        public java.util.List<GetImageByIdResponseBodyDataImageRegionDistributeList> imageRegionDistributeList;

        /**
         * <p>The list of region IDs supported by the image.</p>
         */
        @NameInMap("ImageRegionList")
        public java.util.List<String> imageRegionList;

        /**
         * <p>The source of the image. For example, center indicates the central image service.</p>
         * 
         * <strong>example:</strong>
         * <p>center</p>
         */
        @NameInMap("ImageSource")
        public String imageSource;

        /**
         * <p>The image type. Valid values:</p>
         * <ul>
         * <li>System: system image</li>
         * <li>User: custom image</li>
         * <li>Shared: shared image</li>
         * <li>Community: community image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The image language. If the packaging type is VHD or Container, this property is inherited from the image with the ECS packaging type in the same image combination.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The ID of the latest image version.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
         */
        @NameInMap("LatestVersionId")
        public String latestVersionId;

        /**
         * <p>Indicates whether the returned version is the online version. Valid values:</p>
         * <ul>
         * <li>true: Yes.</li>
         * <li>false: No.</li>
         * </ul>
         */
        @NameInMap("OnlineVersion")
        public Boolean onlineVersion;

        /**
         * <p>The ID of the current online version of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxxx</p>
         */
        @NameInMap("OnlineVersionId")
        public String onlineVersionId;

        /**
         * <p>The operating system type of the image. Valid values:</p>
         * <ul>
         * <li>Windows: Windows system</li>
         * <li>Linux: Linux system</li>
         * <li>Android: Android system</li>
         * <li>Unknown: unknown system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The image package type. Valid values:</p>
         * <ul>
         * <li>Ecs: ECS image</li>
         * <li>Vhd: Virtual disk image</li>
         * <li>Container: Container image</li>
         * <li>Ecs_Container: ECS and container composite image</li>
         * <li>K8s_Node: Kubernetes node image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The ID of the parent image, which indicates the image inheritance relationship. System images do not have parent images.</p>
         * 
         * <strong>example:</strong>
         * <p>imgc-xxx</p>
         */
        @NameInMap("ParentImageId")
        public String parentImageId;

        /**
         * <p>The parent image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>iv-xxx</p>
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
         * <p>The name of the operating system platform, which corresponds to Platform.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows Server 2022</p>
         */
        @NameInMap("PlatformName")
        public String platformName;

        /**
         * <p>The product type to which the image belongs, such as CloudDesktop (Cloud Desktop), CloudApp (cloud application), and WuyingServer (WUYING Workspace Enterprise Edition workstation).</p>
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
         * <p>The connection protocol used by the image. Valid values:</p>
         * <ul>
         * <li>ASP: Alibaba Cloud Streaming Protocol</li>
         * <li>HDX: HDX protocol</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The image status. Valid values:</p>
         * <ul>
         * <li>INIT: Initial.</li>
         * <li>CREATING: Creating.</li>
         * <li>AVAILABLE: Available.</li>
         * <li>CREATE_FAILED: Creation failed.</li>
         * <li>DELETE: Deleted.</li>
         * </ul>
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

        public static GetImageByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageByIdResponseBodyData self = new GetImageByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageByIdResponseBodyData setAdaptorInfoBOList(java.util.List<GetImageByIdResponseBodyDataAdaptorInfoBOList> adaptorInfoBOList) {
            this.adaptorInfoBOList = adaptorInfoBOList;
            return this;
        }
        public java.util.List<GetImageByIdResponseBodyDataAdaptorInfoBOList> getAdaptorInfoBOList() {
            return this.adaptorInfoBOList;
        }

        public GetImageByIdResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetImageByIdResponseBodyData setBaseImageId(String baseImageId) {
            this.baseImageId = baseImageId;
            return this;
        }
        public String getBaseImageId() {
            return this.baseImageId;
        }

        public GetImageByIdResponseBodyData setBaseImageVersion(String baseImageVersion) {
            this.baseImageVersion = baseImageVersion;
            return this;
        }
        public String getBaseImageVersion() {
            return this.baseImageVersion;
        }

        public GetImageByIdResponseBodyData setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public GetImageByIdResponseBodyData setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetImageByIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetImageByIdResponseBodyData setFeatureList(java.util.List<String> featureList) {
            this.featureList = featureList;
            return this;
        }
        public java.util.List<String> getFeatureList() {
            return this.featureList;
        }

        public GetImageByIdResponseBodyData setFotaVersion(String fotaVersion) {
            this.fotaVersion = fotaVersion;
            return this;
        }
        public String getFotaVersion() {
            return this.fotaVersion;
        }

        public GetImageByIdResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetImageByIdResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetImageByIdResponseBodyData setImageCreateMode(String imageCreateMode) {
            this.imageCreateMode = imageCreateMode;
            return this;
        }
        public String getImageCreateMode() {
            return this.imageCreateMode;
        }

        public GetImageByIdResponseBodyData setImageExtendInfoModel(GetImageByIdResponseBodyDataImageExtendInfoModel imageExtendInfoModel) {
            this.imageExtendInfoModel = imageExtendInfoModel;
            return this;
        }
        public GetImageByIdResponseBodyDataImageExtendInfoModel getImageExtendInfoModel() {
            return this.imageExtendInfoModel;
        }

        public GetImageByIdResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetImageByIdResponseBodyData setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public GetImageByIdResponseBodyData setImageRegionDistributeList(java.util.List<GetImageByIdResponseBodyDataImageRegionDistributeList> imageRegionDistributeList) {
            this.imageRegionDistributeList = imageRegionDistributeList;
            return this;
        }
        public java.util.List<GetImageByIdResponseBodyDataImageRegionDistributeList> getImageRegionDistributeList() {
            return this.imageRegionDistributeList;
        }

        public GetImageByIdResponseBodyData setImageRegionList(java.util.List<String> imageRegionList) {
            this.imageRegionList = imageRegionList;
            return this;
        }
        public java.util.List<String> getImageRegionList() {
            return this.imageRegionList;
        }

        public GetImageByIdResponseBodyData setImageSource(String imageSource) {
            this.imageSource = imageSource;
            return this;
        }
        public String getImageSource() {
            return this.imageSource;
        }

        public GetImageByIdResponseBodyData setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public GetImageByIdResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetImageByIdResponseBodyData setLatestVersionId(String latestVersionId) {
            this.latestVersionId = latestVersionId;
            return this;
        }
        public String getLatestVersionId() {
            return this.latestVersionId;
        }

        public GetImageByIdResponseBodyData setOnlineVersion(Boolean onlineVersion) {
            this.onlineVersion = onlineVersion;
            return this;
        }
        public Boolean getOnlineVersion() {
            return this.onlineVersion;
        }

        public GetImageByIdResponseBodyData setOnlineVersionId(String onlineVersionId) {
            this.onlineVersionId = onlineVersionId;
            return this;
        }
        public String getOnlineVersionId() {
            return this.onlineVersionId;
        }

        public GetImageByIdResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public GetImageByIdResponseBodyData setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public GetImageByIdResponseBodyData setParentImageId(String parentImageId) {
            this.parentImageId = parentImageId;
            return this;
        }
        public String getParentImageId() {
            return this.parentImageId;
        }

        public GetImageByIdResponseBodyData setParentImageVersion(String parentImageVersion) {
            this.parentImageVersion = parentImageVersion;
            return this;
        }
        public String getParentImageVersion() {
            return this.parentImageVersion;
        }

        public GetImageByIdResponseBodyData setPlatform(Integer platform) {
            this.platform = platform;
            return this;
        }
        public Integer getPlatform() {
            return this.platform;
        }

        public GetImageByIdResponseBodyData setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public GetImageByIdResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetImageByIdResponseBodyData setPropertyMap(java.util.Map<String, String> propertyMap) {
            this.propertyMap = propertyMap;
            return this;
        }
        public java.util.Map<String, String> getPropertyMap() {
            return this.propertyMap;
        }

        public GetImageByIdResponseBodyData setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public GetImageByIdResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetImageByIdResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
