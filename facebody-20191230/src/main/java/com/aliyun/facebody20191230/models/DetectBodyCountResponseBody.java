// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DetectBodyCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectBodyCountResponseBodyData data;

    public static DetectBodyCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectBodyCountResponseBody self = new DetectBodyCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectBodyCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectBodyCountResponseBody setData(DetectBodyCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectBodyCountResponseBodyData getData() {
        return this.data;
    }

    public static class DetectBodyCountResponseBodyData extends TeaModel {
        @NameInMap("PersonNumber")
        public Integer personNumber;

        public static DetectBodyCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectBodyCountResponseBodyData self = new DetectBodyCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectBodyCountResponseBodyData setPersonNumber(Integer personNumber) {
            this.personNumber = personNumber;
            return this;
        }
        public Integer getPersonNumber() {
            return this.personNumber;
        }

    }

}
