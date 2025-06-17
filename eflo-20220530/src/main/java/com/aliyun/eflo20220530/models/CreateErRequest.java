// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRequest extends TeaModel {
    /**
     * <p>The description of the document.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Lingjun HUB Name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-wulanchabu-main</p>
     */
    @NameInMap("ErName")
    public String erName;

    /**
     * <p>Primary Zone</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu-b</p>
     */
    @NameInMap("MasterZoneId")
    public String masterZoneId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyuzlx2iihcy</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>List of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateErRequestTag> tag;

    public static CreateErRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateErRequest self = new CreateErRequest();
        return TeaModel.build(map, self);
    }

    public CreateErRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateErRequest setErName(String erName) {
        this.erName = erName;
        return this;
    }
    public String getErName() {
        return this.erName;
    }

    public CreateErRequest setMasterZoneId(String masterZoneId) {
        this.masterZoneId = masterZoneId;
        return this;
    }
    public String getMasterZoneId() {
        return this.masterZoneId;
    }

    public CreateErRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateErRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateErRequest setTag(java.util.List<CreateErRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateErRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateErRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value-test</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateErRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateErRequestTag self = new CreateErRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateErRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateErRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
