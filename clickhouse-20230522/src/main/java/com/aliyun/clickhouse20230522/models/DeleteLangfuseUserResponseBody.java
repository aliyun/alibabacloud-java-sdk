// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseUserResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
     */
    @NameInMap("Data")
    public DeleteLangfuseUserResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLangfuseUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseUserResponseBody self = new DeleteLangfuseUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseUserResponseBody setData(DeleteLangfuseUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLangfuseUserResponseBodyData getData() {
        return this.data;
    }

    public DeleteLangfuseUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLangfuseUserResponseBodyData extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        public static DeleteLangfuseUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLangfuseUserResponseBodyData self = new DeleteLangfuseUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLangfuseUserResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
