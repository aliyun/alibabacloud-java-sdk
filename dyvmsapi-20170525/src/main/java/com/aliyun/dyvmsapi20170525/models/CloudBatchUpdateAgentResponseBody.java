// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudBatchUpdateAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudBatchUpdateAgentResponseBodyData data;

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

    public static CloudBatchUpdateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudBatchUpdateAgentResponseBody self = new CloudBatchUpdateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudBatchUpdateAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudBatchUpdateAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudBatchUpdateAgentResponseBody setData(CloudBatchUpdateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudBatchUpdateAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudBatchUpdateAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudBatchUpdateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudBatchUpdateAgentResponseBodyData extends TeaModel {
        /**
         * <p>座席配置信息修改失败的座席工号列表</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Fail")
        public String fail;

        /**
         * <p>座席配置信息修改成功数量</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Success")
        public String success;

        public static CloudBatchUpdateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudBatchUpdateAgentResponseBodyData self = new CloudBatchUpdateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudBatchUpdateAgentResponseBodyData setFail(String fail) {
            this.fail = fail;
            return this;
        }
        public String getFail() {
            return this.fail;
        }

        public CloudBatchUpdateAgentResponseBodyData setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
