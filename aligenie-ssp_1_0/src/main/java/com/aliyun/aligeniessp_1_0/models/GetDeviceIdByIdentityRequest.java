// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceIdByIdentityRequest extends TeaModel {
    /**
     * <p>The value corresponding to the encoding type. Enter the Project ID of the project to which this product belongs. You can view it in the Tmall Genie AI platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>129****0946</p>
     */
    @NameInMap("EncodeKey")
    public String encodeKey;

    /**
     * <p>Encoding type. Enter <strong>PROJECT_ID</strong> here.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROJECT_ID</p>
     */
    @NameInMap("EncodeType")
    public String encodeType;

    /**
     * <p>Authentication identifier. Enter the MAC address or the SN value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>b4:xx:xx:xx:65:2b</p>
     */
    @NameInMap("IdentityId")
    public String identityId;

    /**
     * <p>Device authentication type. Enter <strong>MAC</strong>, <strong>SN</strong>, or <strong>CTEI</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MAC</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The unique product identifier ProductKey, which is a globally unique identity issued by the platform when the product is created in the Tmall Genie AI platform. This parameter is optional when IdentityType is <strong>CTEI</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Mm*****XnZ8</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    public static GetDeviceIdByIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceIdByIdentityRequest self = new GetDeviceIdByIdentityRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceIdByIdentityRequest setEncodeKey(String encodeKey) {
        this.encodeKey = encodeKey;
        return this;
    }
    public String getEncodeKey() {
        return this.encodeKey;
    }

    public GetDeviceIdByIdentityRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public GetDeviceIdByIdentityRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public GetDeviceIdByIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public GetDeviceIdByIdentityRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
