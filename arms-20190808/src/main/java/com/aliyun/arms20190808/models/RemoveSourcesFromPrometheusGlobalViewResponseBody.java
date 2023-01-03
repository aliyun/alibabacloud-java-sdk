// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class RemoveSourcesFromPrometheusGlobalViewResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("Data")
    public RemoveSourcesFromPrometheusGlobalViewResponseBodyData data;

    // The ID of the request. You can use the ID to query logs and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveSourcesFromPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveSourcesFromPrometheusGlobalViewResponseBody self = new RemoveSourcesFromPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setData(RemoveSourcesFromPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RemoveSourcesFromPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public RemoveSourcesFromPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RemoveSourcesFromPrometheusGlobalViewResponseBodyData extends TeaModel {
        // The Info-level information.
        @NameInMap("Info")
        public String info;

        // The additional information.
        @NameInMap("Msg")
        public String msg;

        // Indicates whether the call was successful. Valid values:
        // 
        // *   `true`: The call was successful.
        // *   `false`: The call failed.
        @NameInMap("Success")
        public Boolean success;

        public static RemoveSourcesFromPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveSourcesFromPrometheusGlobalViewResponseBodyData self = new RemoveSourcesFromPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveSourcesFromPrometheusGlobalViewResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public RemoveSourcesFromPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public RemoveSourcesFromPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
