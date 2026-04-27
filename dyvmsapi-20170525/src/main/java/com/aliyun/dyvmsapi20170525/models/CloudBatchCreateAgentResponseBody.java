// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudBatchCreateAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudBatchCreateAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudBatchCreateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudBatchCreateAgentResponseBody self = new CloudBatchCreateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudBatchCreateAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudBatchCreateAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudBatchCreateAgentResponseBody setData(CloudBatchCreateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudBatchCreateAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudBatchCreateAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudBatchCreateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudBatchCreateAgentResponseBodyData extends TeaModel {
        /**
         * <p>成功创建的座席号</p>
         * 
         * <strong>example:</strong>
         * <p>100,101,102,103</p>
         */
        @NameInMap("Cnos")
        public String cnos;

        /**
         * <p>创建座席失败数量</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Fail")
        public String fail;

        /**
         * <p>座席创建成功,绑定技能失败的数量</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Other")
        public String other;

        /**
         * <p>创建座席成功数量</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Success")
        public String success;

        public static CloudBatchCreateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudBatchCreateAgentResponseBodyData self = new CloudBatchCreateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudBatchCreateAgentResponseBodyData setCnos(String cnos) {
            this.cnos = cnos;
            return this;
        }
        public String getCnos() {
            return this.cnos;
        }

        public CloudBatchCreateAgentResponseBodyData setFail(String fail) {
            this.fail = fail;
            return this;
        }
        public String getFail() {
            return this.fail;
        }

        public CloudBatchCreateAgentResponseBodyData setOther(String other) {
            this.other = other;
            return this;
        }
        public String getOther() {
            return this.other;
        }

        public CloudBatchCreateAgentResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
