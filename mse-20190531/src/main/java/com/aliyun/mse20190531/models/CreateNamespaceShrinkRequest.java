// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNamespaceShrinkRequest extends TeaModel {
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
    public String tagShrink;

    public static CreateNamespaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceShrinkRequest self = new CreateNamespaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNamespaceShrinkRequest setDescribe(String describe) {
        this.describe = describe;
        return this;
    }
    public String getDescribe() {
        return this.describe;
    }

    public CreateNamespaceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNamespaceShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

}
