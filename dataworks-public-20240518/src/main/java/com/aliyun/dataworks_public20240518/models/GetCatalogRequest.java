// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCatalogRequest extends TeaModel {
    /**
     * <p>The catalog entity ID. Currently supports dlf and starrocks types. You can refer to the results returned by the ListCatalogs operation and the <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <ul>
     * <li><p>For the DLF type, the format is <code>dlf-catalog::catalog_id</code>.</p>
     * </li>
     * <li><p>For the StarRocks type, the format is <code>starrocks-catalog:(instance_id|encoded_jdbc_url):catalog_name</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p><br><code>catalog_id</code>: The ID of the DLF catalog.<br>
     * <code>instance_id</code>: The instance ID, required if the data source is registered in instance mode.<br>
     * <code>encoded_jdbc_url</code>: The URL-encoded JDBC connection string. Required if the data source is registered in connection string mode.<br>
     * <code>catalog_name</code>: The name of the StarRocks catalog.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dlf-catalog::catalog_id</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogRequest self = new GetCatalogRequest();
        return TeaModel.build(map, self);
    }

    public GetCatalogRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
