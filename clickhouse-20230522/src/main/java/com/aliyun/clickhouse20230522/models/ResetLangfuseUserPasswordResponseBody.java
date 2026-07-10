// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ResetLangfuseUserPasswordResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
     */
    @NameInMap("Data")
    public ResetLangfuseUserPasswordResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetLangfuseUserPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetLangfuseUserPasswordResponseBody self = new ResetLangfuseUserPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetLangfuseUserPasswordResponseBody setData(ResetLangfuseUserPasswordResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ResetLangfuseUserPasswordResponseBodyData getData() {
        return this.data;
    }

    public ResetLangfuseUserPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ResetLangfuseUserPasswordResponseBodyData extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        public static ResetLangfuseUserPasswordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ResetLangfuseUserPasswordResponseBodyData self = new ResetLangfuseUserPasswordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ResetLangfuseUserPasswordResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
