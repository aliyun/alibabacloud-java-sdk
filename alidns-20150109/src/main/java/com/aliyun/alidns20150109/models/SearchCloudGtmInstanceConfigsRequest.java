// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SearchCloudGtmInstanceConfigsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><code>zh-CN</code>: Chinese</p>
     * </li>
     * <li><p><code>en-US</code> (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The service availability status of the instance configuration. Valid values:</p>
     * <ul>
     * <li><p><code>available</code>: The service for the GTM access domain is available when the instance configuration is <strong>enabled</strong> and its health status is <strong>Normal</strong> or Alert.</p>
     * </li>
     * <li><p><code>unavailable</code>: The service for the GTM access domain is unavailable when the instance configuration is <strong>disabled</strong> or its health status is <strong>Exceptional</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("AvailableStatus")
    public String availableStatus;

    /**
     * <p>A client-generated token to ensure the idempotence of the request. The token must be unique across requests and can contain up to 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The status of the instance configuration. Valid values:</p>
     * <ul>
     * <li><p><code>enable</code>: Enabled. The intelligent scheduling policy of the GTM instance is in effect.</p>
     * </li>
     * <li><p><code>disable</code>: Disabled. The intelligent scheduling policy of the GTM instance is unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The health status of the instance configuration. Valid values:</p>
     * <ul>
     * <li><p><code>ok</code>: Normal. All address pools referenced by the GTM access domain are available.</p>
     * </li>
     * <li><p><code>ok_alert</code>: Alert. Some address pools referenced by the GTM access domain are unavailable. In this state, DNS resolution continues for available address pools but stops for unavailable ones.</p>
     * </li>
     * <li><p><code>exceptional</code>: Exceptional. All address pools referenced by the GTM access domain are unavailable. In this case, failover resolution uses the addresses from the non-empty address pool with the smallest sequence number to ensure clients receive a resolution result.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("HealthStatus")
    public String healthStatus;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3h****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. Pages start from 1. The default value is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. The maximum value is <strong>100</strong> and the default value is <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A note for the instance configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The GTM access domain. It is formed by combining the host record (<code>ScheduleHostname</code>) with the primary or subdomain name (<code>ScheduleZoneName</code>).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("ScheduleDomainName")
    public String scheduleDomainName;

    /**
     * <p>The primary domain name (for example, <code>example.com</code>) or subdomain name (for example, <code>a.example.com</code>) of the GTM access domain. This is typically a domain name managed by Alibaba Cloud DNS under the same account that owns the GTM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    public static SearchCloudGtmInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCloudGtmInstanceConfigsRequest self = new SearchCloudGtmInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public SearchCloudGtmInstanceConfigsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public SearchCloudGtmInstanceConfigsRequest setAvailableStatus(String availableStatus) {
        this.availableStatus = availableStatus;
        return this;
    }
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    public SearchCloudGtmInstanceConfigsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SearchCloudGtmInstanceConfigsRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public SearchCloudGtmInstanceConfigsRequest setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }
    public String getHealthStatus() {
        return this.healthStatus;
    }

    public SearchCloudGtmInstanceConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SearchCloudGtmInstanceConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchCloudGtmInstanceConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchCloudGtmInstanceConfigsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SearchCloudGtmInstanceConfigsRequest setScheduleDomainName(String scheduleDomainName) {
        this.scheduleDomainName = scheduleDomainName;
        return this;
    }
    public String getScheduleDomainName() {
        return this.scheduleDomainName;
    }

    public SearchCloudGtmInstanceConfigsRequest setScheduleZoneName(String scheduleZoneName) {
        this.scheduleZoneName = scheduleZoneName;
        return this;
    }
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

}
