// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20201214.models;

import com.aliyun.tea.*;

public class IncreaseInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public IncreaseInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static IncreaseInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IncreaseInstanceResponseBody self = new IncreaseInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public IncreaseInstanceResponseBody setData(IncreaseInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IncreaseInstanceResponseBodyData getData() {
        return this.data;
    }

    public IncreaseInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IncreaseInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class IncreaseInstanceResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("IncrementStatus")
        public String incrementStatus;

        public static IncreaseInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IncreaseInstanceResponseBodyData self = new IncreaseInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IncreaseInstanceResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IncreaseInstanceResponseBodyData setIncrementStatus(String incrementStatus) {
            this.incrementStatus = incrementStatus;
            return this;
        }
        public String getIncrementStatus() {
            return this.incrementStatus;
        }

    }

}
