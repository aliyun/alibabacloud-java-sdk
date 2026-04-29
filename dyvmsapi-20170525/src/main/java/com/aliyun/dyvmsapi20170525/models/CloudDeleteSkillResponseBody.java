// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudDeleteSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudDeleteSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ED18A5AE-9BBC-5851-1111-8E5B8C23CEDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudDeleteSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudDeleteSkillResponseBody self = new CloudDeleteSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudDeleteSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudDeleteSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudDeleteSkillResponseBody setData(CloudDeleteSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudDeleteSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudDeleteSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudDeleteSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudDeleteSkillResponseBodyData extends TeaModel {
        /**
         * <p>0-成功，-1 失败</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Result")
        public Long result;

        public static CloudDeleteSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudDeleteSkillResponseBodyData self = new CloudDeleteSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudDeleteSkillResponseBodyData setResult(Long result) {
            this.result = result;
            return this;
        }
        public Long getResult() {
            return this.result;
        }

    }

}
