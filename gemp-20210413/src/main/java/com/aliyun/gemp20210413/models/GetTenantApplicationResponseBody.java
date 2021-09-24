// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantApplicationResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public GetTenantApplicationResponseBodyData data;

    // id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetTenantApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTenantApplicationResponseBody self = new GetTenantApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTenantApplicationResponseBody setData(GetTenantApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTenantApplicationResponseBodyData getData() {
        return this.data;
    }

    public GetTenantApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTenantApplicationResponseBodyData extends TeaModel {
        // 企业id
        @NameInMap("corporationId")
        public String corporationId;

        // 业务id
        @NameInMap("bizId")
        public String bizId;

        // 进度
        @NameInMap("progress")
        public String progress;

        // 云钉协同渠道
        @NameInMap("channel")
        public String channel;

        public static GetTenantApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantApplicationResponseBodyData self = new GetTenantApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantApplicationResponseBodyData setCorporationId(String corporationId) {
            this.corporationId = corporationId;
            return this;
        }
        public String getCorporationId() {
            return this.corporationId;
        }

        public GetTenantApplicationResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetTenantApplicationResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetTenantApplicationResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

    }

}
