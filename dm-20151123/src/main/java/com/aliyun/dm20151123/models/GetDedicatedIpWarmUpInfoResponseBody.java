// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetDedicatedIpWarmUpInfoResponseBody extends TeaModel {
    @NameInMap("Info")
    public java.util.List<GetDedicatedIpWarmUpInfoResponseBodyInfo> info;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDedicatedIpWarmUpInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedIpWarmUpInfoResponseBody self = new GetDedicatedIpWarmUpInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDedicatedIpWarmUpInfoResponseBody setInfo(java.util.List<GetDedicatedIpWarmUpInfoResponseBodyInfo> info) {
        this.info = info;
        return this;
    }
    public java.util.List<GetDedicatedIpWarmUpInfoResponseBodyInfo> getInfo() {
        return this.info;
    }

    public GetDedicatedIpWarmUpInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDedicatedIpWarmUpInfoResponseBodyInfo extends TeaModel {
        @NameInMap("Esp")
        public String esp;

        @NameInMap("Finished")
        public Boolean finished;

        public static GetDedicatedIpWarmUpInfoResponseBodyInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDedicatedIpWarmUpInfoResponseBodyInfo self = new GetDedicatedIpWarmUpInfoResponseBodyInfo();
            return TeaModel.build(map, self);
        }

        public GetDedicatedIpWarmUpInfoResponseBodyInfo setEsp(String esp) {
            this.esp = esp;
            return this;
        }
        public String getEsp() {
            return this.esp;
        }

        public GetDedicatedIpWarmUpInfoResponseBodyInfo setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

    }

}
