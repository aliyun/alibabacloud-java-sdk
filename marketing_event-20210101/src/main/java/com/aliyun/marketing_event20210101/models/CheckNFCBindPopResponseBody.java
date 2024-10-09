// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class CheckNFCBindPopResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>deny</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("Data")
    public CheckNFCBindPopResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>403</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>1skladklasmda</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckNFCBindPopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckNFCBindPopResponseBody self = new CheckNFCBindPopResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckNFCBindPopResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckNFCBindPopResponseBody setData(CheckNFCBindPopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckNFCBindPopResponseBodyData getData() {
        return this.data;
    }

    public CheckNFCBindPopResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CheckNFCBindPopResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CheckNFCBindPopResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckNFCBindPopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckNFCBindPopResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckNFCBindPopResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsGlobal")
        public Integer isGlobal;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsSign")
        public Boolean isSign;

        public static CheckNFCBindPopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckNFCBindPopResponseBodyData self = new CheckNFCBindPopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckNFCBindPopResponseBodyData setIsGlobal(Integer isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }
        public Integer getIsGlobal() {
            return this.isGlobal;
        }

        public CheckNFCBindPopResponseBodyData setIsSign(Boolean isSign) {
            this.isSign = isSign;
            return this;
        }
        public Boolean getIsSign() {
            return this.isSign;
        }

    }

}
