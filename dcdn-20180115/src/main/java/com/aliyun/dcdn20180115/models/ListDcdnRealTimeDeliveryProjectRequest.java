// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnRealTimeDeliveryProjectRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

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

    public ListDcdnRealTimeDeliveryProjectRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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
