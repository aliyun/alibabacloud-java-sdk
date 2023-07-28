// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnConditionIPBInfoResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<DescribeCdnConditionIPBInfoResponseBodyDatas> datas;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnConditionIPBInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnConditionIPBInfoResponseBody self = new DescribeCdnConditionIPBInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnConditionIPBInfoResponseBody setDatas(java.util.List<DescribeCdnConditionIPBInfoResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<DescribeCdnConditionIPBInfoResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public DescribeCdnConditionIPBInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnConditionIPBInfoResponseBodyDatas extends TeaModel {
        @NameInMap("Value")
        public String value;

        public static DescribeCdnConditionIPBInfoResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnConditionIPBInfoResponseBodyDatas self = new DescribeCdnConditionIPBInfoResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public DescribeCdnConditionIPBInfoResponseBodyDatas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
