// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateKyuubiTokenResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateKyuubiTokenResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateKyuubiTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKyuubiTokenResponseBody self = new CreateKyuubiTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKyuubiTokenResponseBody setData(CreateKyuubiTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKyuubiTokenResponseBodyData getData() {
        return this.data;
    }

    public CreateKyuubiTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateKyuubiTokenResponseBodyData extends TeaModel {
        /**
         * <p>The token ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tk-zpi0*****hdv4y</p>
         */
        @NameInMap("tokenId")
        public String tokenId;

        public static CreateKyuubiTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKyuubiTokenResponseBodyData self = new CreateKyuubiTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKyuubiTokenResponseBodyData setTokenId(String tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public String getTokenId() {
            return this.tokenId;
        }

    }

}
