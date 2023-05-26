// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsByNameResponseBody extends TeaModel {
    /**
     * <p>状态码。说明 200表示成功。</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public String data;

    /**
     * <p>返回结果的提示信息。</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDashboardsByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsByNameResponseBody self = new ListDashboardsByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardsByNameResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDashboardsByNameResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListDashboardsByNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDashboardsByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
