// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppResponseBody extends TeaModel {
    /**
     * <p>The error code. This field is returned when the request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of application records that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The application records on the current page.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAppResponseBodyData> data;

    /**
     * <p>The error or result message. This field describes the cause when a request fails. A successful response may not contain this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal error.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of this query. The name of this response field is PageNmuber.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNmuber")
    public Integer pageNmuber;

    /**
     * <p>The number of records per page in this paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique identifier of the request. You can provide this value for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1A962-5503-107B-AC8F-EBA85DF905AC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was processed successfully. A value of true indicates that the request was processed successfully. To check whether an asynchronous task is completed, query the task status separately.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppResponseBody self = new ListAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListAppResponseBody setData(java.util.List<ListAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAppResponseBodyData> getData() {
        return this.data;
    }

    public ListAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppResponseBody setPageNmuber(Integer pageNmuber) {
        this.pageNmuber = pageNmuber;
        return this;
    }
    public Integer getPageNmuber() {
        return this.pageNmuber;
    }

    public ListAppResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAppResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The URL used to access the application icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/apps/business/icon.png">https://example.com/apps/business/icon.png</a></p>
         */
        @NameInMap("AppIconUrl")
        public String appIconUrl;

        /**
         * <p>The application ID, which is used to query the application or unbind an image later.</p>
         * 
         * <strong>example:</strong>
         * <p>app-bp1example****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The display name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>Business management platform</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The theme color saved for the application. If no theme color is specified when the application is created, #FFFFFF (white) is saved by default. The saved value is returned during a query. This field may not be configured for legacy applications.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFFFFF</p>
         */
        @NameInMap("AppThemeColor")
        public String appThemeColor;

        /**
         * <p>The source type of the application. Valid values:</p>
         * <ul>
         * <li><strong>USER_APP</strong>: User-created applications.</li>
         * <li><strong>SYS_APP</strong>: System-provided applications.</li>
         * <li><strong>VIRTUAL_APP</strong>: Virtual applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_APP</p>
         */
        @NameInMap("AppType")
        public String appType;

        /**
         * <p>The business type to which the application belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic products.</li>
         * <li><strong>2</strong>: Personal cloud.</li>
         * <li><strong>3</strong>: Cloud office.</li>
         * <li><strong>4</strong>: Cloud Flow.</li>
         * <li><strong>10</strong>: Personal Edition.</li>
         * <li><strong>20</strong>: Business Edition.</li>
         * <li><strong>60</strong>: Linggou Team Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BizType")
        public Integer bizType;

        /**
         * <p>Indicates whether the current application is not referenced by any image. A value of true indicates that no image references the application. A value of false indicates that the application is still referenced by an image. You must remove the reference before deleting the application.</p>
         */
        @NameInMap("Deletable")
        public Boolean deletable;

        /**
         * <p>The path of the executable file saved when the application is created or modified. This field is returned only if the path is configured for the application. An example is the installation path of a Windows business application.</p>
         * 
         * <strong>example:</strong>
         * <p>C:\Program Files\BusinessApp\BusinessApp.exe</p>
         */
        @NameInMap("ExecuteFileAddress")
        public String executeFileAddress;

        /**
         * <p>The time when the application was created. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25T07:41:30.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the application was last modified. The time is in ISO 8601 format, accurate to milliseconds, and the time zone offset is +00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25T07:41:30.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The form of the application. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_BASE</strong>: Client applications.</li>
         * <li><strong>WEB_BASE</strong>: Browser applications.</li>
         * <li><strong>CLOUD_NATIVE_BASE</strong>: Cloud-native applications.</li>
         * <li><strong>PORT_SERVICE_BASE</strong>: Port service applications.</li>
         * <li><strong>AGENT_SERVICE_BASE</strong>: Agent applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WEB_BASE</p>
         */
        @NameInMap("OriginAppType")
        public String originAppType;

        /**
         * <p>The type of operating system used by the application. Valid values:</p>
         * <ul>
         * <li><strong>Unknown</strong>: The operating system is unknown.</li>
         * <li><strong>Windows</strong>: Windows operating system.</li>
         * <li><strong>Linux</strong>: Linux operating system.</li>
         * <li><strong>Android</strong>: Android operating system.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The product to which the resource belongs. Valid values:</p>
         * <ul>
         * <li><strong>CloudGame</strong>: Cloud game.</li>
         * <li><strong>CloudApp</strong>: Wuying cloud application.</li>
         * <li><strong>CloudBrowser</strong>: Secure browser.</li>
         * <li><strong>CloudDesktop</strong>: Wuying cloud desktop.</li>
         * <li><strong>ImageBuilder</strong>: Image builder resources.</li>
         * <li><strong>ImageValidate</strong>: Image validation resources.</li>
         * <li><strong>AndroidCloud</strong>: Android cloud.</li>
         * <li><strong>GpuRender</strong>: GPU rendering.</li>
         * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering.</li>
         * <li><strong>WuyingServer</strong>: Enterprise Edition workstation.</li>
         * <li><strong>GpuProxy</strong>: GPU remote rendering proxy.</li>
         * <li><strong>GpuCache</strong>: GPU remote rendering cache.</li>
         * <li><strong>AIAgent</strong>: AI Agent service.</li>
         * <li><strong>HostedDesktop</strong>: Hosted desktop.</li>
         * <li><strong>WuyingWorkstation</strong>: Personal Edition container workstation.</li>
         * <li><strong>WuyingWorkstationBusiness</strong>: Business Edition container workstation.</li>
         * <li><strong>WuyingWorkstationTeam</strong>: Linggou Team Edition container workstation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudApp</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The command-line parameters used when the application is started.</p>
         * 
         * <strong>example:</strong>
         * <p>--lang=zh-CN</p>
         */
        @NameInMap("SilenceParam")
        public String silenceParam;

        /**
         * <p>The status of the application record. The current list queries only valid and undeleted applications.</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The subtype of the application. Valid values:</p>
         * <ul>
         * <li><strong>PWA</strong>: Progressive web applications.</li>
         * <li><strong>SAAS</strong>: Software as a Service (SaaS) applications.</li>
         * <li><strong>SANDBOX</strong>: Sandbox applications.</li>
         * <li><strong>CONTAINER</strong>: Container applications.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SAAS</p>
         */
        @NameInMap("SubAppType")
        public String subAppType;

        public static ListAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAppResponseBodyData self = new ListAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAppResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListAppResponseBodyData setAppIconUrl(String appIconUrl) {
            this.appIconUrl = appIconUrl;
            return this;
        }
        public String getAppIconUrl() {
            return this.appIconUrl;
        }

        public ListAppResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListAppResponseBodyData setAppThemeColor(String appThemeColor) {
            this.appThemeColor = appThemeColor;
            return this;
        }
        public String getAppThemeColor() {
            return this.appThemeColor;
        }

        public ListAppResponseBodyData setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListAppResponseBodyData setBizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }
        public Integer getBizType() {
            return this.bizType;
        }

        public ListAppResponseBodyData setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public ListAppResponseBodyData setExecuteFileAddress(String executeFileAddress) {
            this.executeFileAddress = executeFileAddress;
            return this;
        }
        public String getExecuteFileAddress() {
            return this.executeFileAddress;
        }

        public ListAppResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppResponseBodyData setOriginAppType(String originAppType) {
            this.originAppType = originAppType;
            return this;
        }
        public String getOriginAppType() {
            return this.originAppType;
        }

        public ListAppResponseBodyData setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListAppResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListAppResponseBodyData setSilenceParam(String silenceParam) {
            this.silenceParam = silenceParam;
            return this;
        }
        public String getSilenceParam() {
            return this.silenceParam;
        }

        public ListAppResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAppResponseBodyData setSubAppType(String subAppType) {
            this.subAppType = subAppType;
            return this;
        }
        public String getSubAppType() {
            return this.subAppType;
        }

    }

}
