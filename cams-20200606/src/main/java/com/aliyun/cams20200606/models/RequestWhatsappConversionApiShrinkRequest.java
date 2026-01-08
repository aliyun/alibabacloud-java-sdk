// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class RequestWhatsappConversionApiShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>929399382</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1939848838</p>
     */
    @NameInMap("PageId")
    public String pageId;

    @NameInMap("RequestData")
    public String requestDataShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static RequestWhatsappConversionApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RequestWhatsappConversionApiShrinkRequest self = new RequestWhatsappConversionApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RequestWhatsappConversionApiShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public RequestWhatsappConversionApiShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RequestWhatsappConversionApiShrinkRequest setPageId(String pageId) {
        this.pageId = pageId;
        return this;
    }
    public String getPageId() {
        return this.pageId;
    }

    public RequestWhatsappConversionApiShrinkRequest setRequestDataShrink(String requestDataShrink) {
        this.requestDataShrink = requestDataShrink;
        return this;
    }
    public String getRequestDataShrink() {
        return this.requestDataShrink;
    }

    public RequestWhatsappConversionApiShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RequestWhatsappConversionApiShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
