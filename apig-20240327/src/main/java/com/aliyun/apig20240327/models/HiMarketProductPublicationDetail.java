// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketProductPublicationDetail extends TeaModel {
    /**
     * <p>The portal ID.</p>
     * 
     * <strong>example:</strong>
     * <p>portal-xxx</p>
     */
    @NameInMap("portalId")
    public String portalId;

    /**
     * <p>The portal name.</p>
     * 
     * <strong>example:</strong>
     * <p>开发者门户</p>
     */
    @NameInMap("portalName")
    public String portalName;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>prod-xxx</p>
     */
    @NameInMap("productId")
    public String productId;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>AI网关API</p>
     */
    @NameInMap("productName")
    public String productName;

    /**
     * <p>The product type.</p>
     * 
     * <strong>example:</strong>
     * <p>ApiGateway</p>
     */
    @NameInMap("productType")
    public String productType;

    /**
     * <p>The product publish ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pub-xxx</p>
     */
    @NameInMap("publicationId")
    public String publicationId;

    public static HiMarketProductPublicationDetail build(java.util.Map<String, ?> map) throws Exception {
        HiMarketProductPublicationDetail self = new HiMarketProductPublicationDetail();
        return TeaModel.build(map, self);
    }

    public HiMarketProductPublicationDetail setPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }
    public String getPortalId() {
        return this.portalId;
    }

    public HiMarketProductPublicationDetail setPortalName(String portalName) {
        this.portalName = portalName;
        return this;
    }
    public String getPortalName() {
        return this.portalName;
    }

    public HiMarketProductPublicationDetail setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public HiMarketProductPublicationDetail setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public HiMarketProductPublicationDetail setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public HiMarketProductPublicationDetail setPublicationId(String publicationId) {
        this.publicationId = publicationId;
        return this;
    }
    public String getPublicationId() {
        return this.publicationId;
    }

}
