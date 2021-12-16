// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnFullDomainsBlockIPRequest extends TeaModel {
    @NameInMap("BlockInterval")
    public Integer blockInterval;

    @NameInMap("IPList")
    public String IPList;

    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetDcdnFullDomainsBlockIPRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnFullDomainsBlockIPRequest self = new SetDcdnFullDomainsBlockIPRequest();
        return TeaModel.build(map, self);
    }

    public SetDcdnFullDomainsBlockIPRequest setBlockInterval(Integer blockInterval) {
        this.blockInterval = blockInterval;
        return this;
    }
    public Integer getBlockInterval() {
        return this.blockInterval;
    }

    public SetDcdnFullDomainsBlockIPRequest setIPList(String IPList) {
        this.IPList = IPList;
        return this;
    }
    public String getIPList() {
        return this.IPList;
    }

    public SetDcdnFullDomainsBlockIPRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SetDcdnFullDomainsBlockIPRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
