// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemEffectionServiceResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public CreateProblemEffectionServiceResponseBodyData data;

    // id of the request
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
