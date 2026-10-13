// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdatePortalResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public UpdatePortalResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdatePortalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePortalResponseBody self = new UpdatePortalResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePortalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdatePortalResponseBody setData(UpdatePortalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdatePortalResponseBodyData getData() {
        return this.data;
    }

    public UpdatePortalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdatePortalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdatePortalResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the updated portal. This is the primary ID of the portal resource specified by the portalId path parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        @NameInMap("portalId")
        public String portalId;

        public static UpdatePortalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdatePortalResponseBodyData self = new UpdatePortalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdatePortalResponseBodyData setPortalId(String portalId) {
            this.portalId = portalId;
            return this;
        }
        public String getPortalId() {
            return this.portalId;
        }

    }

}
