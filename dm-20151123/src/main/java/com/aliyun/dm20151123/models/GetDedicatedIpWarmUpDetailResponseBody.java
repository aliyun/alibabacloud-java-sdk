// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetDedicatedIpWarmUpDetailResponseBody extends TeaModel {
    @NameInMap("Detail")
    public java.util.List<GetDedicatedIpWarmUpDetailResponseBodyDetail> detail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDedicatedIpWarmUpDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedIpWarmUpDetailResponseBody self = new GetDedicatedIpWarmUpDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDedicatedIpWarmUpDetailResponseBody setDetail(java.util.List<GetDedicatedIpWarmUpDetailResponseBodyDetail> detail) {
        this.detail = detail;
        return this;
    }
    public java.util.List<GetDedicatedIpWarmUpDetailResponseBodyDetail> getDetail() {
        return this.detail;
    }

    public GetDedicatedIpWarmUpDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDedicatedIpWarmUpDetailResponseBodyDetail extends TeaModel {
        @NameInMap("DayMark")
        public Long dayMark;

        @NameInMap("DeliverCounts")
        public Long deliverCounts;

        @NameInMap("Esp")
        public String esp;

        @NameInMap("SendCounts")
        public Long sendCounts;

        public static GetDedicatedIpWarmUpDetailResponseBodyDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDedicatedIpWarmUpDetailResponseBodyDetail self = new GetDedicatedIpWarmUpDetailResponseBodyDetail();
            return TeaModel.build(map, self);
        }

        public GetDedicatedIpWarmUpDetailResponseBodyDetail setDayMark(Long dayMark) {
            this.dayMark = dayMark;
            return this;
        }
        public Long getDayMark() {
            return this.dayMark;
        }

        public GetDedicatedIpWarmUpDetailResponseBodyDetail setDeliverCounts(Long deliverCounts) {
            this.deliverCounts = deliverCounts;
            return this;
        }
        public Long getDeliverCounts() {
            return this.deliverCounts;
        }

        public GetDedicatedIpWarmUpDetailResponseBodyDetail setEsp(String esp) {
            this.esp = esp;
            return this;
        }
        public String getEsp() {
            return this.esp;
        }

        public GetDedicatedIpWarmUpDetailResponseBodyDetail setSendCounts(Long sendCounts) {
            this.sendCounts = sendCounts;
            return this;
        }
        public Long getSendCounts() {
            return this.sendCounts;
        }

    }

}
