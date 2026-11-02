// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchIndexRequest extends TeaModel {
    /**
     * <p>The index configuration.</p>
     * <blockquote>
     * <p>Notice:  You must specify either the IndexStatus or IndexConfig parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("IndexConfig")
    public String indexConfig;

    /**
     * <p>The index status. Default value: Active. Valid values:</p>
     * <ul>
     * <li>Active: Activated.</li>
     * <li>Deactive: Deactivated.</li>
     * </ul>
     * <blockquote>
     * <p>Notice:  You must specify either the IndexStatus or IndexConfig parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("IndexStatus")
    public String indexStatus;

    /**
     * <p>The index type. Valid values:</p>
     * <ul>
     * <li>mm: Large model.</li>
     * <li>face: Face.</li>
     * <li>aiLabel: Intelligent tag.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>The name of the search library.</p>
     * <ul>
     * <li>If you do not specify the search library name, the search index is created in the default search library of IMS. Default value: ims-default-search-lib.</li>
     * <li>You can also call the <a href="https://help.aliyun.com/document_detail/2584455.html">QuerySearchLib</a> operation to query existing search library information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    public static AlterSearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterSearchIndexRequest self = new AlterSearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public AlterSearchIndexRequest setIndexConfig(String indexConfig) {
        this.indexConfig = indexConfig;
        return this;
    }
    public String getIndexConfig() {
        return this.indexConfig;
    }

    public AlterSearchIndexRequest setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }
    public String getIndexStatus() {
        return this.indexStatus;
    }

    public AlterSearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public AlterSearchIndexRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
