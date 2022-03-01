// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationRequest extends TeaModel {
    @NameInMap("Location")
    public String location;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Tag")
    public java.util.List<DescribeFabricOrganizationRequestTag> tag;

    public static DescribeFabricOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationRequest self = new DescribeFabricOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeFabricOrganizationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeFabricOrganizationRequest setTag(java.util.List<DescribeFabricOrganizationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeFabricOrganizationRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeFabricOrganizationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationRequestTag self = new DescribeFabricOrganizationRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFabricOrganizationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
