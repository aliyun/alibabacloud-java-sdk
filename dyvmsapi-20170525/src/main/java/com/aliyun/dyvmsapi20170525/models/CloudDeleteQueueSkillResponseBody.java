// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteQueueSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteQueueSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudDeleteQueueSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteQueueSkillResponseBody self = new CloudDeleteQueueSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteQueueSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteQueueSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteQueueSkillResponseBody setData(CloudDeleteQueueSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteQueueSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteQueueSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteQueueSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteQueueSkillResponseBodyData extends TeaModel {
        /**
         * <p>0-成功，其它-失败</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteQueueSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteQueueSkillResponseBodyData self = new CloudDeleteQueueSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteQueueSkillResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
