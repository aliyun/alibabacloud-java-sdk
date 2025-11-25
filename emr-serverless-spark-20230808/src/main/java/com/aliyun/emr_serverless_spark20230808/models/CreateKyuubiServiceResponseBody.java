// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateKyuubiServiceResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateKyuubiServiceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateKyuubiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKyuubiServiceResponseBody self = new CreateKyuubiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKyuubiServiceResponseBody setData(CreateKyuubiServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateKyuubiServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateKyuubiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateKyuubiServiceResponseBodyData extends TeaModel {
        /**
         * <p>Kyuubi Service ID。</p>
         * 
         * <strong>example:</strong>
         * <p>kb-f99935b350fb4****7ef700b8b4197a3</p>
         */
        @NameInMap("kyuubiServiceId")
        public String kyuubiServiceId;

        public static CreateKyuubiServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateKyuubiServiceResponseBodyData self = new CreateKyuubiServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateKyuubiServiceResponseBodyData setKyuubiServiceId(String kyuubiServiceId) {
            this.kyuubiServiceId = kyuubiServiceId;
            return this;
        }
        public String getKyuubiServiceId() {
            return this.kyuubiServiceId;
        }

    }

}
