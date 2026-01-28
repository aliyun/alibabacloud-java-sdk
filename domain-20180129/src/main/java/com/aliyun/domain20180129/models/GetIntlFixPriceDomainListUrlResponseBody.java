// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetIntlFixPriceDomainListUrlResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Module")
    public GetIntlFixPriceDomainListUrlResponseBodyModule module;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BF014B60-C708-4253-B5F2-3F9B493F398B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIntlFixPriceDomainListUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntlFixPriceDomainListUrlResponseBody self = new GetIntlFixPriceDomainListUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntlFixPriceDomainListUrlResponseBody setModule(GetIntlFixPriceDomainListUrlResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public GetIntlFixPriceDomainListUrlResponseBodyModule getModule() {
        return this.module;
    }

    public GetIntlFixPriceDomainListUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetIntlFixPriceDomainListUrlResponseBodyModule extends TeaModel {
        /**
         * <p>The URL for downloading the list that contains available fixed-price domain names at the international site (alibabacloud.com).</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://intl-fixed-price.oss-cn-zhangjiakou.aliyuncs.com/aliyun_intl_fixed_price_domain_20240827.gz?Expires=1724830838&OSSAccessKeyId=LTAI5tPMAybR4gfSEjdf****&Signature=tb0SPs6tKb9gLKyQ5ibpQnBUuT">http://intl-fixed-price.oss-cn-zhangjiakou.aliyuncs.com/aliyun_intl_fixed_price_domain_20240827.gz?Expires=1724830838&amp;OSSAccessKeyId=LTAI5tPMAybR4gfSEjdf****&amp;Signature=tb0SPs6tKb9gLKyQ5ibpQnBUuT</a>****</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        public static GetIntlFixPriceDomainListUrlResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            GetIntlFixPriceDomainListUrlResponseBodyModule self = new GetIntlFixPriceDomainListUrlResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public GetIntlFixPriceDomainListUrlResponseBodyModule setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

    }

}
