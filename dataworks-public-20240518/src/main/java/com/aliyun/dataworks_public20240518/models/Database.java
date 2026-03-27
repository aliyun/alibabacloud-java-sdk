// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class Database extends TeaModel {
    /**
     * <p>The comments.</p>
     * 
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The creation time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>The database ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>The common format of this parameter is <code>${Entity type}:${Instance ID or escaped URL}:${Catalog identifier}:${Database name}</code>. If a level does not exist, specify an empty string as a placeholder.</p>
     * <blockquote>
     * <p> For StarRocks data sources, specify a catalog name at the Catalog identifier level. For DLF data sources, specify a catalog ID at the Catalog identifier level. Other types of data sources do not support the Catalog identifier level. You can specify an empty string as a placeholder.</p>
     * </blockquote>
     * <p>You can configure this parameter in one of the following formats based on your data source type:</p>
     * <p><code>dlf-database::catalog_id:database_name</code></p>
     * <p><code>holo-database:instance_id::database_name</code></p>
     * <p><code>mysql-database:(instance_id|encoded_jdbc_url)::database_name</code></p>
     * <blockquote>
     * <p>\
     * <code>catalog_id</code>: the ID of a DLF catalog.\
     * <code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.\
     * <code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.\
     * <code>database_name</code>: the name of a database.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>holo-database:h-xxxx::test_db</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The uniform resource identifier (URI) of the storage location.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test_db</p>
     */
    @NameInMap("LocationUri")
    public String locationUri;

    /**
     * <p>The update time. This value is a UNIX timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1736852168000</p>
     */
    @NameInMap("ModifyTime")
    public Long modifyTime;

    /**
     * <p>The database name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parent entity ID. For more information, see <a href="https://help.aliyun.com/document_detail/2880092.html">Concepts related to metadata entities</a>.</p>
     * <p>You can call the ListCrawlerTypes operation to query the parent entity types.</p>
     * <ul>
     * <li>If the parent entity is a catalog, you can configure the <code>ParentMetaEntityId</code> parameter by referring to the <code>Catalog</code> topic.</li>
     * <li>If the parent entity is a metadata crawler, you can configure the <code>ParentMetaEntityId</code> parameter in the <code>${Crawler type}:${Instance ID or escaped URL}</code> format.</li>
     * </ul>
     * <p>You can configure the ParentMetaEntityId parameter in one of the following formats based on your data source type:</p>
     * <p><code>dlf-catalog::catalog_id</code></p>
     * <p><code>holo:instance_id</code></p>
     * <p><code>mysql:(instance_id|encoded_jdbc_url)</code></p>
     * <blockquote>
     * <p>\
     * <code>catalog_id</code>: the ID of a DLF catalog.\
     * <code>instance_id</code>: the ID of an instance. If the related data source is added to DataWorks in Alibaba Cloud instance mode, you must configure this parameter.\
     * <code>encoded_jdbc_url</code>: the JDBC connection string that is URL-encoded. If the related data source is added to DataWorks in connection string mode, you must configure this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>holo:h-xxxx</p>
     */
    @NameInMap("ParentMetaEntityId")
    public String parentMetaEntityId;

    public static Database build(java.util.Map<String, ?> map) throws Exception {
        Database self = new Database();
        return TeaModel.build(map, self);
    }

    public Database setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Database setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public Database setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Database setLocationUri(String locationUri) {
        this.locationUri = locationUri;
        return this;
    }
    public String getLocationUri() {
        return this.locationUri;
    }

    public Database setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public Database setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Database setParentMetaEntityId(String parentMetaEntityId) {
        this.parentMetaEntityId = parentMetaEntityId;
        return this;
    }
    public String getParentMetaEntityId() {
        return this.parentMetaEntityId;
    }

}
