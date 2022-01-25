// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveRecordsRequest extends TeaModel {
    @NameInMap("LiveId")
    public String liveId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLiveRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordsRequest self = new ListLiveRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordsRequest setLiveId(String liveId) {
        this.liveId = liveId;
        return this;
    }
    public String getLiveId() {
        return this.liveId;
    }

    public ListLiveRecordsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListLiveRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
