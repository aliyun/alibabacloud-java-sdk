// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeliverToUserSlsRequest extends TeaModel {
    /**
     * <p>The list of delivery scopes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;productType&quot;:&quot;China_China&quot;}]</p>
     */
    @NameInMap("DeliveryScopes")
    public java.util.List<DeliverToUserSlsRequestDeliveryScopes> deliveryScopes;

    /**
     * <p>The name of an existing SLS project. Either this parameter or ProjectName must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic-desktop-xxx</p>
     */
    @NameInMap("ExistedProjectName")
    public String existedProjectName;

    /**
     * <p>The LogStore name.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic_desktop_xxx</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The SLS project name. Either this parameter or ExistedProjectName must be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic-desktop-xxx</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The region ID of the SLS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <p>The data retention period in days. Default value: 30.</p>
     * 
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
         * <p>The product type.</p>
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
