// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetOssConfigListRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    public static GetOssConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssConfigListRequest self = new GetOssConfigListRequest();
        return TeaModel.build(map, self);
    }

    public GetOssConfigListRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

    public GetOssConfigListRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetOssConfigListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
