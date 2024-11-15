// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeFaceGuardRiskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeFaceGuardRiskResponseBodyResultObject resultObject;

    public static DescribeFaceGuardRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaceGuardRiskResponseBody self = new DescribeFaceGuardRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaceGuardRiskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeFaceGuardRiskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeFaceGuardRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFaceGuardRiskResponseBody setResultObject(DescribeFaceGuardRiskResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeFaceGuardRiskResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeFaceGuardRiskResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ROOT,VPN,HOOK</p>
         */
        @NameInMap("RiakTags")
        public String riakTags;

        /**
         * <strong>example:</strong>
         * <p>{
         *   &quot;code&quot;: 200
         *   &quot;badNet&quot;:false,
         *   &quot;umid&quot;:&quot;74e37355171ab62230063569350d368e&quot;,
         *   &quot;fileTags&quot;:&quot;basic_root,basic_hook&quot;,
         *   &quot;queryCount&quot;:1,
         *   &quot;querySessionCount&quot;:1,
         *   &quot;queryUmidCount&quot;:1
         *   &quot;platform&quot;:&quot;Android&quot;
         * }</p>
         */
        @NameInMap("RiskExtends")
        public String riskExtends;

        public static DescribeFaceGuardRiskResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaceGuardRiskResponseBodyResultObject self = new DescribeFaceGuardRiskResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeFaceGuardRiskResponseBodyResultObject setRiakTags(String riakTags) {
            this.riakTags = riakTags;
            return this;
        }
        public String getRiakTags() {
            return this.riakTags;
        }

        public DescribeFaceGuardRiskResponseBodyResultObject setRiskExtends(String riskExtends) {
            this.riskExtends = riskExtends;
            return this;
        }
        public String getRiskExtends() {
            return this.riskExtends;
        }

    }

}
