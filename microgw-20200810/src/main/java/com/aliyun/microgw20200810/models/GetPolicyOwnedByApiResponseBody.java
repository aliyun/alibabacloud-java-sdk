// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetPolicyOwnedByApiResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    @NameInMap("data")
    public java.util.List<GetPolicyOwnedByApiResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetPolicyOwnedByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyOwnedByApiResponseBody self = new GetPolicyOwnedByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyOwnedByApiResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPolicyOwnedByApiResponseBody setData(java.util.List<GetPolicyOwnedByApiResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPolicyOwnedByApiResponseBodyData> getData() {
        return this.data;
    }

    public GetPolicyOwnedByApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetPolicyOwnedByApiResponseBodyData extends TeaModel {
        @NameInMap("scopes")
        public java.util.Map<String, java.util.List<DataScopesValue>> scopes;

        public static GetPolicyOwnedByApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyOwnedByApiResponseBodyData self = new GetPolicyOwnedByApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPolicyOwnedByApiResponseBodyData setScopes(java.util.Map<String, java.util.List<DataScopesValue>> scopes) {
            this.scopes = scopes;
            return this;
        }
        public java.util.Map<String, java.util.List<DataScopesValue>> getScopes() {
            return this.scopes;
        }

    }

}
