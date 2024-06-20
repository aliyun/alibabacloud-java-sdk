// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainSecurityProfileResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public java.util.List<DescribeDomainSecurityProfileResponseBodyResult> result;

    public static DescribeDomainSecurityProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainSecurityProfileResponseBody self = new DescribeDomainSecurityProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainSecurityProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainSecurityProfileResponseBody setResult(java.util.List<DescribeDomainSecurityProfileResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeDomainSecurityProfileResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeDomainSecurityProfileResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the global mitigation policy is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("GlobalEnable")
        public Boolean globalEnable;

        /**
         * <p>The mode of the global mitigation policy. Valid values:</p>
         * <ul>
         * <li><strong>weak</strong>: the Low mode</li>
         * <li><strong>default</strong>: the Normal mode</li>
         * <li><strong>hard</strong>: the Strict mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GlobalMode")
        public String globalMode;

        public static DescribeDomainSecurityProfileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainSecurityProfileResponseBodyResult self = new DescribeDomainSecurityProfileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDomainSecurityProfileResponseBodyResult setGlobalEnable(Boolean globalEnable) {
            this.globalEnable = globalEnable;
            return this;
        }
        public Boolean getGlobalEnable() {
            return this.globalEnable;
        }

        public DescribeDomainSecurityProfileResponseBodyResult setGlobalMode(String globalMode) {
            this.globalMode = globalMode;
            return this;
        }
        public String getGlobalMode() {
            return this.globalMode;
        }

    }

}
