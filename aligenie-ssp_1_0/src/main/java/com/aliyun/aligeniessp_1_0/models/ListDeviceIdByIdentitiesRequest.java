// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceIdByIdentitiesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>125****0946</p>
     */
    @NameInMap("EncodeKey")
    public String encodeKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_ID</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("IdentityIds")
    public java.util.List<String> identityIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MAC</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mm*****XnZ8</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static ListDeviceIdByIdentitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceIdByIdentitiesRequest self = new ListDeviceIdByIdentitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceIdByIdentitiesRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public ListDeviceIdByIdentitiesRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public ListDeviceIdByIdentitiesRequest setIdentityIds(java.util.List<String> identityIds) {
        this.identityIds = identityIds;
        return this;
    }
    public java.util.List<String> getIdentityIds() {
        return this.identityIds;
    }

    public ListDeviceIdByIdentitiesRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public ListDeviceIdByIdentitiesRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
