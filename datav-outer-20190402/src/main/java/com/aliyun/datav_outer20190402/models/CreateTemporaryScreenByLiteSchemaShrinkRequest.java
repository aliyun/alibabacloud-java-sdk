// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemporaryScreenByLiteSchemaShrinkRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Schema")
    public String schemaShrink;

    public static CreateTemporaryScreenByLiteSchemaShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemporaryScreenByLiteSchemaShrinkRequest self = new CreateTemporaryScreenByLiteSchemaShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemporaryScreenByLiteSchemaShrinkRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateTemporaryScreenByLiteSchemaShrinkRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateTemporaryScreenByLiteSchemaShrinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateTemporaryScreenByLiteSchemaShrinkRequest setSchemaShrink(String schemaShrink) {
        this.schemaShrink = schemaShrink;
        return this;
    }
    public String getSchemaShrink() {
        return this.schemaShrink;
    }

}
