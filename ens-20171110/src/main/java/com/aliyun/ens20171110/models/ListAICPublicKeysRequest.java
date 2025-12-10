// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAICPublicKeysRequest extends TeaModel {
    /**
     * <p>Public key grouping</p>
     * 
     * <strong>example:</strong>
     * <p>g-test</p>
     */
    @NameInMap("KeyGroup")
    public String keyGroup;

    /**
     * <p>Public key name</p>
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

    public static ListAICPublicKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAICPublicKeysRequest self = new ListAICPublicKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListAICPublicKeysRequest setKeyGroup(String keyGroup) {
        this.keyGroup = keyGroup;
        return this;
    }
    public String getKeyGroup() {
        return this.keyGroup;
    }

    public ListAICPublicKeysRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListAICPublicKeysRequest setKeyType(String keyType) {
        this.keyType = keyType;
        return this;
    }
    public String getKeyType() {
        return this.keyType;
    }

    public ListAICPublicKeysRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAICPublicKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
