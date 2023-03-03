// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BindPrometheusGrafanaInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code returned. 200 indicates that the Prometheus agent was installed. Otherwise, the Prometheus agent fails to be installed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BindPrometheusGrafanaInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindPrometheusGrafanaInstanceResponseBody self = new BindPrometheusGrafanaInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public BindPrometheusGrafanaInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindPrometheusGrafanaInstanceResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public BindPrometheusGrafanaInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindPrometheusGrafanaInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
