// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class GetInstanceLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>p-123****</p>
     */
    @NameInMap("data")
    public GetInstanceLogResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetInstanceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceLogResponseBody self = new GetInstanceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceLogResponseBody setData(GetInstanceLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInstanceLogResponseBodyData getData() {
        return this.data;
    }

    public GetInstanceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceLogResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("lineNum")
        public Long lineNum;

        /**
         * <strong>example:</strong>
         * <p>&quot;logs&quot;</p>
         */
        @NameInMap("message")
        public String message;

        public static GetInstanceLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceLogResponseBodyData self = new GetInstanceLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInstanceLogResponseBodyData setLineNum(Long lineNum) {
            this.lineNum = lineNum;
            return this;
        }
        public Long getLineNum() {
            return this.lineNum;
        }

        public GetInstanceLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
