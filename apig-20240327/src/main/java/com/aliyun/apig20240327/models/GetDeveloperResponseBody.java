// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDeveloperResponseBody extends TeaModel {
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
    public GetDeveloperResponseBodyData data;

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

    public static GetDeveloperResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeveloperResponseBody self = new GetDeveloperResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeveloperResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeveloperResponseBody setData(GetDeveloperResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDeveloperResponseBodyData getData() {
        return this.data;
    }

    public GetDeveloperResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeveloperResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeveloperResponseBodyData extends TeaModel {
        /**
         * <p>The developer ID. This ID can be used to identify the developer in API operations such as SetHiMarketDeveloperStatus and DeleteHiMarketDeveloper.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-xxxxxxxx</p>
         */
        @NameInMap("developerId")
        public String developerId;

        /**
         * <p>The ID of the portal to which the developer belongs. This ID can be used to identify the portal in API operations such as GetPortal, UpdatePortal, and DeletePortal.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        @NameInMap("portalId")
        public String portalId;

        /**
         * <p>The developer status. Valid values: PENDING, APPROVED, and REJECTED.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The logon username of the developer.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-demo</p>
         */
        @NameInMap("username")
        public String username;

        public static GetDeveloperResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDeveloperResponseBodyData self = new GetDeveloperResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDeveloperResponseBodyData setDeveloperId(String developerId) {
            this.developerId = developerId;
            return this;
        }
        public String getDeveloperId() {
            return this.developerId;
        }

        public GetDeveloperResponseBodyData setPortalId(String portalId) {
            this.portalId = portalId;
            return this;
        }
        public String getPortalId() {
            return this.portalId;
        }

        public GetDeveloperResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDeveloperResponseBodyData setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
