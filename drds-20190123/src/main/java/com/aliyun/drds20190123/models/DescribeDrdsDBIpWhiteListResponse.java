// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBIpWhiteListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("IpWhiteList")
    @Validation(required = true)
    public DescribeDrdsDBIpWhiteListResponseIpWhiteList ipWhiteList;

    public static DescribeDrdsDBIpWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBIpWhiteListResponse self = new DescribeDrdsDBIpWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBIpWhiteListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsDBIpWhiteListResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDrdsDBIpWhiteListResponse setIpWhiteList(DescribeDrdsDBIpWhiteListResponseIpWhiteList ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public DescribeDrdsDBIpWhiteListResponseIpWhiteList getIpWhiteList() {
        return this.ipWhiteList;
    }

    public static class DescribeDrdsDBIpWhiteListResponseIpWhiteList extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public java.util.List<String> ip;

        public static DescribeDrdsDBIpWhiteListResponseIpWhiteList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBIpWhiteListResponseIpWhiteList self = new DescribeDrdsDBIpWhiteListResponseIpWhiteList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBIpWhiteListResponseIpWhiteList setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

}
