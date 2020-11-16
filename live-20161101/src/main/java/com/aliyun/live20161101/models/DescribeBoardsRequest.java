// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeBoardsRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static DescribeBoardsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBoardsRequest self = new DescribeBoardsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBoardsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeBoardsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeBoardsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
