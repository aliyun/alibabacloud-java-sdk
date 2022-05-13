// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryUserVpcResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryUserVpcResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryUserVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserVpcResponseBody self = new QueryUserVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserVpcResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryUserVpcResponseBody setData(java.util.List<QueryUserVpcResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryUserVpcResponseBodyData> getData() {
        return this.data;
    }

    public QueryUserVpcResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryUserVpcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserVpcResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryUserVpcResponseBodyDataVSwitchList extends TeaModel {
        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("VswitchName")
        public String vswitchName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryUserVpcResponseBodyDataVSwitchList build(java.util.Map<String, ?> map) throws Exception {
            QueryUserVpcResponseBodyDataVSwitchList self = new QueryUserVpcResponseBodyDataVSwitchList();
            return TeaModel.build(map, self);
        }

        public QueryUserVpcResponseBodyDataVSwitchList setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public QueryUserVpcResponseBodyDataVSwitchList setVswitchName(String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        public String getVswitchName() {
            return this.vswitchName;
        }

        public QueryUserVpcResponseBodyDataVSwitchList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class QueryUserVpcResponseBodyData extends TeaModel {
        @NameInMap("VSwitchList")
        public java.util.List<QueryUserVpcResponseBodyDataVSwitchList> vSwitchList;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static QueryUserVpcResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserVpcResponseBodyData self = new QueryUserVpcResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryUserVpcResponseBodyData setVSwitchList(java.util.List<QueryUserVpcResponseBodyDataVSwitchList> vSwitchList) {
            this.vSwitchList = vSwitchList;
            return this;
        }
        public java.util.List<QueryUserVpcResponseBodyDataVSwitchList> getVSwitchList() {
            return this.vSwitchList;
        }

        public QueryUserVpcResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryUserVpcResponseBodyData setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
