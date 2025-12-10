// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAICPublicKeyDeliveriesRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aic-xxxx-0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Public Key Grouping</p>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>Public Key Name</p>
     * 
     * <strong>example:</strong>
     * <p>mykey</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>Public key type</p>
     * 
     * <strong>example:</strong>
     * <p>adb</p>
     */
    @NameInMap("KeyType")
    public String keyType;

    /**
     * <p>The page number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListAICPublicKeyDeliveriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAICPublicKeyDeliveriesRequest self = new ListAICPublicKeyDeliveriesRequest();
        return TeaModel.build(map, self);
    }

    public ListAICPublicKeyDeliveriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAICPublicKeyDeliveriesRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public ListAICPublicKeyDeliveriesRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListAICPublicKeyDeliveriesRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public ListAICPublicKeyDeliveriesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAICPublicKeyDeliveriesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
