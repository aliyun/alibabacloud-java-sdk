// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>The package ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cmag-xxxx</p>
     */
    @NameInMap("PackageId")
    public String packageId;

    /**
     * <p>The list of tags. You can specify 1 to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ModifyMobileAgentPackageRequestTag> tag;

    public static ModifyMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMobileAgentPackageRequest self = new ModifyMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMobileAgentPackageRequest setPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }
    public String getPackageId() {
        return this.packageId;
    }

    public ModifyMobileAgentPackageRequest setTag(java.util.List<ModifyMobileAgentPackageRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ModifyMobileAgentPackageRequestTag> getTag() {
        return this.tag;
    }

    public static class ModifyMobileAgentPackageRequestTag extends TeaModel {
        /**
         * <p>The tag key. If you specify this parameter, it cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>keyname</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. It can be an empty string. The tag value can be up to 128 characters in length and cannot start with acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyMobileAgentPackageRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ModifyMobileAgentPackageRequestTag self = new ModifyMobileAgentPackageRequestTag();
            return TeaModel.build(map, self);
        }

        public ModifyMobileAgentPackageRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyMobileAgentPackageRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
