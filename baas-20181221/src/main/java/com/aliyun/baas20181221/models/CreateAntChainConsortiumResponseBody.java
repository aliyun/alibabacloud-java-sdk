// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainConsortiumResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>87FAFC6B-E7AE-4626-B7F7-AE0B88E612D5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainConsortiumResponseBodyResult result;

    public static CreateAntChainConsortiumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainConsortiumResponseBody self = new CreateAntChainConsortiumResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainConsortiumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainConsortiumResponseBody setResult(CreateAntChainConsortiumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainConsortiumResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAntChainConsortiumResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>A28nO1ow</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        public static CreateAntChainConsortiumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainConsortiumResponseBodyResult self = new CreateAntChainConsortiumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainConsortiumResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

    }

}
