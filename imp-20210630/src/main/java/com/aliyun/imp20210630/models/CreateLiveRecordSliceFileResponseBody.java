// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateLiveRecordSliceFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateLiveRecordSliceFileResponseBodyResult result;

    public static CreateLiveRecordSliceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordSliceFileResponseBody self = new CreateLiveRecordSliceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordSliceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveRecordSliceFileResponseBody setResult(CreateLiveRecordSliceFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLiveRecordSliceFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLiveRecordSliceFileResponseBodyResult extends TeaModel {
        @NameInMap("SliceRecordUrl")
        public String sliceRecordUrl;

        public static CreateLiveRecordSliceFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveRecordSliceFileResponseBodyResult self = new CreateLiveRecordSliceFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLiveRecordSliceFileResponseBodyResult setSliceRecordUrl(String sliceRecordUrl) {
            this.sliceRecordUrl = sliceRecordUrl;
            return this;
        }
        public String getSliceRecordUrl() {
            return this.sliceRecordUrl;
        }

    }

}
