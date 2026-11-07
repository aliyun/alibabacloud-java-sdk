// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNamespaceRequest extends TeaModel {
    /**
     * <p>The language in which you want the results to be displayed. Valid values: zh (default): Chinese. en: English</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The description of the namespace that you want to create for Microservices Governance.</p>
     * 
     * <strong>example:</strong>
     * <p>Test namespace 1.</p>
     */
    @NameInMap("Describe")
    public String describe;

    /**
     * <p>The name of the namespace that you want to create for Microservices Governance.</p>
     * 
     * <strong>example:</strong>
     * <p>myNamespace</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The tag.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateNamespaceRequestTag> tag;

    public static CreateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceRequest self = new CreateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNamespaceRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public CreateNamespaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNamespaceRequest setTag(java.util.List<CreateNamespaceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNamespaceRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateNamespaceRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You cannot specify an empty string as a tag key. The tag key can be up to 128 characters in length and cannot start with aliyun or acs:. It cannot contain http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaceTagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>namespaceTagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateNamespaceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceRequestTag self = new CreateNamespaceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNamespaceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
