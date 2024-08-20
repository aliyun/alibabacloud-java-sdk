// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnFullDomainsBlockIPRequest extends TeaModel {
    /**
     * <p>The duration for which IP addresses or CIDR blocks are blocked. Unit: seconds. The value <strong>0</strong> specifies that IP addresses or CIDR blocks are permanently blocked. This parameter is available only if you set <strong>OperationType</strong> to <strong>block</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("BlockInterval")
    public Integer blockInterval;

    /**
     * <p>The IP addresses that you want to block or unblock. Separate multiple IP addresses with commas (,). You can specify up to 1,000 IP addresses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.XXX.XXX.1,2.XXX.XXX.2</p>
     */
    @NameInMap("IPList")
    public String IPList;

    /**
     * <p>The action that you want to perform. Valid values:</p>
     * <ul>
     * <li><strong>block</strong></li>
     * <li><strong>unblock</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The type of the blocking duration. This parameter is available only if you set <strong>OperationType</strong> to <strong>block</strong>. Valid values:</p>
     * <ul>
     * <li><strong>cover</strong>: the blocking duration that is specified in the request takes effect.</li>
     * <li><strong>uncover</strong>: the longer one of the blocking duration that is specified in the request and the remaining blocking duration takes effect.</li>
     * <li>Default value: cover.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cover</p>
     */
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
