// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetUserGuideStatusResponseBody extends TeaModel {
    /**
     * <p>map</p>
     * 
     * <strong>example:</strong>
     * <p>{   &quot;data&quot;: {     &quot;monitorGuide&quot;: false,     &quot;userRamId&quot;: 1344371,     &quot;serviceGuide&quot;: false,     &quot;noticeGuide&quot;: false,     &quot;userGuide&quot;: true,     &quot;serviceGroupGuide&quot;: false,     &quot;routeRuleGuide&quot;: false,     &quot;incidentGuide&quot;: true   }</p>
     */
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A2E9</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetUserGuideStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserGuideStatusResponseBody self = new GetUserGuideStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserGuideStatusResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public GetUserGuideStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
