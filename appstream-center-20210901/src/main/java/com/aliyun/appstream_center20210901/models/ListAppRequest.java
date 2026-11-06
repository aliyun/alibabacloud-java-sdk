// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppRequest extends TeaModel {
    /**
     * <p>The application ID for exact query. If this parameter is omitted, applications are not filtered by application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app-bp1example****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name filter. Contains matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Business management</p>
     */
    @NameInMap("AppName")
    public String appName;

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
     * <p>Filters by a single business type. If specified together with BizTypeList, the intersection is used. Valid values:</p>
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
     * <p>The list of business types for filtering. A match with any business type in the list is considered a match. If specified together with BizType, the single-value condition must still be met.</p>
     */
    @NameInMap("BizTypeList")
    public java.util.List<Integer> bizTypeList;

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
     * <p>The page number for the query. Start from 1. If this parameter is omitted, set to 0, or set to 1, the first page is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records to return on each page. If this parameter is omitted or set to a value less than 1, the value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters by a single associated product. If specified together with ProductTypeList, the intersection is used. Valid values:</p>
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
     * <p>The list of associated products for filtering. A match with any product in the list is considered a match. If specified together with ProductType, the single-value condition must still be met.</p>
     */
    @NameInMap("ProductTypeList")
    public java.util.List<String> productTypeList;

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

    public static ListAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppRequest self = new ListAppRequest();
        return TeaModel.build(map, self);
    }

    public ListAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListAppRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListAppRequest setBizTypeList(java.util.List<Integer> bizTypeList) {
        this.bizTypeList = bizTypeList;
        return this;
    }
    public java.util.List<Integer> getBizTypeList() {
        return this.bizTypeList;
    }

    public ListAppRequest setOriginAppType(String originAppType) {
        this.originAppType = originAppType;
        return this;
    }
    public String getOriginAppType() {
        return this.originAppType;
    }

    public ListAppRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListAppRequest setProductTypeList(java.util.List<String> productTypeList) {
        this.productTypeList = productTypeList;
        return this;
    }
    public java.util.List<String> getProductTypeList() {
        return this.productTypeList;
    }

    public ListAppRequest setSubAppType(String subAppType) {
        this.subAppType = subAppType;
        return this;
    }
    public String getSubAppType() {
        return this.subAppType;
    }

}
