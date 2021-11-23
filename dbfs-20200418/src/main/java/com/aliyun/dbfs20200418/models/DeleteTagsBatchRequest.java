// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteTagsBatchRequest extends TeaModel {
    @NameInMap("DbfsList")
    public String dbfsList;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tags")
    public String tags;

    public static DeleteTagsBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagsBatchRequest self = new DeleteTagsBatchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagsBatchRequest setDbfsList(String dbfsList) {
        this.dbfsList = dbfsList;
        return this;
    }
    public String getDbfsList() {
        return this.dbfsList;
    }

    public DeleteTagsBatchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTagsBatchRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
