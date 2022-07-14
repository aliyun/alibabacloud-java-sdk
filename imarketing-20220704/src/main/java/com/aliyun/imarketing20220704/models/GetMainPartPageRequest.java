// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetMainPartPageRequest extends TeaModel {
    @NameInMap("MainId")
    public Long mainId;

    @NameInMap("MainName")
    public String mainName;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetMainPartPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartPageRequest self = new GetMainPartPageRequest();
        return TeaModel.build(map, self);
    }

    public GetMainPartPageRequest setMainId(Long mainId) {
        this.mainId = mainId;
        return this;
    }
    public Long getMainId() {
        return this.mainId;
    }

    public GetMainPartPageRequest setMainName(String mainName) {
        this.mainName = mainName;
        return this;
    }
    public String getMainName() {
        return this.mainName;
    }

    public GetMainPartPageRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetMainPartPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
