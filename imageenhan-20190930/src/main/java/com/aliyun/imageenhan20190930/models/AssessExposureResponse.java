// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessExposureResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public AssessExposureResponseData data;

    public static AssessExposureResponse build(java.util.Map<String, ?> map) throws Exception {
        AssessExposureResponse self = new AssessExposureResponse();
        return TeaModel.build(map, self);
    }

    public static class AssessExposureResponseData extends TeaModel {
        @NameInMap("Exposure")
        @Validation(required = true)
        public Double exposure;

        public static AssessExposureResponseData build(java.util.Map<String, ?> map) throws Exception {
            AssessExposureResponseData self = new AssessExposureResponseData();
            return TeaModel.build(map, self);
        }

    }

}
