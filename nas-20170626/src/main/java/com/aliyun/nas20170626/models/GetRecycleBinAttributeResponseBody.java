// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class GetRecycleBinAttributeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RecycleBinAttribute")
    public GetRecycleBinAttributeResponseBodyRecycleBinAttribute recycleBinAttribute;

    public static GetRecycleBinAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecycleBinAttributeResponseBody self = new GetRecycleBinAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecycleBinAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecycleBinAttributeResponseBody setRecycleBinAttribute(GetRecycleBinAttributeResponseBodyRecycleBinAttribute recycleBinAttribute) {
        this.recycleBinAttribute = recycleBinAttribute;
        return this;
    }
    public GetRecycleBinAttributeResponseBodyRecycleBinAttribute getRecycleBinAttribute() {
        return this.recycleBinAttribute;
    }

    public static class GetRecycleBinAttributeResponseBodyRecycleBinAttribute extends TeaModel {
        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public String status;

        @NameInMap("ReservedDays")
        public Long reservedDays;

        @NameInMap("EnableTime")
        public String enableTime;

        public static GetRecycleBinAttributeResponseBodyRecycleBinAttribute build(java.util.Map<String, ?> map) throws Exception {
            GetRecycleBinAttributeResponseBodyRecycleBinAttribute self = new GetRecycleBinAttributeResponseBodyRecycleBinAttribute();
            return TeaModel.build(map, self);
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setReservedDays(Long reservedDays) {
            this.reservedDays = reservedDays;
            return this;
        }
        public Long getReservedDays() {
            return this.reservedDays;
        }

        public GetRecycleBinAttributeResponseBodyRecycleBinAttribute setEnableTime(String enableTime) {
            this.enableTime = enableTime;
            return this;
        }
        public String getEnableTime() {
            return this.enableTime;
        }

    }

}
