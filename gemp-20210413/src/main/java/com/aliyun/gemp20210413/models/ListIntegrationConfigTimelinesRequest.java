// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigTimelinesRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("integrationConfigId")
    public Long integrationConfigId;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    public static ListIntegrationConfigTimelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationConfigTimelinesRequest self = new ListIntegrationConfigTimelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationConfigTimelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIntegrationConfigTimelinesRequest setIntegrationConfigId(Long integrationConfigId) {
        this.integrationConfigId = integrationConfigId;
        return this;
    }
    public Long getIntegrationConfigId() {
        return this.integrationConfigId;
    }

    public ListIntegrationConfigTimelinesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListIntegrationConfigTimelinesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
