// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetAssetInstanceStatisticsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetAssetInstanceStatisticsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAssetInstanceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetInstanceStatisticsResponseBody self = new GetAssetInstanceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetInstanceStatisticsResponseBody setData(java.util.List<GetAssetInstanceStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAssetInstanceStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public GetAssetInstanceStatisticsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAssetInstanceStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAssetInstanceStatisticsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAssetInstanceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetInstanceStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAssetInstanceStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Cnt")
        public Long cnt;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentUuid")
        public String parentUuid;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("UuidList")
        public java.util.List<String> uuidList;

        public static GetAssetInstanceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAssetInstanceStatisticsResponseBodyData self = new GetAssetInstanceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAssetInstanceStatisticsResponseBodyData setCnt(Long cnt) {
            this.cnt = cnt;
            return this;
        }
        public Long getCnt() {
            return this.cnt;
        }

        public GetAssetInstanceStatisticsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAssetInstanceStatisticsResponseBodyData setParentUuid(String parentUuid) {
            this.parentUuid = parentUuid;
            return this;
        }
        public String getParentUuid() {
            return this.parentUuid;
        }

        public GetAssetInstanceStatisticsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetAssetInstanceStatisticsResponseBodyData setUuidList(java.util.List<String> uuidList) {
            this.uuidList = uuidList;
            return this;
        }
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

    }

}
