// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCatalogRequest extends TeaModel {
    /**
     * <p>The ID of the data catalog entity. Currently, DLF and StarRocks types are supported. For more information, see the response of the ListCatalogs operation and <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts of metadata entities</a>.</p>
     * <ul>
     * <li><p>For the DLF type, the format is <code>dlf-catalog::catalog_id</code>.</p>
     * </li>
     * <li><p>For the StarRocks type, the format is <code>starrocks-catalog:(instance_id|encoded_jdbc_url):catalog_name</code>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Where:<br><code>catalog_id</code>: the DLF catalog ID.<br><code>instance_id</code>: the instance ID, which is required when the data source is registered in instance mode.<br><code>encoded_jdbc_url</code>: the URL-encoded JDBC connection string, which is required when the data source is registered by using a connection string.<br><code>catalog_name</code>: the StarRocks catalog name.</p>
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
