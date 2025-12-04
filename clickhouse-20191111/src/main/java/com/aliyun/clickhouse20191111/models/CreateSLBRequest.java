// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSLBRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to obtain the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-uf6bnitmve5n0****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateSLBRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSLBRequest self = new CreateSLBRequest();
        return TeaModel.build(map, self);
    }

    public CreateSLBRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateSLBRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateSLBRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
