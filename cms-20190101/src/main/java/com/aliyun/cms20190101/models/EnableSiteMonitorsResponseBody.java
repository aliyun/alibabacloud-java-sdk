// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnableSiteMonitorsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static EnableSiteMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsResponseBody self = new EnableSiteMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSiteMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableSiteMonitorsResponseBody setData(EnableSiteMonitorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableSiteMonitorsResponseBodyData getData() {
        return this.data;
    }

    public EnableSiteMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableSiteMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSiteMonitorsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class EnableSiteMonitorsResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        public static EnableSiteMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableSiteMonitorsResponseBodyData self = new EnableSiteMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableSiteMonitorsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
