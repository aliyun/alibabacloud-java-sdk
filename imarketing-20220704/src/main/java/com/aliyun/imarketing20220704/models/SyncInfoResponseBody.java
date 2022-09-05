// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class SyncInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public SyncInfoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SyncInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncInfoResponseBody self = new SyncInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SyncInfoResponseBody setData(SyncInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SyncInfoResponseBodyData getData() {
        return this.data;
    }

    public SyncInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncInfoResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static SyncInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SyncInfoResponseBodyData self = new SyncInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SyncInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
