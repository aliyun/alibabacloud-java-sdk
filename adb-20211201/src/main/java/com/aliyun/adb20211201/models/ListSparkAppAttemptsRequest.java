// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppAttemptsRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListSparkAppAttemptsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppAttemptsRequest self = new ListSparkAppAttemptsRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkAppAttemptsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListSparkAppAttemptsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSparkAppAttemptsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
