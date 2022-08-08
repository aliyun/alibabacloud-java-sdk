// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeAccessibleRegionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeAccessibleRegionsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAccessibleRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessibleRegionsResponseBody self = new DescribeAccessibleRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccessibleRegionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAccessibleRegionsResponseBody setData(java.util.List<DescribeAccessibleRegionsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAccessibleRegionsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAccessibleRegionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeAccessibleRegionsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeAccessibleRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccessibleRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAccessibleRegionsResponseBodyData extends TeaModel {
        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeAccessibleRegionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccessibleRegionsResponseBodyData self = new DescribeAccessibleRegionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccessibleRegionsResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeAccessibleRegionsResponseBodyData setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeAccessibleRegionsResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
