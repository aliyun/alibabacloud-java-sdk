// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Data")
    public ModifySiteMonitorResponseBodyData data;

    public static ModifySiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteMonitorResponseBody self = new ModifySiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySiteMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ModifySiteMonitorResponseBody setData(ModifySiteMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySiteMonitorResponseBodyData getData() {
        return this.data;
    }

    public static class ModifySiteMonitorResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        public static ModifySiteMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySiteMonitorResponseBodyData self = new ModifySiteMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySiteMonitorResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
