// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchIndexRequest extends TeaModel {
    /**
     * <p>The index configuration.</p>
     * <blockquote>
     * <p>Notice:  You must specify either IndexStatus or IndexConfig.</p>
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
     * <li>Active: activated.</li>
     * <li>Deactive: deactivated.</li>
     * </ul>
     * <blockquote>
     * <p>Notice:  You must specify either IndexStatus or IndexConfig.</p>
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
     * <li>mm: large model.</li>
     * <li>face: face.</li>
     * <li>aiLabel: intelligent tag.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm</p>
     */
    @NameInMap("IndexType")
    public String indexType;

    /**
     * <p>The search library name.</p>
     * <ul>
     * <li>If no search library name is specified, the search index is created in the default IMS search library. Default value: ims-default-search-lib.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/2584455.html">QuerySearchLib</a> operation to query existing search library information.</li>
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
