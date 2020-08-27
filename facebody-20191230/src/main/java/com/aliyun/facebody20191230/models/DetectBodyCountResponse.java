// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectBodyCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectBodyCountResponseData data;

    public static DetectBodyCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectBodyCountResponse self = new DetectBodyCountResponse();
        return TeaModel.build(map, self);
    }

    public DetectBodyCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectBodyCountResponse setData(DetectBodyCountResponseData data) {
        this.data = data;
        return this;
    }
    public DetectBodyCountResponseData getData() {
        return this.data;
    }

    public static class DetectBodyCountResponseData extends TeaModel {
        @NameInMap("PersonNumber")
        @Validation(required = true)
        public Integer personNumber;

        public static DetectBodyCountResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectBodyCountResponseData self = new DetectBodyCountResponseData();
            return TeaModel.build(map, self);
        }

        public DetectBodyCountResponseData setPersonNumber(Integer personNumber) {
            this.personNumber = personNumber;
            return this;
        }
        public Integer getPersonNumber() {
            return this.personNumber;
        }

    }

}
