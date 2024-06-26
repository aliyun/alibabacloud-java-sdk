// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeMemberRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeMemberRoleResponseBodyResult result;

    public static DescribeMemberRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMemberRoleResponseBody self = new DescribeMemberRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMemberRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMemberRoleResponseBody setResult(DescribeMemberRoleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeMemberRoleResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeMemberRoleResponseBodyResult extends TeaModel {
        @NameInMap("Role")
        public Integer role;

        public static DescribeMemberRoleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeMemberRoleResponseBodyResult self = new DescribeMemberRoleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeMemberRoleResponseBodyResult setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

}
