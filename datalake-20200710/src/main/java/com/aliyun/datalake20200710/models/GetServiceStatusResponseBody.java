// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetServiceStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServiceStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceStatusResponseBody self = new GetServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceStatusResponseBody setData(GetServiceStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceStatusResponseBodyData getData() {
        return this.data;
    }

    public GetServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceStatusResponseBodyData extends TeaModel {
        @NameInMap("HasRamPermissions")
        public Boolean hasRamPermissions;

        @NameInMap("IsDlfServiceOpen")
        public Boolean isDlfServiceOpen;

        @NameInMap("IsOssOpen")
        public Boolean isOssOpen;

        public static GetServiceStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceStatusResponseBodyData self = new GetServiceStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceStatusResponseBodyData setHasRamPermissions(Boolean hasRamPermissions) {
            this.hasRamPermissions = hasRamPermissions;
            return this;
        }
        public Boolean getHasRamPermissions() {
            return this.hasRamPermissions;
        }

        public GetServiceStatusResponseBodyData setIsDlfServiceOpen(Boolean isDlfServiceOpen) {
            this.isDlfServiceOpen = isDlfServiceOpen;
            return this;
        }
        public Boolean getIsDlfServiceOpen() {
            return this.isDlfServiceOpen;
        }

        public GetServiceStatusResponseBodyData setIsOssOpen(Boolean isOssOpen) {
            this.isOssOpen = isOssOpen;
            return this;
        }
        public Boolean getIsOssOpen() {
            return this.isOssOpen;
        }

    }

}
