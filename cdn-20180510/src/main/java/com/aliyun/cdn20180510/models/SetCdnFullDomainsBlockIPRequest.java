// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnFullDomainsBlockIPRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("BlockInterval")
    public Integer blockInterval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.XXX.XXX.1,2.XXX.XXX.2</p>
     */
    @NameInMap("IPList")
    public String IPList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <strong>example:</strong>
     * <p>cover</p>
     */
    @NameInMap("UpdateType")
    public String updateType;

    public static SetCdnFullDomainsBlockIPRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnFullDomainsBlockIPRequest self = new SetCdnFullDomainsBlockIPRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnFullDomainsBlockIPRequest setBlockInterval(Integer blockInterval) {
        this.blockInterval = blockInterval;
        return this;
    }
    public Integer getBlockInterval() {
        return this.blockInterval;
    }

    public SetCdnFullDomainsBlockIPRequest setIPList(String IPList) {
        this.IPList = IPList;
        return this;
    }
    public String getIPList() {
        return this.IPList;
    }

    public SetCdnFullDomainsBlockIPRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SetCdnFullDomainsBlockIPRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}
