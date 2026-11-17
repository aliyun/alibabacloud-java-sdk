// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeSlsDeliveryConfigRequest extends TeaModel {
    /**
     * <p>Filters delivery scopes by the product type to which the logs belong. If this parameter is omitted or an empty list is passed, delivery scopes are not filtered by product type.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ProductType&quot;:&quot;WuyingServer&quot;}]</p>
     */
    @NameInMap("DeliveryScopes")
    public java.util.List<DescribeSlsDeliveryConfigRequestDeliveryScopes> deliveryScopes;

    /**
     * <p>The name of the SLS Logstore. Exact match is used. If this parameter is omitted, delivery scopes are not filtered by Logstore name.</p>
     * 
     * <strong>example:</strong>
     * <p>wuying-session-audit</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The name of the SLS project. Exact match is used. If this parameter is omitted, delivery scopes are not filtered by project name.</p>
     * 
     * <strong>example:</strong>
     * <p>wuying-audit-cn-hangzhou</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the region where the SLS project is located. Exact match is used. If this parameter is omitted, delivery scopes are not filtered by region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    public static DescribeSlsDeliveryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsDeliveryConfigRequest self = new DescribeSlsDeliveryConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlsDeliveryConfigRequest setDeliveryScopes(java.util.List<DescribeSlsDeliveryConfigRequestDeliveryScopes> deliveryScopes) {
        this.deliveryScopes = deliveryScopes;
        return this;
    }
    public java.util.List<DescribeSlsDeliveryConfigRequestDeliveryScopes> getDeliveryScopes() {
        return this.deliveryScopes;
    }

    public DescribeSlsDeliveryConfigRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public DescribeSlsDeliveryConfigRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DescribeSlsDeliveryConfigRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public static class DescribeSlsDeliveryConfigRequestDeliveryScopes extends TeaModel {
        /**
         * <p>The query condition for the product type to which the logs belong. If you specify this parameter, delivery scopes are filtered by the specified product type. The value must be consistent with the existing delivery configurations. For example, <code>WuyingServer</code> indicates Enterprise Edition workstations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        @NameInMap("ProductType")
        public String productType;

        public static DescribeSlsDeliveryConfigRequestDeliveryScopes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSlsDeliveryConfigRequestDeliveryScopes self = new DescribeSlsDeliveryConfigRequestDeliveryScopes();
            return TeaModel.build(map, self);
        }

        public DescribeSlsDeliveryConfigRequestDeliveryScopes setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

    }

}
