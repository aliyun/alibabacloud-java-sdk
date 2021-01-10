// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class GetAlgorithmDetailResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetAlgorithmDetailResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAlgorithmDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDetailResponseBody self = new GetAlgorithmDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAlgorithmDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlgorithmDetailResponseBody setData(GetAlgorithmDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAlgorithmDetailResponseBodyData getData() {
        return this.data;
    }

    public GetAlgorithmDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAlgorithmDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAlgorithmDetailResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("DeployRegion")
        public String deployRegion;

        @NameInMap("CurrentMonthCount")
        public Integer currentMonthCount;

        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("ApiDocUrl")
        public String apiDocUrl;

        @NameInMap("CurrentMonthSuccessCount")
        public Integer currentMonthSuccessCount;

        public static GetAlgorithmDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAlgorithmDetailResponseBodyData self = new GetAlgorithmDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAlgorithmDetailResponseBodyData setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public GetAlgorithmDetailResponseBodyData setDeployRegion(String deployRegion) {
            this.deployRegion = deployRegion;
            return this;
        }
        public String getDeployRegion() {
            return this.deployRegion;
        }

        public GetAlgorithmDetailResponseBodyData setCurrentMonthCount(Integer currentMonthCount) {
            this.currentMonthCount = currentMonthCount;
            return this;
        }
        public Integer getCurrentMonthCount() {
            return this.currentMonthCount;
        }

        public GetAlgorithmDetailResponseBodyData setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public GetAlgorithmDetailResponseBodyData setApiDocUrl(String apiDocUrl) {
            this.apiDocUrl = apiDocUrl;
            return this;
        }
        public String getApiDocUrl() {
            return this.apiDocUrl;
        }

        public GetAlgorithmDetailResponseBodyData setCurrentMonthSuccessCount(Integer currentMonthSuccessCount) {
            this.currentMonthSuccessCount = currentMonthSuccessCount;
            return this;
        }
        public Integer getCurrentMonthSuccessCount() {
            return this.currentMonthSuccessCount;
        }

    }

}
