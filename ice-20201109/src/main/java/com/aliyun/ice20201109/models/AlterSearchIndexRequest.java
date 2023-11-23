// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AlterSearchIndexRequest extends TeaModel {
    @NameInMap("IndexConfig")
    public String indexConfig;

    @NameInMap("IndexStatus")
    public String indexStatus;

    @NameInMap("IndexType")
    public String indexType;

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
