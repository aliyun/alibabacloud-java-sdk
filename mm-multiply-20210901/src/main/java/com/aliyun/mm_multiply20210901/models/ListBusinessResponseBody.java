// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListBusinessResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RainbowUserBusinessModels")
    public java.util.List<ListBusinessResponseBodyRainbowUserBusinessModels> rainbowUserBusinessModels;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBusinessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponseBody self = new ListBusinessResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBusinessResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListBusinessResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBusinessResponseBody setRainbowUserBusinessModels(java.util.List<ListBusinessResponseBodyRainbowUserBusinessModels> rainbowUserBusinessModels) {
        this.rainbowUserBusinessModels = rainbowUserBusinessModels;
        return this;
    }
    public java.util.List<ListBusinessResponseBodyRainbowUserBusinessModels> getRainbowUserBusinessModels() {
        return this.rainbowUserBusinessModels;
    }

    public ListBusinessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBusinessResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBusinessResponseBodyRainbowUserBusinessModels extends TeaModel {
        @NameInMap("AppType")
        public String appType;

        @NameInMap("BusinessId")
        public String businessId;

        @NameInMap("Name")
        public String name;

        @NameInMap("TpBusinessId")
        public String tpBusinessId;

        @NameInMap("TpUserId")
        public String tpUserId;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("ValidEndTime")
        public String validEndTime;

        @NameInMap("ValidStartTime")
        public String validStartTime;

        public static ListBusinessResponseBodyRainbowUserBusinessModels build(java.util.Map<String, ?> map) throws Exception {
            ListBusinessResponseBodyRainbowUserBusinessModels self = new ListBusinessResponseBodyRainbowUserBusinessModels();
            return TeaModel.build(map, self);
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setTpBusinessId(String tpBusinessId) {
            this.tpBusinessId = tpBusinessId;
            return this;
        }
        public String getTpBusinessId() {
            return this.tpBusinessId;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setTpUserId(String tpUserId) {
            this.tpUserId = tpUserId;
            return this;
        }
        public String getTpUserId() {
            return this.tpUserId;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setValidEndTime(String validEndTime) {
            this.validEndTime = validEndTime;
            return this;
        }
        public String getValidEndTime() {
            return this.validEndTime;
        }

        public ListBusinessResponseBodyRainbowUserBusinessModels setValidStartTime(String validStartTime) {
            this.validStartTime = validStartTime;
            return this;
        }
        public String getValidStartTime() {
            return this.validStartTime;
        }

    }

}
