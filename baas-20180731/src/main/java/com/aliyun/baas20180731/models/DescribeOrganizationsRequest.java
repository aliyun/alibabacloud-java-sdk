// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Location")
    public String location;

    @NameInMap("Tag")
    public java.util.List<DescribeOrganizationsRequestTag> tag;

    public static DescribeOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationsRequest self = new DescribeOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationsRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeOrganizationsRequest setTag(java.util.List<DescribeOrganizationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeOrganizationsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeOrganizationsRequestTag extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeOrganizationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationsRequestTag self = new DescribeOrganizationsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeOrganizationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
