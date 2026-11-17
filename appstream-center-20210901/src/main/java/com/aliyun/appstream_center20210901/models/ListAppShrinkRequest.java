// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppShrinkRequest extends TeaModel {
    /**
     * <p>The application ID used for exact match. If omitted, applications are not filtered by application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>app-bp1example****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name used for filtering. Contains matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>Business management</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The source type of the application. Valid values:</p>
     * <ul>
     * <li><strong>USER_APP</strong>: user-created applications</li>
     * <li><strong>SYS_APP</strong>: system-provided applications</li>
     * <li><strong>VIRTUAL_APP</strong>: virtual applications</li>
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
     * <li><strong>1</strong>: basic products</li>
     * <li><strong>2</strong>: personal cloud</li>
     * <li><strong>3</strong>: cloud office</li>
     * <li><strong>4</strong>: Cloud Flow</li>
     * <li><strong>10</strong>: Personal Edition</li>
     * <li><strong>20</strong>: Business Edition</li>
     * <li><strong>60</strong>: Linggou Team Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The list of business types for filtering. An application is matched if it belongs to any business type in the list. If specified together with BizType, the single-value condition must still be met.</p>
     */
    @NameInMap("BizTypeList")
    public String bizTypeListShrink;

    /**
     * <p>The form of the application. Valid values:</p>
     * <ul>
     * <li><strong>CLIENT_BASE</strong>: client applications</li>
     * <li><strong>WEB_BASE</strong>: browser applications</li>
     * <li><strong>CLOUD_NATIVE_BASE</strong>: cloud-native applications</li>
     * <li><strong>PORT_SERVICE_BASE</strong>: port service applications</li>
     * <li><strong>AGENT_SERVICE_BASE</strong>: agent applications</li>
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
     * <li><strong>Unknown</strong>: unknown operating system</li>
     * <li><strong>Windows</strong>: Windows operating system</li>
     * <li><strong>Linux</strong>: Linux operating system</li>
     * <li><strong>Android</strong>: Android operating system</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The page number. We recommend that you start from 1. If this parameter is omitted, set to 0, or set to 1, the first page is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. If this parameter is omitted or set to a value less than 1, the value 10 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters by a single associated product. If specified together with ProductTypeList, the intersection is used. Valid values:</p>
     * <ul>
     * <li><strong>CloudGame</strong>: cloud gaming</li>
     * <li><strong>CloudApp</strong>: Wuying Cloud Application</li>
     * <li><strong>CloudBrowser</strong>: secure browser</li>
     * <li><strong>CloudDesktop</strong>: Wuying Cloud Computer</li>
     * <li><strong>ImageBuilder</strong>: image builder resources</li>
     * <li><strong>ImageValidate</strong>: image validation resources</li>
     * <li><strong>AndroidCloud</strong>: Android cloud</li>
     * <li><strong>GpuRender</strong>: GPU rendering</li>
     * <li><strong>AndroidGpuRender</strong>: Android cloud GPU rendering</li>
     * <li><strong>WuyingServer</strong>: Enterprise Edition workstation</li>
     * <li><strong>GpuProxy</strong>: GPU remote rendering proxy</li>
     * <li><strong>GpuCache</strong>: GPU remote rendering cache</li>
     * <li><strong>AIAgent</strong>: AI agent service</li>
     * <li><strong>HostedDesktop</strong>: hosted computer</li>
     * <li><strong>WuyingWorkstation</strong>: Personal Edition container workstation</li>
     * <li><strong>WuyingWorkstationBusiness</strong>: Business Edition container workstation</li>
     * <li><strong>WuyingWorkstationTeam</strong>: Linggou Team Edition container workstation</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The list of associated products for filtering. An application is matched if it belongs to any product in the list. If specified together with ProductType, the single-value condition must still be met.</p>
     */
    @NameInMap("ProductTypeList")
    public String productTypeListShrink;

    /**
     * <p>The subtype of the application. Valid values:</p>
     * <ul>
     * <li><strong>PWA</strong>: progressive web applications</li>
     * <li><strong>SAAS</strong>: SaaS applications</li>
     * <li><strong>SANDBOX</strong>: sandbox applications</li>
     * <li><strong>CONTAINER</strong>: container applications</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SAAS</p>
     */
    @NameInMap("SubAppType")
    public String subAppType;

    public static ListAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppShrinkRequest self = new ListAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListAppShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAppShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListAppShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListAppShrinkRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListAppShrinkRequest setBizTypeListShrink(String bizTypeListShrink) {
        this.bizTypeListShrink = bizTypeListShrink;
        return this;
    }
    public String getBizTypeListShrink() {
        return this.bizTypeListShrink;
    }

    public ListAppShrinkRequest setOriginAppType(String originAppType) {
        this.originAppType = originAppType;
        return this;
    }
    public String getOriginAppType() {
        return this.originAppType;
    }

    public ListAppShrinkRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public ListAppShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ListAppShrinkRequest setProductTypeListShrink(String productTypeListShrink) {
        this.productTypeListShrink = productTypeListShrink;
        return this;
    }
    public String getProductTypeListShrink() {
        return this.productTypeListShrink;
    }

    public ListAppShrinkRequest setSubAppType(String subAppType) {
        this.subAppType = subAppType;
        return this;
    }
    public String getSubAppType() {
        return this.subAppType;
    }

}
