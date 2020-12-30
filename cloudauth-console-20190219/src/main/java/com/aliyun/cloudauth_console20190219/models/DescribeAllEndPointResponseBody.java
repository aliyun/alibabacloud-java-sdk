// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeAllEndPointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public java.util.List<DescribeAllEndPointResponseBodyData> data;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAllEndPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllEndPointResponseBody self = new DescribeAllEndPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllEndPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAllEndPointResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAllEndPointResponseBody setData(java.util.List<DescribeAllEndPointResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAllEndPointResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAllEndPointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAllEndPointResponseBodyData extends TeaModel {
        @NameInMap("CityName")
        public String cityName;

        @NameInMap("EndPoint")
        public String endPoint;

        public static DescribeAllEndPointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllEndPointResponseBodyData self = new DescribeAllEndPointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAllEndPointResponseBodyData setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public DescribeAllEndPointResponseBodyData setEndPoint(String endPoint) {
            this.endPoint = endPoint;
            return this;
        }
        public String getEndPoint() {
            return this.endPoint;
        }

    }

}
