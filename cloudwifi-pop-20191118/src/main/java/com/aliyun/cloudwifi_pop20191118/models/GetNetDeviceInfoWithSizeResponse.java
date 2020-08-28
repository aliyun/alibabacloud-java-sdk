// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetNetDeviceInfoWithSizeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public GetNetDeviceInfoWithSizeResponseData data;

    public static GetNetDeviceInfoWithSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNetDeviceInfoWithSizeResponse self = new GetNetDeviceInfoWithSizeResponse();
        return TeaModel.build(map, self);
    }

    public static class GetNetDeviceInfoWithSizeResponseData extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("Data")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> data;

        public static GetNetDeviceInfoWithSizeResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetNetDeviceInfoWithSizeResponseData self = new GetNetDeviceInfoWithSizeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
