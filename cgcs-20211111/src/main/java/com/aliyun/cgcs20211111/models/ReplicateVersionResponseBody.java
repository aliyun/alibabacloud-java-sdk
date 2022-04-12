// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReplicateVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ReplicateVersionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ReplicateVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReplicateVersionResponseBody self = new ReplicateVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ReplicateVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReplicateVersionResponseBody setData(ReplicateVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReplicateVersionResponseBodyData getData() {
        return this.data;
    }

    public ReplicateVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReplicateVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReplicateVersionResponseBodyData extends TeaModel {
        // 复制结果
        @NameInMap("Code")
        public String code;

        // 复制结果信息
        @NameInMap("Message")
        public String message;

        public static ReplicateVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReplicateVersionResponseBodyData self = new ReplicateVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReplicateVersionResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ReplicateVersionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
