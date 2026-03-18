// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaResponseBody extends TeaModel {
    /**
     * <p>Response parameters.</p>
     */
    @NameInMap("data")
    public CreateQuotaResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc520ad17171208978521777d742c</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaResponseBody self = new CreateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaResponseBody setData(CreateQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateQuotaResponseBodyData getData() {
        return this.data;
    }

    public CreateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateQuotaResponseBodyData extends TeaModel {
        /**
         * <p>Quota alias.</p>
         * 
         * <strong>example:</strong>
         * <p>os_PayAsYouGoQuota_p</p>
         */
        @NameInMap("nickName")
        public String nickName;

        public static CreateQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateQuotaResponseBodyData self = new CreateQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateQuotaResponseBodyData setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

}
