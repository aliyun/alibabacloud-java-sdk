// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetContactsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Datapoints")
    public GetContactsResponseBodyDatapoints datapoints;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContactsResponseBody self = new GetContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContactsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetContactsResponseBody setDatapoints(GetContactsResponseBodyDatapoints datapoints) {
        this.datapoints = datapoints;
        return this;
    }
    public GetContactsResponseBodyDatapoints getDatapoints() {
        return this.datapoints;
    }

    public GetContactsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContactsResponseBodyDatapointsContacts extends TeaModel {
        @NameInMap("Contact")
        public java.util.List<String> contact;

        public static GetContactsResponseBodyDatapointsContacts build(java.util.Map<String, ?> map) throws Exception {
            GetContactsResponseBodyDatapointsContacts self = new GetContactsResponseBodyDatapointsContacts();
            return TeaModel.build(map, self);
        }

        public GetContactsResponseBodyDatapointsContacts setContact(java.util.List<String> contact) {
            this.contact = contact;
            return this;
        }
        public java.util.List<String> getContact() {
            return this.contact;
        }

    }

    public static class GetContactsResponseBodyDatapoints extends TeaModel {
        @NameInMap("Contacts")
        public GetContactsResponseBodyDatapointsContacts contacts;

        @NameInMap("Name")
        public String name;

        public static GetContactsResponseBodyDatapoints build(java.util.Map<String, ?> map) throws Exception {
            GetContactsResponseBodyDatapoints self = new GetContactsResponseBodyDatapoints();
            return TeaModel.build(map, self);
        }

        public GetContactsResponseBodyDatapoints setContacts(GetContactsResponseBodyDatapointsContacts contacts) {
            this.contacts = contacts;
            return this;
        }
        public GetContactsResponseBodyDatapointsContacts getContacts() {
            return this.contacts;
        }

        public GetContactsResponseBodyDatapoints setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
