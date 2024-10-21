// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class GetIntlFixPriceDomainListUrlResponseBody extends TeaModel {
    @NameInMap("Module")
    public GetIntlFixPriceDomainListUrlResponseBodyModule module;

    /**
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
         * <strong>example:</strong>
         * <p><a href="http://intl-fixed-price.oss-cn-zhangjiakou.aliyuncs.com/aliyun_intl_fixed_price_domain_20240827.gz?Expires=1724830838&OSSAccessKeyId=LTAI5tPMAybR4gfSEjdfAk1F&Signature=tb0SPs6tKb9gLKyQ5ibpQnBUuTY%3D">http://intl-fixed-price.oss-cn-zhangjiakou.aliyuncs.com/aliyun_intl_fixed_price_domain_20240827.gz?Expires=1724830838&amp;OSSAccessKeyId=LTAI5tPMAybR4gfSEjdfAk1F&amp;Signature=tb0SPs6tKb9gLKyQ5ibpQnBUuTY%3D</a></p>
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
