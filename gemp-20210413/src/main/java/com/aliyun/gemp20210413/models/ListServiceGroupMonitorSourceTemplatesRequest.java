// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListServiceGroupMonitorSourceTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static ListServiceGroupMonitorSourceTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupMonitorSourceTemplatesRequest self = new ListServiceGroupMonitorSourceTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupMonitorSourceTemplatesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListServiceGroupMonitorSourceTemplatesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceGroupMonitorSourceTemplatesRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
