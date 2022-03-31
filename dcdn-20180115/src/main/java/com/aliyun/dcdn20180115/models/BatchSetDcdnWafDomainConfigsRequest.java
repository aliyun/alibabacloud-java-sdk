// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnWafDomainConfigsRequest extends TeaModel {
    @NameInMap("DefenseStatus")
    public String defenseStatus;

    @NameInMap("DomainNames")
    public String domainNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static BatchSetDcdnWafDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnWafDomainConfigsRequest self = new BatchSetDcdnWafDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnWafDomainConfigsRequest setDefenseStatus(String defenseStatus) {
        this.defenseStatus = defenseStatus;
        return this;
    }
    public String getDefenseStatus() {
        return this.defenseStatus;
    }

    public BatchSetDcdnWafDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetDcdnWafDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
