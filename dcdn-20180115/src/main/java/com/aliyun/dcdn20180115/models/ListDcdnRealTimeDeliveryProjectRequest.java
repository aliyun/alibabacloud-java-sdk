// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnRealTimeDeliveryProjectRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <ul>
     * <li><strong>cdn_log_access_l1</strong>: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</li>
     * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
     * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
     * <li>By default, this parameter is left empty, and all logs are returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The domain name. You can specify only one domain name in each request. If this parameter is not specified, all domain names are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The number of the page to return. Valid values: <strong>1</strong> to <strong>100000</strong>. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The default value is 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDcdnRealTimeDeliveryProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnRealTimeDeliveryProjectRequest self = new ListDcdnRealTimeDeliveryProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListDcdnRealTimeDeliveryProjectRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public ListDcdnRealTimeDeliveryProjectRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ListDcdnRealTimeDeliveryProjectRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDcdnRealTimeDeliveryProjectRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
