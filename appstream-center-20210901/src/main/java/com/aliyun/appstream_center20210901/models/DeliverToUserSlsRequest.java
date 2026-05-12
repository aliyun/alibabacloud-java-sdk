// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeliverToUserSlsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;productType&quot;:&quot;China_China&quot;}]</p>
     */
    @NameInMap("DeliveryScopes")
    public java.util.List<DeliverToUserSlsRequestDeliveryScopes> deliveryScopes;

    /**
     * <strong>example:</strong>
     * <p>elastic-desktop-xxx</p>
     */
    @NameInMap("ExistedProjectName")
    public String existedProjectName;

    /**
     * <strong>example:</strong>
     * <p>elastic_desktop_xxx</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <strong>example:</strong>
     * <p>elastic-desktop-xxx</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    public static DeliverToUserSlsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeliverToUserSlsRequest self = new DeliverToUserSlsRequest();
        return TeaModel.build(map, self);
    }

    public DeliverToUserSlsRequest setDeliveryScopes(java.util.List<DeliverToUserSlsRequestDeliveryScopes> deliveryScopes) {
        this.deliveryScopes = deliveryScopes;
        return this;
    }
    public java.util.List<DeliverToUserSlsRequestDeliveryScopes> getDeliveryScopes() {
        return this.deliveryScopes;
    }

    public DeliverToUserSlsRequest setExistedProjectName(String existedProjectName) {
        this.existedProjectName = existedProjectName;
        return this;
    }
    public String getExistedProjectName() {
        return this.existedProjectName;
    }

    public DeliverToUserSlsRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DeliverToUserSlsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DeliverToUserSlsRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public DeliverToUserSlsRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class DeliverToUserSlsRequestDeliveryScopes extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudBrowser</p>
         */
        @NameInMap("ProductType")
        public String productType;

        public static DeliverToUserSlsRequestDeliveryScopes build(java.util.Map<String, ?> map) throws Exception {
            DeliverToUserSlsRequestDeliveryScopes self = new DeliverToUserSlsRequestDeliveryScopes();
            return TeaModel.build(map, self);
        }

        public DeliverToUserSlsRequestDeliveryScopes setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

}
