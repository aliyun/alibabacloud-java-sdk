// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvironmentsRequest extends TeaModel {
    /**
     * <p>The add-on name. You must specify at least one of the AddonName and EnvironmentType parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>trace-java</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>The ID of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cff30f0d67d7542dfb05bd114b4b1d7af</p>
     */
    @NameInMap("BindResourceId")
    public String bindResourceId;

    /**
     * <p>The environment type. You must specify at least one of the AddonName and EnvironmentType parameters.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>CS</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>Container Service for Kubernetes (ACK)</p>
     * <!-- -->
     * </li>
     * <li><p>ECS</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>Elastic Compute Service (ECS)</p>
     * <!-- -->
     * </li>
     * <li><p>Cloud</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>cloud service</p>
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CS</p>
     */
    @NameInMap("EnvironmentType")
    public String environmentType;

    /**
     * <p>The payable resource plan. Valid values:</p>
     * <ul>
     * <li>If the EnvironmentType parameter is set to CS, set the value to CS_Basic or CS_Pro. Default value: CS_Basic.</li>
     * <li>Otherwise, leave the parameter empty.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CS_Pro</p>
     */
    @NameInMap("FeePackage")
    public String feePackage;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzfurdatohtka</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListEnvironmentsRequestTag> tag;

    public static ListEnvironmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsRequest self = new ListEnvironmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public ListEnvironmentsRequest setBindResourceId(String bindResourceId) {
        this.bindResourceId = bindResourceId;
        return this;
    }
    public String getBindResourceId() {
        return this.bindResourceId;
    }

    public ListEnvironmentsRequest setEnvironmentType(String environmentType) {
        this.environmentType = environmentType;
        return this;
    }
    public String getEnvironmentType() {
        return this.environmentType;
    }

    public ListEnvironmentsRequest setFeePackage(String feePackage) {
        this.feePackage = feePackage;
        return this;
    }
    public String getFeePackage() {
        return this.feePackage;
    }

    public ListEnvironmentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEnvironmentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListEnvironmentsRequest setTag(java.util.List<ListEnvironmentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListEnvironmentsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListEnvironmentsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>gfn_web_outbound_add</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListEnvironmentsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentsRequestTag self = new ListEnvironmentsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEnvironmentsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
