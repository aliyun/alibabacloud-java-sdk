// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppResponseBody extends TeaModel {
    /**
     * <p>The business result code, returned as a string. The value is typically &quot;200&quot; when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of applications on the current page. Each element represents an application.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTenantAppResponseBodyData> data;

    /**
     * <p>The HTTP status code field in the business response. This field may be empty. The actual transmission status is determined by the HTTP response status.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The description of the request processing result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The actual page number of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The actual number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request tracking ID. Provide this value when reporting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>11111111-2222-4333-8444-555555555555</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. Valid values:</p>
     * <ul>
     * <li>true: Succeeded.</li>
     * <li>false: Failed.</li>
     * </ul>
     * <p>Refer to the corresponding field descriptions for specific business meanings.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of applications that match the filter conditions. This value is not equal to the length of the array on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         */
        @NameInMap("AdminTag")
        public java.util.List<String> adminTag;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Recommended</p>
         */
        @NameInMap("AppAdminTag")
        public String appAdminTag;

        /**
         * <p>The application registry identification information, returned as a string. This value can be used to match the name of an application registry entry.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleEditor</p>
         */
        @NameInMap("AppRegInfo")
        public String appRegInfo;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         */
        @NameInMap("AppTag")
        public java.util.List<String> appTag;

        /**
         * <p>The application UID string, which is a different identifier from the numeric Id field.</p>
         * 
         * <strong>example:</strong>
         * <p>app-demo-001</p>
         */
        @NameInMap("AppUid")
        public String appUid;

        /**
         * <p>The authorization dimension of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>auth_type_user: Authorized by user.</li>
         * <li>auth_type_resource_group: Authorized by resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auth_type_user</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("AutoDeleteFlag")
        public Boolean autoDeleteFlag;

        /**
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("AutoInstallFlag")
        public Boolean autoInstallFlag;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>SILENCE_INSTALL</p>
         */
        @NameInMap("AutoInstallType")
        public String autoInstallType;

        /**
         * <p>The new automatic installation scope policy. Use this field together with AuthType to determine the authorization dimension. Valid values:</p>
         * <ul>
         * <li>0: Automatically install for all visible users or resource groups.</li>
         * <li>1: Automatically install for some visible users or resource groups.</li>
         * <li>2: Disable automatic installation.</li>
         * <li>99: Unknown policy.</li>
         * </ul>
         * <p>This field describes the configuration scope and does not indicate that the installation has been completed on the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoInstallmentType")
        public Integer autoInstallmentType;

        /**
         * <p>The display category ID of the application. The category ID is a dynamic identifier and is not a fixed enumeration.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("CateId")
        public Integer cateId;

        /**
         * <p>The display category name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        @NameInMap("CateName")
        public String cateName;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cluster-demo-001</p>
         */
        @NameInMap("ClusterUid")
        public String clusterUid;

        /**
         * <p>The description of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Used for document editing</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the application developer.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample Software Company</p>
         */
        @NameInMap("Developer")
        public String developer;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DiscountPrice")
        public Double discountPrice;

        /**
         * <p>The authorization distribution scope of the application. This field must be interpreted together with AuthType. An empty value does not necessarily mean that the application is not distributed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ALL: Distributed to all.</li>
         * <li>DESIGNATED: Distributed to a specified scope.</li>
         * <li>NOTDISTRO: Not distributed.</li>
         * <li>UNKNOWN: Unknown scope.</li>
         * </ul>
         * <p>The distribution target is determined by AuthType.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("DistributeType")
        public String distributeType;

        /**
         * <p>The authorization end time of the application. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-07T00:00:00.000+0000</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The extended information of the application, returned as a string. There is no unified fixed field structure.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The storage file name of the installation package, which may differ from the original file name.</p>
         * 
         * <strong>example:</strong>
         * <p>editor_1.2.3.exe</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The storage path of the installation package. This value is not a directly accessible download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>packages/example/editor.exe</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The original file name of the installation package.</p>
         * 
         * <strong>example:</strong>
         * <p>editor.exe</p>
         */
        @NameInMap("FileRealName")
        public String fileRealName;

        /**
         * <p>The creation time of the application record. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T09:04:38.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The last modification time of the application record. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T09:04:38.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("HasCert")
        public Boolean hasCert;

        /**
         * <p>The icon URL of the application.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/icons/editor.png">https://example.com/icons/editor.png</a></p>
         */
        @NameInMap("IconUrl")
        public String iconUrl;

        /**
         * <p>The internal network icon URL of the application. Use this URL only when the corresponding network access conditions are met. The domain name in the example is for illustrative purposes only.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/icons/editor.png">https://example.com/icons/editor.png</a></p>
         */
        @NameInMap("IconUrlInternal")
        public String iconUrlInternal;

        /**
         * <p>The numeric ID of the application, used as the identity of the application and to associate what to do next.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("Install")
        public Boolean install;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InstallMode")
        public Integer installMode;

        /**
         * <p>Specifies whether elevated privilege installation is configured. This does not indicate the administrator identity of the caller.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Elevated privilege installation is configured.</li>
         * <li>false: Elevated privilege installation is not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAdmin")
        public Boolean isAdmin;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>TRUE</p>
         */
        @NameInMap("IsFree")
        public String isFree;

        /**
         * <p><strong>[Deprecated]</strong></p>
         */
        @NameInMap("IsGame")
        public Boolean isGame;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsWhiteList")
        public Integer isWhiteList;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>app-demo-001</p>
         */
        @NameInMap("ItemCode")
        public String itemCode;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("LicenseType")
        public String licenseType;

        /**
         * <p>The English name of the management category of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        @NameInMap("ManageCateEnName")
        public String manageCateEnName;

        /**
         * <p>The management category ID of the application, which may differ from the display category CateId.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("ManageCateId")
        public Integer manageCateId;

        /**
         * <p>The management category name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Office</p>
         */
        @NameInMap("ManageCateName")
        public String manageCateName;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleEditor</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The application type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ClientBase: Client-based application.</li>
         * <li>WebBase: Web-based application.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ClientBase</p>
         */
        @NameInMap("OriginAppType")
        public String originAppType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OriginalPrice")
        public Double originalPrice;

        /**
         * <p>The operating system type of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>WINDOWS: Windows.</li>
         * <li>LINUX: Linux.</li>
         * <li>ANDROID: Android.</li>
         * <li>UNKNOWN: Unknown operating system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WINDOWS</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>WINDOWS</p>
         */
        @NameInMap("OwnerOs")
        public String ownerOs;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PaymentType")
        public Integer paymentType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Price")
        public String price;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The publish time of the application. The value is returned as a string with a time zone, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T09:04:39.000+0000</p>
         */
        @NameInMap("PublishDate")
        public String publishDate;

        /**
         * <p>The customer scope of the application.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ENT: Enterprise.</li>
         * <li>PER: Individual.</li>
         * <li>BOTH: Enterprise and individual.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ENT</p>
         */
        @NameInMap("PublishType")
        public String publishType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SandboxMode")
        public Integer sandboxMode;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         * 
         * <strong>example:</strong>
         * <p>Edit Document</p>
         */
        @NameInMap("SearchTag")
        public String searchTag;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SilenceDeleteFlag")
        public Integer silenceDeleteFlag;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>/uninstall /quiet</p>
         */
        @NameInMap("SilenceDeleteParam")
        public String silenceDeleteParam;

        /**
         * <p>Indicates whether silent installtion is supported. Valid values:</p>
         * <ul>
         * <li>0: Not supported.</li>
         * <li>1: Supported.</li>
         * </ul>
         * <p>This field indicates the application capability and does not represent the actual installation execute result.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SilenceFlag")
        public Integer silenceFlag;

        /**
         * <p>The silent installtion parameters, used by the corresponding installation flow.</p>
         * 
         * <strong>example:</strong>
         * <p>/quiet</p>
         */
        @NameInMap("SilenceParam")
        public String silenceParam;

        /**
         * <p>The size of the installation package.</p>
         * 
         * <strong>example:</strong>
         * <p>10485760</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The application source. Valid values:</p>
         * <ul>
         * <li>MARKET: Alibaba Cloud Marketplace application.</li>
         * <li>TENANT: Tenant-uploaded application.</li>
         * <li>UNKNOWN: Unknown source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TENANT</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The start time of the application authorization. The value is returned as a string with time zone information, in the format of date, the letter T, hours-minutes-seconds, 3-digit milliseconds, and a time zone offset without colons. The +0000 in the example indicates UTC. This field may be empty or not returned if no value is available.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-07T00:00:00.000+0000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The application status. This field does not represent the installation status on the endpoint. Valid values:</p>
         * <ul>
         * <li>NORMAL: Normal.</li>
         * <li>DELETE: Deleted.</li>
         * <li>UNCHECK: Not reviewed or not verified.</li>
         * <li>DISABLE: All versions are unavailable.</li>
         * <li>UNKNOWN: Unknown status.</li>
         * </ul>
         * <p><strong>The following historical statuses from the sandbox packaging and publishing process are deprecated. Do not use them: UNPACKED (not packaged), TESTING (packaged, pending testing), UNPUBLISHED (testing completed, not published), PUBLISHED (published).</strong></p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>sandbox</p>
         */
        @NameInMap("SubAppType")
        public String subAppType;

        /**
         * <p>The secondary source of the application. Valid values:</p>
         * <ul>
         * <li>ALI_MARKET: Alibaba Cloud Marketplace.</li>
         * <li>ISV: Independent software vendor.</li>
         * <li>OPS: Operations channel.</li>
         * <li>UNKNOWN: Unknown source.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ISV</p>
         */
        @NameInMap("SubSourceType")
        public String subSourceType;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SubscribeCount")
        public Long subscribeCount;

        /**
         * <p>The account ID of the application supplier or uploader.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        @NameInMap("SupplierId")
        public Long supplierId;

        /**
         * <p>An internal field. We do not recommend that you use this field.</p>
         */
        @NameInMap("UserTag")
        public java.util.List<String> userTag;

        /**
         * <p>The application version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The display name of the application version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.3 Release</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>editor_1.2.3.wam</p>
         */
        @NameInMap("WamFileName")
        public String wamFileName;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>packages/example/editor.wam</p>
         */
        @NameInMap("WamFilePath")
        public String wamFilePath;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>editor.wam</p>
         */
        @NameInMap("WamFileRealName")
        public String wamFileRealName;

        /**
         * <p><strong>[Deprecated]</strong></p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
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

        public ListTenantAppResponseBodyData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListTenantAppResponseBodyData setAutoDeleteFlag(Boolean autoDeleteFlag) {
            this.autoDeleteFlag = autoDeleteFlag;
            return this;
        }
        public Boolean getAutoDeleteFlag() {
            return this.autoDeleteFlag;
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

        public ListTenantAppResponseBodyData setAutoInstallmentType(Integer autoInstallmentType) {
            this.autoInstallmentType = autoInstallmentType;
            return this;
        }
        public Integer getAutoInstallmentType() {
            return this.autoInstallmentType;
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

        public ListTenantAppResponseBodyData setInstallMode(Integer installMode) {
            this.installMode = installMode;
            return this;
        }
        public Integer getInstallMode() {
            return this.installMode;
        }

        public ListTenantAppResponseBodyData setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }
        public Boolean getIsAdmin() {
            return this.isAdmin;
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

        public ListTenantAppResponseBodyData setSandboxMode(Integer sandboxMode) {
            this.sandboxMode = sandboxMode;
            return this;
        }
        public Integer getSandboxMode() {
            return this.sandboxMode;
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

        public ListTenantAppResponseBodyData setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
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
