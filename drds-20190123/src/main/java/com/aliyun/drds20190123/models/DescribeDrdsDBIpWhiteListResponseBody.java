// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsDBIpWhiteListResponseBody extends TeaModel {
    /**
     * <p>The IP address whitelist.</p>
     */
    @NameInMap("IpWhiteList")
    public DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList ipWhiteList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsDBIpWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsDBIpWhiteListResponseBody self = new DescribeDrdsDBIpWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsDBIpWhiteListResponseBody setIpWhiteList(DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList getIpWhiteList() {
        return this.ipWhiteList;
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

    public static class DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList self = new DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsDBIpWhiteListResponseBodyIpWhiteList setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

}
