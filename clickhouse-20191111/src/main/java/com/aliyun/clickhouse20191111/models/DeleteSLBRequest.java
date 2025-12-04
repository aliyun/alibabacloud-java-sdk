// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DeleteSLBRequest extends TeaModel {
    /**
     * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to view cluster IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-uf6bnitmve5n0****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Product")
    public String product;

    public static DeleteSLBRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSLBRequest self = new DeleteSLBRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSLBRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteSLBRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
