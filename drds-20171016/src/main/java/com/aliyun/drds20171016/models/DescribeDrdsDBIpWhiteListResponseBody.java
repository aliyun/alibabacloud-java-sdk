// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBIpWhiteListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsDBIpWhiteListResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDBIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBIpWhiteListResponseBody self = new DescribeDrdsDBIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBIpWhiteListResponseBody setData(DescribeDrdsDBIpWhiteListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsDBIpWhiteListResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsDBIpWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBIpWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList self = new DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class DescribeDrdsDBIpWhiteListResponseBodyData extends TeaModel {
        @NameInMap("IpWhiteList")
        public DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList ipWhiteList;

        public static DescribeDrdsDBIpWhiteListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBIpWhiteListResponseBodyData self = new DescribeDrdsDBIpWhiteListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBIpWhiteListResponseBodyData setIpWhiteList(DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public DescribeDrdsDBIpWhiteListResponseBodyDataIpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

    }

}
