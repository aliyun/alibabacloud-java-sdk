// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentTimelinesRequest extends TeaModel {
    // 幂等校验Id
    @NameInMap("clientToken")
    public String clientToken;

    // 页
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 行
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListIncidentTimelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentTimelinesRequest self = new ListIncidentTimelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentTimelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIncidentTimelinesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListIncidentTimelinesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
