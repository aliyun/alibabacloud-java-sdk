// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210501.models;

import com.aliyun.tea.*;

public class GetProductInfoByIdsRequest extends TeaModel {
    @NameInMap("Fields")
    public String fields;

    @NameInMap("ItemIds")
    public String itemIds;

    @NameInMap("Pid")
    public String pid;

    public static GetProductInfoByIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductInfoByIdsRequest self = new GetProductInfoByIdsRequest();
        return TeaModel.build(map, self);
    }

    public GetProductInfoByIdsRequest setFields(String fields) {
        this.fields = fields;
        return this;
    }
    public String getFields() {
        return this.fields;
    }

    public GetProductInfoByIdsRequest setItemIds(String itemIds) {
        this.itemIds = itemIds;
        return this;
    }
    public String getItemIds() {
        return this.itemIds;
    }

    public GetProductInfoByIdsRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
