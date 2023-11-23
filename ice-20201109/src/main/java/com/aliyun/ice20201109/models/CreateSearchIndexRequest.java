// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateSearchIndexRequest extends TeaModel {
    @NameInMap("IndexConfig")
    public String indexConfig;

    @NameInMap("IndexStatus")
    public String indexStatus;

    @NameInMap("IndexType")
    public String indexType;

    @NameInMap("SearchLibName")
    public String searchLibName;

    public static CreateSearchIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSearchIndexRequest self = new CreateSearchIndexRequest();
        return TeaModel.build(map, self);
    }

    public CreateSearchIndexRequest setIndexConfig(String indexConfig) {
        this.indexConfig = indexConfig;
        return this;
    }
    public String getIndexConfig() {
        return this.indexConfig;
    }

    public CreateSearchIndexRequest setIndexStatus(String indexStatus) {
        this.indexStatus = indexStatus;
        return this;
    }
    public String getIndexStatus() {
        return this.indexStatus;
    }

    public CreateSearchIndexRequest setIndexType(String indexType) {
        this.indexType = indexType;
        return this;
    }
    public String getIndexType() {
        return this.indexType;
    }

    public CreateSearchIndexRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

}
