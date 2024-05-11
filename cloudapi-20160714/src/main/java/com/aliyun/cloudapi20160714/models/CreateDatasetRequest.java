// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>The name of the dataset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <br>
     * <p>* JWT_BLOCKING: a JSON Web Token (JWT) blacklist</p>
     * <p>* IP_WHITELIST_CIDR : an IP address whitelist</p>
     * <p>* PARAMETER_ACCESS : parameter-based access control</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateDatasetRequestTag> tag;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateDatasetRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateDatasetRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateDatasetRequest setTag(java.util.List<CreateDatasetRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateDatasetRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateDatasetRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateDatasetRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateDatasetRequestTag self = new CreateDatasetRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateDatasetRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateDatasetRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
