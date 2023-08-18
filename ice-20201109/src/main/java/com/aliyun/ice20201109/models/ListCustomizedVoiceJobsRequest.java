// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListCustomizedVoiceJobsRequest extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListCustomizedVoiceJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCustomizedVoiceJobsRequest self = new ListCustomizedVoiceJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListCustomizedVoiceJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListCustomizedVoiceJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
