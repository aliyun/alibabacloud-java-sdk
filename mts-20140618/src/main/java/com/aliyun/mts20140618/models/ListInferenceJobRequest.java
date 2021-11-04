// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListInferenceJobRequest extends TeaModel {
    @NameInMap("MaxPageSize")
    public Long maxPageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("ServerName")
    public String serverName;

    public static ListInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobRequest self = new ListInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobRequest setMaxPageSize(Long maxPageSize) {
        this.maxPageSize = maxPageSize;
        return this;
    }
    public Long getMaxPageSize() {
        return this.maxPageSize;
    }

    public ListInferenceJobRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInferenceJobRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}
