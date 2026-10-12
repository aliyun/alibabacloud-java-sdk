// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListGatewayErrorAccessLogsResponseBody extends TeaModel {
    /**
     * <p>The list of log entries. Each entry is a mapping from field names to field values.</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C9BF49BD-3037-5006-B379-656ECBA6F56C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListGatewayErrorAccessLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayErrorAccessLogsResponseBody self = new ListGatewayErrorAccessLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayErrorAccessLogsResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public ListGatewayErrorAccessLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
