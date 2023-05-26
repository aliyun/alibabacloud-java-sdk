// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class BindPrometheusGrafanaInstanceResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
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
