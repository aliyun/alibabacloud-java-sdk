// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemEffectionServiceResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public CreateProblemEffectionServiceResponseBodyData data;

    /**
     * <p>id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>c26f36de-1ec8-496a-a828-880676c5ef81</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateProblemEffectionServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemEffectionServiceResponseBody self = new CreateProblemEffectionServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProblemEffectionServiceResponseBody setData(CreateProblemEffectionServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProblemEffectionServiceResponseBodyData getData() {
        return this.data;
    }

    public CreateProblemEffectionServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProblemEffectionServiceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6442430</p>
         */
        @NameInMap("effectionServiceId")
        public Long effectionServiceId;

        public static CreateProblemEffectionServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProblemEffectionServiceResponseBodyData self = new CreateProblemEffectionServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProblemEffectionServiceResponseBodyData setEffectionServiceId(Long effectionServiceId) {
            this.effectionServiceId = effectionServiceId;
            return this;
        }
        public Long getEffectionServiceId() {
            return this.effectionServiceId;
        }

    }

}
