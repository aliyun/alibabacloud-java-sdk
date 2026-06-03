// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CopyVerifySchemeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>错误码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>结果数据</p>
     */
    @NameInMap("Data")
    public CopyVerifySchemeResponseBodyData data;

    /**
     * <p>错误消息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2E7CA885-8D97-C497-A02C-2D31214D3285</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CopyVerifySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyVerifySchemeResponseBody self = new CopyVerifySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyVerifySchemeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CopyVerifySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CopyVerifySchemeResponseBody setData(CopyVerifySchemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CopyVerifySchemeResponseBodyData getData() {
        return this.data;
    }

    public CopyVerifySchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CopyVerifySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyVerifySchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CopyVerifySchemeResponseBodyData extends TeaModel {
        /**
         * <p>方案Code</p>
         * 
         * <strong>example:</strong>
         * <p>FC100********212</p>
         */
        @NameInMap("SceneCode")
        public String sceneCode;

        public static CopyVerifySchemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CopyVerifySchemeResponseBodyData self = new CopyVerifySchemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CopyVerifySchemeResponseBodyData setSceneCode(String sceneCode) {
            this.sceneCode = sceneCode;
            return this;
        }
        public String getSceneCode() {
            return this.sceneCode;
        }

    }

}
