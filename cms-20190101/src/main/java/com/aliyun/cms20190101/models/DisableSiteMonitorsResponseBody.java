// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DisableSiteMonitorsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DisableSiteMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSiteMonitorsResponseBody self = new DisableSiteMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSiteMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSiteMonitorsResponseBody setData(DisableSiteMonitorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableSiteMonitorsResponseBodyData getData() {
        return this.data;
    }

    public DisableSiteMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSiteMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSiteMonitorsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DisableSiteMonitorsResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        public static DisableSiteMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableSiteMonitorsResponseBodyData self = new DisableSiteMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableSiteMonitorsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
