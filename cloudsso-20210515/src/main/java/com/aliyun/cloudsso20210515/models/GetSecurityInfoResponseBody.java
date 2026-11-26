// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetSecurityInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE42D2C4-A30A-59B7-ACEB-6D22FB44174A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security email information of the user.</p>
     * <blockquote>
     * <p>If the user has not configured a security email address, this field is not returned.</p>
     * </blockquote>
     */
    @NameInMap("SecurityEmail")
    public GetSecurityInfoResponseBodySecurityEmail securityEmail;

    public static GetSecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityInfoResponseBody self = new GetSecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityInfoResponseBody setSecurityEmail(GetSecurityInfoResponseBodySecurityEmail securityEmail) {
        this.securityEmail = securityEmail;
        return this;
    }
    public GetSecurityInfoResponseBodySecurityEmail getSecurityEmail() {
        return this.securityEmail;
    }

    public static class GetSecurityInfoResponseBodySecurityEmail extends TeaModel {
        /**
         * <p>The security email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The verification status of the security email address. Valid values:</p>
         * <ul>
         * <li>active: Verified.</li>
         * <li>pending: Pending verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetSecurityInfoResponseBodySecurityEmail build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityInfoResponseBodySecurityEmail self = new GetSecurityInfoResponseBodySecurityEmail();
            return TeaModel.build(map, self);
        }

        public GetSecurityInfoResponseBodySecurityEmail setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetSecurityInfoResponseBodySecurityEmail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
