// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class SaveUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public SaveUserGroupResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    public static SaveUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveUserGroupResponseBody self = new SaveUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveUserGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveUserGroupResponseBody setData(SaveUserGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SaveUserGroupResponseBodyData getData() {
        return this.data;
    }

    public SaveUserGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveUserGroupResponseBodyData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        public static SaveUserGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SaveUserGroupResponseBodyData self = new SaveUserGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SaveUserGroupResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SaveUserGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
