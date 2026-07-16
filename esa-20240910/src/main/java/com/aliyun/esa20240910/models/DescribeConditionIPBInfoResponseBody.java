// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeConditionIPBInfoResponseBody extends TeaModel {
    /**
     * <p>The data details.</p>
     */
    @NameInMap("Datas")
    public java.util.List<DescribeConditionIPBInfoResponseBodyDatas> datas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConditionIPBInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConditionIPBInfoResponseBody self = new DescribeConditionIPBInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConditionIPBInfoResponseBody setDatas(java.util.List<DescribeConditionIPBInfoResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<DescribeConditionIPBInfoResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public DescribeConditionIPBInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeConditionIPBInfoResponseBodyDatas extends TeaModel {
        /**
         * <p>The returned data details, including the name of the country, ISP, or region and the corresponding identifier code.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;text\&quot;:\&quot;安徽\&quot;,\&quot;value\&quot;:\&quot;340000\&quot;},{\&quot;text\&quot;:\&quot;北京\&quot;,\&quot;value\&quot;:\&quot;110000\&quot;},{\&quot;text\&quot;:\&quot;重庆\&quot;,\&quot;value\&quot;:\&quot;500000\&quot;}]</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeConditionIPBInfoResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeConditionIPBInfoResponseBodyDatas self = new DescribeConditionIPBInfoResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public DescribeConditionIPBInfoResponseBodyDatas setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
