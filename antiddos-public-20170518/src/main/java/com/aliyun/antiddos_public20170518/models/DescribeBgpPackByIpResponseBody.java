// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackByIpResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("DdosbgpInfo")
    public DescribeBgpPackByIpResponseBodyDdosbgpInfo ddosbgpInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeBgpPackByIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackByIpResponseBody self = new DescribeBgpPackByIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackByIpResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeBgpPackByIpResponseBody setDdosbgpInfo(DescribeBgpPackByIpResponseBodyDdosbgpInfo ddosbgpInfo) {
        this.ddosbgpInfo = ddosbgpInfo;
        return this;
    }
    public DescribeBgpPackByIpResponseBodyDdosbgpInfo getDdosbgpInfo() {
        return this.ddosbgpInfo;
    }

    public DescribeBgpPackByIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpPackByIpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeBgpPackByIpResponseBodyDdosbgpInfo extends TeaModel {
        @NameInMap("BaseThreshold")
        public Integer baseThreshold;

        @NameInMap("DdosbgpInstanceId")
        public String ddosbgpInstanceId;

        @NameInMap("ElasticThreshold")
        public Integer elasticThreshold;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("Ip")
        public String ip;

        public static DescribeBgpPackByIpResponseBodyDdosbgpInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPackByIpResponseBodyDdosbgpInfo self = new DescribeBgpPackByIpResponseBodyDdosbgpInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBgpPackByIpResponseBodyDdosbgpInfo setBaseThreshold(Integer baseThreshold) {
            this.baseThreshold = baseThreshold;
            return this;
        }
        public Integer getBaseThreshold() {
            return this.baseThreshold;
        }

        public DescribeBgpPackByIpResponseBodyDdosbgpInfo setDdosbgpInstanceId(String ddosbgpInstanceId) {
            this.ddosbgpInstanceId = ddosbgpInstanceId;
            return this;
        }
        public String getDdosbgpInstanceId() {
            return this.ddosbgpInstanceId;
        }

        public DescribeBgpPackByIpResponseBodyDdosbgpInfo setElasticThreshold(Integer elasticThreshold) {
            this.elasticThreshold = elasticThreshold;
            return this;
        }
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        public DescribeBgpPackByIpResponseBodyDdosbgpInfo setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeBgpPackByIpResponseBodyDdosbgpInfo setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
