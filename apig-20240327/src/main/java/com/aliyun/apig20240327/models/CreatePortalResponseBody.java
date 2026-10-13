// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePortalResponseBody extends TeaModel {
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
    public CreatePortalResponseBodyData data;

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

    public static CreatePortalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePortalResponseBody self = new CreatePortalResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePortalResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePortalResponseBody setData(CreatePortalResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePortalResponseBodyData getData() {
        return this.data;
    }

    public CreatePortalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePortalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePortalResponseBodyData extends TeaModel {
        /**
         * <p>The portal ID. It can be used to locate the portal in API operations such as GetPortal, UpdatePortal, and DeletePortal.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        @NameInMap("portalId")
        public String portalId;

        public static CreatePortalResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePortalResponseBodyData self = new CreatePortalResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePortalResponseBodyData setPortalId(String portalId) {
            this.portalId = portalId;
            return this;
        }
        public String getPortalId() {
            return this.portalId;
        }

    }

}
