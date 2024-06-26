// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-aaaaaa2-1eqnj5o5w****</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Tag")
    public java.util.List<DescribeOrganizationRequestTag> tag;

    public static DescribeOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationRequest self = new DescribeOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeOrganizationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeOrganizationRequest setTag(java.util.List<DescribeOrganizationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeOrganizationRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeOrganizationRequestTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeOrganizationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationRequestTag self = new DescribeOrganizationRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOrganizationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
