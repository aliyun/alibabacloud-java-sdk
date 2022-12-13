// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantStatusResponseBody extends TeaModel {
    @NameInMap("data")
    public GetTenantStatusResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static GetTenantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTenantStatusResponseBody self = new GetTenantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTenantStatusResponseBody setData(GetTenantStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTenantStatusResponseBodyData getData() {
        return this.data;
    }

    public GetTenantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTenantStatusResponseBodyData extends TeaModel {
        @NameInMap("tenantStatus")
        public Integer tenantStatus;

        public static GetTenantStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantStatusResponseBodyData self = new GetTenantStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantStatusResponseBodyData setTenantStatus(Integer tenantStatus) {
            this.tenantStatus = tenantStatus;
            return this;
        }
        public Integer getTenantStatus() {
            return this.tenantStatus;
        }

    }

}
