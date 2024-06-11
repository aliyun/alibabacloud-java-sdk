// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetAdbSecureResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetAdbSecureResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAdbSecureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdbSecureResponseBody self = new GetAdbSecureResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdbSecureResponseBody setData(GetAdbSecureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAdbSecureResponseBodyData getData() {
        return this.data;
    }

    public GetAdbSecureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAdbSecureResponseBodyDataAdbSecureList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Status")
        public Integer status;

        public static GetAdbSecureResponseBodyDataAdbSecureList build(java.util.Map<String, ?> map) throws Exception {
            GetAdbSecureResponseBodyDataAdbSecureList self = new GetAdbSecureResponseBodyDataAdbSecureList();
            return TeaModel.build(map, self);
        }

        public GetAdbSecureResponseBodyDataAdbSecureList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAdbSecureResponseBodyDataAdbSecureList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetAdbSecureResponseBodyData extends TeaModel {
        @NameInMap("AdbSecureList")
        public java.util.List<GetAdbSecureResponseBodyDataAdbSecureList> adbSecureList;

        public static GetAdbSecureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAdbSecureResponseBodyData self = new GetAdbSecureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAdbSecureResponseBodyData setAdbSecureList(java.util.List<GetAdbSecureResponseBodyDataAdbSecureList> adbSecureList) {
            this.adbSecureList = adbSecureList;
            return this;
        }
        public java.util.List<GetAdbSecureResponseBodyDataAdbSecureList> getAdbSecureList() {
            return this.adbSecureList;
        }

    }

}
