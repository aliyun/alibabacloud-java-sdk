// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewByAliClusterIdsResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 is success, other status codes are exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData data;

    /**
     * <p>Returns a hint message for the result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3A0EA2AF-C9B3-555C-B9D5-5DD8F5EF98A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPrometheusGlobalViewByAliClusterIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewByAliClusterIdsResponseBody self = new AddPrometheusGlobalViewByAliClusterIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setData(AddPrometheusGlobalViewByAliClusterIdsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData getData() {
        return this.data;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddPrometheusGlobalViewByAliClusterIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddPrometheusGlobalViewByAliClusterIdsResponseBodyData extends TeaModel {
        /**
         * <p>The Info-level information.</p>
         * 
         * <strong>example:</strong>
         * <p>{regionId: the region where the aggregation instance resides. globalViewClusterId: the ID of the aggregation instance. failedClusterIds: the ID of the cluster that failed to be added. A cluster may fail to be added because the specified cluster ID is invalid or the cluster is added across continents.}</p>
         */
        @NameInMap("Info")
        public String info;

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code></li>
         * <li><code>false</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AddPrometheusGlobalViewByAliClusterIdsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewByAliClusterIdsResponseBodyData self = new AddPrometheusGlobalViewByAliClusterIdsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

        public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public AddPrometheusGlobalViewByAliClusterIdsResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
