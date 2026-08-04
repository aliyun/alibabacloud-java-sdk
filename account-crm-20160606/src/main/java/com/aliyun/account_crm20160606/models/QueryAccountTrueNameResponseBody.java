// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountTrueNameResponseBody extends TeaModel {
    @NameInMap("ProfileInfo")
    public QueryAccountTrueNameResponseBodyProfileInfo profileInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccountTrueNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountTrueNameResponseBody self = new QueryAccountTrueNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountTrueNameResponseBody setProfileInfo(QueryAccountTrueNameResponseBodyProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public QueryAccountTrueNameResponseBodyProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public QueryAccountTrueNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccountTrueNameResponseBodyProfileInfo extends TeaModel {
        @NameInMap("TrueName")
        public String trueName;

        public static QueryAccountTrueNameResponseBodyProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountTrueNameResponseBodyProfileInfo self = new QueryAccountTrueNameResponseBodyProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryAccountTrueNameResponseBodyProfileInfo setTrueName(String trueName) {
            this.trueName = trueName;
            return this;
        }
        public String getTrueName() {
            return this.trueName;
        }

    }

}
