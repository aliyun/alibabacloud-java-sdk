// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddPrometheusGlobalViewResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusGlobalViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewResponseBody self = new AddPrometheusGlobalViewResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewResponseBody setData(AddPrometheusGlobalViewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrometheusGlobalViewResponseBodyData getData() {
        return this.data;
    }

    public AddPrometheusGlobalViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrometheusGlobalViewResponseBodyDataInfo extends TeaModel {
        @NameInMap("FailedInstances")
        public String failedInstances;

        @NameInMap("GlobalViewClusterId")
        public String globalViewClusterId;

        @NameInMap("RegionId")
        public String regionId;

        public static AddPrometheusGlobalViewResponseBodyDataInfo build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewResponseBodyDataInfo self = new AddPrometheusGlobalViewResponseBodyDataInfo();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewResponseBodyDataInfo setFailedInstances(String failedInstances) {
            this.failedInstances = failedInstances;
            return this;
        }
        public String getFailedInstances() {
            return this.failedInstances;
        }

        public AddPrometheusGlobalViewResponseBodyDataInfo setGlobalViewClusterId(String globalViewClusterId) {
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }
        public String getGlobalViewClusterId() {
            return this.globalViewClusterId;
        }

        public AddPrometheusGlobalViewResponseBodyDataInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class AddPrometheusGlobalViewResponseBodyData extends TeaModel {
        @NameInMap("Info")
        public AddPrometheusGlobalViewResponseBodyDataInfo info;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("Success")
        public Boolean success;

        public static AddPrometheusGlobalViewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewResponseBodyData self = new AddPrometheusGlobalViewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewResponseBodyData setInfo(AddPrometheusGlobalViewResponseBodyDataInfo info) {
            this.info = info;
            return this;
        }
        public AddPrometheusGlobalViewResponseBodyDataInfo getInfo() {
            return this.info;
        }

        public AddPrometheusGlobalViewResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddPrometheusGlobalViewResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
