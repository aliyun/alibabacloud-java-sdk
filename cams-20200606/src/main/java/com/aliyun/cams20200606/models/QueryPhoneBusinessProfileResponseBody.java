// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryPhoneBusinessProfileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPhoneBusinessProfileResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPhoneBusinessProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPhoneBusinessProfileResponseBody self = new QueryPhoneBusinessProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPhoneBusinessProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPhoneBusinessProfileResponseBody setData(QueryPhoneBusinessProfileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPhoneBusinessProfileResponseBodyData getData() {
        return this.data;
    }

    public QueryPhoneBusinessProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPhoneBusinessProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPhoneBusinessProfileResponseBodyData extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("Description")
        public String description;

        @NameInMap("Email")
        public String email;

        @NameInMap("ProfilePictureUrl")
        public String profilePictureUrl;

        @NameInMap("Vertical")
        public String vertical;

        @NameInMap("Websites")
        public java.util.List<String> websites;

        public static QueryPhoneBusinessProfileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPhoneBusinessProfileResponseBodyData self = new QueryPhoneBusinessProfileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPhoneBusinessProfileResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryPhoneBusinessProfileResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryPhoneBusinessProfileResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryPhoneBusinessProfileResponseBodyData setProfilePictureUrl(String profilePictureUrl) {
            this.profilePictureUrl = profilePictureUrl;
            return this;
        }
        public String getProfilePictureUrl() {
            return this.profilePictureUrl;
        }

        public QueryPhoneBusinessProfileResponseBodyData setVertical(String vertical) {
            this.vertical = vertical;
            return this;
        }
        public String getVertical() {
            return this.vertical;
        }

        public QueryPhoneBusinessProfileResponseBodyData setWebsites(java.util.List<String> websites) {
            this.websites = websites;
            return this;
        }
        public java.util.List<String> getWebsites() {
            return this.websites;
        }

    }

}
