// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeliverToUserSlsRequest extends TeaModel {
    /**
     * <p>The list of product scopes for which delivery needs to be configured. Specify at least one item. You cannot create duplicate enabled delivery configurations for the same account and product type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProductType&quot;:&quot;CloudBrowser&quot;}]</p>
     */
    @NameInMap("DeliveryScopes")
    public java.util.List<DeliverToUserSlsRequestDeliveryScopes> deliveryScopes;

    /**
     * <p>The name of an existing SLS project. The name must start with <code>elastic-desktop-</code> and the project must already exist in the specified SLS region of the current account.</p>
     * <p>Specify either this parameter or <code>ProjectName</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic-desktop-audit</p>
     */
    @NameInMap("ExistedProjectName")
    public String existedProjectName;

    /**
     * <p>The name of the destination Logstore. The name must start with <code>elastic_desktop_</code>. If the Logstore does not exist, it is created. If the Logstore already exists, it is reused.</p>
     * <p>If this parameter is not specified, the part after <code>elastic-desktop-</code> in the selected project name is used as a suffix to generate a name that starts with <code>elastic_desktop_</code>. For example, if the project name is <code>elastic-desktop-audit</code>, the default Logstore name is <code>elastic_desktop_audit</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic_desktop_audit</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The name of the SLS project to be created or reused. The name must start with <code>elastic-desktop-</code>.</p>
     * <p>Specify either this parameter or <code>ExistedProjectName</code>. If the project does not exist, it is created. If the project already exists, it is reused.</p>
     * 
     * <strong>example:</strong>
     * <p>elastic-desktop-audit</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the region where the destination SLS project is located. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    /**
     * <p>The data retention period of the new Logstore. Unit: days.</p>
     * <p><strong>Valid values:</strong> 1 to 3650.</p>
     * <p><strong>Default value:</strong> 30.</p>
     * <p>If an existing Logstore is reused, this operation does not update its data retention period.</p>
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
         * <p>The product type to which the logs belong. Specify the product type for which you want to enable log delivery. For example, <code>CloudBrowser</code> indicates Cloud Browser.</p>
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
