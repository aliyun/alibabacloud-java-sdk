// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetOssConfigListRequest extends TeaModel {
    @NameInMap("ConfigName")
    public String configName;

    @NameInMap("PageIndex")
    public String pageIndex;

    @NameInMap("PageSize")
    public String pageSize;

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

    public GetOssConfigListRequest setPageIndex(String pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public String getPageIndex() {
        return this.pageIndex;
    }

    public GetOssConfigListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
