// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListFilesRequest extends TeaModel {
    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("Limit")
    public Integer limit;

    public static ListFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFilesRequest self = new ListFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListFilesRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListFilesRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
