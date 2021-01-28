// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnDomainOfflineLogDeliveryRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("FieldId")
    public String fieldId;

    public static CreateDcdnDomainOfflineLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnDomainOfflineLogDeliveryRequest self = new CreateDcdnDomainOfflineLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnDomainOfflineLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDcdnDomainOfflineLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnDomainOfflineLogDeliveryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDcdnDomainOfflineLogDeliveryRequest setFieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }
    public String getFieldId() {
        return this.fieldId;
    }

}
