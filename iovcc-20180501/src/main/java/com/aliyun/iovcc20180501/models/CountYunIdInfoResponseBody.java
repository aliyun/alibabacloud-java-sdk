// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountYunIdInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("YunIdInfo")
    public java.util.List<CountYunIdInfoResponseBodyYunIdInfo> yunIdInfo;

    public static CountYunIdInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountYunIdInfoResponseBody self = new CountYunIdInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public CountYunIdInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountYunIdInfoResponseBody setYunIdInfo(java.util.List<CountYunIdInfoResponseBodyYunIdInfo> yunIdInfo) {
        this.yunIdInfo = yunIdInfo;
        return this;
    }
    public java.util.List<CountYunIdInfoResponseBodyYunIdInfo> getYunIdInfo() {
        return this.yunIdInfo;
    }

    public static class CountYunIdInfoResponseBodyYunIdInfo extends TeaModel {
        @NameInMap("TotalBrandCount")
        public Long totalBrandCount;

        @NameInMap("TotalDeviceCount")
        public Long totalDeviceCount;

        @NameInMap("TotalDeviceModelCount")
        public Long totalDeviceModelCount;

        public static CountYunIdInfoResponseBodyYunIdInfo build(java.util.Map<String, ?> map) throws Exception {
            CountYunIdInfoResponseBodyYunIdInfo self = new CountYunIdInfoResponseBodyYunIdInfo();
            return TeaModel.build(map, self);
        }

        public CountYunIdInfoResponseBodyYunIdInfo setTotalBrandCount(Long totalBrandCount) {
            this.totalBrandCount = totalBrandCount;
            return this;
        }
        public Long getTotalBrandCount() {
            return this.totalBrandCount;
        }

        public CountYunIdInfoResponseBodyYunIdInfo setTotalDeviceCount(Long totalDeviceCount) {
            this.totalDeviceCount = totalDeviceCount;
            return this;
        }
        public Long getTotalDeviceCount() {
            return this.totalDeviceCount;
        }

        public CountYunIdInfoResponseBodyYunIdInfo setTotalDeviceModelCount(Long totalDeviceModelCount) {
            this.totalDeviceModelCount = totalDeviceModelCount;
            return this;
        }
        public Long getTotalDeviceModelCount() {
            return this.totalDeviceModelCount;
        }

    }

}
