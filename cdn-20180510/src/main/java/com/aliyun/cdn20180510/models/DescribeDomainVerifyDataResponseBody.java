// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainVerifyDataResponseBody extends TeaModel {
    /**
     * <p>The verification content.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;verifiCode&quot;: &quot;uy0-DbxL4HBmUtSUXpkXctaSnCAUKhhNH6WKl-JnJY4&quot;,
     *     &quot;verifyKey&quot;: &quot;_acme-challenge&quot;
     *   }</p>
     */
    @NameInMap("Content")
    public DescribeDomainVerifyDataResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainVerifyDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainVerifyDataResponseBody self = new DescribeDomainVerifyDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainVerifyDataResponseBody setContent(DescribeDomainVerifyDataResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeDomainVerifyDataResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeDomainVerifyDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainVerifyDataResponseBodyContent extends TeaModel {
        @NameInMap("RootDomain")
        public String rootDomain;

        @NameInMap("verifyCode")
        public String verifyCode;

        @NameInMap("verifyKey")
        public String verifyKey;

        public static DescribeDomainVerifyDataResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainVerifyDataResponseBodyContent self = new DescribeDomainVerifyDataResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDomainVerifyDataResponseBodyContent setRootDomain(String rootDomain) {
            this.rootDomain = rootDomain;
            return this;
        }
        public String getRootDomain() {
            return this.rootDomain;
        }

        public DescribeDomainVerifyDataResponseBodyContent setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
            return this;
        }
        public String getVerifyCode() {
            return this.verifyCode;
        }

        public DescribeDomainVerifyDataResponseBodyContent setVerifyKey(String verifyKey) {
            this.verifyKey = verifyKey;
            return this;
        }
        public String getVerifyKey() {
            return this.verifyKey;
        }

    }

}
