// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmInstanceConfigsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh-CN: Chinese</p>
     * </li>
     * <li><p>en-US (default): English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Generate a unique token for each request. The token can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1ae05db4-10e7-11ef-b126-00163e24****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The status of the domain name instance:</p>
     * <ul>
     * <li><p>enable: The GTM instance uses intelligent scheduling policies.</p>
     * </li>
     * <li><p>disable: The intelligent scheduling policies of the GTM instance are unavailable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("EnableStatus")
    public String enableStatus;

    /**
     * <p>The ID of the Global Traffic Manager (GTM) 3.0 instance.</p>
     * 
     * <strong>example:</strong>
     * <p>gtm-cn-wwo3a3h****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value starts from <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query. Maximum value: <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The GTM access domain name. The domain name is a combination of the host record (ScheduleHostname) and the root or subdomain (ScheduleZoneName).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("ScheduleDomainName")
    public String scheduleDomainName;

    /**
     * <p>The root domain, such as example.com, or subdomain, such as a.example.com, of the GTM access domain name. This is typically a domain name that is hosted in an authoritative zone in the Alibaba Cloud DNS console and belongs to the same account as the GTM instance.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("ScheduleZoneName")
    public String scheduleZoneName;

    public static ListCloudGtmInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmInstanceConfigsRequest self = new ListCloudGtmInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmInstanceConfigsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListCloudGtmInstanceConfigsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListCloudGtmInstanceConfigsRequest setEnableStatus(String enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public String getEnableStatus() {
        return this.enableStatus;
    }

    public ListCloudGtmInstanceConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCloudGtmInstanceConfigsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudGtmInstanceConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudGtmInstanceConfigsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListCloudGtmInstanceConfigsRequest setScheduleDomainName(String scheduleDomainName) {
        this.scheduleDomainName = scheduleDomainName;
        return this;
    }
    public String getScheduleDomainName() {
        return this.scheduleDomainName;
    }

    public ListCloudGtmInstanceConfigsRequest setScheduleZoneName(String scheduleZoneName) {
        this.scheduleZoneName = scheduleZoneName;
        return this;
    }
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

}
