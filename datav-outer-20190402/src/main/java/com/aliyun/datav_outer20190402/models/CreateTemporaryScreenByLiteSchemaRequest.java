// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemporaryScreenByLiteSchemaRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Schema")
    public java.util.Map<String, ?> schema;

    public static CreateTemporaryScreenByLiteSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemporaryScreenByLiteSchemaRequest self = new CreateTemporaryScreenByLiteSchemaRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemporaryScreenByLiteSchemaRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateTemporaryScreenByLiteSchemaRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateTemporaryScreenByLiteSchemaRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateTemporaryScreenByLiteSchemaRequest setSchema(java.util.Map<String, ?> schema) {
        this.schema = schema;
        return this;
    }
    public java.util.Map<String, ?> getSchema() {
        return this.schema;
    }

}
