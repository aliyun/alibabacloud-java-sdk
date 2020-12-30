// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveUserInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public SaveUserInfoResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static SaveUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveUserInfoResponseBody self = new SaveUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveUserInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveUserInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveUserInfoResponseBody setData(SaveUserInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveUserInfoResponseBodyData getData() {
        return this.data;
    }

    public SaveUserInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveUserInfoResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        public static SaveUserInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveUserInfoResponseBodyData self = new SaveUserInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveUserInfoResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SaveUserInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
