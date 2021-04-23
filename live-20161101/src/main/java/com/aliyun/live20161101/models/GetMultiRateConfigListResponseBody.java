// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMultiRateConfigListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GroupInfo")
    public GetMultiRateConfigListResponseBodyGroupInfo groupInfo;

    @NameInMap("Code")
    public Integer code;

    public static GetMultiRateConfigListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiRateConfigListResponseBody self = new GetMultiRateConfigListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiRateConfigListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMultiRateConfigListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiRateConfigListResponseBody setGroupInfo(GetMultiRateConfigListResponseBodyGroupInfo groupInfo) {
        this.groupInfo = groupInfo;
        return this;
    }
    public GetMultiRateConfigListResponseBodyGroupInfo getGroupInfo() {
        return this.groupInfo;
    }

    public GetMultiRateConfigListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class GetMultiRateConfigListResponseBodyGroupInfoInfo extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("App")
        public String app;

        @NameInMap("AvFormat")
        public String avFormat;

        @NameInMap("Count")
        public Integer count;

        public static GetMultiRateConfigListResponseBodyGroupInfoInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMultiRateConfigListResponseBodyGroupInfoInfo self = new GetMultiRateConfigListResponseBodyGroupInfoInfo();
            return TeaModel.build(map, self);
        }

        public GetMultiRateConfigListResponseBodyGroupInfoInfo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetMultiRateConfigListResponseBodyGroupInfoInfo setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public GetMultiRateConfigListResponseBodyGroupInfoInfo setAvFormat(String avFormat) {
            this.avFormat = avFormat;
            return this;
        }
        public String getAvFormat() {
            return this.avFormat;
        }

        public GetMultiRateConfigListResponseBodyGroupInfoInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class GetMultiRateConfigListResponseBodyGroupInfo extends TeaModel {
        @NameInMap("Info")
        public java.util.List<GetMultiRateConfigListResponseBodyGroupInfoInfo> info;

        public static GetMultiRateConfigListResponseBodyGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMultiRateConfigListResponseBodyGroupInfo self = new GetMultiRateConfigListResponseBodyGroupInfo();
            return TeaModel.build(map, self);
        }

        public GetMultiRateConfigListResponseBodyGroupInfo setInfo(java.util.List<GetMultiRateConfigListResponseBodyGroupInfoInfo> info) {
            this.info = info;
            return this;
        }
        public java.util.List<GetMultiRateConfigListResponseBodyGroupInfoInfo> getInfo() {
            return this.info;
        }

    }

}
