// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnFullDomainsBlockIPRequest extends TeaModel {
    /**
     * <p>The blocking period. Unit: seconds.</p>
     * <br>
     * <p>> If you set the **OperationType** parameter to **unblock**, you do not need to set this parameter.</p>
     */
    @NameInMap("BlockInterval")
    public Integer blockInterval;

    /**
     * <p>The IP addresses that are blocked or unblocked. Separate multiple IP addresses with commas (,). You can specify up to 1,000 IP addresses.</p>
     */
    @NameInMap("IPList")
    public String IPList;

    /**
     * <p>The action. Valid values:</p>
     * <br>
     * <p>*   **block**</p>
     * <p>*   **unblock**</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("UpdateType")
    public String updateType;

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

    public SetDcdnFullDomainsBlockIPRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}
