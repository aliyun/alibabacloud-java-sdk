// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The trusted AccessKey pairs.</p>
     */
    @NameInMap("AkProven")
    public String akProven;

    public static UpdateQuotaHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaHeaders self = new UpdateQuotaHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateQuotaHeaders setAkProven(String akProven) {
        this.akProven = akProven;
        return this;
    }
    public String getAkProven() {
        return this.akProven;
    }

}
