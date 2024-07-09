// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnConditionIPBInfoResponseBody extends TeaModel {
    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Datas")
    public java.util.List<DescribeCdnConditionIPBInfoResponseBodyDatas> datas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2C4AA72D-8C00-1113-BD68-8BC4E3CF4FF6</p>
     */
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
        /**
         * <p>The configuration value.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{\&quot;text\&quot;:\&quot;阿鲁巴\&quot;,\&quot;value\&quot;:\&quot;AW\&quot;}]&quot;</p>
         */
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
