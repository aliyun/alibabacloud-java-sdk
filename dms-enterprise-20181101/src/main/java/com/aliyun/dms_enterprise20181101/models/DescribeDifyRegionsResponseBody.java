// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeDifyRegionsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDifyRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyRegionsResponseBody self = new DescribeDifyRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDifyRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDifyRegionsResponseBody setData(java.util.List<DescribeDifyRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDifyRegionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDifyRegionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDifyRegionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDifyRegionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDifyRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDifyRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDifyRegionsResponseBodyData extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        public static DescribeDifyRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDifyRegionsResponseBodyData self = new DescribeDifyRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDifyRegionsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
