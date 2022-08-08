// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class DescribeReleasableRegionListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<DescribeReleasableRegionListResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeReleasableRegionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReleasableRegionListResponseBody self = new DescribeReleasableRegionListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReleasableRegionListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeReleasableRegionListResponseBody setData(java.util.List<DescribeReleasableRegionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeReleasableRegionListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeReleasableRegionListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeReleasableRegionListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public DescribeReleasableRegionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeReleasableRegionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeReleasableRegionListResponseBodyData extends TeaModel {
        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("TrackId")
        public String trackId;

        public static DescribeReleasableRegionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeReleasableRegionListResponseBodyData self = new DescribeReleasableRegionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeReleasableRegionListResponseBodyData setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeReleasableRegionListResponseBodyData setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeReleasableRegionListResponseBodyData setTrackId(String trackId) {
            this.trackId = trackId;
            return this;
        }
        public String getTrackId() {
            return this.trackId;
        }

    }

}
