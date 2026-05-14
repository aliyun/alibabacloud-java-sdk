// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateEnterprisePauseResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkCreateEnterprisePauseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkCreateEnterprisePauseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateEnterprisePauseResponseBody self = new ClinkCreateEnterprisePauseResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkCreateEnterprisePauseResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkCreateEnterprisePauseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkCreateEnterprisePauseResponseBody setData(ClinkCreateEnterprisePauseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkCreateEnterprisePauseResponseBodyData getData() {
        return this.data;
    }

    public ClinkCreateEnterprisePauseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkCreateEnterprisePauseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause extends TeaModel {
        /**
         * <p>默认状态，0：不是；1：是</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDefault")
        public Long isDefault;

        /**
         * <p>休息状态，0：不是；1：是</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsRest")
        public String isRest;

        /**
         * <p>置忙状态描述（不超4个字符）</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("PauseStatus")
        public String pauseStatus;

        public static ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause self = new ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause();
            return TeaModel.build(map, self);
        }

        public ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause setIsDefault(Long isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Long getIsDefault() {
            return this.isDefault;
        }

        public ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause setIsRest(String isRest) {
            this.isRest = isRest;
            return this;
        }
        public String getIsRest() {
            return this.isRest;
        }

        public ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause setPauseStatus(String pauseStatus) {
            this.pauseStatus = pauseStatus;
            return this;
        }
        public String getPauseStatus() {
            return this.pauseStatus;
        }

    }

    public static class ClinkCreateEnterprisePauseResponseBodyData extends TeaModel {
        /**
         * <p>请求标识</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>企业置忙状态</p>
         */
        @NameInMap("EnterprisePause")
        public ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause enterprisePause;

        public static ClinkCreateEnterprisePauseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateEnterprisePauseResponseBodyData self = new ClinkCreateEnterprisePauseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkCreateEnterprisePauseResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkCreateEnterprisePauseResponseBodyData setEnterprisePause(ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause enterprisePause) {
            this.enterprisePause = enterprisePause;
            return this;
        }
        public ClinkCreateEnterprisePauseResponseBodyDataEnterprisePause getEnterprisePause() {
            return this.enterprisePause;
        }

    }

}
