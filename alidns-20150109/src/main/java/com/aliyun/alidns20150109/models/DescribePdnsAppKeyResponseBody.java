// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAppKeyResponseBody extends TeaModel {
    @NameInMap("AppKey")
    public DescribePdnsAppKeyResponseBodyAppKey appKey;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePdnsAppKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAppKeyResponseBody self = new DescribePdnsAppKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAppKeyResponseBody setAppKey(DescribePdnsAppKeyResponseBodyAppKey appKey) {
        this.appKey = appKey;
        return this;
    }
    public DescribePdnsAppKeyResponseBodyAppKey getAppKey() {
        return this.appKey;
    }

    public DescribePdnsAppKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePdnsAppKeyResponseBodyAppKey extends TeaModel {
        @NameInMap("AppKeyId")
        public String appKeyId;

        @NameInMap("AppKeySecret")
        public String appKeySecret;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("State")
        public String state;

        public static DescribePdnsAppKeyResponseBodyAppKey build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsAppKeyResponseBodyAppKey self = new DescribePdnsAppKeyResponseBodyAppKey();
            return TeaModel.build(map, self);
        }

        public DescribePdnsAppKeyResponseBodyAppKey setAppKeyId(String appKeyId) {
            this.appKeyId = appKeyId;
            return this;
        }
        public String getAppKeyId() {
            return this.appKeyId;
        }

        public DescribePdnsAppKeyResponseBodyAppKey setAppKeySecret(String appKeySecret) {
            this.appKeySecret = appKeySecret;
            return this;
        }
        public String getAppKeySecret() {
            return this.appKeySecret;
        }

        public DescribePdnsAppKeyResponseBodyAppKey setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public DescribePdnsAppKeyResponseBodyAppKey setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePdnsAppKeyResponseBodyAppKey setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
