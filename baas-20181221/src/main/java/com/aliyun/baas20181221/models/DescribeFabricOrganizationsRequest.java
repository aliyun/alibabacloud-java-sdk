// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("Tag")
    public java.util.List<DescribeFabricOrganizationsRequestTag> tag;

    public static DescribeFabricOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationsRequest self = new DescribeFabricOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricOrganizationsRequest setTag(java.util.List<DescribeFabricOrganizationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeFabricOrganizationsRequestTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeFabricOrganizationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationsRequestTag self = new DescribeFabricOrganizationsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricOrganizationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
