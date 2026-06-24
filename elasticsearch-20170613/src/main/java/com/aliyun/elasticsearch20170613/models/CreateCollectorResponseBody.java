// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateCollectorResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8466BDFB-C513-4B8D-B4E3-5AB256AB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public CreateCollectorResponseBodyResult result;

    public static CreateCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCollectorResponseBody self = new CreateCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCollectorResponseBody setResult(CreateCollectorResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCollectorResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateCollectorResponseBodyResult extends TeaModel {
        /**
         * <p>The ID of the collector that is created.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-4135is2tj194p****</p>
         */
        @NameInMap("resId")
        public String resId;

        public static CreateCollectorResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCollectorResponseBodyResult self = new CreateCollectorResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCollectorResponseBodyResult setResId(String resId) {
            this.resId = resId;
            return this;
        }
        public String getResId() {
            return this.resId;
        }

    }

}
