// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetTenantApplicationResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public GetTenantApplicationResponseBodyData data;

    /**
     * <p>id of the request</p>
     */
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
        @NameInMap("bizId")
        public String bizId;

        @NameInMap("channel")
        public String channel;

        @NameInMap("corporationId")
        public String corporationId;

        @NameInMap("originalCorpId")
        public String originalCorpId;

        @NameInMap("progress")
        public String progress;

        public static GetTenantApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTenantApplicationResponseBodyData self = new GetTenantApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTenantApplicationResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public GetTenantApplicationResponseBodyData setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetTenantApplicationResponseBodyData setCorporationId(String corporationId) {
            this.corporationId = corporationId;
            return this;
        }
        public String getCorporationId() {
            return this.corporationId;
        }

        public GetTenantApplicationResponseBodyData setOriginalCorpId(String originalCorpId) {
            this.originalCorpId = originalCorpId;
            return this;
        }
        public String getOriginalCorpId() {
            return this.originalCorpId;
        }

        public GetTenantApplicationResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

    }

}
