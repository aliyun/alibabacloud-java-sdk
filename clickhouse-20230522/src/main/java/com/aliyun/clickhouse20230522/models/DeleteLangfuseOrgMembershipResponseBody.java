// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class DeleteLangfuseOrgMembershipResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
     */
    @NameInMap("Data")
    public DeleteLangfuseOrgMembershipResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLangfuseOrgMembershipResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLangfuseOrgMembershipResponseBody self = new DeleteLangfuseOrgMembershipResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLangfuseOrgMembershipResponseBody setData(DeleteLangfuseOrgMembershipResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLangfuseOrgMembershipResponseBodyData getData() {
        return this.data;
    }

    public DeleteLangfuseOrgMembershipResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteLangfuseOrgMembershipResponseBodyData extends TeaModel {
        /**
         * <p>The email address of the user.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:john@company.com">john@company.com</a></p>
         */
        @NameInMap("Email")
        public String email;

        public static DeleteLangfuseOrgMembershipResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLangfuseOrgMembershipResponseBodyData self = new DeleteLangfuseOrgMembershipResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLangfuseOrgMembershipResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

    }

}
