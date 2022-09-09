// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetModuleMarketResponseBody extends TeaModel {
    @NameInMap("moduleMarket")
    public GetModuleMarketResponseBodyModuleMarket moduleMarket;

    @NameInMap("requestId")
    public String requestId;

    public static GetModuleMarketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModuleMarketResponseBody self = new GetModuleMarketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModuleMarketResponseBody setModuleMarket(GetModuleMarketResponseBodyModuleMarket moduleMarket) {
        this.moduleMarket = moduleMarket;
        return this;
    }
    public GetModuleMarketResponseBodyModuleMarket getModuleMarket() {
        return this.moduleMarket;
    }

    public GetModuleMarketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetModuleMarketResponseBodyModuleMarket extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("message")
        public String message;

        @NameInMap("moduleDetail")
        public String moduleDetail;

        @NameInMap("moduleId")
        public String moduleId;

        @NameInMap("moduleMarketId")
        public String moduleMarketId;

        @NameInMap("moduleVersion")
        public String moduleVersion;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        public static GetModuleMarketResponseBodyModuleMarket build(java.util.Map<String, ?> map) throws Exception {
            GetModuleMarketResponseBodyModuleMarket self = new GetModuleMarketResponseBodyModuleMarket();
            return TeaModel.build(map, self);
        }

        public GetModuleMarketResponseBodyModuleMarket setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModuleMarketResponseBodyModuleMarket setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetModuleMarketResponseBodyModuleMarket setModuleDetail(String moduleDetail) {
            this.moduleDetail = moduleDetail;
            return this;
        }
        public String getModuleDetail() {
            return this.moduleDetail;
        }

        public GetModuleMarketResponseBodyModuleMarket setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetModuleMarketResponseBodyModuleMarket setModuleMarketId(String moduleMarketId) {
            this.moduleMarketId = moduleMarketId;
            return this;
        }
        public String getModuleMarketId() {
            return this.moduleMarketId;
        }

        public GetModuleMarketResponseBodyModuleMarket setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetModuleMarketResponseBodyModuleMarket setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetModuleMarketResponseBodyModuleMarket setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
